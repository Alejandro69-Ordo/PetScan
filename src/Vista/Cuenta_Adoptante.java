
package Vista;

import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Cuenta_Adoptante extends javax.swing.JFrame {

    public JPanel getPanelMacotas() {
        return panelMacotas;
    }

    public void setPanelMacotas(JPanel panelMacotas) {
        this.panelMacotas = panelMacotas;
    }
    
    public Cuenta_Adoptante() {
        initComponents();
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public void setBtnCerrar(JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    public JButton getHistorial() {
        return historial;
    }

    public void setHistorial(JButton historial) {
        this.historial = historial;
    }

    public JFrame getjFrame1() {
        return jFrame1;
    }

    public void setjFrame1(JFrame jFrame1) {
        this.jFrame1 = jFrame1;
    }

    
    
    public JButton getBtnMascotas() {
        return btnMascotas;
    }

    public JTextField getBusqueda() {
        return busqueda;
    }

    public void setBusqueda(JTextField busqueda) {
        this.busqueda = busqueda;
    }

    public JTable getjTable1() {
        return jTable1;
    }

    public void setjTable1(JTable jTable1) {
        this.jTable1 = jTable1;
    }

    public JButton getCerrar() {
        return cerrar;
    }

    public void setCerrar(JButton cerrar) {
        this.cerrar = cerrar;
    }

    public JButton getListar() {
        return listar;
    }

    public void setListar(JButton listar) {
        this.listar = listar;
    }
 
    
    
    public void setBtnMascotas(JButton btnMascotas) {
        this.btnMascotas = btnMascotas;
    }

    public JButton getBtnMenu() {
        return btnMenu;
    }

    public void setBtnMenu(JButton btnMenu) {
        this.btnMenu = btnMenu;
    }

    
    
    public JButton getBtnMinimizar() {
        return btnMinimizar;
    }

    public void setBtnMinimizar(JButton btnMinimizar) {
        this.btnMinimizar = btnMinimizar;
    }

    public JButton getCerrar_secion() {
        return cerrar_secion;
    }

    public void setCerrar_secion(JButton cerrar_secion) {
        this.cerrar_secion = cerrar_secion;
    }

    public JButton getCerrar_secion_pri() {
        return editar;
    }

    public void setCerrar_secion_pri(JButton cerrar_secion_pri) {
        this.editar = cerrar_secion_pri;
    }

    public JLabel getHora() {
        return hora;
    }

    public void setHora(JLabel hora) {
        this.hora = hora;
    }

    public JLabel getMinuto() {
        return minuto;
    }

    public void setMinuto(JLabel minuto) {
        this.minuto = minuto;
    }

    public JPanel getPanel_principal() {
        return panel_principal;
    }

    public void setPanel_principal(JPanel panel_principal) {
        this.panel_principal = panel_principal;
    }

    public JLabel getSegundo() {
        return segundo;
    }

    public void setSegundo(JLabel segundo) {
        this.segundo = segundo;
    }

    public JButton getBtnRegistro() {
        return btnRegistro;
    }

    public void setBtnRegistro(JButton btnRegistro) {
        this.btnRegistro = btnRegistro;
    }

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public ButtonGroup getButtonGroup2() {
        return buttonGroup2;
    }

    public void setButtonGroup2(ButtonGroup buttonGroup2) {
        this.buttonGroup2 = buttonGroup2;
    }

    public ButtonGroup getButtonGroup3() {
        return buttonGroup3;
    }

    public void setButtonGroup3(ButtonGroup buttonGroup3) {
        this.buttonGroup3 = buttonGroup3;
    }
    
    

    public JButton getBtFoto() {
        return btFoto;
    }

    public void setBtFoto(JButton btFoto) {
        this.btFoto = btFoto;
    }

    public JButton getBtRegistrar() {
        return btRegistrar;
    }

    public void setBtRegistrar(JButton btRegistrar) {
        this.btRegistrar = btRegistrar;
    }

    public JComboBox<String> getCbInstituto() {
        return cbInstituto;
    }

    public void setCbInstituto(JComboBox<String> cbInstituto) {
        this.cbInstituto = cbInstituto;
    }

    public JComboBox<String> getCbRaza() {
        return cbRaza;
    }

    public void setCbRaza(JComboBox<String> cbRaza) {
        this.cbRaza = cbRaza;
    }

    public JPanel getpMacotas() {
        return panelMacotas;
    }

    public void setpMacotas(JPanel pMacotas) {
        this.panelMacotas = pMacotas;
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

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JComboBox<String> getTemperamento() {
        return temperamento;
    }

    public void setTemperamento(JComboBox<String> temperamento) {
        this.temperamento = temperamento;
    }

    public JRadioButton getRbHembra() {
        return rbHembra;
    }

    public JPanel getjPanel3() {
        return jPanel3;
    }

    public void setjPanel3(JPanel jPanel3) {
        this.jPanel3 = jPanel3;
    }

    public void setRbHembra(JRadioButton rbHembra) {
        this.rbHembra = rbHembra;
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
    
    

    public JRadioButton getRbMacho() {
        return rbMacho;
    }

    public void setRbMacho(JRadioButton rbMacho) {
        this.rbMacho = rbMacho;
    }

    public JRadioButton getRbNoEsterilizacion() {
        return rbNoEsterilizacion;
    }

    public void setRbNoEsterilizacion(JRadioButton rbNoEsterilizacion) {
        this.rbNoEsterilizacion = rbNoEsterilizacion;
    }

    public JRadioButton getRbSiEstirilizacion() {
        return rbSiEstirilizacion;
    }

    public void setRbSiEstirilizacion(JRadioButton rbSiEstirilizacion) {
        this.rbSiEstirilizacion = rbSiEstirilizacion;
    }

    public JSpinner getSpnTamano() {
        return spnTamano;
    }

    public void setSpnTamano(JSpinner spnTamano) {
        this.spnTamano = spnTamano;
    }

    public JTextArea getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(JTextArea descripcion) {
        this.descripcion = descripcion;
    }

    public JTextField getTxtIdmascota() {
        return txtIdmascota;
    }

    public void setTxtIdmascota(JTextField txtIdmascota) {
        this.txtIdmascota = txtIdmascota;
    }

    public JDateChooser getAño_nacimiento() {
        return año_nacimiento;
    }

    public void setAño_nacimiento(JDateChooser año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    public JPanel getMascotas() {
        return Mascotas;
    }

    public void setMascotas(JPanel Mascotas) {
        this.Mascotas = Mascotas;
    }

    public JPanel getPrincipal() {
        return Principal;
    }

    public void setPrincipal(JPanel Principal) {
        this.Principal = Principal;
    }

    public JPanel getRegistro() {
        return Registro;
    }

    public void setRegistro(JPanel Registro) {
        this.Registro = Registro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        porcategoria = new javax.swing.JButton();
        porfecha = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        listar = new javax.swing.JButton();
        busqueda = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cerrar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        boton_movimiento = new javax.swing.JButton();
        boton_dez_cerrarseci = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        label_na = new javax.swing.JLabel();
        label_cedula = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnMenu = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        salir = new javax.swing.JButton();
        btnMascotas = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
        panel_principal = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        hora = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        minuto = new javax.swing.JLabel();
        segundo = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        historial = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        cerrar_secion = new javax.swing.JButton();
        Registro = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtIdmascota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbRaza = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cbInstituto = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spnTamano = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btRegistrar = new javax.swing.JButton();
        btFoto = new javax.swing.JButton();
        rbMacho = new javax.swing.JRadioButton();
        rbHembra = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        rbSiEstirilizacion = new javax.swing.JRadioButton();
        rbNoEsterilizacion = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        rbPerro = new javax.swing.JRadioButton();
        rbGato = new javax.swing.JRadioButton();
        año_nacimiento = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcion = new javax.swing.JTextArea();
        temperamento = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Fondo1 = new javax.swing.JLabel();
        Mascotas = new javax.swing.JPanel();
        panelMacotas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelarriba = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        Principal = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

        jFrame1.setUndecorated(true);
        jFrame1.getContentPane().setLayout(null);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.black, java.awt.Color.black));
        jPanel12.setLayout(null);

        jScrollPane3.setBackground(new Color(0,0,0,0));
        jScrollPane3.setOpaque(false);

        jTable1.setBackground(new java.awt.Color(0, 0, 0));
        jTable1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Mascota", "Tipo de Mascota", "Lugar de Adopción", "Fecha de Adopcion", "Foto Mascota"
            }
        ));
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        jTable1.setOpaque(false);
        jScrollPane3.setViewportView(jTable1);

        jPanel12.add(jScrollPane3);
        jScrollPane3.setBounds(200, 40, 590, 200);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perro_dibujo.jpg"))); // NOI18N
        jPanel12.add(jLabel20);
        jLabel20.setBounds(770, 20, 220, 240);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/gato_dibujo.jpg"))); // NOI18N
        jPanel12.add(jLabel22);
        jLabel22.setBounds(-40, -10, 270, 300);

        jFrame1.getContentPane().add(jPanel12);
        jPanel12.setBounds(10, 120, 950, 270);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Impreción de Reporte", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tw Cen MT", 1, 16))); // NOI18N
        jPanel15.setOpaque(false);
        jPanel15.setLayout(null);

        porcategoria.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        porcategoria.setText("Categoria");
        jPanel15.add(porcategoria);
        porcategoria.setBounds(30, 50, 160, 27);

        porfecha.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        porfecha.setText("Fecha de Adopción");
        jPanel15.add(porfecha);
        porfecha.setBounds(30, 80, 160, 27);

        imprimir.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        imprimir.setText("Datos de Adopción");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });
        jPanel15.add(imprimir);
        imprimir.setBounds(30, 20, 160, 27);

        jFrame1.getContentPane().add(jPanel15);
        jPanel15.setBounds(660, 0, 230, 110);

        jPanel13.setBackground(new Color(255,255,255,50));
        jPanel13.setLayout(null);

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));
        jPanel14.setLayout(null);

        listar.setBackground(new java.awt.Color(255, 255, 255));
        listar.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        listar.setText("Listar");
        listar.setBorder(null);
        listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarActionPerformed(evt);
            }
        });
        jPanel14.add(listar);
        listar.setBounds(282, 2, 105, 22);

        busqueda.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        jPanel14.add(busqueda);
        busqueda.setBounds(110, 2, 159, 20);

        jLabel15.setFont(new java.awt.Font("Tw Cen MT", 3, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Busqueda:");
        jPanel14.add(jLabel15);
        jLabel15.setBounds(10, 0, 94, 23);

        jPanel13.add(jPanel14);
        jPanel14.setBounds(260, 50, 391, 27);

        cerrar.setBackground(new java.awt.Color(255, 255, 255));
        cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/mini_cerrar.png"))); // NOI18N
        cerrar.setBorder(null);
        cerrar.setBorderPainted(false);
        jPanel13.add(cerrar);
        cerrar.setBounds(927, 0, 33, 33);

        jFrame1.getContentPane().add(jPanel13);
        jPanel13.setBounds(0, 0, 970, 450);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FONDO_R.USUARIO.jpeg"))); // NOI18N
        jFrame1.getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 980, 450);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 562));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(780, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setOpaque(false);
        jPanel10.setLayout(null);

        boton_movimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/hacia_izquierda.png"))); // NOI18N
        boton_movimiento.setBorder(null);
        boton_movimiento.setBorderPainted(false);
        boton_movimiento.setContentAreaFilled(false);
        jPanel10.add(boton_movimiento);
        boton_movimiento.setBounds(327, 130, 33, 50);

        boton_dez_cerrarseci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/close.png"))); // NOI18N
        boton_dez_cerrarseci.setToolTipText("Cerrar Seción");
        boton_dez_cerrarseci.setBorder(null);
        boton_dez_cerrarseci.setBorderPainted(false);
        boton_dez_cerrarseci.setContentAreaFilled(false);
        boton_dez_cerrarseci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_dez_cerrarseciActionPerformed(evt);
            }
        });
        jPanel10.add(boton_dez_cerrarseci);
        boton_dez_cerrarseci.setBounds(328, 180, 33, 50);

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(null);

        label_na.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        label_na.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/usuario_dez.png"))); // NOI18N
        label_na.setText("Alejandro Ordoñez");
        jPanel4.add(label_na);
        label_na.setBounds(0, 0, 250, 40);

        label_cedula.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        label_cedula.setText("0106928039");
        jPanel4.add(label_cedula);
        label_cedula.setBounds(60, 40, 110, 21);
        jPanel4.add(jSeparator2);
        jSeparator2.setBounds(10, 38, 200, 2);

        jPanel3.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel10.add(jPanel3);
        jPanel3.setBounds(400, 118, 220, 60);

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, 360, 260));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/menu-circle.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jPanel11.setOpaque(false);
        jPanel11.setLayout(null);

        salir.setBackground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/close.png"))); // NOI18N
        salir.setBorder(null);
        salir.setBorderPainted(false);
        jPanel11.add(salir);
        salir.setBounds(-40, 100, 40, 50);

        btnMascotas.setBackground(new Color(255,255,255,90));
        btnMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/animal-prints_1.png"))); // NOI18N
        btnMascotas.setBorder(null);
        btnMascotas.setBorderPainted(false);
        btnMascotas.setContentAreaFilled(false);
        jPanel11.add(btnMascotas);
        btnMascotas.setBounds(-40, 0, 40, 50);

        btnRegistro.setBackground(new Color(255,255,255,90));
        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/registro_pts.png"))); // NOI18N
        btnRegistro.setBorder(null);
        btnRegistro.setBorderPainted(false);
        btnRegistro.setContentAreaFilled(false);
        jPanel11.add(btnRegistro);
        btnRegistro.setBounds(-40, 50, 40, 50);

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 60, 180));

        panel_principal.setOpaque(false);

        jPanel7.setBackground(new Color(0,0,0,100));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.white));
        jPanel7.setLayout(null);

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        jLabel24.setBackground(new java.awt.Color(0, 0, 0));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perroBlanco.png"))); // NOI18N
        jLabel24.setOpaque(true);

        jLabel.setBackground(new java.awt.Color(0, 0, 0));
        jLabel.setFont(new java.awt.Font("Segoe UI Black", 3, 26)); // NOI18N
        jLabel.setForeground(new java.awt.Color(255, 255, 255));
        jLabel.setText("FaithfulPet");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        jPanel7.add(jPanel9);
        jPanel9.setBounds(40, 80, 260, 250);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(27, 27, 25));
        jPanel5.setLayout(null);

        jPanel6.setOpaque(false);
        jPanel6.setLayout(null);

        hora.setFont(new java.awt.Font("Tw Cen MT", 1, 32)); // NOI18N
        hora.setText("02");
        jPanel6.add(hora);
        hora.setBounds(0, 0, 40, 40);

        jLabel21.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel21.setText(":");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(41, -10, 10, 50);

        jLabel23.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel23.setText(":");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(90, -10, 9, 50);

        minuto.setBackground(new java.awt.Color(0, 0, 0));
        minuto.setFont(new java.awt.Font("Tw Cen MT", 1, 32)); // NOI18N
        minuto.setText("02");
        jPanel6.add(minuto);
        minuto.setBounds(50, 0, 40, 40);

        segundo.setFont(new java.awt.Font("Tw Cen MT", 1, 32)); // NOI18N
        segundo.setText("02");
        jPanel6.add(segundo);
        segundo.setBounds(100, 0, 50, 40);

        jPanel5.add(jPanel6);
        jPanel6.setBounds(84, 30, 160, 50);

        jLabel25.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        jLabel25.setText("AL MENOS EL MUNDO HABRÁ ");
        jPanel5.add(jLabel25);
        jLabel25.setBounds(30, 130, 450, 20);

        jLabel26.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        jLabel26.setText("AYUDANDO A UN ANIMAL PERO");
        jPanel5.add(jLabel26);
        jLabel26.setBounds(30, 110, 490, 18);

        jLabel28.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        jLabel28.setText("CAMBIADO PARA ÉL\"");
        jPanel5.add(jLabel28);
        jLabel28.setBounds(30, 150, 450, 20);

        jLabel29.setFont(new java.awt.Font("Tw Cen MT", 2, 16)); // NOI18N
        jLabel29.setText("\"NO VAMOS A CAMBIAR EL MUNDO ");
        jPanel5.add(jLabel29);
        jLabel29.setBounds(20, 90, 490, 18);

        jPanel7.add(jPanel5);
        jPanel5.setBounds(290, 110, 290, 200);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/historial_de_adopcion.png"))); // NOI18N
        historial.setBorder(null);
        historial.setContentAreaFilled(false);
        historial.setFocusable(false);
        historial.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        historial.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/configuracion_cuenta.png"))); // NOI18N
        editar.setBorder(null);
        editar.setContentAreaFilled(false);
        editar.setFocusable(false);
        editar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        cerrar_secion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/close.png.png"))); // NOI18N
        cerrar_secion.setToolTipText("");
        cerrar_secion.setBorder(null);
        cerrar_secion.setBorderPainted(false);
        cerrar_secion.setContentAreaFilled(false);
        cerrar_secion.setFocusable(false);
        cerrar_secion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cerrar_secion.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        cerrar_secion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cerrar_secion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_secionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cerrar_secion)
                .addGap(22, 22, 22)
                .addComponent(historial)
                .addGap(245, 245, 245))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(editar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(historial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cerrar_secion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        jPanel7.add(jPanel8);
        jPanel8.setBounds(0, 0, 640, 40);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_principalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 640, 450));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setOpaque(false);
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perrologo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 56));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/logof.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel1.setText("Tipo Mascota:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 350));
        jPanel1.add(txtIdmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 30));

        jLabel4.setText("ID Mascota :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Raza :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        cbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cbRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRazaActionPerformed(evt);
            }
        });
        jPanel1.add(cbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 140, -1));

        jLabel6.setText("Tamaño :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, -1, -1));

        cbInstituto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(cbInstituto, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 140, -1));

        jLabel7.setText("Instituto :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel8.setText("Año Nacimiento :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, 10));

        jLabel9.setText("Descripción :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel10.setText("Foto :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        spnTamano.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(20.0f), Float.valueOf(20.0f), Float.valueOf(68.0f), Float.valueOf(0.5f)));
        jPanel1.add(spnTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, -1));

        jLabel11.setText("Temperamento :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 100, 110));

        btRegistrar.setBackground(new java.awt.Color(78, 96, 219));
        btRegistrar.setFont(new java.awt.Font("Tw Cen MT", 1, 16)); // NOI18N
        btRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrar.setText("Registrar");
        jPanel1.add(btRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, -1, -1));

        btFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/foto.png"))); // NOI18N
        btFoto.setContentAreaFilled(false);
        jPanel1.add(btFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 40, 30));

        rbMacho.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbMacho);
        rbMacho.setText("Macho");
        jPanel1.add(rbMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        rbHembra.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup2.add(rbHembra);
        rbHembra.setText("Hembra");
        jPanel1.add(rbHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLabel16.setText("Genero :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        rbSiEstirilizacion.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbSiEstirilizacion);
        rbSiEstirilizacion.setText("Si");
        jPanel1.add(rbSiEstirilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        rbNoEsterilizacion.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup3.add(rbNoEsterilizacion);
        rbNoEsterilizacion.setText("No");
        jPanel1.add(rbNoEsterilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        jLabel17.setText("Esterilizacion :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        rbPerro.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPerro);
        rbPerro.setText("Perro");
        jPanel1.add(rbPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        rbGato.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbGato);
        rbGato.setText("Gato");
        jPanel1.add(rbGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));
        jPanel1.add(año_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 140, -1));

        descripcion.setColumns(20);
        descripcion.setLineWrap(true);
        descripcion.setRows(5);
        jScrollPane1.setViewportView(descripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 240, 70));

        temperamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alto", "Medio", "Bajo" }));
        jPanel1.add(temperamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 80, -1));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("cm");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, -1, 20));

        Registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 630, 430));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("REGISTRO DE MASCOTAS");
        Registro.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FONDO_R.USUARIO.jpeg"))); // NOI18N
        Fondo1.setLabelFor(Fondo);
        Registro.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 630, 440));

        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

        Mascotas.setBackground(new java.awt.Color(255, 255, 255));
        Mascotas.setOpaque(false);
        Mascotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelMacotas.setBackground(new java.awt.Color(255, 255, 255));
        panelMacotas.setLayout(null);

        jScrollPane2.setOpaque(false);

        panelarriba.setBackground(new java.awt.Color(255, 255, 255));
        panelarriba.setOpaque(false);
        jScrollPane2.setViewportView(panelarriba);

        panelMacotas.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 640, 430);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/dogs-german-shorthaired-pointer-dog-wallpaper-preview.jpg"))); // NOI18N
        jLabel19.setMaximumSize(new java.awt.Dimension(359, 250));
        jLabel19.setMinimumSize(new java.awt.Dimension(359, 250));
        jLabel19.setPreferredSize(new java.awt.Dimension(359, 250));
        panelMacotas.add(jLabel19);
        jLabel19.setBounds(0, 0, 650, 430);

        Mascotas.add(panelMacotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 640, 430));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MASCOTAS EN ADOPCIÓN");
        Mascotas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        getContentPane().add(Mascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

        jPanel2.setBackground(new java.awt.Color(230, 230, 230));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/minimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setContentAreaFilled(false);
        btnMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizarActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/cerrar.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(btnMinimizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 110, 40));

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FondoRegistro.png"))); // NOI18N
        Principal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

        getContentPane().add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JPanel getPanelarriba() {
        return panelarriba;
    }

    public void setPanelarriba(JPanel panelarriba) {
        this.panelarriba = panelarriba;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }

    public JButton getEditar() {
        return editar;
    }

    public void setEditar(JButton editar) {
        this.editar = editar;
    }

    public JButton getImprimir() {
        return imprimir;
    }

    public void setImprimir(JButton imprimir) {
        this.imprimir = imprimir;
    }

    private void btnMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMinimizarActionPerformed

    private void cbRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRazaActionPerformed

    private void cerrar_secionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_secionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cerrar_secionActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editarActionPerformed

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historialActionPerformed

    private void boton_dez_cerrarseciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_dez_cerrarseciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton_dez_cerrarseciActionPerformed

    private void listarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imprimirActionPerformed

    public JButton getPorcategoria() {
        return porcategoria;
    }

    public void setPorcategoria(JButton porcategoria) {
        this.porcategoria = porcategoria;
    }

    public JButton getPorfecha() {
        return porfecha;
    }

    public void setPorfecha(JButton porfecha) {
        this.porfecha = porfecha;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JPanel Mascotas;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Registro;
    private com.toedter.calendar.JDateChooser año_nacimiento;
    private javax.swing.JButton boton_dez_cerrarseci;
    private javax.swing.JButton boton_movimiento;
    private javax.swing.JButton btFoto;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JTextField busqueda;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<String> cbInstituto;
    private javax.swing.JComboBox<String> cbRaza;
    private javax.swing.JButton cerrar;
    private javax.swing.JButton cerrar_secion;
    private javax.swing.JTextArea descripcion;
    private javax.swing.JButton editar;
    private javax.swing.JButton historial;
    private javax.swing.JLabel hora;
    private javax.swing.JButton imprimir;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_na;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JButton listar;
    private javax.swing.JLabel minuto;
    private javax.swing.JPanel panelMacotas;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panelarriba;
    private javax.swing.JButton porcategoria;
    private javax.swing.JButton porfecha;
    private javax.swing.JRadioButton rbGato;
    private javax.swing.JRadioButton rbHembra;
    private javax.swing.JRadioButton rbMacho;
    private javax.swing.JRadioButton rbNoEsterilizacion;
    private javax.swing.JRadioButton rbPerro;
    private javax.swing.JRadioButton rbSiEstirilizacion;
    private javax.swing.JButton salir;
    private javax.swing.JLabel segundo;
    private javax.swing.JSpinner spnTamano;
    private javax.swing.JComboBox<String> temperamento;
    private javax.swing.JTextField txtIdmascota;
    // End of variables declaration//GEN-END:variables
}
