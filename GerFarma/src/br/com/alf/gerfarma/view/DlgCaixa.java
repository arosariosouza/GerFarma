/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.alf.gerfarma.view;

/**
 *
 * @author flavio
 */
public class DlgCaixa extends javax.swing.JFrame {

        /**
         * Creates new form DlgCaixa
         */
        public DlgCaixa() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form. WARNING: Do NOT
         * modify this code. The content of this method is always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                MasterTable = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                pnlVenda = new javax.swing.JPanel();
                lblCodigo = new javax.swing.JLabel();
                lblNCodigo = new javax.swing.JLabel();
                lblQuantidade = new javax.swing.JLabel();
                lblNQuantidade = new javax.swing.JLabel();
                lblPrecoUnitario = new javax.swing.JLabel();
                lblNPrecoUnitario = new javax.swing.JLabel();
                lblPrecoTotal = new javax.swing.JLabel();
                lblNPrecoTotal = new javax.swing.JLabel();
                pnlProduto = new javax.swing.JPanel();
                lblMeicamento = new javax.swing.JLabel();
                lblProduto = new javax.swing.JLabel();
                btnFormaPagamento = new javax.swing.JButton();
                lblCancelamento = new javax.swing.JButton();
                lblFinalizar = new javax.swing.JButton();
                lblAdicionarMedicamento = new javax.swing.JButton();
                txtPesquisar = new javax.swing.JTextField();
                lblPesquisar = new javax.swing.JLabel();
                lblCodigoPreVenda = new javax.swing.JLabel();
                txtCodigoPreVenda = new javax.swing.JTextField();
                lblFuncionario = new javax.swing.JLabel();
                txtFuncionario = new javax.swing.JTextField();
                btnAdicionarPreVenda = new javax.swing.JButton();
                lblImagemcaixa = new javax.swing.JLabel();
                lblimagemFundo = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null},
                                {null, null, null, null}
                        },
                        new String [] {
                                "Title 1", "Title 2", "Title 3", "Title 4"
                        }
                ));
                MasterTable.setViewportView(jTable1);

                getContentPane().add(MasterTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 330));

                lblCodigo.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                lblCodigo.setText("Codígo");

                lblNCodigo.setText("121");

                lblQuantidade.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                lblQuantidade.setText("Quantidade");

                lblNQuantidade.setText("21");

                lblPrecoUnitario.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                lblPrecoUnitario.setText("Preço Unitario");

                lblNPrecoUnitario.setText("R$ 6,00");

                lblPrecoTotal.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                lblPrecoTotal.setText("Preço Total");

                lblNPrecoTotal.setText("R$ 7,40");

                javax.swing.GroupLayout pnlVendaLayout = new javax.swing.GroupLayout(pnlVenda);
                pnlVenda.setLayout(pnlVendaLayout);
                pnlVendaLayout.setHorizontalGroup(
                        pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblCodigo)
                                        .addComponent(lblNCodigo)
                                        .addComponent(lblQuantidade)
                                        .addComponent(lblNQuantidade)
                                        .addComponent(lblPrecoUnitario)
                                        .addComponent(lblNPrecoUnitario)
                                        .addComponent(lblPrecoTotal)
                                        .addComponent(lblNPrecoTotal))
                                .addContainerGap(85, Short.MAX_VALUE))
                );
                pnlVendaLayout.setVerticalGroup(
                        pnlVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlVendaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNQuantidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPrecoUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNPrecoUnitario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblPrecoTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNPrecoTotal)
                                .addContainerGap(16, Short.MAX_VALUE))
                );

                getContentPane().add(pnlVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 250, 260));

                pnlProduto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

                lblMeicamento.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
                lblMeicamento.setText("Diclofenaco De Potacio");

                javax.swing.GroupLayout pnlProdutoLayout = new javax.swing.GroupLayout(pnlProduto);
                pnlProduto.setLayout(pnlProdutoLayout);
                pnlProdutoLayout.setHorizontalGroup(
                        pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlProdutoLayout.createSequentialGroup()
                                .addComponent(lblMeicamento)
                                .addGap(0, 198, Short.MAX_VALUE))
                );
                pnlProdutoLayout.setVerticalGroup(
                        pnlProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlProdutoLayout.createSequentialGroup()
                                .addComponent(lblMeicamento)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                getContentPane().add(pnlProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 450, -1));

                lblProduto.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                lblProduto.setText("Produto");
                getContentPane().add(lblProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, -1, -1));

                btnFormaPagamento.setText("Forma de Pagamento");
                getContentPane().add(btnFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

                lblCancelamento.setText("Cancelamento");
                getContentPane().add(lblCancelamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

                lblFinalizar.setText("Finalizar Venda");
                getContentPane().add(lblFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, -1, -1));

                lblAdicionarMedicamento.setText("Adicionar Medicamento");
                getContentPane().add(lblAdicionarMedicamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, -1, -1));
                getContentPane().add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 350, -1));

                lblPesquisar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
                lblPesquisar.setText("Pesquisar:");
                getContentPane().add(lblPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

                lblCodigoPreVenda.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
                lblCodigoPreVenda.setText("Codígo Pre-venda:");
                getContentPane().add(lblCodigoPreVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));
                getContentPane().add(txtCodigoPreVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 350, -1));

                lblFuncionario.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
                lblFuncionario.setText("Funcionario:");
                getContentPane().add(lblFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
                getContentPane().add(txtFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 350, -1));

                btnAdicionarPreVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/adicionar_16x16.png"))); // NOI18N
                btnAdicionarPreVenda.setText("Adicionar");
                getContentPane().add(btnAdicionarPreVenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

                lblImagemcaixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/caixa64x64.png"))); // NOI18N
                getContentPane().add(lblImagemcaixa, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, -1));

                lblimagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/alf/gerfarma/view/img/ImagemFundo_800x600.png"))); // NOI18N
                getContentPane().add(lblimagemFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 520));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
                 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(DlgCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(DlgCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(DlgCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(DlgCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
        //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new DlgCaixa().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JScrollPane MasterTable;
        private javax.swing.JButton btnAdicionarPreVenda;
        private javax.swing.JButton btnFormaPagamento;
        private javax.swing.JTable jTable1;
        private javax.swing.JButton lblAdicionarMedicamento;
        private javax.swing.JButton lblCancelamento;
        private javax.swing.JLabel lblCodigo;
        private javax.swing.JLabel lblCodigoPreVenda;
        private javax.swing.JButton lblFinalizar;
        private javax.swing.JLabel lblFuncionario;
        private javax.swing.JLabel lblImagemcaixa;
        private javax.swing.JLabel lblMeicamento;
        private javax.swing.JLabel lblNCodigo;
        private javax.swing.JLabel lblNPrecoTotal;
        private javax.swing.JLabel lblNPrecoUnitario;
        private javax.swing.JLabel lblNQuantidade;
        private javax.swing.JLabel lblPesquisar;
        private javax.swing.JLabel lblPrecoTotal;
        private javax.swing.JLabel lblPrecoUnitario;
        private javax.swing.JLabel lblProduto;
        private javax.swing.JLabel lblQuantidade;
        private javax.swing.JLabel lblimagemFundo;
        private javax.swing.JPanel pnlProduto;
        private javax.swing.JPanel pnlVenda;
        private javax.swing.JTextField txtCodigoPreVenda;
        private javax.swing.JTextField txtFuncionario;
        private javax.swing.JTextField txtPesquisar;
        // End of variables declaration//GEN-END:variables
}