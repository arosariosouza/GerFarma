/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.alf.gerfarma.view;

import br.com.alf.gerfarma.control.JusCadastroController;
import br.com.alf.gerfarma.model.entity.Pessoa;
import java.awt.Frame;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;

/**
 *
 * @author allan
 */
public class DlgBalcao extends javax.swing.JDialog {

    /**
     * Creates new form DlgBalcao
     */
    public DlgBalcao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Preenche o nome do Funcionario logado no sistema
        txtFuncionario.setText(JusCadastroController.getFuncionarioCorrente().getUsuario());
        
        carregarListaDeClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                entityManager0 = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("gerfarma?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
                preVendaQuery = java.beans.Beans.isDesignTime() ? null : entityManager0.createQuery("SELECT p FROM PreVenda p");
                preVendaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : preVendaQuery.getResultList();
                lblFuncionario = new javax.swing.JLabel();
                txtFuncionario = new javax.swing.JTextField();
                lblData = new javax.swing.JLabel();
                lblDataHora = new javax.swing.JLabel();
                lblCliente = new javax.swing.JLabel();
                cbxClientes = new javax.swing.JComboBox();
                pnlProdutos = new javax.swing.JPanel();
                lblPesquisar = new javax.swing.JLabel();
                txtPesquisar = new javax.swing.JFormattedTextField();
                lblQtde = new javax.swing.JLabel();
                txtNumeroQtde = new javax.swing.JFormattedTextField();
                lblValorUnitario = new javax.swing.JLabel();
                lblValor = new javax.swing.JLabel();
                btnAdicinar = new javax.swing.JButton();
                sclProduto = new javax.swing.JScrollPane();
                tblProduto = new javax.swing.JTable();
                btnRemover = new javax.swing.JButton();
                lblLogo = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jlValorTotal = new javax.swing.JLabel();
                jPanel3 = new javax.swing.JPanel();
                jLabelodBalcao = new javax.swing.JLabel();
                btnNovo = new javax.swing.JButton();
                btnConsulta = new javax.swing.JButton();
                btnCancela = new javax.swing.JButton();
                btnFinaliza = new javax.swing.JButton();
                lblControleMedico = new javax.swing.JLabel();
                btnAdicionarCliente = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setTitle("GerFarma - Balcão");
                setIconImage(new ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/logo_32x29.png")).getImage());

                lblFuncionario.setText("Funcionário:");

                txtFuncionario.setEditable(false);

                lblData.setText("Data:");

                lblDataHora.setText("23/09/2013 - 17:10");

                lblCliente.setText("Cliente:*");

                cbxClientes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Allan Carlos do Rosário Souza", "Flávio Lúcio Curado", "Lucisley Pereira Soares" }));
                cbxClientes.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cbxClientesActionPerformed(evt);
                        }
                });

                pnlProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder("Produtos"));

                lblPesquisar.setText("Pesquisar:");

                lblQtde.setText("Qtde:");

                txtNumeroQtde.setText("1");

                lblValorUnitario.setText("Valor Unitário:");

                lblValor.setText("R$ 1,00");

                btnAdicinar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/adicionar_16x16.png"))); // NOI18N
                btnAdicinar.setText("Adicionar");

                tblProduto.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null},
                                {null, null, null, null, null}
                        },
                        new String [] {
                                "Código", "Produto", "Qtde.", "Valor Unitário", "Valor Total do Produto"
                        }
                ));
                sclProduto.setViewportView(tblProduto);

                btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/remover_16x16.png"))); // NOI18N
                btnRemover.setText("Remover");

                javax.swing.GroupLayout pnlProdutosLayout = new javax.swing.GroupLayout(pnlProdutos);
                pnlProdutos.setLayout(pnlProdutosLayout);
                pnlProdutosLayout.setHorizontalGroup(
                        pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlProdutosLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(sclProduto)
                                        .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                .addComponent(lblPesquisar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblQtde)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtNumeroQtde, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblValorUnitario)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblValor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAdicinar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                pnlProdutosLayout.setVerticalGroup(
                        pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlProdutosLayout.createSequentialGroup()
                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblPesquisar)
                                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblQtde)
                                        .addComponent(txtNumeroQtde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblValorUnitario)
                                        .addComponent(lblValor)
                                        .addComponent(btnAdicinar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnlProdutosLayout.createSequentialGroup()
                                                .addComponent(btnRemover)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(sclProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addContainerGap())
                );

                lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/balcao_48x48.png"))); // NOI18N

                jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Total (R$)"));

                jlValorTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jlValorTotal.setForeground(new java.awt.Color(49, 106, 197));
                jlValorTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jlValorTotal.setText("108,00");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jlValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jlValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Código Balcão"));

                jLabelodBalcao.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
                jLabelodBalcao.setForeground(new java.awt.Color(49, 106, 197));
                jLabelodBalcao.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabelodBalcao.setText("163434");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelodBalcao, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                .addContainerGap())
                );
                jPanel3Layout.setVerticalGroup(
                        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelodBalcao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/novo_32x32.png"))); // NOI18N
                btnNovo.setText("F2 Novo");

                btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/consulta_32x32.png"))); // NOI18N
                btnConsulta.setText("F3 Consulta");

                btnCancela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/cancelar_32x32.png"))); // NOI18N
                btnCancela.setText("F4 Cancela");

                btnFinaliza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/aplicar_32x32.png"))); // NOI18N
                btnFinaliza.setText("F5 Finaliza");

                lblControleMedico.setForeground(new java.awt.Color(255, 0, 0));
                lblControleMedico.setText("* Campo obrigatório para venda de medicamento controlado");

                btnAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/adicionar_16x16.png"))); // NOI18N
                btnAdicionarCliente.setText("Adicionar");
                btnAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnAdicionarClienteActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(pnlProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lblFuncionario)
                                                                        .addComponent(lblCliente))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(lblData)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(lblDataHora))
                                                                        .addComponent(cbxClientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(184, 184, 184)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnCancela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnFinaliza, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblControleMedico)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblFuncionario)
                                                        .addComponent(txtFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblData)
                                                        .addComponent(lblDataHora))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lblCliente)
                                                        .addComponent(cbxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnAdicionarCliente)))
                                        .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCancela, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(pnlProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblControleMedico)
                                .addGap(0, 12, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarClienteActionPerformed
        new PnlCliente().mostrar(this);
    }//GEN-LAST:event_btnAdicionarClienteActionPerformed

        private void cbxClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxClientesActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_cbxClientesActionPerformed


        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnAdicinar;
        private javax.swing.JButton btnAdicionarCliente;
        private javax.swing.JButton btnCancela;
        private javax.swing.JButton btnConsulta;
        private javax.swing.JButton btnFinaliza;
        private javax.swing.JButton btnNovo;
        private javax.swing.JButton btnRemover;
        private javax.swing.JComboBox cbxClientes;
        private javax.persistence.EntityManager entityManager0;
        private javax.swing.JLabel jLabelodBalcao;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JLabel jlValorTotal;
        private javax.swing.JLabel lblCliente;
        private javax.swing.JLabel lblControleMedico;
        private javax.swing.JLabel lblData;
        private javax.swing.JLabel lblDataHora;
        private javax.swing.JLabel lblFuncionario;
        private javax.swing.JLabel lblLogo;
        private javax.swing.JLabel lblPesquisar;
        private javax.swing.JLabel lblQtde;
        private javax.swing.JLabel lblValor;
        private javax.swing.JLabel lblValorUnitario;
        private javax.swing.JPanel pnlProdutos;
        private java.util.List<br.com.alf.gerfarma.view.PreVenda> preVendaList;
        private javax.persistence.Query preVendaQuery;
        private javax.swing.JScrollPane sclProduto;
        private javax.swing.JTable tblProduto;
        private javax.swing.JTextField txtFuncionario;
        private javax.swing.JFormattedTextField txtNumeroQtde;
        private javax.swing.JFormattedTextField txtPesquisar;
        // End of variables declaration//GEN-END:variables
    
    private EntityManager entityManager;
    private Query query;
    
    private void carregarListaDeClientes() {
        //Buscando nome de clientes do banco
        entityManager = Persistence.createEntityManagerFactory("GERFARMAPU").createEntityManager();
        query = entityManager.createQuery("SELECT p.nome FROM Pessoa p");
        List<String> clientes = query.getResultList();
        
        //Adicionando nomes de clientes
        cbxClientes.removeAllItems();
        cbxClientes.addItem("Selecione um cliente");
        for (String cliente : clientes) {
            cbxClientes.addItem(cliente);
        }
    }
}
