/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author USUARIO
 */
public class frmSeguimiento extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmSeguimiento
     */
    public frmSeguimiento() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        cbxProyectoS = new javax.swing.JComboBox<>();
        txtVencimiento = new javax.swing.JTextField();
        txtTitulos0 = new javax.swing.JTextField();
        txtPresentacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos2 = new javax.swing.JTable();
        btnRegistrar2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblCantidad2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Vencimiento    :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Proyecto       :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("N° Titulo        :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 160, 50));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Estado             :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 160, 50));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Presentacion  :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 160, 50));

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 210, 40));

        cbxProyectoS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxProyectoS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxProyectoSActionPerformed(evt);
            }
        });
        jPanel2.add(cbxProyectoS, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 210, 40));
        jPanel2.add(txtVencimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 210, 40));

        txtTitulos0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTitulos0ActionPerformed(evt);
            }
        });
        jPanel2.add(txtTitulos0, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 210, 40));
        jPanel2.add(txtPresentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 210, 40));

        tblDatos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDatos2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 520, 350));

        btnRegistrar2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar2.setText("REGISTRAR");
        jPanel2.add(btnRegistrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 170, 50));

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));

        lblCantidad2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCantidad2.setText("Cantidad de Registro :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(732, Short.MAX_VALUE)
                .addComponent(lblCantidad2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCantidad2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 990, 60));

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USUARIO\\OneDrive - Universidad Tecnologica del Peru\\Desktop\\Logo_Vector.png")); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setText("SEGUIMIENTO");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 370, 80));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 110));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitulos0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTitulos0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTitulos0ActionPerformed

    private void cbxProyectoSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxProyectoSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxProyectoSActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistrar2;
    public javax.swing.JComboBox<String> cbxEstado;
    public javax.swing.JComboBox<String> cbxProyectoS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblCantidad2;
    public javax.swing.JTable tblDatos2;
    public javax.swing.JTextField txtPresentacion;
    public javax.swing.JTextField txtTitulos0;
    public javax.swing.JTextField txtVencimiento;
    // End of variables declaration//GEN-END:variables
}