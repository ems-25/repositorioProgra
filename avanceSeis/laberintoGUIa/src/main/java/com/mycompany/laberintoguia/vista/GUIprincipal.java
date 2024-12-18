/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laberintoguia.vista;

import com.mycompany.laberintoguia.controlador.ControladorPrincipal;

/**
 *
 * @author emily
 */
public class GUIprincipal extends javax.swing.JFrame {

    /**
     * Creates new form GUIprincipal
     */
    public GUIprincipal(ControladorPrincipal controlador) {
        initComponents();
        escuchar(controlador);
    }
    
    public void escuchar(ControladorPrincipal controlador)
    {
        btnIntsrucciones.addActionListener(controlador);
        btnJugar.addActionListener(controlador);
        btnSalir.addActionListener(controlador);
        btnHistoria.addActionListener(controlador);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIntsrucciones = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnHistoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnIntsrucciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInstrucciones.png"))); // NOI18N
        btnIntsrucciones.setActionCommand("Instrucciones");
        btnIntsrucciones.setBorderPainted(false);
        btnIntsrucciones.setContentAreaFilled(false);
        btnIntsrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntsruccionesActionPerformed(evt);
            }
        });
        getContentPane().add(btnIntsrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, 70));

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnJugar.png"))); // NOI18N
        btnJugar.setActionCommand("Jugar");
        btnJugar.setBorderPainted(false);
        btnJugar.setContentAreaFilled(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, -1, -1));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir.png"))); // NOI18N
        btnSalir.setActionCommand("Salir");
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, 70));

        btnHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnHistoria.png"))); // NOI18N
        btnHistoria.setActionCommand("historia");
        btnHistoria.setBorderPainted(false);
        btnHistoria.setContentAreaFilled(false);
        getContentPane().add(btnHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 170, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo de inicio.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIntsruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntsruccionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIntsruccionesActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnJugarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistoria;
    private javax.swing.JButton btnIntsrucciones;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
