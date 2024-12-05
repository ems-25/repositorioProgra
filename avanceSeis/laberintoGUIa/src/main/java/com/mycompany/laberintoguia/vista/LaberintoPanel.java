/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.laberintoguia.vista;

import com.mycompany.laberintoguia.controlador.ControladorLaberinto;
import com.mycompany.laberintoguia.controlador.ControladorPrincipal;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author emily
 */
public class LaberintoPanel extends javax.swing.JPanel {
private ImageIcon laberinto;
private ControladorLaberinto controlador;
    /**
     * Creates new form LaberintoPanel
     */
    
   
    public LaberintoPanel() {
        initComponents();
        laberinto=new ImageIcon("./src/main/resources/img/laberintoListo.png");
    }

    public void setControlador(ControladorLaberinto controlador) {
        this.controlador = controlador;
    }

    
    public void paint (Graphics g)
    {
        super.paint(g);
        laberinto.paintIcon(null, g,0,0);
        if (controlador!=null) 
        {
            controlador.dibujar(g);
           
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}