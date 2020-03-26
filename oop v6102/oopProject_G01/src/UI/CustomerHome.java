package UI;

public class CustomerHome extends javax.swing.JFrame {

    public CustomerHome() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnlogin1 = new javax.swing.JButton();
        btnsignup1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Customer");

        btnlogin1.setText("Login");
        btnlogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogin1ActionPerformed(evt);
            }
        });

        btnsignup1.setText("sign up");
        btnsignup1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignup1ActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(452, 452, 452)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(434, 434, 434)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnsignup1)
                            .addComponent(btnlogin1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnBack)))
                .addContainerGap(445, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(84, 84, 84)
                .addComponent(btnlogin1)
                .addGap(63, 63, 63)
                .addComponent(btnsignup1)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogin1ActionPerformed
        CustomerLogin cl = new CustomerLogin();
        cl.setVisible(true);
    }//GEN-LAST:event_btnlogin1ActionPerformed

    private void btnsignup1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignup1ActionPerformed
       CustomerSignUp csu=new CustomerSignUp();
        csu.setVisible(true);
    }//GEN-LAST:event_btnsignup1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        HomeWindow hw =new HomeWindow();
        hw.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnlogin1;
    private javax.swing.JButton btnsignup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
