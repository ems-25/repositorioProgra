/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.AreaJuego;
import com.mycompany.laberintoguia.vista.GUIGano;
import com.mycompany.laberintoguia.vista.GUILaberinto;
import com.mycompany.laberintoguia.vista.LaberintoPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author emily
 */
public class ControladorLaberinto implements KeyListener {

    private GUILaberinto guiLaberinto;
    private LaberintoPanel laberintoPanel;
    private AreaJuego areaJuego;

    
    public void dibujar(Graphics g)
    {
        areaJuego.dibujar(g);
    }
    
    public ControladorLaberinto(GUILaberinto guiLaberinto) {
        this.guiLaberinto = guiLaberinto;
        areaJuego = new AreaJuego ();
        
    }

    public void setLaberintoPanel(LaberintoPanel laberintoPanel) {
        this.laberintoPanel = laberintoPanel;
    }
    
    public void moverEnemigo()
    {
        
        areaJuego.moverEnemigo();
        laberintoPanel.repaint();
        
    }
    
    public void moverEnemigo2()
    {
        areaJuego.moverEnemigo2();
        laberintoPanel.repaint();
    }
    
    public boolean isPerdio()
    {
       return areaJuego.isPerdio();
        
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
    
}
