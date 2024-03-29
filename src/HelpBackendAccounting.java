
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorg
 */
public class HelpBackendAccounting extends javax.swing.JFrame {

    /**
     * Creates new form HelpBackendAccounting
     */
    public HelpBackendAccounting() {
        initComponents();
        displayHelp();
    }

    public void displayHelp(){
        try
        {
            String line = "";
            Scanner file = new Scanner(new File("HelpBackendAccounting.txt"));
            txtHelpAccountingBackend.setText("");
            while(file.hasNextLine()){
                line = file.nextLine();
                txtHelpAccountingBackend.append(line + "\n");
            }
            file.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File was not found");
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCompanyNameBackendAccountingHelp = new javax.swing.JLabel();
        lblHeadingBackendAccounting = new javax.swing.JLabel();
        txtHelpAccountingBackend = new java.awt.TextArea();
        btnHelpBackendAccounting = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCompanyNameBackendAccountingHelp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblCompanyNameBackendAccountingHelp.setText("OBIJENCY FOOD STUFF");

        lblHeadingBackendAccounting.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHeadingBackendAccounting.setText("HOW TO USE THE BACKEND ACCOUNTING PAGE");

        txtHelpAccountingBackend.setEditable(false);

        btnHelpBackendAccounting.setText("BACK");
        btnHelpBackendAccounting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHelpBackendAccountingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(lblCompanyNameBackendAccountingHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lblHeadingBackendAccounting))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(txtHelpAccountingBackend, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnHelpBackendAccounting)
                .addGap(312, 312, 312))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCompanyNameBackendAccountingHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(lblHeadingBackendAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHelpAccountingBackend, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnHelpBackendAccounting)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHelpBackendAccountingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHelpBackendAccountingActionPerformed
        BackendAccounting hba = new BackendAccounting();
        hba.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHelpBackendAccountingActionPerformed

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
            java.util.logging.Logger.getLogger(HelpBackendAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HelpBackendAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HelpBackendAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HelpBackendAccounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HelpBackendAccounting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHelpBackendAccounting;
    private javax.swing.JLabel lblCompanyNameBackendAccountingHelp;
    private javax.swing.JLabel lblHeadingBackendAccounting;
    private java.awt.TextArea txtHelpAccountingBackend;
    // End of variables declaration//GEN-END:variables
}
