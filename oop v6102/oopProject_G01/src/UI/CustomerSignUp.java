package UI;

import javax.swing.JOptionPane;
import DatabaseLayer.DBConnection;
import java.sql.ResultSet;

public class CustomerSignUp extends javax.swing.JFrame {

    String fname;
    String lname;
    String email;
    String password;
    String tpno;
    int cno = 0;
    DBConnection db;
    ResultSet rs;

    public CustomerSignUp() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerFName = new javax.swing.JTextField();
        txtCustomerLName = new javax.swing.JTextField();
        txtCustomerEmail = new javax.swing.JTextField();
        txtCustomerTP = new javax.swing.JTextField();
        txtCustomerPW1 = new javax.swing.JPasswordField();
        txtCustomerPW2 = new javax.swing.JPasswordField();
        btnSignUp2 = new javax.swing.JButton();
        btnCustomerLogin2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("New Customer Sign up");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("Email");

        jLabel5.setText("TP No");

        jLabel6.setText("Password");

        jLabel7.setText("Confirm Password");

        btnSignUp2.setText("Sign Up");
        btnSignUp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUp2ActionPerformed(evt);
            }
        });

        btnCustomerLogin2.setText("Login");
        btnCustomerLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerLogin2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSignUp2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCustomerFName)
                                    .addComponent(txtCustomerLName)
                                    .addComponent(txtCustomerEmail)
                                    .addComponent(txtCustomerTP, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtCustomerPW1)
                                    .addComponent(txtCustomerPW2))
                                .addGap(135, 135, 135)
                                .addComponent(btnCustomerLogin2)))))
                .addContainerGap(349, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCustomerFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomerLogin2))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCustomerLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtCustomerTP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCustomerPW1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCustomerPW2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSignUp2)
                .addContainerGap(114, Short.MAX_VALUE))
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

    private void btnSignUp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUp2ActionPerformed
        db = DBConnection.getSingleInstance();
        if ((txtCustomerPW1.getText()).equals(txtCustomerPW2.getText())) {
            fname = txtCustomerFName.getText();

            lname = txtCustomerLName.getText();
            email = txtCustomerEmail.getText();
            password = txtCustomerPW1.getText();
            tpno = txtCustomerTP.getText();
            String Query = "select MAX(cno) from Customer_oop";
            try {
                rs = db.Fetch(Query);

                while (rs.next()) {
                    cno = rs.getInt(1);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            cno++;
            //String Query = "insert into Customer_oop(cno,fname,lname,email,tp_no,password) values(" + cno + ",\'" + fname + "\',\'" + lname + "\',\'" + email + "\',\'" + tpno + "\',\'" + password + "\');";
            String Query2 = "insert into Customer_oop(cno,fname,lname,email,tp_no,password) values(" + cno + ",'" + fname + "','" + lname + "','" + email + "','" + tpno + "','" + password + "');";
            db.ExecuteQuery(Query2);
            JOptionPane.showMessageDialog(rootPane, "Account Created! Your Customer No: C" + cno);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Passwords are not the same");
        }

    }//GEN-LAST:event_btnSignUp2ActionPerformed

    private void btnCustomerLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerLogin2ActionPerformed
        CustomerLogin cl = new CustomerLogin();
        cl.setVisible(true);
    }//GEN-LAST:event_btnCustomerLogin2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerLogin2;
    private javax.swing.JButton btnSignUp2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCustomerEmail;
    private javax.swing.JTextField txtCustomerFName;
    private javax.swing.JTextField txtCustomerLName;
    private javax.swing.JPasswordField txtCustomerPW1;
    private javax.swing.JPasswordField txtCustomerPW2;
    private javax.swing.JTextField txtCustomerTP;
    // End of variables declaration//GEN-END:variables
}
