package br.com.app;

import br.com.view.JanelaPrincipalGui;

/**
 *
 * @author celio_henrique
 */
public class Principal {
    
    public static void main(String[] args) {
        JanelaPrincipalGui jpg = new JanelaPrincipalGui();
        jpg.setLocationRelativeTo(jpg);
        
        jpg.setVisible(true);
    }
}
