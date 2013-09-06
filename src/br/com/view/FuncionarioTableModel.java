/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

import br.com.model.negocio.Filme;
import br.com.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author celio_henrique
 */
public class FuncionarioTableModel extends AbstractTableModel{
    
    private static final int COL_ID = 0;
    private static final int COL_NOME = 1;
    private static final int COL_IDADE = 2;
    private static final int COL_FUNCAO = 3;
    private List<Funcionario> linhas;
    
    private String[] colunas = new String[]{"Código", "Nome", "Idade", "Função"};
    
    //Cria uma MarcaTableModel sem nenhuma linha
    public FuncionarioTableModel() {
        linhas = new ArrayList<Funcionario>();
    }
    //Cria uma MarcaTableModel contendo a lista recebida por parâmetro.
    public FuncionarioTableModel(List<Funcionario> funcionarios) {
        this.linhas = new ArrayList<Funcionario>(funcionarios);
    }
    
   
    public int getRowCount() {
        return linhas.size();
    }

   
    public int getColumnCount() {
        return colunas.length;
    }
    
  
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
    
    
    public Object getValueAt(int row, int column) {
        Funcionario f = linhas.get(row);

        //verifica qual valor deve ser retornado
        if (column == COL_ID) {
            return f.getId();
        } else if (column == COL_NOME) {
            return f.getNome();
        } else if (column == COL_IDADE){
            return f.getIdade();
        } else if (column == COL_IDADE){
            return f.getIdade();
        } else if (column == COL_FUNCAO){
            return f.getFuncao();
        }
        return "";
    }
    public void setValueAt(Object aValue, int row, int column) {
        //Vamos alterar o valor da coluna columnIndex na linha rowIndex com o valor aValue passado no parâmetro.  
        //Note que vc poderia alterar 2 campos ao invés de um só.  
        Funcionario u = linhas.get(row);
        if (column == COL_ID) {
            u.setId((Integer) aValue);
        } else if (column == COL_NOME) {
            u.setNome(aValue.toString());
        } else if (column == COL_IDADE){
            u.setIdade(aValue.toString());
        } else if (column == COL_FUNCAO){
            u.setFuncao(aValue.toString());
        }
           
    }
    
     // Retorna a marca referente a linha especificada
     public Funcionario getFuncionario(int indiceLinha) {
        return linhas.get(indiceLinha);
    }
     
     // Adiciona a marca especificada ao modelo
    public void addFuncionario(Funcionario funcionario) {
        // Adiciona o registro.
        linhas.add(funcionario);

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
        Collections.sort(linhas, new Comparator<Funcionario>() {

            public int compare(Funcionario o1, Funcionario o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        //avisa que a tabela foi alterada
        fireTableDataChanged();
    }
      public void updateFuncionario(int indiceLinha, Funcionario funcionario) {
            linhas.set(indiceLinha, funcionario);
        // Notifica a mudança.
        fireTableRowsUpdated(indiceLinha, indiceLinha);
        ordenarPorNome();
    }
      //Remove o sócio da linha especificada.
    public void removeFuncionario(int indiceLinha) {
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
