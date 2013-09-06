package br.com.view;

import br.com.controller.FilmeController;
import br.com.model.negocio.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author celio_henrique
 */
public class FilmeGui extends javax.swing.JFrame {
 
    private FilmeTableModel model;
    /**
     * Creates new form FilmeGui
     */
    public FilmeGui() {
        initComponents();
        List<Filme> lista = new ArrayList<Filme>();
        FilmeController a = new FilmeController();
        lista = a.listarFilme();
    

        //cria o modelo de Produto      
        model = new FilmeTableModel(lista);

        //atribui o modelo à tabela
        Tabela.setModel(model);

        // Ordenar tabela conforme cabeçalho coluna clicado.
        Tabela.setAutoCreateRowSorter(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painel1 = new javax.swing.JPanel();
        lbFilme = new javax.swing.JLabel();
        TxtPesqFilme = new javax.swing.JTextField();
        btPesquisar = new javax.swing.JButton();
        ScrollPainel = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btAtualizar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        painel1.setBackground(new java.awt.Color(255, 255, 255));

        lbFilme.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lbFilme.setForeground(new java.awt.Color(255, 102, 0));
        lbFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Sign-Forward-icon.png"))); // NOI18N
        lbFilme.setText("Filmes");

        TxtPesqFilme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPesqFilmeKeyPressed(evt);
            }
        });

        btPesquisar.setBackground(new java.awt.Color(255, 255, 255));
        btPesquisar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 153, 51));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Magnifier-icon.png"))); // NOI18N
        btPesquisar.setBorderPainted(false);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Nome", "Genero"
            }
        ));
        ScrollPainel.setViewportView(Tabela);
        Tabela.getColumnModel().getColumn(0).setMinWidth(50);
        Tabela.getColumnModel().getColumn(0).setPreferredWidth(50);
        Tabela.getColumnModel().getColumn(0).setMaxWidth(50);

        btInserir.setBackground(new java.awt.Color(255, 255, 255));
        btInserir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btInserir.setForeground(new java.awt.Color(255, 153, 51));
        btInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Sign-Add-icon.png"))); // NOI18N
        btInserir.setToolTipText("Inserir");
        btInserir.setBorderPainted(false);
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btAtualizar.setBackground(new java.awt.Color(255, 255, 255));
        btAtualizar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btAtualizar.setForeground(new java.awt.Color(255, 153, 51));
        btAtualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Apps-system-software-update-icon.png"))); // NOI18N
        btAtualizar.setToolTipText("Atualizar");
        btAtualizar.setBorderPainted(false);
        btAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAtualizarActionPerformed(evt);
            }
        });

        btExcluir.setBackground(new java.awt.Color(255, 255, 255));
        btExcluir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btExcluir.setForeground(new java.awt.Color(255, 153, 51));
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/images/Delete-icon.png"))); // NOI18N
        btExcluir.setToolTipText("Excluir");
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
                    .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(painel1Layout.createSequentialGroup()
                            .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btAtualizar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btExcluir))
                        .addComponent(ScrollPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painel1Layout.createSequentialGroup()
                            .addComponent(TxtPesqFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painel1Layout.setVerticalGroup(
            painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TxtPesqFilme))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ScrollPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
         InserirFilmeGui ifg = new InserirFilmeGui(model);
        ifg.setLocationRelativeTo(null);
        ifg.setVisible(true);
    }//GEN-LAST:event_btInserirActionPerformed

    private void btAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAtualizarActionPerformed
       int selecionado = -1;
        selecionado = Tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer cdFilme = (Integer) model.getValueAt(selecionado, 0);
            AtualizarFilmeGui af = new AtualizarFilmeGui(selecionado, cdFilme, model);
            af.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar uma tabela");
        }
    }//GEN-LAST:event_btAtualizarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
       int selecionado = -1;
        selecionado = Tabela.getSelectedRow();

        if (selecionado >= 0) {
            Integer i = (Integer) model.getValueAt(selecionado, 0);
            FilmeController fc = new FilmeController();
            if (fc.excluir(i)){
            model.removeFilme(selecionado);
            }
        } else {
            JOptionPane.showMessageDialog(null, "É necesário selecionar uma linha");
        } 
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        efetuaPesquisa();
    }//GEN-LAST:event_btPesquisarActionPerformed

    private void TxtPesqFilmeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPesqFilmeKeyPressed
        efetuaPesquisa();
    }//GEN-LAST:event_TxtPesqFilmeKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPainel;
    private javax.swing.JTable Tabela;
    private javax.swing.JTextField TxtPesqFilme;
    private javax.swing.JButton btAtualizar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JLabel lbFilme;
    private javax.swing.JPanel painel1;
    // End of variables declaration//GEN-END:variables

    private void efetuaPesquisa() {
        String nome = TxtPesqFilme.getText();
        List<Filme> lista = new ArrayList<Filme>();
        FilmeController a = new FilmeController();
        lista = a.listarFilmesByNome(nome);
        model.limpar();

        //cria o modelo de Produto      
        model = new FilmeTableModel(lista);

        //atribui o modelo à tabela
        Tabela.setModel(model);
    }
}
