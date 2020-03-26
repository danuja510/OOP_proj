package UI;
import DatabaseLayer.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class StudioFamilyPhotographsInterface extends javax.swing.JFrame {

    int cno;
    DBConnection db;
    ResultSet rs;
    String type;
    int Q;
    int odno;
    int orderno;
    String description = "Studio Family Photographs";
    float price;
    float total_price;
    float cost;
    String q1 = "select standard_quality_price from order_details where odno=";
    String q2 = "select cost_per_standard_order from order_details where odno=";

    public StudioFamilyPhotographsInterface(int cno) {
        initComponents();
        this.cno = cno;
    }

    public StudioFamilyPhotographsInterface() {
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
        SFPType = new javax.swing.JComboBox();
        SFPQuantity = new javax.swing.JSpinner();
        btnConfirm = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Studio Family Photo");

        btnHome.setText("Home");

        btnBack.setText("Back");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Type");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Quantity");

        SFPType.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SFPType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Classic 12x10", "Large 20x17.5" }));

        SFPQuantity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnConfirm.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBack))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(SFPType, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnHome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(410, 410, 410)
                        .addComponent(SFPQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnBack)
                        .addGap(37, 37, 37)
                        .addComponent(SFPType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnHome))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(SFPQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:

        db = db.getSingleInstance();
        type = (String) SFPType.getSelectedItem();
        Q = (int) SFPQuantity.getValue();
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
            case "Classic 12x10":
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

            case "Large 20x17.5":
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
                new StudioFamilyPhotographsInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner SFPQuantity;
    private javax.swing.JComboBox SFPType;
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
