/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.AreaJuego;
import com.mycompany.laberintoguia.vista.GUIGano;
import com.mycompany.laberintoguia.vista.GUILaberinto;
import com.mycompany.laberintoguia.vista.GUIPerdio;
import java.awt.event.ActionListener;

/**
 *
 * @author emily
 */
public class Hilo extends Thread 
{
    private AreaJuego areaJuego;
    private ControladorLaberinto controladorLaberinto;
    public boolean estado;
    private GUIGano guiGano;
    private GUIPerdio guiPerdio;
    public boolean volverJugar;
    private GUILaberinto guiLaberinto;

    public Hilo(ControladorLaberinto controladorLaberinto) 
    {
        this.controladorLaberinto = controladorLaberinto;
        estado= true;
        guiGano= new GUIGano();
        guiPerdio = new GUIPerdio();
        guiLaberinto = new GUILaberinto();
        
       
    }
    
    public void run ()
    {  
         while (true)
         {
             try
             {
                 if (estado) 
                 
                 {
                  controladorLaberinto.moverEnemigo();
                  
                     if (controladorLaberinto.isPerdio()) {
                        estado = false;
                        ///volverJugar=false;
                       
                        break; 
                    }

                    if (controladorLaberinto.isGano()) {
                        estado = false;
                        //volverJugar=true;
                        break; 
                    }
                  
                 }//fin de if
                 
                 sleep (200);
             }
             
             catch(InterruptedException ex)
             {
                 System.out.println(""+ex);
             }
             
             
                 
         
         }//fin de while
    }//fin del metodo
    
  public boolean terminarJuego()
  {
    return volverJugar;
  }
   
   
   
   
     
}//fin de clase


