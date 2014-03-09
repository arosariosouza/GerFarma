/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.view;

import br.com.alf.gerfarma.control.GerFarmaController;
import br.com.alf.gerfarma.model.entity.Funcionario;
import br.com.alf.gerfarma.util.JPAUtil;
import java.awt.event.KeyEvent;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author allan
 */
public class DlgLogin extends javax.swing.JDialog {

    // Variavel que armazena a tela de tras
    public FrmPrincipal formPrincipal = null;

    /**
     * Creates new form DlgLogin
     *
     * @param parent
     * @param modal
     */
    public DlgLogin(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formPrincipal = (FrmPrincipal) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JFormattedTextField();
        btnEntrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        lblUsuario = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Gerfarma - Entrar");
        setResizable(false);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
        });

        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/entrar_32x32.png"))); // NOI18N
        btnEntrar.setMnemonic('e');
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/cancelar_32x32.png"))); // NOI18N
        btnCancelar.setMnemonic('a');
        btnCancelar.setText("Sair");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSenhaKeyReleased(evt);
            }
        });

        lblUsuario.setText("Usuário:");

        lblSenha.setText("Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsuario)
                            .addComponent(lblSenha))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenha)
                            .addComponent(txtUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSenha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEntrar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed

    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Fecha GerFarma
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

        private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
            String usuario = txtUsuario.getText().trim();
            String senha = txtSenha.getText();

            if (!usuario.equals("")) {
                if (!senha.equals("")) {
                    //Busca funcionario por usuario e senha no banco de dados
                    EntityManager em = JPAUtil.getInstance();
                    TypedQuery query = em.createNamedQuery("Funcionario.get", Funcionario.class)
                            .setParameter("usuario", usuario)
                            .setParameter("senha", senha);

                    Funcionario funcionario = null;
                    if (!query.getResultList().isEmpty()) {
                        funcionario = (Funcionario) query.getSingleResult();
                    }

                    if (funcionario != null) {
                        habilitarBotoes(funcionario.getCargo());
                        GerFarmaController.setFuncionarioCorrente(funcionario);
                        this.dispose();
                    } else {
                        JOptionPane.showMessageDialog(this, "Usuário desconhecido.");
                        txtUsuario.requestFocus();
                        txtUsuario.selectAll();
                        txtSenha.setText("");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, informe a senha.");
                    txtSenha.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, informe o usuário.");
                txtUsuario.requestFocus();
            }
        }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtSenhaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyReleased
        teclarEnter(evt);
    }//GEN-LAST:event_txtSenhaKeyReleased

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        
    }//GEN-LAST:event_txtUsuarioKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JFormattedTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void teclarEnter(KeyEvent evt) {
        int key=evt.getKeyCode();
        if(key==KeyEvent.VK_ENTER)
        { 
            btnEntrar.doClick();
        }
    }
    
    private void habilitarRelatorio(boolean op) {
        formPrincipal.getItmFM().setEnabled(op);
        formPrincipal.getItmMEB().setEnabled(op);
        formPrincipal.getItmMMV().setEnabled(op);
        formPrincipal.getItmVTM().setEnabled(op);
        formPrincipal.getItmVV().setEnabled(op);
    }

    private void habilitarCadastros(boolean op) {
        formPrincipal.getItmCliente().setEnabled(op);
        formPrincipal.getItmMedico().setEnabled(op);
        formPrincipal.getItmFuncionario().setEnabled(op);
        formPrincipal.getItmFornecedor().setEnabled(op);
        formPrincipal.getItmMedicamento().setEnabled(op);
        formPrincipal.getItmCartao().setEnabled(op);
    }

    private void habilitarBalcao(boolean op) {
        formPrincipal.getBtnBalcao().setEnabled(op);
        formPrincipal.getItmBalcao().setEnabled(op);
    }

    private void habilitarCompra(boolean op) {
        formPrincipal.getBtnCompra().setEnabled(op);
        formPrincipal.getItmCompra().setEnabled(op);
    }

    private void habilitarVenda(boolean op) {
        formPrincipal.getBtnVenda().setEnabled(op);
        formPrincipal.getItmVenda().setEnabled(op);
    }

    private void habilitarBotoes(String cargo) {
        if (cargo.equals(Funcionario.CARGO_CAIXA)) {
            habilitarVenda(true);
            habilitarCompra(false);
            habilitarBalcao(false);
            habilitarCadastros(false);
            habilitarRelatorio(false);
        } else {
            if (cargo.equals(Funcionario.CARGO_BALCONISTA)) {
                habilitarVenda(false);
                habilitarCompra(false);
                habilitarBalcao(true);
                habilitarCadastros(false);
                formPrincipal.getItmCliente().setEnabled(true);
                habilitarRelatorio(false);
            } else {
                if (cargo.equals(Funcionario.CARGO_FARMACEUTICO)) {
                    habilitarVenda(false);
                    habilitarCompra(false);
                    habilitarBalcao(true);
                    habilitarCadastros(false);
                    formPrincipal.getItmFornecedor().setEnabled(true);
                    formPrincipal.getItmMedicamento().setEnabled(true);
                    habilitarRelatorio(false);
                } else {
                    habilitarVenda(true);
                    habilitarCompra(true);
                    habilitarBalcao(true);
                    habilitarCadastros(true);
                    habilitarRelatorio(true);
                }
            }
        }

    }
}
