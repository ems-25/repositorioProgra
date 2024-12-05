/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.AreaJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author emily
 */
public class ContinuarControlador implements ActionListener{

    private AreaJuego areaJuego;
    private Hilo hilo;
    private ControladorLaberinto controladorLaberinto;

    public ContinuarControlador() 
    {
        areaJuego = new AreaJuego();
        
        
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        switch  (evento.getActionCommand())
        {
            case"":
                break;
        }
    }
    
}
