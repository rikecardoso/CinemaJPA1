/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.negocio.Filme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author celio_henrique
 */
public class FilmeTableModel extends AbstractTableModel{

    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_GENERO = 2;
    private List<Filme> linhas;
    
    private String[] colunas = new String[]{"Código", "Nome", "Genero"};
    
    //Cria uma MarcaTableModel sem nenhuma linha
    public FilmeTableModel() {
        linhas = new ArrayList<Filme>();
    }
    //Cria uma MarcaTableModel contendo a lista recebida por parâmetro.
    public FilmeTableModel(List<Filme> filmes) {
        this.linhas = new ArrayList<Filme>(filmes);
    }
    
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
    public Class getColumnClass(int columnIndex) {
        //Qual a classe das nossas colunas? A coluna 1 é inteira, as outras string.  
        if (columnIndex == COL_ID) {
            return Integer.class;
        }
        return String.class;
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        //Indicamos se a célula da rowIndex e da columnIndex é editável. Nossa tabela toda é.  
        return false;
    }
    
    @Override
    public Object getValueAt(int row, int column) {
        Filme m = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return m.getId();
        } else if (column == COL_NOME) {
            return m.getNome();
        } else if (column == COL_GENERO){
            return m.getGenero();
        }
        return "";
    }
    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Filme u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        }else if (column == COL_GENERO){
            u.setGenero(aValue.toString());
        }
    }
     // Retorna a marca referente a linha especificada
     public Filme getFilme(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
     
     // Adiciona a marca especificada ao modelo
    public void addFilme(Filme filme) {
        // Adiciona o registro.
        linhas.add(filme);

        // Pega a quantidade de registros e subtrai 1 para
        // achar o último índice. A subtração é necessária
        // porque os índices começam em zero.
        int ultimoIndice = getRowCount() - 1;


        // Notifica a mudança.
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
        ordenarPorNome();

    }
    public void ordenarPorNome() {
        //ordena pelo nome
        Collections.sort(linhas, new Comparator<Filme>() {

            public int compare(Filme o1, Filme o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
      public void updateFilme(int indiceLinha, Filme filme) {
            linhas.set(indiceLinha, filme);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorNome();
    }
      //Remove o sócio da linha especificada.
    public void removeFilme(int indiceLinha) {
        // Remove o registro.
        linhas.remove(indiceLinha);

        // Notifica a mudança.
        fireTableRowsDeleted(indiceLinha, indiceLinha);
        ordenarPorNome();
    }
    // Remove todos os registros.
    public void limpar() {
        // Remove todos os elementos da lista de sócios.
        linhas.clear();

        // Notifica a mudança.
        fireTableDataChanged();
    }
}
