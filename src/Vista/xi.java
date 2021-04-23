
package Vista;

import com.toedter.calendar.JYearChooser;
import com.toedter.components.JSpinField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;


public class xi extends javax.swing.JFrame {


    public xi() {
        initComponents();
    }

    public JButton getBtnCerrar() {
        return btnCerrar;
    }

    public void setBtnCerrar(JButton btnCerrar) {
        this.btnCerrar = btnCerrar;
    }

    public JButton getBtnMascotas() {
        return btnMascotas;
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

    public JButton getBtnRegistro() {
        return btnRegistro;
    }

    public void setBtnRegistro(JButton btnRegistro) {
        this.btnRegistro = btnRegistro;
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
        return pMacotas;
    }

    public void setpMacotas(JPanel pMacotas) {
        this.pMacotas = pMacotas;
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

    public JScrollPane getSpMascotas() {
        return spMascotas;
    }

    public void setSpMascotas(JScrollPane spMascotas) {
        this.spMascotas = spMascotas;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JRadioButton getRbAdoptado() {
        return rbAdoptado;
    }

    public void setRbAdoptado(JRadioButton rbAdoptado) {
        this.rbAdoptado = rbAdoptado;
    }

    public JRadioButton getRbEnAdopcion() {
        return rbEnAdopcion;
    }

    public void setRbEnAdopcion(JRadioButton rbEnAdopcion) {
        this.rbEnAdopcion = rbEnAdopcion;
    }

    public JRadioButton getRbHembra() {
        return rbHembra;
    }

    public void setRbHembra(JRadioButton rbHembra) {
        this.rbHembra = rbHembra;
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

    public JTextField getTxtDescripcion() {
        return txtDescripcion;
    }

    public void setTxtDescripcion(JTextField txtDescripcion) {
        this.txtDescripcion = txtDescripcion;
    }

    public JTextField getTxtIdmascota() {
        return txtIdmascota;
    }

    public void setTxtIdmascota(JTextField txtIdmascota) {
        this.txtIdmascota = txtIdmascota;
    }

    public JYearChooser getYcAnoNacimiento() {
        return ycAnoNacimiento;
    }

    public void setYcAnoNacimiento(JYearChooser ycAnoNacimiento) {
        this.ycAnoNacimiento = ycAnoNacimiento;
    }

    public JTextField getTxtTemperamento() {
        return txtTemperamento;
    }

    public void setTxtTemperamento(JTextField txtTemperamento) {
        this.txtTemperamento = txtTemperamento;
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

    public JButton getBtnCrearInst() {
        return btnCrearInst;
    }

    public void setBtnCrearInst(JButton btnCrearInst) {
        this.btnCrearInst = btnCrearInst;
    }

    public JButton getBtnCrearRaza() {
        return btnCrearRaza;
    }

    public void setBtnCrearRaza(JButton btnCrearRaza) {
        this.btnCrearRaza = btnCrearRaza;
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
        btnMinimizar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnMascotas = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnRegistro = new javax.swing.JButton();
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
        ycAnoNacimiento = new com.toedter.calendar.JYearChooser();
        jLabel8 = new javax.swing.JLabel();
        txtTemperamento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        rbEnAdopcion = new javax.swing.JRadioButton();
        rbAdoptado = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        spnTamano = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        lblFoto = new javax.swing.JLabel();
        btRegistrar = new javax.swing.JButton();
        btFoto = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        rbMacho = new javax.swing.JRadioButton();
        rbHembra = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        rbSiEstirilizacion = new javax.swing.JRadioButton();
        rbNoEsterilizacion = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        rbPerro = new javax.swing.JRadioButton();
        rbGato = new javax.swing.JRadioButton();
        btnCrearInst = new javax.swing.JButton();
        btnCrearRaza = new javax.swing.JButton();
        Fondo1 = new javax.swing.JLabel();
        Mascotas = new javax.swing.JPanel();
        spMascotas = new javax.swing.JScrollPane();
        pMacotas = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Principal = new javax.swing.JPanel();
        Fondo = new javax.swing.JLabel();

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
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        jLabel20.setText("ID Raza:");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        btnGuardarRaza.setText("Guardar");
        jPanel3.add(btnGuardarRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));
        jPanel3.add(txtNombreRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, -1));
        jPanel3.add(txtIdRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 130, -1));
        jPanel3.add(spnAnosPromedio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 60, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 340, 190));

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/minimizar.png"))); // NOI18N
        btnMinimizar.setBorder(null);
        btnMinimizar.setContentAreaFilled(false);
        getContentPane().add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 5, 40, 40));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/cerrar.png"))); // NOI18N
        btnCerrar.setContentAreaFilled(false);
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 5, 40, 40));

        btnMascotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/animal-prints_1.png"))); // NOI18N
        getContentPane().add(btnMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 70, 60, 50));

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/menu-circle.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setContentAreaFilled(false);
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        btnRegistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/mas.png"))); // NOI18N
        btnRegistro.setContentAreaFilled(false);
        getContentPane().add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 120, 60, 50));

        Registro.setBackground(new java.awt.Color(255, 255, 255));
        Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perrologo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 56));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/logof.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 30));

        jLabel1.setText("Tipo Mascota:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 350));
        jPanel1.add(txtIdmascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 20));

        jLabel4.setText("ID Mascota :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel5.setText("Raza :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        cbRaza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(cbRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 100, -1));

        jLabel6.setText("Tamaño :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        cbInstituto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jPanel1.add(cbInstituto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 100, -1));

        jLabel7.setText("Instituto :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));
        jPanel1.add(ycAnoNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 60, -1));

        jLabel8.setText("Año Nacimiento :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));
        jPanel1.add(txtTemperamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 190, -1));

        jLabel9.setText("Descripción :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        rbEnAdopcion.setBackground(new java.awt.Color(255, 255, 255));
        rbEnAdopcion.setText("En Adopción");
        jPanel1.add(rbEnAdopcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        rbAdoptado.setBackground(new java.awt.Color(255, 255, 255));
        rbAdoptado.setText("Adoptado");
        jPanel1.add(rbAdoptado, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel10.setText("Foto :");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        spnTamano.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(20.0f), Float.valueOf(20.0f), Float.valueOf(100.0f), Float.valueOf(0.5f)));
        jPanel1.add(spnTamano, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 60, -1));

        jLabel11.setText("Temperamento :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        lblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 100, 110));

        btRegistrar.setBackground(new java.awt.Color(78, 96, 219));
        btRegistrar.setText("Registrar");
        jPanel1.add(btRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, -1, -1));

        btFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/foto.png"))); // NOI18N
        btFoto.setContentAreaFilled(false);
        jPanel1.add(btFoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 40, 30));

        jLabel15.setText("Estado:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        rbMacho.setBackground(new java.awt.Color(255, 255, 255));
        rbMacho.setText("Macho");
        jPanel1.add(rbMacho, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        rbHembra.setBackground(new java.awt.Color(255, 255, 255));
        rbHembra.setText("Hembra");
        jPanel1.add(rbHembra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, -1, -1));

        jLabel16.setText("Genero :");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        rbSiEstirilizacion.setBackground(new java.awt.Color(255, 255, 255));
        rbSiEstirilizacion.setText("Si");
        jPanel1.add(rbSiEstirilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        rbNoEsterilizacion.setBackground(new java.awt.Color(255, 255, 255));
        rbNoEsterilizacion.setText("No");
        jPanel1.add(rbNoEsterilizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, -1, -1));

        jLabel17.setText("Esterilizacion :");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));
        jPanel1.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 190, -1));

        rbPerro.setBackground(new java.awt.Color(255, 255, 255));
        rbPerro.setText("Perro");
        jPanel1.add(rbPerro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        rbGato.setBackground(new java.awt.Color(255, 255, 255));
        rbGato.setText("Gato");
        jPanel1.add(rbGato, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        btnCrearInst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/mas.png"))); // NOI18N
        btnCrearInst.setContentAreaFilled(false);
        jPanel1.add(btnCrearInst, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 40, 30));

        btnCrearRaza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/mas.png"))); // NOI18N
        btnCrearRaza.setContentAreaFilled(false);
        btnCrearRaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearRazaActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrearRaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 40, 30));

        Registro.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 630, 430));

        Fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FondoRegistro.png"))); // NOI18N
        Registro.add(Fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        getContentPane().add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        Mascotas.setOpaque(false);
        Mascotas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pMacotas.setLayout(new java.awt.GridLayout(0, 3));
        spMascotas.setViewportView(pMacotas);

        Mascotas.add(spMascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 655, 386));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("MASCOTAS EN ADOPCIÓN");
        Mascotas.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/perroBlanco.png"))); // NOI18N
        Mascotas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        getContentPane().add(Mascotas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        Principal.setBackground(new java.awt.Color(255, 255, 255));
        Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/Recursos/FondoRegistro.png"))); // NOI18N
        Principal.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        getContentPane().add(Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearRazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearRazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearRazaActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Fondo1;
    private javax.swing.JPanel Mascotas;
    private javax.swing.JPanel Principal;
    private javax.swing.JPanel Registro;
    private javax.swing.JButton btFoto;
    private javax.swing.JButton btRegistrar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCerrarInst;
    private javax.swing.JButton btnCerrarRaza;
    private javax.swing.JButton btnCrearInst;
    private javax.swing.JButton btnCrearRaza;
    private javax.swing.JButton btnGuardarInst;
    private javax.swing.JButton btnGuardarRaza;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMinimizar;
    private javax.swing.JButton btnMinimizarInst;
    private javax.swing.JButton btnMinimizarRaza;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JComboBox<String> cbInstituto;
    private javax.swing.JComboBox<String> cbRaza;
    private javax.swing.JDialog dlgInstituto;
    private javax.swing.JDialog dlgRaza;
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
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblFondoInsti;
    private javax.swing.JLabel lblFondoRaza;
    private javax.swing.JLabel lblFoto;
    private javax.swing.JPanel pMacotas;
    private javax.swing.JRadioButton rbAdoptado;
    private javax.swing.JRadioButton rbEnAdopcion;
    private javax.swing.JRadioButton rbGato;
    private javax.swing.JRadioButton rbHembra;
    private javax.swing.JRadioButton rbMacho;
    private javax.swing.JRadioButton rbNoEsterilizacion;
    private javax.swing.JRadioButton rbPerro;
    private javax.swing.JRadioButton rbSiEstirilizacion;
    private javax.swing.JScrollPane spMascotas;
    private com.toedter.components.JSpinField spnAnosPromedio;
    private javax.swing.JSpinner spnTamano;
    private javax.swing.JTextField txtCallePrincipal;
    private javax.swing.JTextField txtCalleSecundaria;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdInsti;
    private javax.swing.JTextField txtIdRaza;
    private javax.swing.JTextField txtIdmascota;
    private javax.swing.JTextField txtNombreInst;
    private javax.swing.JTextField txtNombreRaza;
    private javax.swing.JTextField txtTemperamento;
    private com.toedter.calendar.JYearChooser ycAnoNacimiento;
    // End of variables declaration//GEN-END:variables
}
