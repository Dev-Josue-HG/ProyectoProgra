/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.interfaz;

/**
 *
 * @author jhosu
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form LoginUser
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background1 = new javax.swing.JPanel();
        Background2 = new javax.swing.JPanel();
        jLabelLogin = new javax.swing.JLabel();
        btnVolverLogin = new javax.swing.JButton();
        btnRegistroCliente = new javax.swing.JButton();
        btnActualizacionCliente = new javax.swing.JButton();
        btnAperturaCuenta = new javax.swing.JButton();
        btnRealizarDepo = new javax.swing.JButton();
        btnRetirarDine = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Background1.setBackground(new java.awt.Color(255, 255, 255));

        Background2.setBackground(new java.awt.Color(204, 204, 204));
        Background2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Background2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelLogin.setText("SISTEMA BANCARIO");
        Background2.add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        btnVolverLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnVolverLogin.setText("VOLVER");
        btnVolverLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverLoginActionPerformed(evt);
            }
        });

        btnRegistroCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRegistroCliente.setText("REGISTRO DE CLIENTE");
        btnRegistroCliente.setToolTipText("");
        btnRegistroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroClienteActionPerformed(evt);
            }
        });

        btnActualizacionCliente.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnActualizacionCliente.setText("ACTUALIZACIÓN DE CLIENTE");
        btnActualizacionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizacionClienteActionPerformed(evt);
            }
        });

        btnAperturaCuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnAperturaCuenta.setText("APERTURA DE CUENTA");
        btnAperturaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAperturaCuentaActionPerformed(evt);
            }
        });

        btnRealizarDepo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRealizarDepo.setText("REALIZAR DEPÓSITO");
        btnRealizarDepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarDepoActionPerformed(evt);
            }
        });

        btnRetirarDine.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnRetirarDine.setText("RETIRAR DINERO");
        btnRetirarDine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarDineActionPerformed(evt);
            }
        });

        btnReportes.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnReportes.setText("REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("MENU PRINCIPAL");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/RegistroUserNew.png"))); // NOI18N

        javax.swing.GroupLayout Background1Layout = new javax.swing.GroupLayout(Background1);
        Background1.setLayout(Background1Layout);
        Background1Layout.setHorizontalGroup(
            Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Background1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(296, 296, 296))
            .addGroup(Background1Layout.createSequentialGroup()
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addComponent(Background2, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                    .addGroup(Background1Layout.createSequentialGroup()
                        .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Background1Layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnRetirarDine, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(Background1Layout.createSequentialGroup()
                                        .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAperturaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnActualizacionCliente)
                                            .addComponent(btnRegistroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(44, 44, 44)
                                        .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnRealizarDepo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(Background1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnVolverLogin)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Background1Layout.setVerticalGroup(
            Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Background1Layout.createSequentialGroup()
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Background2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistroCliente)
                    .addComponent(btnRealizarDepo))
                .addGap(46, 46, 46)
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRetirarDine)
                    .addComponent(btnActualizacionCliente))
                .addGap(50, 50, 50)
                .addGroup(Background1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReportes)
                    .addComponent(btnAperturaCuenta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnVolverLogin)
                .addGap(15, 15, 15))
        );

        getContentPane().add(Background1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAperturaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAperturaCuentaActionPerformed
        AperturaCuenta abrirAperturaCuenta = new AperturaCuenta();
        abrirAperturaCuenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAperturaCuentaActionPerformed

    private void btnActualizacionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizacionClienteActionPerformed
        ActualizarCliente abrirActualizarCliente = new ActualizarCliente();
        abrirActualizarCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnActualizacionClienteActionPerformed

    private void btnVolverLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverLoginActionPerformed
        LoginUserSistem abrirLoginUserSistem = new LoginUserSistem();
        abrirLoginUserSistem.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverLoginActionPerformed

    private void btnRegistroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroClienteActionPerformed
        RegistroCliente abrirRegistroCliente = new RegistroCliente();
        abrirRegistroCliente.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroClienteActionPerformed

    private void btnRealizarDepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarDepoActionPerformed
        RealizarDeposito abrirRealizarDeposito = new RealizarDeposito();
        abrirRealizarDeposito.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRealizarDepoActionPerformed

    private void btnRetirarDineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarDineActionPerformed
        RetirarDinero abrirRetirarDinero = new RetirarDinero();
        abrirRetirarDinero.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRetirarDineActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        Reportes abrirReportes = new Reportes();
        abrirReportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReportesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background1;
    private javax.swing.JPanel Background2;
    private javax.swing.JButton btnActualizacionCliente;
    private javax.swing.JButton btnAperturaCuenta;
    private javax.swing.JButton btnRealizarDepo;
    private javax.swing.JButton btnRegistroCliente;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnRetirarDine;
    private javax.swing.JButton btnVolverLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelLogin;
    // End of variables declaration//GEN-END:variables
}