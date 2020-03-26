package UI;

import DatabaseLayer.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PhotoAlbumCreationInterface extends javax.swing.JFrame {

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

    public PhotoAlbumCreationInterface(int cno) {
        initComponents();
        this.cno = cno;
    }

    public PhotoAlbumCreationInterface() {
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
        AlbumType = new javax.swing.JComboBox();
        albumQuantity = new javax.swing.JSpinner();
        btnConfirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Photo Album Creation");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(90, 30, 460, 60);

        btnHome.setText("Home");
        jPanel1.add(btnHome);
        btnHome.setBounds(30, 150, 61, 23);

        btnBack.setText("Back");
        jPanel1.add(btnBack);
        btnBack.setBounds(30, 200, 55, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Album Type");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(250, 250, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 300, 110, 20);

        AlbumType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Wedding Album Classic", "Wedding Album Premium", "Family Album 1 (100 photos)", "Family Album 2 (300 photos)" }));
        jPanel1.add(AlbumType);
        AlbumType.setBounds(400, 250, 160, 30);
        jPanel1.add(albumQuantity);
        albumQuantity.setBounds(400, 300, 40, 20);

        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfirm);
        btnConfirm.setBounds(350, 390, 110, 23);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 600, 0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed

        db = db.getSingleInstance();
        type = (String) AlbumType.getSelectedItem();
        Q = (int) albumQuantity.getValue();
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
            case "Wedding Album Classic":
                odno = 1;
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

            case "Wedding Album Premium":
                odno = 1;
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

            case "Family Album 1 (100 photos)":
                odno = 1;
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

            case "Family Album 2 (300 photos)":
                odno = 1;
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

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhotoAlbumCreationInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox AlbumType;
    private javax.swing.JSpinner albumQuantity;
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
