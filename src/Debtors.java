import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author victorg
 */
public class Debtors extends javax.swing.JFrame {

    /**
     * Creates new form Debtors
     */
    public Debtors() {
        initComponents();
        DatabaseConnection db = new DatabaseConnection();
        ResultSet rs = db.displayDebtors();
        tblDebtorsTable.setModel(DbUtils.resultSetToTableModel(rs));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyNameDebtors = new javax.swing.JLabel();
        lblHeadingDebtors = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDebtorsTable = new javax.swing.JTable();
        btnDebtorsMainMenu = new javax.swing.JButton();
        btnDebtorsHelp = new javax.swing.JButton();
        btnAddDebtor = new javax.swing.JButton();
        btnRemoveDebtor = new javax.swing.JButton();
        btnEditDebtor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCompanyNameDebtors.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCompanyNameDebtors.setText("OBIJENCY FOOD STUFF");

        lblHeadingDebtors.setText("DEBTOR'S TABLE");

        tblDebtorsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "DebtorsID", "Name", "Surname", "Amount Owed", "TransactionID", "Phone Number", "Email Address", "ID Number"
            }
        ));
        jScrollPane1.setViewportView(tblDebtorsTable);

        btnDebtorsMainMenu.setText("BACK TO MAIN MENU");
        btnDebtorsMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebtorsMainMenuActionPerformed(evt);
            }
        });

        btnDebtorsHelp.setText("HELP");
        btnDebtorsHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDebtorsHelpActionPerformed(evt);
            }
        });

        btnAddDebtor.setText("ADD DEBTOR");
        btnAddDebtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDebtorActionPerformed(evt);
            }
        });

        btnRemoveDebtor.setText("REMOVE DEBTOR");
        btnRemoveDebtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveDebtorActionPerformed(evt);
            }
        });

        btnEditDebtor.setText("EDIT");
        btnEditDebtor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDebtorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblCompanyNameDebtors)
                        .addGap(0, 142, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnDebtorsMainMenu)
                        .addGap(69, 69, 69)
                        .addComponent(btnAddDebtor)
                        .addGap(60, 60, 60)
                        .addComponent(btnRemoveDebtor)
                        .addGap(45, 45, 45)
                        .addComponent(btnEditDebtor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDebtorsHelp)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(lblHeadingDebtors)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCompanyNameDebtors, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblHeadingDebtors, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDebtorsMainMenu)
                    .addComponent(btnDebtorsHelp)
                    .addComponent(btnAddDebtor)
                    .addComponent(btnRemoveDebtor)
                    .addComponent(btnEditDebtor))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDebtorsMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebtorsMainMenuActionPerformed
        MainMenu d = new MainMenu();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDebtorsMainMenuActionPerformed

    private void btnDebtorsHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDebtorsHelpActionPerformed
        HelpDebtors dt = new HelpDebtors();
        dt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDebtorsHelpActionPerformed

    private void btnAddDebtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDebtorActionPerformed
        String name = JOptionPane.showInputDialog(this, "Enter the name of the debtor.");
        String surname = JOptionPane.showInputDialog(this, "Enter the surname of the debtor.");
        Double amount = Double.parseDouble(JOptionPane.showInputDialog(this, "Enter the amount of the transaction."));
        int transaction = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the transaction ID."));
        String phone = JOptionPane.showInputDialog(this, "Enter the phone number.");
        String email = JOptionPane.showInputDialog(this, "Enter the email address.");
        String id = JOptionPane.showInputDialog(this, "Enter the ID number");
        String adminPassword = JOptionPane.showInputDialog(this, "Enter the "
                + "password of sn admin user.");
       DatabaseConnection dc = new DatabaseConnection();
       boolean match = dc.validateAdminPassword(adminPassword);
       if(match == true){
        int row = dc.addDebtor(name, surname, amount, transaction, phone, email, id);
        if (row > 0) {
            JOptionPane.showMessageDialog(lblCompanyNameDebtors, "The debtor has been added");
        }
        else{
            JOptionPane.showMessageDialog(lblCompanyNameDebtors, "The debtor has not been added");
        }
       }
    }//GEN-LAST:event_btnAddDebtorActionPerformed

    private void btnRemoveDebtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveDebtorActionPerformed
        DatabaseConnection dc = new DatabaseConnection();
        int change = Integer.parseInt(JOptionPane.showInputDialog(lblCompanyNameDebtors, "Enter the debtor ID of the debtor." ));
        String adminPassword = JOptionPane.showInputDialog(this, "Enter the "
                + "password of sn admin user.");
        boolean match = dc.validateAdminPassword(adminPassword);
        if(match == true){
        int row = dc.removeDebtor(change);
        if (row > 0) {
            JOptionPane.showMessageDialog(lblCompanyNameDebtors, "The debtor has been removed");
        }
        else{
            JOptionPane.showMessageDialog(lblCompanyNameDebtors, "The debtor has not been removed");
        }
        }
    }//GEN-LAST:event_btnRemoveDebtorActionPerformed

    private void btnEditDebtorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDebtorActionPerformed
        DatabaseConnection dc = new DatabaseConnection();
        int dID = Integer.parseInt(JOptionPane.showInputDialog(this, "Enter the ID of the debtor."));
        String[] choices = {"Name", "Surname", "PhoneNumber", "EmailAddress"};
        int x = JOptionPane.showOptionDialog(this, "Please select the details that you want to change.",
                "Click a button",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, choices, choices[0]);
        String opt = choices[x];
        String nValue = JOptionPane.showInputDialog(this, "Enter the new " + opt + " for the debtor");
        int row = dc.editDebtor(dID, opt, nValue);
        if(row > 0){
            JOptionPane.showMessageDialog(lblCompanyNameDebtors, "The " + opt 
            + " has been updated");
        }
        else{
            JOptionPane.showMessageDialog(lblCompanyNameDebtors, "The " + opt 
            + " has been updated");
        }
    }//GEN-LAST:event_btnEditDebtorActionPerformed

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
            java.util.logging.Logger.getLogger(Debtors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Debtors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Debtors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Debtors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Debtors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDebtor;
    private javax.swing.JButton btnDebtorsHelp;
    private javax.swing.JButton btnDebtorsMainMenu;
    private javax.swing.JButton btnEditDebtor;
    private javax.swing.JButton btnRemoveDebtor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCompanyNameDebtors;
    private javax.swing.JLabel lblHeadingDebtors;
    private javax.swing.JTable tblDebtorsTable;
    // End of variables declaration//GEN-END:variables
}