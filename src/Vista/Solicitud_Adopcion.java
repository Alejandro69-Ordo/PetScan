/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import AppPackage.AnimationClass;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author HP
 */
public class Solicitud_Adopcion extends javax.swing.JFrame {

    /**
     * Creates new form Solicitud_Adopcion
     */
    public Solicitud_Adopcion() {
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

        menu = new javax.swing.JButton();
        informacion = new javax.swing.JButton();
        solicitud = new javax.swing.JButton();
        labelparte1 = new javax.swing.JLabel();
        labelparte2 = new javax.swing.JLabel();
        boton_movimiento = new javax.swing.JButton();
        boton_dez_cerrarseci = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        label_na = new javax.swing.JLabel();
        label_cedula = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        panel_adopcion = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        r_tipo_vivienda = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        r_adopcion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        r_provincia = new javax.swing.JComboBox<>();
        r_ciudad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        r_espacio = new javax.swing.JSpinner();
        enviar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        panel_informacion = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        label_foto = new javax.swing.JLabel();
        tama??o = new javax.swing.JLabel();
        temperamento = new javax.swing.JLabel();
        genero = new javax.swing.JLabel();
        esterilizacion = new javax.swing.JLabel();
        a??o_nacimiento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JLabel();
        Fondo = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        minimizar = new javax.swing.JButton();
        cerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(913, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/menu-circle.png"))); // NOI18N
        menu.setBorderPainted(false);
        menu.setContentAreaFilled(false);
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });
        getContentPane().add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 60, -1));

        informacion.setBackground(new java.awt.Color(255, 255, 255));
        informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/mascotas_s.png"))); // NOI18N
        informacion.setBorder(null);
        informacion.setBorderPainted(false);
        informacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informacionActionPerformed(evt);
            }
        });
        getContentPane().add(informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 160, 60, 60));

        solicitud.setBackground(new java.awt.Color(255, 255, 255));
        solicitud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/solicitud.png"))); // NOI18N
        solicitud.setBorder(null);
        solicitud.setBorderPainted(false);
        solicitud.setContentAreaFilled(false);
        solicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solicitudActionPerformed(evt);
            }
        });
        getContentPane().add(solicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 90, 60, -1));

        labelparte1.setFont(new java.awt.Font("Viner Hand ITC", 2, 36)); // NOI18N
        labelparte1.setText("INFORMACI??N DE ");
        getContentPane().add(labelparte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 340, 40));

        labelparte2.setFont(new java.awt.Font("Viner Hand ITC", 2, 36)); // NOI18N
        labelparte2.setText("LA  MASCOTA");
        getContentPane().add(labelparte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 270, 40));

        boton_movimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/hacia_izquierda.png"))); // NOI18N
        boton_movimiento.setBorder(null);
        boton_movimiento.setBorderPainted(false);
        boton_movimiento.setContentAreaFilled(false);
        boton_movimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_movimientoActionPerformed(evt);
            }
        });
        getContentPane().add(boton_movimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 490, -1, 60));

        boton_dez_cerrarseci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/volver.png"))); // NOI18N
        boton_dez_cerrarseci.setBorder(null);
        boton_dez_cerrarseci.setBorderPainted(false);
        boton_dez_cerrarseci.setContentAreaFilled(false);
        getContentPane().add(boton_dez_cerrarseci, new org.netbeans.lib.awtextra.AbsoluteConstraints(856, 560, -1, 40));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setOpaque(false);
        jPanel10.setLayout(null);

        label_na.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        label_na.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/usuario_dez.png"))); // NOI18N
        label_na.setText("Alejandro Ordo??ez");
        jPanel10.add(label_na);
        label_na.setBounds(0, 0, 250, 40);

        label_cedula.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        label_cedula.setText("0106928039");
        jPanel10.add(label_cedula);
        label_cedula.setBounds(60, 40, 110, 21);
        jPanel10.add(jSeparator2);
        jSeparator2.setBounds(10, 38, 200, 2);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 485, 220, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/WhatsApp Image 2021-04-02 at 19.09.44 (1).jpeg"))); // NOI18N
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 360, 370));

        panel_adopcion.setBackground(new Color(255,255,255,25));
        panel_adopcion.setOpaque(false);
        panel_adopcion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new Color(0,0,0,50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/LOGO_P1.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, 21));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/LOGO_P2.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, -1, 84));

        jLabel8.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel8.setText("Tipo de Vivienda:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        r_tipo_vivienda.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        r_tipo_vivienda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa independiente", "Estudio", "Piso", "D??plex", "??tico", "Buhardilla", "Loft" }));
        jPanel1.add(r_tipo_vivienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 177, -1));

        jLabel9.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel9.setText("Raz??n de Adopci??n");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, 20));

        r_adopcion.setColumns(20);
        r_adopcion.setLineWrap(true);
        r_adopcion.setRows(5);
        jScrollPane1.setViewportView(r_adopcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 200, 60));

        jLabel10.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel10.setText("Disponibilidad de espacio");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        r_provincia.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        r_provincia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azuay", "Loja", "Guayas" }));
        jPanel1.add(r_provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 100, -1));

        r_ciudad.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel1.add(r_ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Provincia");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 65, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Ciudad");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 79, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 54, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 2, 54));

        jLabel11.setFont(new java.awt.Font("Gotham Thin", 0, 14)); // NOI18N
        jLabel11.setText("Localidad");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        r_espacio.setModel(new javax.swing.SpinnerNumberModel(1, 1, 15, 1));
        jPanel1.add(r_espacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 65, -1));

        enviar.setBackground(new Color(255,34,44,50));
        enviar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Enviar Solicitud");
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 120, 30));

        cancelar.setBackground(new Color(43,94,255,50));
        cancelar.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Cancelar");
        cancelar.setBorder(null);
        cancelar.setBorderPainted(false);
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 102, 30));

        jLabel18.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jLabel18.setText("KM");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, -1, 20));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        panel_adopcion.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 440, 480));

        getContentPane().add(panel_adopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1010, 540));

        panel_informacion.setOpaque(false);
        panel_informacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new Color(0,0,0,50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel12.setText("Temperamento:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel13.setText("A??o Nacimiento:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 130, -1));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel14.setText("Descripci??n:");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel15.setText("Tama??o:");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel16.setText("Esterilizaci??n");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 220, 100, -1));

        jLabel17.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel17.setText("Genero:");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 40));

        jPanel5.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 2, 250));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));
        jPanel8.setLayout(null);

        label_foto.setBackground(new java.awt.Color(0, 0, 0));
        label_foto.setOpaque(true);
        jPanel8.add(label_foto);
        label_foto.setBounds(10, 10, 110, 110);

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 120, 130));

        tama??o.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        tama??o.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(tama??o, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 70, 30));

        temperamento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(temperamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 120, 30));

        genero.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        genero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 100, 30));

        esterilizacion.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        esterilizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(esterilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 120, 30));

        a??o_nacimiento.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        a??o_nacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(a??o_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel1.setText("Cm");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, 30));

        descripcion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane2.setViewportView(descripcion);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 160, 80));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        panel_informacion.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 490, 480));

        getContentPane().add(panel_informacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 560));

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/minimizar.png"))); // NOI18N
        minimizar.setBorderPainted(false);
        minimizar.setContentAreaFilled(false);
        jPanel3.add(minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 0, 34, -1));

        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/cerrar.png"))); // NOI18N
        cerrar.setBorderPainted(false);
        cerrar.setContentAreaFilled(false);
        jPanel3.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 0, 35, -1));

        Fondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, 140, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FondoRegistro.png"))); // NOI18N
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 560));

        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solicitudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_solicitudActionPerformed

    private void informacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_informacionActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
    }//GEN-LAST:event_menuActionPerformed

    private void boton_movimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_movimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_movimientoActionPerformed

    public JLabel getA??o_nacimiento() {
        return a??o_nacimiento;
    }

    public void setA??o_nacimiento(JLabel a??o_nacimiento) {
        this.a??o_nacimiento = a??o_nacimiento;
    }

    public JLabel getGenero() {
        return genero;
    }

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

    public void setGenero(JLabel genero) {
        this.genero = genero;
    }

    public JButton getCancelar() {
        return cancelar;
    }

    public JPanel getPanel_adopcion() {
        return panel_adopcion;
    }

    public void setPanel_adopcion(JPanel panel_adopcion) {
        this.panel_adopcion = panel_adopcion;
    }

    public JPanel getPanel_informacion() {
        return panel_informacion;
    }

    public void setPanel_informacion(JPanel panel_informacion) {
        this.panel_informacion = panel_informacion;
    }

    
    
    public void setCancelar(JButton cancelar) {
        this.cancelar = cancelar;
    }

    public JLabel getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(JLabel descripcion) {
        this.descripcion = descripcion;
    }

    public JButton getEnviar() {
        return enviar;
    }

    public void setEnviar(JButton enviar) {
        this.enviar = enviar;
    }

    public JLabel getEsterilizacion() {
        return esterilizacion;
    }

    public void setEsterilizacion(JLabel esterilizacion) {
        this.esterilizacion = esterilizacion;
    }

    public JButton getInformacion() {
        return informacion;
    }

    public void setInformacion(JButton informacion) {
        this.informacion = informacion;
    }

    public JLabel getLabel_foto() {
        return label_foto;
    }

    public void setLabel_foto(JLabel label_foto) {
        this.label_foto = label_foto;
    }

    public JLabel getLabelparte1() {
        return labelparte1;
    }

    public void setLabelparte1(JLabel labelparte1) {
        this.labelparte1 = labelparte1;
    }

    public JLabel getLabelparte2() {
        return labelparte2;
    }

    public void setLabelparte2(JLabel labelparte2) {
        this.labelparte2 = labelparte2;
    }

    public JTextArea getR_adopcion() {
        return r_adopcion;
    }

    public JButton getBoton_dez_cerrarseci() {
        return boton_dez_cerrarseci;
    }

    public void setBoton_dez_cerrarseci(JButton boton_dez_cerrarseci) {
        this.boton_dez_cerrarseci = boton_dez_cerrarseci;
    }

    public JButton getBoton_movimiento() {
        return boton_movimiento;
    }

    public void setBoton_movimiento(JButton boton_movimiento) {
        this.boton_movimiento = boton_movimiento;
    }

    public JPanel getjPanel10() {
        return jPanel10;
    }

    public void setjPanel10(JPanel jPanel10) {
        this.jPanel10 = jPanel10;
    }

    public JLabel getLabel_cedula() {
        return label_cedula;
    }

    public void setLabel_cedula(JLabel label_cedula) {
        this.label_cedula = label_cedula;
    }

    public JLabel getLabel_na() {
        return label_na;
    }

    public void setLabel_na(JLabel label_na) {
        this.label_na = label_na;
    }
    
    

    public void setR_adopcion(JTextArea r_adopcion) {
        this.r_adopcion = r_adopcion;
    }

    public JComboBox<String> getR_ciudad() {
        return r_ciudad;
    }

    public void setR_ciudad(JComboBox<String> r_ciudad) {
        this.r_ciudad = r_ciudad;
    }

    public JComboBox<String> getR_provincia() {
        return r_provincia;
    }

    public void setR_provincia(JComboBox<String> r_provincia) {
        this.r_provincia = r_provincia;
    }

    public JComboBox<String> getR_tipo_vivienda() {
        return r_tipo_vivienda;
    }

    public void setR_tipo_vivienda(JComboBox<String> r_tipo_vivienda) {
        this.r_tipo_vivienda = r_tipo_vivienda;
    }

    public JButton getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(JButton solicitud) {
        this.solicitud = solicitud;
    }

    public JLabel getTama??o() {
        return tama??o;
    }

    public void setTama??o(JLabel tama??o) {
        this.tama??o = tama??o;
    }

    public JLabel getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(JLabel temperamento) {
        this.temperamento = temperamento;
    }

    public JButton getMenu() {
        return menu;
    }

    public void setMenu(JButton menu) {
        this.menu = menu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel a??o_nacimiento;
    private javax.swing.JButton boton_dez_cerrarseci;
    private javax.swing.JButton boton_movimiento;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cerrar;
    private javax.swing.JLabel descripcion;
    private javax.swing.JButton enviar;
    private javax.swing.JLabel esterilizacion;
    private javax.swing.JLabel genero;
    private javax.swing.JButton informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_foto;
    private javax.swing.JLabel label_na;
    private javax.swing.JLabel labelparte1;
    private javax.swing.JLabel labelparte2;
    private javax.swing.JButton menu;
    private javax.swing.JButton minimizar;
    private javax.swing.JPanel panel_adopcion;
    private javax.swing.JPanel panel_informacion;
    private javax.swing.JTextArea r_adopcion;
    private javax.swing.JComboBox<String> r_ciudad;
    private javax.swing.JSpinner r_espacio;
    private javax.swing.JComboBox<String> r_provincia;
    private javax.swing.JComboBox<String> r_tipo_vivienda;
    private javax.swing.JButton solicitud;
    private javax.swing.JLabel tama??o;
    private javax.swing.JLabel temperamento;
    // End of variables declaration//GEN-END:variables
}
