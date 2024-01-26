import java.io.*;
import java.sql.ResultSet;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author victorg
 */
public class QRcodeTransaction extends javax.swing.JFrame {

    /**
     * Creates new form QRcodeTransaction
     */
    public QRcodeTransaction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyNameQR = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQRtable = new javax.swing.JTable();
        btnQRTRansaction = new javax.swing.JButton();
        btnQRMainMenu = new javax.swing.JButton();
        btnQRCheckout = new javax.swing.JButton();
        btnQRHelp = new javax.swing.JButton();
        btnRemoveItemQR = new javax.swing.JButton();
        txtBarcode = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCompanyNameQR.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCompanyNameQR.setText("OBIJENCY FOOD STUFF");

        tblQRtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BARCODE", "ITEM", "PRICE", "PRODUCT TYPE"
            }
        ));
        jScrollPane1.setViewportView(tblQRtable);

        btnQRTRansaction.setText("BACK");
        btnQRTRansaction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRTRansactionActionPerformed(evt);
            }
        });

        btnQRMainMenu.setText("CANCEL");

        btnQRCheckout.setText("CHECKOUT");
        btnQRCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRCheckoutActionPerformed(evt);
            }
        });

        btnQRHelp.setText("HELP");
        btnQRHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRHelpActionPerformed(evt);
            }
        });

        btnRemoveItemQR.setText("REMOVE AN ITEM");

        txtBarcode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtBarcodeMouseReleased(evt);
            }
        });
        txtBarcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBarcodeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnQRMainMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQRTRansaction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnQRCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnRemoveItemQR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnQRHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCompanyNameQR)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCompanyNameQR, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnQRTRansaction)
                            .addComponent(btnRemoveItemQR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQRMainMenu)
                            .addComponent(btnQRHelp))
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnQRCheckout)
                        .addGap(60, 60, 60))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQRTRansactionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRTRansactionActionPerformed
        Transaction qr = new Transaction();
        qr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQRTRansactionActionPerformed

    private void btnQRHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRHelpActionPerformed
        HelpQRTransaction qrt = new HelpQRTransaction();
        qrt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQRHelpActionPerformed

    private void btnQRCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRCheckoutActionPerformed
        Checkout qr = new Checkout();
        qr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnQRCheckoutActionPerformed

    private void txtBarcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBarcodeKeyReleased

        String bar = txtBarcode.getText();
        DatabaseConnection dc = new DatabaseConnection();
        ResultSet rs = dc.getBarcodeProduct(bar);
        tblQRtable.setModel(DbUtils.resultSetToTableModel(rs));
        
        
    }//GEN-LAST:event_txtBarcodeKeyReleased

    private void txtBarcodeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtBarcodeMouseReleased
        
    }//GEN-LAST:event_txtBarcodeMouseReleased

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
            java.util.logging.Logger.getLogger(QRcodeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QRcodeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QRcodeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QRcodeTransaction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QRcodeTransaction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQRCheckout;
    private javax.swing.JButton btnQRHelp;
    private javax.swing.JButton btnQRMainMenu;
    private javax.swing.JButton btnQRTRansaction;
    private javax.swing.JButton btnRemoveItemQR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompanyNameQR;
    private javax.swing.JTable tblQRtable;
    private javax.swing.JTextField txtBarcode;
    // End of variables declaration//GEN-END:variables
}
