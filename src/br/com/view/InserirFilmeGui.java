package br.com.view;

import br.com.controller.FilmeController;
import br.com.model.negocio.Filme;
import javax.swing.JOptionPane;

/**
 *
 * @author celio_henrique
 */
public class InserirFilmeGui extends javax.swing.JFrame {
    FilmeTableModel model;
    /**
     * Creates new form InserirFilmeGui
     */
    public InserirFilmeGui(FilmeTableModel mtb) {
        initComponents();
        model = mtb;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        lbCadastrarFilme = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbIdade = new javax.swing.JLabel();
        lbDuracao = new javax.swing.JLabel();
        lb3D = new javax.swing.JLabel();
        lbEntrada = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        txtIdade = new javax.swing.JTextField();
        txtDuracao = new javax.swing.JTextField();
        txtEntrada = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel1.setBackground(new java.awt.Color(255, 255, 255));

        lbCadastrarFilme.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbCadastrarFilme.setForeground(new java.awt.Color(255, 102, 0));
        lbCadastrarFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Button-Play-icon.png"))); // NOI18N
        lbCadastrarFilme.setText("Cadastrar Filme");

        lbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNome.setText("Nome ");

        lbGenero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbGenero.setText("Género");

        lbIdade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbIdade.setText("Idade");

        lbDuracao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbDuracao.setText("Duração do Filme");

        lb3D.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lb3D.setText("3D");

        lbEntrada.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEntrada.setText("Entrada");

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

        comboBox.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim\t", "Não", " " }));

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(lbNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome))
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btLimpar))
                                    .addGroup(painel1Layout.createSequentialGroup()
                                        .addComponent(lb3D)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(54, 54, 54)
                                        .addComponent(lbEntrada)
                                        .addGap(0, 12, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btCadastrar))))
                        .addGap(19, 19, 19))
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(lbDuracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel1Layout.createSequentialGroup()
                                    .addComponent(lbIdade)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIdade))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painel1Layout.createSequentialGroup()
                                    .addComponent(lbGenero)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(painel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lbCadastrarFilme)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadastrarFilme)
                .addGap(38, 38, 38)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbGenero)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIdade)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDuracao)
                    .addComponent(txtDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3D)
                    .addComponent(lbEntrada)
                    .addComponent(txtEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btLimpar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        txtNome.setText("");
        txtDuracao.setText("");
        txtEntrada.setText("");
        txtGenero.setText("");
        txtIdade.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        Filme f = new Filme();
        if (txtNome.getText().length() > 0) {
            f.setNome(txtNome.getText());
            f.setDuracaoFilme(txtDuracao.getText());
            f.setGenero(txtGenero.getText());
            f.setIdade(Integer.parseInt(txtIdade.getText()));
            f.setEntrada((Float.parseFloat(txtEntrada.getText())));
            f.setTresD(comboBox.getSelectedItem().toString());
            
            FilmeController fc = new FilmeController();
            if (fc.inserir(f)){      
            model.addFilme(pesquisar(f.getNome()));
            }
            dispose();
        }else{
            JOptionPane.showMessageDialog(null,"Insira o nome do filme");


        }
    }//GEN-LAST:event_btCadastrarActionPerformed

     private Filme pesquisar (String nome){
        FilmeController fc = new FilmeController();
        return fc.listarFilmeByNome(nome);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btLimpar;
    private javax.swing.JComboBox comboBox;
    private javax.swing.JLabel lb3D;
    private javax.swing.JLabel lbCadastrarFilme;
    private javax.swing.JLabel lbDuracao;
    private javax.swing.JLabel lbEntrada;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbIdade;
    private javax.swing.JLabel lbNome;
    private javax.swing.JPanel painel1;
    private javax.swing.JTextField txtDuracao;
    private javax.swing.JTextField txtEntrada;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
