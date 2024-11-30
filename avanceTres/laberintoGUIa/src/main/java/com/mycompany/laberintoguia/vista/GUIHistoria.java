/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laberintoguia.vista;

import java.awt.event.ActionListener;

/**
 *
 * @author emily
 */
public class GUIHistoria extends javax.swing.JFrame {

    /**
     * Creates new form GUIHistoria
     */
    public GUIHistoria() {
        initComponents();
    }
    
    public void escuchar (ActionListener controlador)
    {
        btnSalirHistoria.addActionListener(controlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalirHistoria = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirHistoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir.png"))); // NOI18N
        btnSalirHistoria.setActionCommand("salirHistoria");
        btnSalirHistoria.setBorderPainted(false);
        btnSalirHistoria.setContentAreaFilled(false);
        btnSalirHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirHistoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirHistoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Historia.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirHistoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirHistoriaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirHistoria;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
