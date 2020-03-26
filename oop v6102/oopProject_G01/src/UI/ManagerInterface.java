package UI;

public class ManagerInterface extends javax.swing.JFrame {
    int mng_no;
    public ManagerInterface() {
        initComponents();
    }
    
    public ManagerInterface(int mng_no) {
        initComponents();
        this.mng_no=mng_no;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnvieworders = new javax.swing.JButton();
        btnmonthlyreport = new javax.swing.JButton();
        btnviewemp = new javax.swing.JButton();
        btnAddNewEmp = new javax.swing.JButton();
        btnRemoveEmp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnvieworders.setText("View Orders");
        btnvieworders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewordersActionPerformed(evt);
            }
        });

        btnmonthlyreport.setText("View Monthly report");
        btnmonthlyreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmonthlyreportActionPerformed(evt);
            }
        });

        btnviewemp.setText("View Employees");
        btnviewemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewempActionPerformed(evt);
            }
        });

        btnAddNewEmp.setText("Add New Employees");
        btnAddNewEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewEmpActionPerformed(evt);
            }
        });

        btnRemoveEmp.setText("Remove Employees");
        btnRemoveEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEmpActionPerformed(evt);
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAddNewEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmonthlyreport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnvieworders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnviewemp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemoveEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(155, 155, 155))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnBack)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnvieworders)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnmonthlyreport)
                .addGap(18, 18, 18)
                .addComponent(btnviewemp)
                .addGap(18, 18, 18)
                .addComponent(btnAddNewEmp)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveEmp)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewordersActionPerformed
        ViewOrdersInterface_Mng vo=new ViewOrdersInterface_Mng(mng_no);
        vo.setVisible(true);
    }//GEN-LAST:event_btnviewordersActionPerformed

    private void btnAddNewEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewEmpActionPerformed
        AddNewEmployee n1 = new AddNewEmployee(mng_no);
        n1.setVisible(true);
    }//GEN-LAST:event_btnAddNewEmpActionPerformed

    private void btnRemoveEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEmpActionPerformed
        RemoveEmpoyeesInterface re=new RemoveEmpoyeesInterface(mng_no);
        re.setVisible(true);
    }//GEN-LAST:event_btnRemoveEmpActionPerformed

    private void btnmonthlyreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmonthlyreportActionPerformed
        Monthly_Report mr=new Monthly_Report(mng_no);
        mr.setVisible(true);
    }//GEN-LAST:event_btnmonthlyreportActionPerformed

    private void btnviewempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewempActionPerformed
        ViewEmployees ve=new ViewEmployees(mng_no);
        ve.setVisible(true);
    }//GEN-LAST:event_btnviewempActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        HomeWindow hw =new HomeWindow();
        hw.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        EmployeeLogin el=new EmployeeLogin();
        el.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewEmp;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnRemoveEmp;
    private javax.swing.JButton btnmonthlyreport;
    private javax.swing.JButton btnviewemp;
    private javax.swing.JButton btnvieworders;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
