/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.laberintoguia.vista;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

/**
 *
 * @author emily
 */
public class GUILaberinto extends javax.swing.JFrame {

    
    /**
     * Creates new form GUILaberinto
     */
    public GUILaberinto() {
        initComponents();
    }

    public LaberintoPanel getLaberintoPanel1() {
        return laberintoPanel1;
    }

    
    
    public void escucharMouse (MouseListener controlador)
    {
        this.addMouseListener(controlador);
    }
    
    
    
    
     public void escuchar(ActionListener controlador)
    {
        
        btnSalirLaberinto.addActionListener(controlador);
       
    }

     public void escucharTeclado (KeyListener controlador)
     {
         this.addKeyListener(controlador);
     }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalirLaberinto = new javax.swing.JButton();
        laberintoPanel1 = new com.mycompany.laberintoguia.vista.LaberintoPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirLaberinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnSalir.png"))); // NOI18N
        btnSalirLaberinto.setActionCommand("btnSalirLaberinto");
        btnSalirLaberinto.setBorderPainted(false);
        btnSalirLaberinto.setContentAreaFilled(false);
        btnSalirLaberinto.setDefaultCapable(false);
        btnSalirLaberinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirLaberintoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalirLaberinto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 480, 160, 70));

        javax.swing.GroupLayout laberintoPanel1Layout = new javax.swing.GroupLayout(laberintoPanel1);
        laberintoPanel1.setLayout(laberintoPanel1Layout);
        laberintoPanel1Layout.setHorizontalGroup(
            laberintoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        laberintoPanel1Layout.setVerticalGroup(
            laberintoPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(laberintoPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, 800, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirLaberintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirLaberintoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirLaberintoActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalirLaberinto;
    private com.mycompany.laberintoguia.vista.LaberintoPanel laberintoPanel1;
    // End of variables declaration//GEN-END:variables
}
