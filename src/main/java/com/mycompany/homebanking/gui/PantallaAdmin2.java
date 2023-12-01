
package com.mycompany.homebanking.gui;

import com.mycompany.homebanking.logica.Cliente;
import com.mycompany.homebanking.logica.Controladora;
import com.mycompany.homebanking.logica.Cuenta;
import com.mycompany.homebanking.logica.Tarjeta;
import com.mycompany.homebanking.logica.Usuario;
import java.awt.Color;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PantallaAdmin2 extends javax.swing.JFrame {

    Controladora control;
    Usuario usuario;
    
    public PantallaAdmin2(Controladora c, Usuario u) {
        initComponents();
        this.control = c;
        this.usuario = u;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnLupa = new javax.swing.JLabel();
        separadorMain = new javax.swing.JSeparator();
        btnMain = new javax.swing.JLabel();
        separadorCliente = new javax.swing.JSeparator();
        btnCliente = new javax.swing.JLabel();
        separadorCuenta = new javax.swing.JSeparator();
        btnCuenta = new javax.swing.JLabel();
        separadorTarjeta = new javax.swing.JSeparator();
        btnTarjeta = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        main = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cliente = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnCrearCliente = new javax.swing.JButton();
        btnEditarCliente = new javax.swing.JButton();
        btnBorrarCliente = new javax.swing.JButton();
        cuenta = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscarEnCuenta = new javax.swing.JButton();
        rbCC = new javax.swing.JRadioButton();
        rbCA = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnCrearCuenta = new javax.swing.JButton();
        btnBorrarCuenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCuentas = new javax.swing.JTable();
        tarjeta = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtCliente1 = new javax.swing.JTextField();
        btnBuscarEnTarjeta = new javax.swing.JButton();
        rbDebito = new javax.swing.JRadioButton();
        rbCredito = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        cmbPlanes = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaTarjetas = new javax.swing.JTable();
        btnCrearTarjeta = new javax.swing.JButton();
        btnEditarTarjeta = new javax.swing.JButton();
        btnBorrarTarjeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(48, 58, 73));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\HomeBanking\\src\\main\\img\\user.png")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setText("Nombre de Usuario");
        jPanel2.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2.setText("Online");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 40, -1));

        jTextField1.setBackground(new java.awt.Color(54, 73, 80));
        jTextField1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 160, 40));

        btnLupa.setBackground(new java.awt.Color(54, 73, 80));
        btnLupa.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\lupa.png")); // NOI18N
        btnLupa.setOpaque(true);
        jPanel2.add(btnLupa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, 40));
        jPanel2.add(separadorMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 20));

        btnMain.setBackground(new java.awt.Color(204, 255, 255));
        btnMain.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnMain.setForeground(new java.awt.Color(255, 255, 255));
        btnMain.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\main.png")); // NOI18N
        btnMain.setText("Main");
        btnMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMouseClicked(evt);
            }
        });
        jPanel2.add(btnMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));
        jPanel2.add(separadorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 20));

        btnCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCliente.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\client.png")); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClienteMouseClicked(evt);
            }
        });
        jPanel2.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 30));
        jPanel2.add(separadorCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, 10));

        btnCuenta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCuenta.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\Cuenta.png")); // NOI18N
        btnCuenta.setText("Cuenta");
        btnCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCuentaMouseClicked(evt);
            }
        });
        jPanel2.add(btnCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 200, 30));
        jPanel2.add(separadorTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 10));

        btnTarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnTarjeta.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\tarjeta.png")); // NOI18N
        btnTarjeta.setText("Tarjeta");
        btnTarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTarjetaMouseClicked(evt);
            }
        });
        jPanel2.add(btnTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 200, 30));

        btnSalir.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\exit.png")); // NOI18N
        btnSalir.setText("Exit");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel2.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 200, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 480));

        jPanel3.setBackground(new java.awt.Color(23, 100, 191));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(23, 100, 191));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("DevTech S.A");
        jPanel3.add(jLabel3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 60));

        jPanel4.setBackground(new java.awt.Color(23, 100, 191));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 570, 60));

        jPanel5.setLayout(new java.awt.CardLayout());

        main.setBackground(new java.awt.Color(37, 34, 27));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Main");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel11)
                .addContainerGap(487, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11)
                .addContainerGap(422, Short.MAX_VALUE))
        );

        jPanel5.add(main, "card2");

        cliente.setBackground(new java.awt.Color(37, 34, 27));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cliente");

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(102, 102, 102));
        txtNombre.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellido:");

        txtApellido.setBackground(new java.awt.Color(102, 102, 102));
        txtApellido.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtApellido.setForeground(new java.awt.Color(255, 255, 255));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tablaClientes.setBackground(new java.awt.Color(37, 34, 27));
        tablaClientes.setForeground(new java.awt.Color(255, 255, 255));
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaClientes.setGridColor(new java.awt.Color(250, 9, 111));
        jScrollPane1.setViewportView(tablaClientes);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dni:");

        txtDni.setBackground(new java.awt.Color(102, 102, 102));
        txtDni.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtDni.setForeground(new java.awt.Color(255, 255, 255));
        txtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Usuario:");

        txtUsuario.setBackground(new java.awt.Color(102, 102, 102));
        txtUsuario.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pass:");

        txtPass.setBackground(new java.awt.Color(102, 102, 102));
        txtPass.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btnCrearCliente.setBackground(new java.awt.Color(250, 9, 111));
        btnCrearCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnCrearCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCliente.setText("Crear");
        btnCrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearClienteActionPerformed(evt);
            }
        });

        btnEditarCliente.setBackground(new java.awt.Color(250, 9, 111));
        btnEditarCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnEditarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarCliente.setText("Editar");
        btnEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarClienteActionPerformed(evt);
            }
        });

        btnBorrarCliente.setBackground(new java.awt.Color(250, 9, 111));
        btnBorrarCliente.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnBorrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarCliente.setText("Borrar");
        btnBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout clienteLayout = new javax.swing.GroupLayout(cliente);
        cliente.setLayout(clienteLayout);
        clienteLayout.setHorizontalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(clienteLayout.createSequentialGroup()
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(clienteLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, clienteLayout.createSequentialGroup()
                                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8))
                                        .addGap(18, 18, 18)
                                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(clienteLayout.createSequentialGroup()
                                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCrearCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBorrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(34, 34, 34))))
        );
        clienteLayout.setVerticalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clienteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(clienteLayout.createSequentialGroup()
                        .addComponent(btnCrearCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarCliente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE))
        );

        jPanel5.add(cliente, "card3");

        cuenta.setBackground(new java.awt.Color(37, 34, 27));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Cuenta");
        jLabel12.setPreferredSize(new java.awt.Dimension(70, 32));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cliente:");

        txtCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente.setBorder(null);

        btnBuscarEnCuenta.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarEnCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEnCuenta.setText("Buscar");
        btnBuscarEnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEnCuentaActionPerformed(evt);
            }
        });

        rbCC.setBackground(new java.awt.Color(37, 34, 27));
        buttonGroup1.add(rbCC);
        rbCC.setForeground(new java.awt.Color(255, 255, 255));
        rbCC.setText("Cuenta Corriente");

        rbCA.setBackground(new java.awt.Color(37, 34, 27));
        buttonGroup1.add(rbCA);
        rbCA.setForeground(new java.awt.Color(255, 255, 255));
        rbCA.setText("Caja de Ahorro");

        btnCrearCuenta.setBackground(new java.awt.Color(250, 9, 111));
        btnCrearCuenta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearCuenta.setText("Crear");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        btnBorrarCuenta.setBackground(new java.awt.Color(250, 9, 111));
        btnBorrarCuenta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnBorrarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarCuenta.setText("Borrar");
        btnBorrarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarCuentaActionPerformed(evt);
            }
        });

        tablaCuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaCuentas);

        javax.swing.GroupLayout cuentaLayout = new javax.swing.GroupLayout(cuenta);
        cuenta.setLayout(cuentaLayout);
        cuentaLayout.setHorizontalGroup(
            cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cuentaLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addGroup(cuentaLayout.createSequentialGroup()
                        .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(cuentaLayout.createSequentialGroup()
                                .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(cuentaLayout.createSequentialGroup()
                                        .addComponent(rbCC)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rbCA))
                                    .addGroup(cuentaLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(btnBuscarEnCuenta))
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
        );
        cuentaLayout.setVerticalGroup(
            cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cuentaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cuentaLayout.createSequentialGroup()
                        .addComponent(btnCrearCuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarCuenta)
                        .addGap(27, 27, 27))
                    .addGroup(cuentaLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarEnCuenta))
                        .addGap(18, 18, 18)
                        .addGroup(cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbCC)
                            .addComponent(rbCA))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel5.add(cuenta, "card4");

        tarjeta.setBackground(new java.awt.Color(37, 34, 27));

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Cliente:");

        txtCliente1.setBackground(new java.awt.Color(51, 51, 51));
        txtCliente1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtCliente1.setForeground(new java.awt.Color(255, 255, 255));
        txtCliente1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCliente1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        txtCliente1.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCliente1.setSelectedTextColor(new java.awt.Color(255, 255, 255));

        btnBuscarEnTarjeta.setBackground(new java.awt.Color(51, 51, 51));
        btnBuscarEnTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarEnTarjeta.setText("Buscar");
        btnBuscarEnTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEnTarjetaActionPerformed(evt);
            }
        });

        rbDebito.setBackground(new java.awt.Color(37, 34, 27));
        buttonGroup2.add(rbDebito);
        rbDebito.setForeground(new java.awt.Color(255, 255, 255));
        rbDebito.setText("Débito");

        rbCredito.setBackground(new java.awt.Color(37, 34, 27));
        buttonGroup2.add(rbCredito);
        rbCredito.setForeground(new java.awt.Color(255, 255, 255));
        rbCredito.setText("Crédito");

        jLabel14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Planes:");

        cmbPlanes.setBackground(new java.awt.Color(37, 34, 27));
        cmbPlanes.setForeground(new java.awt.Color(255, 255, 255));
        cmbPlanes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Bronce", "Plata", "Oro", "Platino", "Black" }));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tarjeta");
        jLabel15.setPreferredSize(new java.awt.Dimension(70, 32));

        tablaTarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaTarjetas);

        btnCrearTarjeta.setBackground(new java.awt.Color(250, 9, 111));
        btnCrearTarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnCrearTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearTarjeta.setText("Crear");
        btnCrearTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTarjetaActionPerformed(evt);
            }
        });

        btnEditarTarjeta.setBackground(new java.awt.Color(250, 9, 111));
        btnEditarTarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnEditarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarTarjeta.setText("Editar");
        btnEditarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarTarjetaActionPerformed(evt);
            }
        });

        btnBorrarTarjeta.setBackground(new java.awt.Color(250, 9, 111));
        btnBorrarTarjeta.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        btnBorrarTarjeta.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarTarjeta.setText("Borrar");
        btnBorrarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTarjetaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tarjetaLayout = new javax.swing.GroupLayout(tarjeta);
        tarjeta.setLayout(tarjetaLayout);
        tarjetaLayout.setHorizontalGroup(
            tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tarjetaLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tarjetaLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tarjetaLayout.createSequentialGroup()
                        .addGroup(tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tarjetaLayout.createSequentialGroup()
                                .addComponent(rbDebito)
                                .addGap(33, 33, 33)
                                .addComponent(rbCredito)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tarjetaLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnBuscarEnTarjeta))
                            .addComponent(jSeparator3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearTarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42))))
        );
        tarjetaLayout.setVerticalGroup(
            tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tarjetaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tarjetaLayout.createSequentialGroup()
                        .addGroup(tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtCliente1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarEnTarjeta))
                        .addGap(18, 18, 18)
                        .addGroup(tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDebito)
                            .addComponent(rbCredito)
                            .addComponent(jLabel14)
                            .addComponent(cmbPlanes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tarjetaLayout.createSequentialGroup()
                        .addComponent(btnCrearTarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditarTarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrarTarjeta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel5.add(tarjeta, "card5");

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 570, 480));

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

    private void btnMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMouseClicked
        limpiar();
        separadorMain.setBackground(Color.WHITE);

        main.setVisible(true);
        cliente.setVisible(false);
        cuenta.setVisible(false);
        tarjeta.setVisible(false);

    }//GEN-LAST:event_btnMainMouseClicked

    private void btnClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClienteMouseClicked
        limpiar();
        separadorCliente.setBackground(Color.WHITE);

        cliente.setVisible(true);
        main.setVisible(false);
        cuenta.setVisible(false);
        tarjeta.setVisible(false);
    }//GEN-LAST:event_btnClienteMouseClicked

    private void btnCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuentaMouseClicked
        limpiar();
        separadorCuenta.setBackground(Color.WHITE);

        cuenta.setVisible(true);
        main.setVisible(false);
        cliente.setVisible(false);
        tarjeta.setVisible(false);
    }//GEN-LAST:event_btnCuentaMouseClicked

    private void btnTarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTarjetaMouseClicked
        limpiar();
        separadorTarjeta.setBackground(Color.WHITE);

        tarjeta.setVisible(true);
        main.setVisible(false);
        cliente.setVisible(false);
        cuenta.setVisible(false);
    }//GEN-LAST:event_btnTarjetaMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        int i = JOptionPane.showConfirmDialog(this, "Seguro que quiere salir?");
        if( i==0 ) {
            Login2 login = new Login2();
            login.setVisible(true);
            login.setLocationRelativeTo(null);
            
            this.dispose();
        }

    }//GEN-LAST:event_btnSalirMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        limpiar();
        
        txtNombreUsuario.setText(usuario.getNombreUsuario());
        
        cargarTablaCliente();
        cargarTablaCuenta();
        cargarTablaTarjeta();
    }//GEN-LAST:event_formWindowOpened

    private void btnCrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearClienteActionPerformed
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String dni = txtDni.getText();
        
        String nombreUsu = txtUsuario.getText();
        String pass = txtPass.getText();
        
        control.crearCliente(nombre, apellido, dni, nombreUsu, pass);
        
        mostrarMensaje("Cliente creado correctamente", "Info", "Cliente creado");
        
        limpiarInput();
        
        cargarTablaCliente();
    }//GEN-LAST:event_btnCrearClienteActionPerformed

    private void btnEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarClienteActionPerformed
        if( tablaClientes.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaClientes.getSelectedRow() != -1 ) {
                int id_cliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(),0)));
                
                Cliente c = control.traerCliente(id_cliente);
                
                String nombre = (txtNombre.getText().length()==0)?c.getNombre():txtNombre.getText();
                String apellido = (txtApellido.getText().length()==0)?c.getApellido():txtApellido.getText();
                String dni = (txtDni.getText().length()==0)?c.getDni():txtDni.getText();
                
                String nombreUsu = (txtUsuario.getText().length()==0)?c.getUnUsuario().getNombreUsuario():txtUsuario.getText();
                String pass = (txtPass.getText().length()==0)?c.getUnUsuario().getContrasenia():txtPass.getText(); 
                
                control.editarCliente(id_cliente, nombre, apellido, dni, nombreUsu, pass);
                
                mostrarMensaje("Usuario editado", "Info", "Editar Usuario");
                limpiarInput();
                cargarTablaCliente();
            }
            else {
                mostrarMensaje("No selecciono ningun cliente", "Error", "Error al editar");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para editar", "Error", "Error al editar");
        }
    }//GEN-LAST:event_btnEditarClienteActionPerformed

    private void btnBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarClienteActionPerformed
        if( tablaClientes.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaClientes.getSelectedRow() != -1 ) {
                int id_cliente = Integer.parseInt(String.valueOf(tablaClientes.getValueAt(tablaClientes.getSelectedRow(),0)));
                
                control.borrarCliente(id_cliente);
                
                mostrarMensaje("Se elimino correctamente", "Info", "Borrado de Cliente");
                
                cargarTablaCliente();
            }
            else {
                mostrarMensaje("No selecciono ningun cliente", "Error", "Error al eliminar");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para eliminar", "Error", "Error al eliminar");
        }
    }//GEN-LAST:event_btnBorrarClienteActionPerformed

    private void btnBuscarEnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEnCuentaActionPerformed
        String dni = txtCliente.getText();

        Cliente c = traerClienteDni(dni);

        if( c!=null ) {
            cargarTablaCuenta(c);
        } else {
            mostrarMensaje("No se encontro al cliente", "Error", "Cliente no encontrado");
        }

    }//GEN-LAST:event_btnBuscarEnCuentaActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        if( tablaCuentas.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaCuentas.getSelectedRow() != -1 ) {
                int id_cliente = Integer.parseInt(String.valueOf(tablaCuentas.getValueAt(tablaCuentas.getSelectedRow(),0)));
                
                if(rbCC.isSelected()==true) {
                    control.crearCtaCte(id_cliente);
                    mostrarMensaje("Cuenta Corriente creada", "Info", "Crear Cuenta");
                }
                
                if(rbCA.isSelected()==true) {
                    control.crearCajaAhorro(id_cliente);
                    mostrarMensaje("Caja de ahorro creada", "Info", "Crear cuenta");
                }
                
                cargarTablaCuenta();
                txtCliente.setText("");
            }
            else {
                mostrarMensaje("No selecciono ninguna cuenta", "Error", "Error al crear");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para crear cuenta", "Error", "Error al crear");
        }
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void btnBorrarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarCuentaActionPerformed
        if( tablaCuentas.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaCuentas.getSelectedRow() != -1 ) {
                int id_cuenta = Integer.parseInt(String.valueOf(tablaCuentas.getValueAt(tablaCuentas.getSelectedRow(),0)));
                String cbu = (String) tablaCuentas.getValueAt(tablaCuentas.getSelectedRow(),1);
                
                boolean borrarCuenta = control.borrarCuenta(id_cuenta, cbu);
                
                if(borrarCuenta) {
                    mostrarMensaje("Se borro la cuenta correctamente", "Info", "Borrar cuenta");
                } else {
                    mostrarMensaje("No se borro la cuenta", "Error", "Borrar cuenta");
                }

                cargarTablaCuenta();
            }
            else {
                mostrarMensaje("No selecciono ninguna cuenta", "Error", "Error al crear");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para crear cuenta", "Error", "Error al crear");
        }
    }//GEN-LAST:event_btnBorrarCuentaActionPerformed

    private void btnBuscarEnTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEnTarjetaActionPerformed
        String dni = txtCliente1.getText();

        Cliente c = traerClienteDni(dni);

        if( c!=null ) {
            cargarTablaEnTarjeta(c);
        } else {
            mostrarMensaje("No se encontro al cliente", "Error", "Cliente no encontrado");
        }

    }//GEN-LAST:event_btnBuscarEnTarjetaActionPerformed

    private void btnCrearTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTarjetaActionPerformed
        if( tablaTarjetas.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaTarjetas.getSelectedRow() != -1 ) {
                int id_cliente = Integer.parseInt(String.valueOf(tablaTarjetas.getValueAt(tablaTarjetas.getSelectedRow(),0)));
                
                String tipoTarjeta = "";
                
                String plan = (String) cmbPlanes.getSelectedItem();
                
                if(rbDebito.isSelected()==true) {
                    tipoTarjeta = "Debito";
                }
                
                if(rbCredito.isSelected()==true) {
                    tipoTarjeta = "Credito";
                }
                
                control.crearTarjeta(id_cliente, tipoTarjeta, plan);
                
                mostrarMensaje("Tarjeta creada correctamente", "Info", "Tarjeta creada");
                
                cargarTablaTarjeta();
                limpiarInputTarjeta();
            }
            else {
                mostrarMensaje("No selecciono ningun cliente", "Error", "Error al crear");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para crear la Tarjeta", "Error", "Error al crear");
        }
    }//GEN-LAST:event_btnCrearTarjetaActionPerformed

    private void btnEditarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarTarjetaActionPerformed
        if( tablaTarjetas.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaTarjetas.getSelectedRow() != -1 ) {
                int id_tarjeta = Integer.parseInt(String.valueOf(tablaTarjetas.getValueAt(tablaTarjetas.getSelectedRow(),0)));
                
                String tipoTarjeta = "";
                
                String plan = (String) cmbPlanes.getSelectedItem();
                
                if(rbDebito.isSelected()==true) {
                    tipoTarjeta = "Debito";
                }
                
                if(rbCredito.isSelected()==true) {
                    tipoTarjeta = "Credito";
                }
                
                float disponible = Float.parseFloat(JOptionPane.showInputDialog("Ingrese valor disponible:"));
                
                control.editarTarjeta(id_tarjeta, tipoTarjeta, plan, disponible);
                
                mostrarMensaje("Tarjeta editada correctamente", "Info", "Editar");
                
                cargarTablaTarjeta();
            }
            else {
                mostrarMensaje("No selecciono ninguna tarjeta", "Error", "Error");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para modificar", "Error", "Error");
        }
    }//GEN-LAST:event_btnEditarTarjetaActionPerformed

    private void btnBorrarTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTarjetaActionPerformed
        if( tablaTarjetas.getRowCount() > 0 ) {
            // controlo que se haya seleccionado una fila
            if( tablaTarjetas.getSelectedRow() != -1 ) {
                int id_tarjeta = Integer.parseInt(String.valueOf(tablaTarjetas.getValueAt(tablaTarjetas.getSelectedRow(),0)));
                
                control.borrarTarjeta(id_tarjeta);
                
                mostrarMensaje("Tarjeta borrada correctamente", "Info", "Tarjeta borrada");

                cargarTablaTarjeta();
            }
            else {
                mostrarMensaje("No selecciono ninguna tarjeta", "Error", "Error");
            }
        }
        else {
            mostrarMensaje("No hay nada en la tabla para borrar", "Error", "Error");
        }
    }//GEN-LAST:event_btnBorrarTarjetaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrarCliente;
    private javax.swing.JButton btnBorrarCuenta;
    private javax.swing.JButton btnBorrarTarjeta;
    private javax.swing.JButton btnBuscarEnCuenta;
    private javax.swing.JButton btnBuscarEnTarjeta;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JButton btnCrearCliente;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JButton btnCrearTarjeta;
    private javax.swing.JLabel btnCuenta;
    private javax.swing.JButton btnEditarCliente;
    private javax.swing.JButton btnEditarTarjeta;
    private javax.swing.JLabel btnLupa;
    private javax.swing.JLabel btnMain;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnTarjeta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel cliente;
    private javax.swing.JComboBox<String> cmbPlanes;
    private javax.swing.JPanel cuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel main;
    private javax.swing.JRadioButton rbCA;
    private javax.swing.JRadioButton rbCC;
    private javax.swing.JRadioButton rbCredito;
    private javax.swing.JRadioButton rbDebito;
    private javax.swing.JSeparator separadorCliente;
    private javax.swing.JSeparator separadorCuenta;
    private javax.swing.JSeparator separadorMain;
    private javax.swing.JSeparator separadorTarjeta;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTable tablaCuentas;
    private javax.swing.JTable tablaTarjetas;
    private javax.swing.JPanel tarjeta;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCliente1;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JLabel txtNombreUsuario;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpiar() {
        separadorCliente.setForeground(new Color(48,58,73));
        separadorMain.setForeground(new Color(48,58,73));
        separadorCuenta.setForeground(new Color(48,58,73));
        separadorTarjeta.setForeground(new Color(48,58,73));

        separadorCliente.setBackground(new Color(48,58,73));
        separadorMain.setBackground(new Color(48,58,73));
        separadorCuenta.setBackground(new Color(48,58,73));
        separadorTarjeta.setBackground(new Color(48,58,73));
    }

    private void cargarTablaCliente() {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int col) {
                return false;
            }
                   
        };
        
        // nombres de las columnas
        String titulos[] = {"Id", "Nombre", "Dni"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la abse de datos
        List<Cliente> listaCliente = control.traerClientes();
        
        // recorrer la lista y mostrar cada uno de los elementos en la tabla
        if( listaCliente != null ) {
            
            for(Cliente c : listaCliente) {
                Object[] objeto = {c.getId(), c.getNombre(), c.getDni()};
                
                modeloTabla.addRow(objeto);
            }
            
        }
        
        tablaClientes.setModel(modeloTabla);
    }
    
    private void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if( tipo.equals("Info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        }
        else if( tipo.equals("Error") ) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
    
    private void limpiarInput() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        txtUsuario.setText("");
        txtPass.setText("");
    }

    private Cliente traerClienteDni(String dni) {
        Cliente c = null;
        
        List<Cliente> clientes = control.traerClientes();
        
        for(Cliente cli: clientes) {
            if( cli.getDni().equals(dni)) {
                c = cli;
            }
        }
        
        return c;
    }

    private void cargarTablaCuenta() {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int col) {
                return false;
            }
                   
        };
        
        // nombres de las columnas
        String titulos[] = {"Id", "Cbu", "Alias"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la abse de datos
        List<Cuenta> listaCuentas = control.traerCuentas();
        
        // recorrer la lista y mostrar cada uno de los elementos en la tabla
        if( listaCuentas != null ) {
            
            for(Cuenta c : listaCuentas) {
                Object[] objeto = {c.getId(), c.getCbu(), c.getAlias()};
                
                modeloTabla.addRow(objeto);
            }
            
        }
        
        tablaCuentas.setModel(modeloTabla);
    }
    
    private void cargarTablaCuenta(Cliente c) {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int col) {
                return false;
            }
                   
        };
        
        // nombres de las columnas
        String titulos[] = {"Id", "Nombre", "Dni"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la abse de datos
        
        // recorrer la lista y mostrar cada uno de los elementos en la tabla
        if( c != null ) {
            Object[] objeto = {c.getId(), c.getNombre(), c.getDni()};
                
            modeloTabla.addRow(objeto);
        }
        
        tablaCuentas.setModel(modeloTabla);
    }

    private void cargarTablaEnTarjeta(Cliente c) {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int col) {
                return false;
            }
                   
        };
        
        // nombres de las columnas
        String titulos[] = {"Id", "Nombre", "Dni"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la abse de datos
        
        // recorrer la lista y mostrar cada uno de los elementos en la tabla
        if( c != null ) {
            Object[] objeto = {c.getId(), c.getNombre(), c.getDni()};
                
            modeloTabla.addRow(objeto);
        }
        
        tablaTarjetas.setModel(modeloTabla);
    }

    private void cargarTablaTarjeta() {
        // definir el modelo que queremos que tenga la tabla
        DefaultTableModel modeloTabla = new DefaultTableModel() {
            
            // que filas y col no sean editables
            @Override
            public boolean isCellEditable (int row, int col) {
                return false;
            }
                   
        };
        
        // nombres de las columnas
        String titulos[] = {"Id", "Disponible", "SaldoAPagar", "Tipo + Plan"};
        modeloTabla.setColumnIdentifiers(titulos);
        
        //carga de los datos desde la abse de datos
        List<Tarjeta> listaTarjetas = control.traerTarjetas();
        
        // recorrer la lista y mostrar cada uno de los elementos en la tabla
        if( listaTarjetas != null ) {
            
            for(Tarjeta t : listaTarjetas) {
                Object[] objeto = {t.getId(), t.getDisponible(), t.getSaldoPagar(), t.getTipoTarjeta()};
                
                modeloTabla.addRow(objeto);
            }
            
        }
        
        tablaTarjetas.setModel(modeloTabla);
    }

    private void limpiarInputTarjeta() {
        txtCliente1.setText("");
        cmbPlanes.setSelectedIndex(0);
    }
    
    
    
}
