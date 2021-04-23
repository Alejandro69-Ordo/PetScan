
package Vista;

import com.toedter.components.JSpinField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class Administrador extends javax.swing.JFrame {


    public Administrador() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRaza = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        btnMinimizarRaza = new javax.swing.JButton();
        btnCerrarRaza = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnGuardarRaza = new javax.swing.JButton();
        txtNombreRaza = new javax.swing.JTextField();
        txtIdRaza = new javax.swing.JTextField();
        spnAnosPromedio = new com.toedter.components.JSpinField();
        rbPerro = new javax.swing.JRadioButton();
        rbGato = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblFondoRaza = new javax.swing.JLabel();
        dlgInstituto = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        btnMinimizarInst = new javax.swing.JButton();
        btnCerrarInst = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnGuardarInst = new javax.swing.JButton();
        txtNombreInst = new javax.swing.JTextField();
        txtCallePrincipal = new javax.swing.JTextField();
        txtCalleSecundaria = new javax.swing.JTextField();
        txtIdInsti = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lblFondoInsti = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        btnReporteUsuario = new javax.swing.JButton();
        btnReporteMascota = new javax.swing.JButton();
        btnRegistroRaza = new javax.swing.JButton();
        btnRegistroInst = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        cerrar = new javax.swing.JButton();
        minimizar = new javax.swing.JButton();
        pnlMascota = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTablaM = new javax.swing.JTable();
        txtBuscarM = new javax.swing.JTextField();
        Busqueda = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnActualizarTblM = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        fondo1 = new javax.swing.JLabel();
        pnlUsuario = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnActualizarTbl = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        btnReporteCert = new javax.swing.JButton();
        Busqueda1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        fondo = new javax.swing.JLabel();
        Princ = new javax.swing.JPanel();
        fondo2 = new javax.swing.JLabel();

        dlgRaza.setUndecorated(true);
        dlgRaza.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("CREAR RAZA");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnMinimizarRaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/minimizar.png"))); // NOI18N
        btnMinimizarRaza.setBorder(null);
        btnMinimizarRaza.setContentAreaFilled(false);
        jPanel2.add(btnMinimizarRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        btnCerrarRaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/cerrar.png"))); // NOI18N
        btnCerrarRaza.setContentAreaFilled(false);
        jPanel2.add(btnCerrarRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setText("Años Proedio:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel19.setText("Nombre :");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel20.setText("ID Raza:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        btnGuardarRaza.setText("Guardar");
        jPanel3.add(btnGuardarRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));
        jPanel3.add(txtNombreRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 130, -1));
        jPanel3.add(txtIdRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 130, -1));
        jPanel3.add(spnAnosPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));

        rbPerro.setBackground(new java.awt.Color(255, 255, 255));
        rbPerro.setText("Perro");
        jPanel3.add(rbPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 20));

        rbGato.setBackground(new java.awt.Color(255, 255, 255));
        rbGato.setText("Gato");
        jPanel3.add(rbGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, 20));

        jLabel1.setText("Tipo Mascota:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 20));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 340, 200));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perroBlanco.png"))); // NOI18N
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        lblFondoRaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/fondodlg.PNG"))); // NOI18N
        jPanel2.add(lblFondoRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        dlgRaza.getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        dlgInstituto.setUndecorated(true);
        dlgInstituto.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizarInst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/minimizar.png"))); // NOI18N
        btnMinimizarInst.setBorder(null);
        btnMinimizarInst.setContentAreaFilled(false);
        jPanel4.add(btnMinimizarInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        btnCerrarInst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/cerrar.png"))); // NOI18N
        btnCerrarInst.setContentAreaFilled(false);
        jPanel4.add(btnCerrarInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 40, 40));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setText("Calle Secundaria :");
        jPanel5.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jLabel25.setText("Nombre :");
        jPanel5.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel26.setText("ID Instituto :");
        jPanel5.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel27.setText("Calle Principal :");
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 10, 150));

        btnGuardarInst.setText("GUARDAR");
        jPanel5.add(btnGuardarInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));
        jPanel5.add(txtNombreInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, -1));
        jPanel5.add(txtCallePrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, -1));
        jPanel5.add(txtCalleSecundaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));
        jPanel5.add(txtIdInsti, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 310, 210));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perroBlanco.png"))); // NOI18N
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("CREAR INSTITUTO");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        lblFondoInsti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/fondodlg.PNG"))); // NOI18N
        jPanel4.add(lblFondoInsti, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        dlgInstituto.getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(892, 496));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/menu-circle.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btnReporteUsuario.setBackground(new java.awt.Color(255, 255, 255));
        btnReporteUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/reporteUsuario.png"))); // NOI18N
        btnReporteUsuario.setBorder(null);
        btnReporteUsuario.setBorderPainted(false);
        getContentPane().add(btnReporteUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 70, 60, 50));

        btnReporteMascota.setBackground(new java.awt.Color(255, 255, 255));
        btnReporteMascota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/reporteMascota.png"))); // NOI18N
        btnReporteMascota.setBorder(null);
        btnReporteMascota.setBorderPainted(false);
        btnReporteMascota.setContentAreaFilled(false);
        btnReporteMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteMascotaActionPerformed(evt);
            }
        });
        getContentPane().add(btnReporteMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 120, 60, 50));

        btnRegistroRaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/crearRaza.png"))); // NOI18N
        btnRegistroRaza.setContentAreaFilled(false);
        getContentPane().add(btnRegistroRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 170, 60, 50));

        btnRegistroInst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/crearInst.png"))); // NOI18N
        btnRegistroInst.setContentAreaFilled(false);
        btnRegistroInst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroInstActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistroInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 220, 60, 50));

        jPanel1.setLayout(null);

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/cerrar.png"))); // NOI18N
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        jPanel1.add(cerrar);
        cerrar.setBounds(90, 0, 40, 40);

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/minimizar.png"))); // NOI18N
        minimizar.setBorderPainted(false);
        minimizar.setContentAreaFilled(false);
        minimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minimizarActionPerformed(evt);
            }
        });
        jPanel1.add(minimizar);
        minimizar.setBounds(50, 0, 40, 41);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, 130, 40));

        pnlMascota.setLayout(null);

        tblTablaM.setBackground(new java.awt.Color(0, 0, 0));
        tblTablaM.setForeground(new java.awt.Color(255, 255, 255));
        tblTablaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Mascota", "Id Tipo", "Nacimiento", "Descripiòn", "Tamaño", "Gènero", "Temperamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblTablaM);

        pnlMascota.add(jScrollPane2);
        jScrollPane2.setBounds(90, 160, 780, 210);

        txtBuscarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMActionPerformed(evt);
            }
        });
        pnlMascota.add(txtBuscarM);
        txtBuscarM.setBounds(260, 80, 190, 30);

        Busqueda.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda.setText("Busqueda:");
        pnlMascota.add(Busqueda);
        Busqueda.setBounds(170, 80, 89, 30);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        btnActualizarTblM.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnActualizarTblM.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTblM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/actualizar.png"))); // NOI18N
        btnActualizarTblM.setText("LISTAR");
        btnActualizarTblM.setContentAreaFilled(false);
        btnActualizarTblM.setFocusable(false);
        btnActualizarTblM.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnActualizarTblM.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel6.add(btnActualizarTblM);
        btnActualizarTblM.setBounds(-135, 0, 250, 41);

        pnlMascota.add(jPanel6);
        jPanel6.setBounds(500, 80, 430, 40);

        jPanel8.setBackground(new Color(255,255,255,25));
        pnlMascota.add(jPanel8);
        jPanel8.setBounds(80, 140, 800, 260);

        fondo1.setForeground(new java.awt.Color(255, 255, 255));
        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FONDO_R.USUARIO.jpeg"))); // NOI18N
        pnlMascota.add(fondo1);
        fondo1.setBounds(0, 0, 920, 500);

        getContentPane().add(pnlMascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 500));

        pnlUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        tblTabla.setBackground(new java.awt.Color(0, 0, 0));
        tblTabla.setForeground(new java.awt.Color(255, 255, 255));
        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Apellido", "Genero"
            }
        ));
        tblTabla.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tblTabla);

        pnlUsuario.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 770, 230));
        pnlUsuario.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 210, 30));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel7.setOpaque(false);
        jPanel7.setLayout(null);

        btnActualizarTbl.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnActualizarTbl.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/actualizar.png"))); // NOI18N
        btnActualizarTbl.setText("LISTAR");
        btnActualizarTbl.setContentAreaFilled(false);
        btnActualizarTbl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnActualizarTbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnActualizarTbl.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnActualizarTbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTblActionPerformed(evt);
            }
        });
        jPanel7.add(btnActualizarTbl);
        btnActualizarTbl.setBounds(0, 0, 115, 40);

        btnReporte.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/reporte.png"))); // NOI18N
        btnReporte.setText("REPORTE ");
        btnReporte.setContentAreaFilled(false);
        btnReporte.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnReporte.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReporte.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });
        jPanel7.add(btnReporte);
        btnReporte.setBounds(110, 0, 150, 40);

        btnReporteCert.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btnReporteCert.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteCert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/certificado.png"))); // NOI18N
        btnReporteCert.setText("CERTIFICADO");
        btnReporteCert.setContentAreaFilled(false);
        btnReporteCert.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteCert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteCertActionPerformed(evt);
            }
        });
        jPanel7.add(btnReporteCert);
        btnReporteCert.setBounds(235, 0, 160, 40);

        pnlUsuario.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 420, 40));

        Busqueda1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        Busqueda1.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda1.setText("Busqueda:");
        pnlUsuario.add(Busqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 90, 30));

        jPanel9.setBackground(new Color(255,255,255,25));
        pnlUsuario.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 790, 270));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FONDO_R.USUARIO.jpeg"))); // NOI18N
        pnlUsuario.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 500));

        getContentPane().add(pnlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        Princ.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FONDO_R.USUARIO.jpeg"))); // NOI18N
        Princ.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 500));

        getContentPane().add(Princ, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minimizarActionPerformed

    private void btnReporteMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteMascotaActionPerformed

    private void btnRegistroInstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroInstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistroInstActionPerformed

    private void btnReporteCertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteCertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteCertActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed

    private void txtBuscarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarMActionPerformed

    private void btnActualizarTblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTblActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTblActionPerformed


    public JButton getCerrar() {
        return cerrar;
    }

    public void setCerrar(JButton cerrar) {
        this.cerrar = cerrar;
    }

    public JButton getMinimizar() {
        return minimizar;
    }

    public void setMinimizar(JButton minimizar) {
        this.minimizar = minimizar;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTblTabla() {
        return tblTabla;
    }

    public void setTblTabla(JTable tblTabla) {
        this.tblTabla = tblTabla;
    }

    public JTextField getTxtBuscar() {
        return txtBuscar;
    }

    public void setTxtBuscar(JTextField txtBuscar) {
        this.txtBuscar = txtBuscar;
    }

    public JButton getBtnActualizarTbl() {
        return btnActualizarTbl;
    }

    public void setBtnActualizarTbl(JButton btnActualizarTbl) {
        this.btnActualizarTbl = btnActualizarTbl;
    }

    public JButton getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(JButton btnMenu) {
        this.btnMenu = btnMenu;
    }

    public JButton getBtnReporteMascota() {
        return btnReporteMascota;
    }

    public void setBtnReporteMascota(JButton btnReporteMascota) {
        this.btnReporteMascota = btnReporteMascota;
    }

    public JButton getBtnReporteUsuario() {
        return btnReporteUsuario;
    }

    public void setBtnReporteUsuario(JButton btnReporteUsuario) {
        this.btnReporteUsuario = btnReporteUsuario;
    }

    public JPanel getPnlUsuario() {
        return pnlUsuario;
    }

    public void setPnlUsuario(JPanel pnlUsuario) {
        this.pnlUsuario = pnlUsuario;
    }

    public JPanel getPrinc() {
        return Princ;
    }

    public void setPrinc(JPanel Princ) {
        this.Princ = Princ;
    }

    public JButton getBtnActualizarTblM() {
        return btnActualizarTblM;
    }

    public void setBtnActualizarTblM(JButton btnActualizarTblM) {
        this.btnActualizarTblM = btnActualizarTblM;
    }

    public JPanel getPnlMascota() {
        return pnlMascota;
    }

    public void setPnlMascota(JPanel pnlMascota) {
        this.pnlMascota = pnlMascota;
    }

    public JTable getTblTablaM() {
        return tblTablaM;
    }

    public void setTblTablaM(JTable tblTablaM) {
        this.tblTablaM = tblTablaM;
    }

    public JTextField getTxtBuscarM() {
        return txtBuscarM;
    }

    public void setTxtBuscarM(JTextField txtBuscarM) {
        this.txtBuscarM = txtBuscarM;
    }

    public JButton getBtnCerrarInst() {
        return btnCerrarInst;
    }

    public void setBtnCerrarInst(JButton btnCerrarInst) {
        this.btnCerrarInst = btnCerrarInst;
    }

    public JButton getBtnCerrarRaza() {
        return btnCerrarRaza;
    }

    public void setBtnCerrarRaza(JButton btnCerrarRaza) {
        this.btnCerrarRaza = btnCerrarRaza;
    }

    public JButton getBtnGuardarInst() {
        return btnGuardarInst;
    }

    public void setBtnGuardarInst(JButton btnGuardarInst) {
        this.btnGuardarInst = btnGuardarInst;
    }

    public JButton getBtnGuardarRaza() {
        return btnGuardarRaza;
    }

    public void setBtnGuardarRaza(JButton btnGuardarRaza) {
        this.btnGuardarRaza = btnGuardarRaza;
    }

    public JButton getBtnMinimizarInst() {
        return btnMinimizarInst;
    }

    public void setBtnMinimizarInst(JButton btnMinimizarInst) {
        this.btnMinimizarInst = btnMinimizarInst;
    }

    public JButton getBtnMinimizarRaza() {
        return btnMinimizarRaza;
    }

    public void setBtnMinimizarRaza(JButton btnMinimizarRaza) {
        this.btnMinimizarRaza = btnMinimizarRaza;
    }

    public JDialog getDlgInstituto() {
        return dlgInstituto;
    }

    public void setDlgInstituto(JDialog dlgInstituto) {
        this.dlgInstituto = dlgInstituto;
    }

    public JDialog getDlgRaza() {
        return dlgRaza;
    }

    public void setDlgRaza(JDialog dlgRaza) {
        this.dlgRaza = dlgRaza;
    }

    public JSpinField getSpnAnosPromedio() {
        return spnAnosPromedio;
    }

    public void setSpnAnosPromedio(JSpinField spnAnosPromedio) {
        this.spnAnosPromedio = spnAnosPromedio;
    }

    public JTextField getTxtCallePrincipal() {
        return txtCallePrincipal;
    }

    public void setTxtCallePrincipal(JTextField txtCallePrincipal) {
        this.txtCallePrincipal = txtCallePrincipal;
    }

    public JTextField getTxtCalleSecundaria() {
        return txtCalleSecundaria;
    }

    public void setTxtCalleSecundaria(JTextField txtCalleSecundaria) {
        this.txtCalleSecundaria = txtCalleSecundaria;
    }

    public JTextField getTxtIdInsti() {
        return txtIdInsti;
    }

    public void setTxtIdInsti(JTextField txtIdInsti) {
        this.txtIdInsti = txtIdInsti;
    }

    public JTextField getTxtIdRaza() {
        return txtIdRaza;
    }

    public void setTxtIdRaza(JTextField txtIdRaza) {
        this.txtIdRaza = txtIdRaza;
    }

    public JTextField getTxtNombreInst() {
        return txtNombreInst;
    }

    public void setTxtNombreInst(JTextField txtNombreInst) {
        this.txtNombreInst = txtNombreInst;
    }

    public JTextField getTxtNombreRaza() {
        return txtNombreRaza;
    }

    public void setTxtNombreRaza(JTextField txtNombreRaza) {
        this.txtNombreRaza = txtNombreRaza;
    }

    public JButton getBtnRegistroInst() {
        return btnRegistroInst;
    }

    public void setBtnRegistroInst(JButton btnRegistroInst) {
        this.btnRegistroInst = btnRegistroInst;
    }

    public JButton getBtnRegistroRaza() {
        return btnRegistroRaza;
    }

    public void setBtnRegistroRaza(JButton btnRegistroRaza) {
        this.btnRegistroRaza = btnRegistroRaza;
    }

    public JRadioButton getRbGato() {
        return rbGato;
    }

    public void setRbGato(JRadioButton rbGato) {
        this.rbGato = rbGato;
    }

    public JRadioButton getRbPerro() {
        return rbPerro;
    }

    public void setRbPerro(JRadioButton rbPerro) {
        this.rbPerro = rbPerro;
    }

    public JButton getBtnReporte() {
        return btnReporte;
    }

    public void setBtnReporte(JButton btnReporte) {
        this.btnReporte = btnReporte;
    }

    public JButton getBtnReporteCert() {
        return btnReporteCert;
    }

    public void setBtnReporteCert(JButton btnReporteCert) {
        this.btnReporteCert = btnReporteCert;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Busqueda;
    private javax.swing.JLabel Busqueda1;
    private javax.swing.JPanel Princ;
    private javax.swing.JButton btnActualizarTbl;
    private javax.swing.JButton btnActualizarTblM;
    private javax.swing.JButton btnCerrarInst;
    private javax.swing.JButton btnCerrarRaza;
    private javax.swing.JButton btnGuardarInst;
    private javax.swing.JButton btnGuardarRaza;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMinimizarInst;
    private javax.swing.JButton btnMinimizarRaza;
    private javax.swing.JButton btnRegistroInst;
    private javax.swing.JButton btnRegistroRaza;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnReporteCert;
    private javax.swing.JButton btnReporteMascota;
    private javax.swing.JButton btnReporteUsuario;
    private javax.swing.JButton cerrar;
    private javax.swing.JDialog dlgInstituto;
    private javax.swing.JDialog dlgRaza;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFondoInsti;
    private javax.swing.JLabel lblFondoRaza;
    private javax.swing.JButton minimizar;
    private javax.swing.JPanel pnlMascota;
    private javax.swing.JPanel pnlUsuario;
    private javax.swing.JRadioButton rbGato;
    private javax.swing.JRadioButton rbPerro;
    private com.toedter.components.JSpinField spnAnosPromedio;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTable tblTablaM;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarM;
    private javax.swing.JTextField txtCallePrincipal;
    private javax.swing.JTextField txtCalleSecundaria;
    private javax.swing.JTextField txtIdInsti;
    private javax.swing.JTextField txtIdRaza;
    private javax.swing.JTextField txtNombreInst;
    private javax.swing.JTextField txtNombreRaza;
    // End of variables declaration//GEN-END:variables
}
