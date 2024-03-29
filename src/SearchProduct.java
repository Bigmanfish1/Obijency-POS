
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victorg
 */
public class SearchProduct extends javax.swing.JFrame {

    DefaultListModel dft = new DefaultListModel();
    /**
     * Creates new form SearchProduct
     */
    public SearchProduct() {
        
        initComponents();
        this.bindData();
    }
    
    private ArrayList getStars(){
    
        ArrayList products = new ArrayList();
        products.add("Sniper");
        products.add("Damatol");
        products.add("Extra Virgin Olive Oil");
        products.add("Razor Blade");
        products.add("Triple Action Cream");
        products.add("After Shave");
        products.add("Air Freshner");
        products.add("Soap");
        products.add("Perfume");
        products.add("Aboniki Balm");
        products.add("Lexus For Men");
        products.add("Grandpa");
        products.add("Smokers Toothbrush");
        products.add("Med Lemon");
        products.add("Eno");
        products.add("Tom Tom");
        products.add("Butter Mint");
        products.add("Carotone");
        products.add("Airtime/ Data");
        products.add("Scrub");
        products.add("Dragon Energy Drink");
        products.add("Amstel Malta Non-alcoholic");
        products.add("Maltina Classic Non-alcoholic");
        products.add("Malta Guiness Non-alcoholic");
        products.add("Oasis Water 500ml RO3");
        products.add("Oasis Water 1.5 L RO3");
        products.add("A & N Chemicals Handy Cleaner 5L");
        products.add("A & N Chemicals Shower Gel 1L");
        products.add("A & N Chemicals Foam Bath 5L");
        products.add("A & N Chemicals Thick Bleach 5L");
        products.add("A & N Chemicals Pine Gel 1L");
        products.add("A & N Chemicals Dish Washing Liquid 5L");
        products.add("A & N Chemicals Washing Powder 20L");
        products.add("Ankara Wax");
        products.add("Ankara Cloth");
        products.add("Chin-Chin");
        products.add("Peanuts (Peeled)");
        products.add("Cashew Nuts");
        products.add("Granauts");
        products.add("Red Oil 500ml");
        products.add("Red Oil 750ml");
        products.add("Red Oil 2L");
        products.add("Yellow Garri");
        products.add("Semolina (Small)");
        products.add("Semolina (Large)");
        products.add("Indomi Noodles (single)");
        products.add("Maggi Cubes");
        products.add("Basmati Rice (Large)");
        products.add("Basmati Rice (Small)");
        products.add("White Garri (Large)");
        products.add("White Garri (Medium)");
        products.add("White Garri (Small)");
        products.add("Crayfish (Small)");
        products.add("Crayfish (Medium)");
        products.add("Crayfish (Large)");
        products.add("Beans (Large)");
        products.add("Beans (Medium)");
        products.add("Beans (Small)");
        products.add("Abacha");
        products.add("White Beans (Large)");
         products.add("White Beans (Medium)");
        products.add("White Beans (Small)");
        products.add("Ogbono (Large)");
        products.add("Ogbono (Medium)");
        products.add("Ogbono (Small)");
        products.add("Egusi (Large)");
        products.add("Egusi (Medium)");
        products.add("Egusi (Small)");
        products.add("Pepper soup");
        products.add("Uda");
        products.add("Uziza");
        products.add("Ede");
        products.add("Achi");
        products.add("Cameroon Pepper (Ose)");
        products.add("Ose (Orange)");
        products.add("Scent leave");
        products.add("Maggi Cube (Star) Pack");
        products.add("aggi Cube (Knorr) Pack");
        
        return products;
    }

    private void bindData(){
        getStars().stream().forEach((star) -> {dft.addElement(star);});
        
        lstItems.setModel(dft);
        lstItems.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    private void searchFilter(String searchTerm){
        DefaultListModel fI = new DefaultListModel();
        ArrayList stars = getStars();
        
        stars.stream().forEach((star) -> {
            String starName = star.toString().toLowerCase();
            if (starName.contains(searchTerm.toLowerCase())) {
                fI.addElement(star);
            }
        });
        dft = fI;
        lstItems.setModel(dft);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSearch = new javax.swing.JLabel();
        txtSearchItem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstItems = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSearch.setText("SEARCH:");

        txtSearchItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchItemActionPerformed(evt);
            }
        });
        txtSearchItem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchItemKeyReleased(evt);
            }
        });

        lstItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstItems);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearchItem)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchItem, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchItemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchItemKeyReleased
        searchFilter(txtSearchItem.getText());
    }//GEN-LAST:event_txtSearchItemKeyReleased

    private void lstItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstItemsMouseClicked
        String pro = lstItems.getSelectedValue().toString();
        new ManualTransaction(pro).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lstItemsMouseClicked

    private void txtSearchItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchItemActionPerformed

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
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JList lstItems;
    private javax.swing.JTextField txtSearchItem;
    // End of variables declaration//GEN-END:variables
}
