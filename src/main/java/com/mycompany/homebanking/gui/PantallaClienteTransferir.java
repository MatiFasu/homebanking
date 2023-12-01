
package com.mycompany.homebanking.gui;

import com.mycompany.homebanking.logica.Cliente;
import com.mycompany.homebanking.logica.Controladora;
import com.mycompany.homebanking.logica.Cuenta;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class PantallaClienteTransferir extends javax.swing.JFrame {

    Controladora control;
    Cliente cli;
   
    public PantallaClienteTransferir(Controladora c, Cliente cliente) {
        initComponents();
        this.cli = cliente;
        this.control = c;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCuentaOri = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        tipoTransferencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSaldo = new javax.swing.JLabel();
        cmbTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnTransferir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        jLabel1.setText("Transferir");

        jLabel2.setText("Cuenta Origen:");

        cmbCuentaOri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        cmbCuentaOri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCuentaOriActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingrese Id/Cbu/Alias:");

        tipoTransferencia.setEnabled(false);
        tipoTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTransferenciaActionPerformed(evt);
            }
        });
        tipoTransferencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tipoTransferenciaKeyReleased(evt);
            }
        });

        jLabel4.setText("Transferir por:");

        jLabel5.setText("Saldo disponible:");

        cmbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Id", "Cbu", "Alias" }));
        cmbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoActionPerformed(evt);
            }
        });

        jLabel7.setText("Monto a transferir:");

        monto.setEnabled(false);
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });
        monto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                montoKeyReleased(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnTransferir.setText("Transferir");
        btnTransferir.setEnabled(false);
        btnTransferir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferirActionPerformed(evt);
            }
        });

        jLabel6.setText("Dni del destinatario:");

        dni.setEnabled(false);
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dniKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tipoTransferencia)
                            .addComponent(dni, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(monto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnVolver)
                        .addGap(18, 18, 18)
                        .addComponent(btnTransferir))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(cmbCuentaOri, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtSaldo))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCuentaOri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSaldo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tipoTransferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnTransferir))
                .addContainerGap(101, Short.MAX_VALUE))
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

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnTransferirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferirActionPerformed
        
        float saldo = Float.parseFloat(txtSaldo.getText());
        
        float m = Float.parseFloat(this.monto.getText());
        
        String d = dni.getText();
        
        if( saldo>=m ) {
            
            String cbuCO = (String) cmbCuentaOri.getSelectedItem();
        
            Cuenta cuentaOri = control.traerCuentaCbu(cbuCO);
            
            String tipo = (String) cmbTipo.getSelectedItem();
            
            if( tipo.equals("Id") ) {
                String id_cue_des = tipoTransferencia.getText();
                
                control.transferir(cuentaOri, id_cue_des, d, m, tipo);
                
                mostrarMensaje("Transferencia Exitosa!", "Info", "Transferencia");
                limpiarTabla();
            }
            
            if( tipo.equals("Cbu") ) {
                String cbu = tipoTransferencia.getText();
                
                control.transferir(cuentaOri, cbu, d, m, tipo);
                
                mostrarMensaje("Transferencia Exitosa!", "Info", "Transferencia");
                limpiarTabla();
            }
            
            if( tipo.equals("Alias") ) {
                 String alias = tipoTransferencia.getText();
                
                control.transferir(cuentaOri, alias, d, m, tipo);
                
                mostrarMensaje("Transferencia Exitosa!", "Info", "Transferencia");
                limpiarTabla();
            }
            
            
            
        }else {
            mostrarMensaje("No hay suficiente saldo", "Error", "Saldo insuficiente");
        }
        
    }//GEN-LAST:event_btnTransferirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        List<Cuenta> listaCuentas = cli.getCuentas();
        if(listaCuentas != null) {
            for(Cuenta c: listaCuentas) {
                cmbCuentaOri.addItem(c.getCbu());
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void cmbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoActionPerformed
        if(cmbTipo.getSelectedItem().equals("Id") || cmbTipo.getSelectedItem().equals("Cbu") || 
                cmbTipo.getSelectedItem().equals("Alias")) {
            tipoTransferencia.setEnabled(true);
            monto.setEnabled(true);
            dni.setEnabled(true);
        } else {
            tipoTransferencia.setEnabled(false);
            monto.setEnabled(false);
            dni.setEnabled(false);
        }
    }//GEN-LAST:event_cmbTipoActionPerformed

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed

    }//GEN-LAST:event_montoActionPerformed

    private void cmbCuentaOriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCuentaOriActionPerformed
        String cbu = (String) cmbCuentaOri.getSelectedItem();
        
        Cuenta c = control.traerCuentaCbu(cbu);
        if(c!=null) {
            txtSaldo.setText(String.valueOf(c.getSaldo()));
        }
    }//GEN-LAST:event_cmbCuentaOriActionPerformed

    private void tipoTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTransferenciaActionPerformed

    }//GEN-LAST:event_tipoTransferenciaActionPerformed

    private void tipoTransferenciaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tipoTransferenciaKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_tipoTransferenciaKeyReleased

    private void montoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_montoKeyReleased

    private void dniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyReleased
        habilitarBoton();
    }//GEN-LAST:event_dniKeyReleased

    private void habilitarBoton() {     
        if( !tipoTransferencia.getText().isEmpty() && !monto.getText().isEmpty()) {
            btnTransferir.setEnabled(true);
        } else {
            btnTransferir.setEnabled(false);
        }
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTransferir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbCuentaOri;
    private javax.swing.JComboBox<String> cmbTipo;
    private javax.swing.JTextField dni;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField monto;
    private javax.swing.JTextField tipoTransferencia;
    private javax.swing.JLabel txtSaldo;
    // End of variables declaration//GEN-END:variables

    private void limpiarTabla() {
        cmbCuentaOri.setSelectedIndex(0);
        cmbTipo.setSelectedIndex(0);
        txtSaldo.setText("");
        tipoTransferencia.setText("");
        dni.setText("");
        monto.setText("");
    }
}
