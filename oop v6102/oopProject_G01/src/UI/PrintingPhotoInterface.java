package UI;

import DatabaseLayer.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PrintingPhotoInterface extends javax.swing.JFrame {

    int cno;
    DBConnection db;
    ResultSet rs;
    String size;
    int no;
    int odno;
    int orderno;
    String description = "Photo Printing ";
    float price;
    float total_price;
    float cost;
    String q1 = "select standard_quality_price from order_details where odno=";
    String q2 = "select cost_per_standard_order from order_details where odno=";

    public PrintingPhotoInterface(int cno) {
        initComponents();
        this.cno = cno;
    }

    public PrintingPhotoInterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbsize = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sNo = new javax.swing.JSpinner();
        btnConfirm = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel3.setText("Photo Printing");

        cbsize.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbsize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Classic 6x4", "Classic 6x4.5", "Large 8x6", "Large 9x6", "Square 5X5", "Square 8x8" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Select Size");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("No. Of Photos");

        sNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(501, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 151, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(btnHome))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(cbsize, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(256, 256, 256)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(426, 426, 426)
                            .addComponent(sNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(316, 316, 316)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 209, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(btnBack)
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(146, 146, 146)
                            .addComponent(btnHome)
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbsize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(246, 246, 246)
                            .addComponent(sNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(326, 326, 326)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        db = db.getSingleInstance();
        size = (String) cbsize.getSelectedItem();
        no = (int) sNo.getValue();
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
        switch (size) {
            case "Classic 6x4":
            odno = 1;
            description += size + " x" + no;
            rs = db.Fetch(q1 + odno);

            try {
                while (rs.next()) {
                    price = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            total_price = price + (price * 0.1f);
            rs = db.Fetch(q2 + odno);

            try {
                while (rs.next()) {
                    cost = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            break;
            case "Classic 6x4.5":
            odno = 2;
            description += size + " x" + no;
            rs = db.Fetch(q1 + odno);

            try {
                while (rs.next()) {
                    price = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            total_price = price + (price * 0.1f);
            rs = db.Fetch(q2 + odno);

            try {
                while (rs.next()) {
                    cost = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            break;
            case "Large 8x6":
            odno = 3;
            description += size + " x" + no;
            rs = db.Fetch(q1 + odno);

            try {
                while (rs.next()) {
                    price = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            total_price = price + (price * 0.1f);
            rs = db.Fetch(q2 + odno);

            try {
                while (rs.next()) {
                    cost = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            break;
            case "Large 9x6":
            odno = 4;
            description += size + " x" + no;
            rs = db.Fetch(q1 + odno);

            try {
                while (rs.next()) {
                    price = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            total_price = price + (price * 0.1f);
            rs = db.Fetch(q2 + odno);

            try {
                while (rs.next()) {
                    cost = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            break;
            case "Square 5X5":
            odno = 5;
            description += size + " x" + no;
            rs = db.Fetch(q1 + odno);

            try {
                while (rs.next()) {
                    price = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            total_price = price + (price * 0.1f);
            rs = db.Fetch(q2 + odno);

            try {
                while (rs.next()) {
                    cost = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            break;
            case "Square 8x8":
            odno = 6;
            description += size + " x" + no;
            rs = db.Fetch(q1 + odno);

            try {
                while (rs.next()) {
                    price = (rs.getInt(1)) * no;
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(rootPane, ex);
            }
            total_price = price + (price * 0.1f);
            rs = db.Fetch(q2 + odno);

            try {
                while (rs.next()) {
                    cost = (rs.getInt(1)) * no;
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
                new PrintingPhotoInterface().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnHome;
    private javax.swing.JComboBox<String> cbsize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner sNo;
    // End of variables declaration//GEN-END:variables
}
