/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.AreaJuego;
import com.mycompany.laberintoguia.vista.GUIGano;
import com.mycompany.laberintoguia.vista.GUILaberinto;
import com.mycompany.laberintoguia.vista.GUIPerdio;
import com.mycompany.laberintoguia.vista.LaberintoPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author emily
 */
public class ControladorLaberinto implements KeyListener {


    private LaberintoPanel laberintoPanel;
    private AreaJuego areaJuego;
    private GUIGano guiGano;
    private GUIPerdio guiPerdio;
    private Hilo hilo;
//    private GUIprincipal guiPrincipal;
   
    
    public void dibujar(Graphics g)
    {
        areaJuego.dibujar(g);
    }
    
    
    public ControladorLaberinto(GUILaberinto guiLaberinto) {
       
        areaJuego = new AreaJuego ();
        guiGano = new GUIGano();
        guiPerdio= new GUIPerdio();
//        guiPrincipal = new GUIprincipal(this);
        
    }

    public void setLaberintoPanel(LaberintoPanel laberintoPanel) {
        this.laberintoPanel = laberintoPanel;
    }
    
    public void moverEnemigo()
    {
        
        areaJuego.moverEnemigo();
        laberintoPanel.repaint();
        
    }
    
    
    public boolean isPerdio()
    {
       return areaJuego.isPerdio();
        
    }
    public boolean isGano()
    {
        return areaJuego.isGano();
    }
    
    

    
    @Override
    public void keyTyped(KeyEvent e) {
       }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode())
        {
            case KeyEvent.VK_UP:
                areaJuego.caminar("arriba");
                break;
                
            case KeyEvent.VK_DOWN:
                areaJuego.caminar("abajo");
            break;
            
            case KeyEvent.VK_LEFT:
                areaJuego.caminar("izquierda");
                break;

            case KeyEvent.VK_RIGHT:
                areaJuego.caminar("derecha");
            break;
        }
        
        }
    
    


    @Override
    public void keyReleased(KeyEvent e) {
    }

     public void mostrar()
    {
        if (hilo.volverJugar)
        {
            guiGano.setVisible(true);
            
        }
        else
        {
            guiPerdio.setVisible(true);
        }
    } 
     
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        switch(e.getActionCommand())
//        {
//             case "btnSiGano": // Opción de seguir jugando después de ganar
//            
//            guiGano.setVisible(false);
//            guiLaberinto.setVisible(true);
//            break;
//
//        case "btnNoGano": // Volver al menú principal después de ganar
//            guiGano.setVisible(false);
////            guiPrincipal.setVisible(true);
//            break;
//
//        case "btnSiPerdio": // Opción de seguir jugando después de perder
//           
//            guiPerdio.setVisible(false);
//            guiLaberinto.setVisible(true);
//            break;
//
//        case "btnNoPerdio": // Volver al menú principal después de perder
//            guiPerdio.setVisible(false);
////            guiPrincipal.setVisible(true);
//            break;
//        }   
//            
    }//fin de la clase
    

