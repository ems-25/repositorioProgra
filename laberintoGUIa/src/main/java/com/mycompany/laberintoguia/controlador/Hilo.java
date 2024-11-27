/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.AreaJuego;

/**
 *
 * @author emily
 */
public class Hilo extends Thread
{
    private AreaJuego areaJuego;
    private ControladorLaberinto controladorLaberinto;
    public boolean estado ;

    public Hilo(ControladorLaberinto controladorLaberinto) 
    {
        this.controladorLaberinto = controladorLaberinto;
        estado= true;
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
