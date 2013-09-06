package br.com.view;

import br.com.controller.FilmeController;
import br.com.controller.FuncionarioController;
import br.com.model.negocio.Filme;
import br.com.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author celio_henrique
 */
public class InserirFuncionarioGui extends javax.swing.JFrame {

    FuncionarioTableModel model;
    /**
     * Creates new form InserirFuncionarioGui
     */
    public InserirFuncionarioGui(FuncionarioTableModel mtb) {
        initComponents();
        model = mtb;

        carregarCombo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        lbCadFunc = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbFuncao = new javax.swing.JLabel();
        lbObs = new javax.swing.JLabel();
        ScrollPainel = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        txtNome = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtFuncao = new javax.swing.JTextField();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        lbFilme = new javax.swing.JLabel();
        comboFilme = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel1.setBackground(new java.awt.Color(255, 255, 255));

        lbCadFunc.setBackground(new java.awt.Color(255, 255, 255));
        lbCadFunc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCadFunc.setForeground(new java.awt.Color(255, 102, 0));
        lbCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Button-Play-icon.png"))); // NOI18N
        lbCadFunc.setText("Cadastrar Funcionário");

        lbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNome.setText("Nome ");

        lbIdade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbIdade.setText("Idade ");

        lbFuncao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbFuncao.setText("Função");

        lbObs.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbObs.setText("Observações");

        TextArea.setColumns(20);
        TextArea.setRows(5);
        ScrollPainel.setViewportView(TextArea);

        txtNome.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtIdade.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        txtFuncao.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        btCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        btCadastrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/floppy-drive-3-12-icon.png"))); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btLimpar.setBackground(new java.awt.Color(255, 255, 255));
        btLimpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Actions-edit-clear-icon.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        lbFilme.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbFilme.setText("Filme");

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lbCadFunc))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbFuncao)))
                .addGap(0, 72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btCadastrar)
                .addGap(8, 8, 8))
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(lbObs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPainel))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbIdade)
                            .addComponent(lbFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadFunc)
                .addGap(29, 29, 29)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdade))
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFuncao)
                    .addComponent(txtFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFilme)
                    .addComponent(comboFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObs)
                    .addComponent(ScrollPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNome.setText("");
        txtFuncao.setText("");
        txtIdade.setText("");
        TextArea.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
         Funcionario f = new Funcionario();
        if (txtNome.getText().length() > 0) {
            f.setNome(txtNome.getText());
            f.setFuncao(txtFuncao.getText());
            f.setIdade(txtIdade.getText());
            f.setObservacoes(TextArea.getText());
            
            FuncionarioController fc = new FuncionarioController();
            if (fc.inserir(f)){      
            model.addFuncionario(pesquisar(f.getNome()));
            }
         
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Insira o nome do filme");


        }
    }//GEN-LAST:event_btCadastrarActionPerformed
private Funcionario pesquisar (String nome){
        FuncionarioController fc = new FuncionarioController();
        return fc.listarFilmeByNome(nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPainel;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox comboFilme;
    private javax.swing.JLabel lbCadFunc;
    private javax.swing.JLabel lbFilme;
    private javax.swing.JLabel lbFuncao;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbObs;
    private javax.swing.JPanel painel1;
    private javax.swing.JTextField txtFuncao;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
      private void carregarCombo() { 
    //assim como é feito numa JTable, temos o DefaultComboBoxModel que é o model do JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) comboFilme.getModel();
        //removendo todos os elementos do combo
        comboModel.removeAllElements();
        //cria a lista: java.util.List
        List<Filme> filmes = new ArrayList<Filme>();
        FilmeController a = new FilmeController();
        filmes = a.listarFilme();


        for (int linha = 0; linha < filmes.size(); linha++) {
            //pegando a categoria da lista
            Filme filme = filmes.get(linha);
            //adicionando a categoria no combo
            comboModel.addElement(filme);
        }
    }
   
}

