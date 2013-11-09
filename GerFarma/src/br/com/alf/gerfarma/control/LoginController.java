/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.control;

import br.com.alf.gerfarma.model.entity.Funcionario;
import br.com.alf.gerfarma.view.DlgLogin;
import br.com.alf.gerfarma.util.JPAUtil;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class LoginController {    
    
    @SuppressWarnings("empty-statement")
    private Funcionario buscarFuncionario(String usuario, String senha){
        EntityManager em = JPAUtil.getInstance();
        TypedQuery query = em.createNamedQuery("Funcionario.get", Funcionario.class)
                .setParameter("usuario", usuario)
                .setParameter("senha", senha);     
        if (query.getResultList().isEmpty()) {
            return null;
        };
        return (Funcionario) query.getSingleResult();
    }
    
    public void logarGerente(DlgLogin f) {
        String usuario = f.getFtxtUsuario().getText().trim();
        String senha = f.getFtxtSenha().getText();
        
        if (!usuario.equals(""))
        {
            if (!senha.equals("")) {
                Funcionario func = buscarFuncionario(usuario, senha);
                if (func != null) {
                    if (func.getCargo().equals(Funcionario.CARGO_GERENTE)) {
                        f.dispose();
                    } else {
                        JOptionPane.showMessageDialog(f, "Usuario não tem permissão para iniciar o sistema.");
                    }
                } else {
                    JOptionPane.showMessageDialog(f, "Usuario desconhecido.");
                    f.getFtxtUsuario().requestFocus();
                    f.getFtxtUsuario().selectAll();
                    f.getFtxtSenha().setText("");
                }
            } else {
                JOptionPane.showMessageDialog(f, "Por favor, informe a senha.");
                f.getFtxtSenha().requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(f, "Por favor, informe o usuário.");
            f.getFtxtUsuario().requestFocus();
        }
    }
}
