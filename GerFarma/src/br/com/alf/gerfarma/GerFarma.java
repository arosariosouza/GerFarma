package br.com.alf.gerfarma;

import br.com.alf.gerfarma.view.FrmPrincipal;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author flavio
 * @author lucisley
 * @author allan
 */
public class GerFarma {
    
    public static void main(String[] args) {
        //Coloca as telas com aparência do Windows 7
        try {
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
        } catch (InstantiationException ex) {
                System.out.println(ex.getMessage());
        } catch (IllegalAccessException ex) {
                System.out.println(ex.getMessage());
        } catch (UnsupportedLookAndFeelException ex) {
                System.out.println(ex.getMessage());
        }
        //Abre a tela principal do sistema
        new FrmPrincipal().setVisible(true);
    }
}