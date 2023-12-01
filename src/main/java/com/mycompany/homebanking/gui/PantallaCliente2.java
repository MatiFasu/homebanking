
package com.mycompany.homebanking.gui;

import com.mycompany.homebanking.logica.Controladora;
import com.mycompany.homebanking.logica.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class PantallaCliente2 extends javax.swing.JFrame {

    Controladora control;
    Usuario usuario;
    
    public PantallaCliente2(Controladora c, Usuario u) {
        initComponents();
        this.control = c;
        this.usuario = u;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JLabel();
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
        cuenta = new javax.swing.JPanel();
        tarjeta = new javax.swing.JPanel();

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

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre de Usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 110, -1));

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

        btnBuscar.setBackground(new java.awt.Color(54, 73, 80));
        btnBuscar.setIcon(new javax.swing.ImageIcon("E:\\Matias\\Programas\\Java\\Interfaz\\src\\main\\img\\lupa.png")); // NOI18N
        btnBuscar.setOpaque(true);
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 40, 40));
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

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Main");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel11)
                .addContainerGap(469, Short.MAX_VALUE))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel11)
                .addContainerGap(406, Short.MAX_VALUE))
        );

        jPanel5.add(main, "card2");

        javax.swing.GroupLayout clienteLayout = new javax.swing.GroupLayout(cliente);
        cliente.setLayout(clienteLayout);
        clienteLayout.setHorizontalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        clienteLayout.setVerticalGroup(
            clienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel5.add(cliente, "card3");

        javax.swing.GroupLayout cuentaLayout = new javax.swing.GroupLayout(cuenta);
        cuenta.setLayout(cuentaLayout);
        cuentaLayout.setHorizontalGroup(
            cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        cuentaLayout.setVerticalGroup(
            cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jPanel5.add(cuenta, "card4");

        javax.swing.GroupLayout tarjetaLayout = new javax.swing.GroupLayout(tarjeta);
        tarjeta.setLayout(tarjetaLayout);
        tarjetaLayout.setHorizontalGroup(
            tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        tarjetaLayout.setVerticalGroup(
            tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
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
    }//GEN-LAST:event_formWindowOpened

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnCliente;
    private javax.swing.JLabel btnCuenta;
    private javax.swing.JLabel btnMain;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnTarjeta;
    private javax.swing.JPanel cliente;
    private javax.swing.JPanel cuenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel main;
    private javax.swing.JSeparator separadorCliente;
    private javax.swing.JSeparator separadorCuenta;
    private javax.swing.JSeparator separadorMain;
    private javax.swing.JSeparator separadorTarjeta;
    private javax.swing.JPanel tarjeta;
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
}
