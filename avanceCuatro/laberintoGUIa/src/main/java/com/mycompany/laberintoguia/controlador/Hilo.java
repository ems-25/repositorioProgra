/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.AreaJuego;
import com.mycompany.laberintoguia.vista.GUIGano;
import com.mycompany.laberintoguia.vista.GUIPerdio;

/**
 *
 * @author emily
 */
public class Hilo extends Thread
{
    private AreaJuego areaJuego;
    private ControladorLaberinto controladorLaberinto;
    public boolean estado ;
    public boolean terminarJuego;
    private GUIGano guiGano;
    private GUIPerdio guiPerdio;

    public Hilo(ControladorLaberinto controladorLaberinto) 
    {
        this.controladorLaberinto = controladorLaberinto;
        estado= true;
        guiGano= new GUIGano();
        guiPerdio = new GUIPerdio();
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
                  controladorLaberinto.moverEnemigo2();
                     if (controladorLaberinto.isPerdio()) 
                     {
                        estado=false;
                        guiPerdio.setVisible(true);
                        
                     }
                     if (controladorLaberinto.isGano()) 
                        {

                            estado=false;
                            guiGano.setVisible(true);
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
    

     
}//fin de clase
