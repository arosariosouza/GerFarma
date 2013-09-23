package br.com.alf.gerfarma;

import br.com.alf.gerfarma.view.FrmPrincipal;
import javax.swing.UIManager;

/**
 *
 * @author flavio
 * @author lucisley
 * @author allan
 */
public class GerFarma {
    
    public static void main(String[] args) {
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        new FrmPrincipal().setVisible(true);
    }
}