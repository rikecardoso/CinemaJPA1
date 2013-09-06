package br.com.view;

import br.com.controller.FuncionarioController;
import br.com.model.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author celio_henrique
 */
public class FuncionarioGui extends javax.swing.JFrame {

    private FuncionarioTableModel model;
    
    public FuncionarioGui() {
        initComponents();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        FuncionarioController f = new FuncionarioController();
        lista = f.listarFuncionario();
        
        //cria o modelo de Produto      
        model = new FuncionarioTableModel(lista);

        //atribui o modelo à tabela
        Tabela.setModel(model);

        // Ordenar tabela conforme cabeçalho coluna clicado.
        Tabela.setAutoCreateRowSorter(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        lbCadFunc = new javax.swing.JLabel();
        scrollPainel1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        btPesq = new javax.swing.JButton();
        btInserir = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel1.setBackground(new java.awt.Color(255, 255, 255));

        lbCadFunc.setBackground(new java.awt.Color(153, 153, 153));
        lbCadFunc.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lbCadFunc.setForeground(new java.awt.Color(255, 102, 0));
        lbCadFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Sign-Forward-icon.png"))); // NOI18N
        lbCadFunc.setText("Funcionário");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Idade", "Função"
            }
        ));
        scrollPainel1.setViewportView(Tabela);

        txtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesqKeyPressed(evt);
            }
        });

        btPesq.setBackground(new java.awt.Color(255, 255, 255));
        btPesq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Magnifier-icon.png"))); // NOI18N
        btPesq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesqActionPerformed(evt);
            }
        });

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Sign-Add-icon.png"))); // NOI18N
        btInserir.setBorderPainted(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btEditar.setBackground(new java.awt.Color(255, 255, 255));
        btEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Apps-system-software-update-icon.png"))); // NOI18N
        btEditar.setBorderPainted(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Delete-icon.png"))); // NOI18N
        btExcluir.setBorderPainted(false);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painel1Layout = new javax.swing.GroupLayout(painel1);
        painel1.setLayout(painel1Layout);
        painel1Layout.setHorizontalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbCadFunc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(painel1Layout.createSequentialGroup()
                        .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painel1Layout.createSequentialGroup()
                                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btPesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(scrollPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPesq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPesq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollPainel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        InserirFuncionarioGui ifg = new InserirFuncionarioGui(model);
        ifg.setLocationRelativeTo(null);
        ifg.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
           int selecionado = -1;
        selecionado = Tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdFuncionario = (Integer) model.getValueAt(selecionado, 0);
            AtualizarFuncionarioGui af = new AtualizarFuncionarioGui(selecionado, cdFuncionario, model);
            af.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma tabela");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btPesqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesqActionPerformed
        efetuaPesquisa();
    }//GEN-LAST:event_btPesqActionPerformed

    private void txtPesqKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqKeyPressed
        efetuaPesquisa();
    }//GEN-LAST:event_txtPesqKeyPressed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int selecionado = -1;
        selecionado = Tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            FuncionarioController fc = new FuncionarioController();
            if (fc.excluir(i)){
            model.removeFuncionario(selecionado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        } 
    }//GEN-LAST:event_btExcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesq;
    private javax.swing.JLabel lbCadFunc;
    private javax.swing.JPanel painel1;
    private javax.swing.JScrollPane scrollPainel1;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables
private void efetuaPesquisa() {
        String nome = txtPesq.getText();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        FuncionarioController fc = new FuncionarioController();
        lista = fc.listarFuncionariosByNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new FuncionarioTableModel(lista);

        //atribui o modelo à tabela
        Tabela.setModel(model);
    }
}
