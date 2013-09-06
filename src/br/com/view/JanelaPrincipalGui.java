package br.com.view;

/**
 *
 * @author celio_henrique
 */
public class JanelaPrincipalGui extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipalGui
     */
    public JanelaPrincipalGui() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem1 = new componentes.UJPanelImagem();
        btFilme = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu - Bem vindo!");

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\celio_henrique\\Desktop\\images\\historia-do-cinema-03.jpg"));

        btFilme.setBackground(new java.awt.Color(204, 204, 204));
        btFilme.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btFilme.setText("Filme");
        btFilme.setBorderPainted(false);
        btFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFilmeActionPerformed(evt);
            }
        });

        btFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        btFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btFuncionario.setText("Funcionário");
        btFuncionario.setBorderPainted(false);
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(406, Short.MAX_VALUE))
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uJPanelImagem1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(430, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFilmeActionPerformed
        FilmeGui fg = new FilmeGui();
        fg.setLocationRelativeTo(fg);
        fg.setVisible(true);
    }//GEN-LAST:event_btFilmeActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        FuncionarioGui fg = new FuncionarioGui();
        fg.setLocationRelativeTo(fg);
        fg.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFilme;
    private javax.swing.JButton btFuncionario;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
