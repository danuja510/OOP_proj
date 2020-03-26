package UI;

import DatabaseLayer.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BannerPrintingInterface extends javax.swing.JFrame {

    int cno;
    DBConnection db;
    ResultSet rs;
    String type;
    int Q;
    int odno;
    int orderno;
    String description = "Banner Printing";
    float price;
    float total_price;
    float cost;
    String q1 = "select standard_quality_price from order_details where odno=";
    String q2 = "select cost_per_standard_order from order_details where odno=";

    public BannerPrintingInterface(int cno) {
        initComponents();
        this.cno = cno;
    }

    public BannerPrintingInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnHome = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BannerType = new javax.swing.JComboBox();
        BannerQuantity = new javax.swing.JSpinner();
        btnConfirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Banner Printing");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 20, 300, 50);

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome);
        btnHome.setBounds(30, 110, 61, 23);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack);
        btnBack.setBounds(30, 160, 55, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Banner Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(260, 260, 110, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(260, 310, 70, 17);

        BannerType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BannerType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classic 36x72", "Large 48x72" }));
        jPanel1.add(BannerType);
        BannerType.setBounds(400, 250, 90, 30);

        BannerQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel1.add(BannerQuantity);
        BannerQuantity.setBounds(400, 310, 40, 20);

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm);
        btnConfirm.setBounds(330, 390, 100, 40);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 0, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:

        db = db.getSingleInstance();
        type = (String) BannerType.getSelectedItem();
        Q = (int) BannerQuantity.getValue();
        String Query = "select MAX(orderno) from orders_oop";
        try {
            rs = db.Fetch(Query);

            while (rs.next()) {
                orderno = rs.getInt(1);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        orderno++;

        switch (type) {
            case "Classic 36x72":
                odno = 9;
                description += type + " x" + Q;
                rs = db.Fetch(q1 + odno);

                try {
                    while (rs.next()) {
                        price = (rs.getInt(1)) * Q;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                total_price = price + (price * 0.1f);
                rs = db.Fetch(q2 + odno);

                try {
                    while (rs.next()) {
                        cost = (rs.getInt(1)) * Q;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                break;

            case "Large 48x72":
                odno = 10;
                description += type + " x" + Q;
                rs = db.Fetch(q1 + odno);

                try {
                    while (rs.next()) {
                        price = (rs.getInt(1)) * Q;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                total_price = price + (price * 0.1f);
                rs = db.Fetch(q2 + odno);

                try {
                    while (rs.next()) {
                        cost = (rs.getInt(1)) * Q;
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex);
                }
                break;
        }
        String q3 = "insert into orders_oop(orderno,odno,cno,description,price,total_price,status,order_date,total_cost) values (" + orderno + "," + odno + "," + cno + ",'" + description + "'," + price + "," + total_price + ",'On Hold',GETDATE()," + cost + ")";
        db.ExecuteQuery(q3);
        JOptionPane.showMessageDialog(rootPane, "Order Confirmed  OrderNo:" + orderno + " Total Price:" + price + " You will receive an E-mail when the order is ready to be collected. Thanks for Choosing N&C Photo Labs ;-)");
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
         HomeWindow hw =new HomeWindow();
        hw.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomePlaceOrder cpo=new CustomePlaceOrder(cno);
        cpo.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BannerPrintingInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner BannerQuantity;
    private javax.swing.JComboBox BannerType;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
