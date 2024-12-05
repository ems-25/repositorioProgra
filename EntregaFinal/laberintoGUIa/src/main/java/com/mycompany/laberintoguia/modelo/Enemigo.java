/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author emily
 */
public class Enemigo extends Personaje        
{
    private int direction;
    
     public Enemigo(int fila, int columna, int x, int y, ImageIcon imagen, int direction) {
        super(fila, columna, x, y, imagen);
        this.direction = direction;
    }
     
     //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//                                          metodo para mover el enemigo
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
     public void mover()
     {
         //x=x+10;
         
        // el enemigo que inicia en 0 entra en estos if
        if (direction==0&&(fila>0)&&fila<24) 
         {
           fila--;
             if (fila==1) 
             {
                 fila=1;
                 direction=1;
                 
                 
             }
         }
         
         
         if ((direction==1)&&(fila>0)&&(fila<24)) 
         {
            fila++;
             if (fila==15)
             {
                
               direction=0;
              
             }
         }
         
          // el enemigo que inicia en 2 entra en estos if
        if (direction==2&&(fila>0)&&fila<24) 
         {
           fila--;
             if (fila==15) 
             {
                 fila=15;
                 direction=3;
                 
                 
             }
         }
         
         
         if ((direction==3)&&(fila>0)&&(fila<24)) 
         {
            fila++;
             if (fila==21)
             {
                
               direction=2;
              
             }
         }
 
         
         //setY(getY()-10); otra forma de acceder al atributo cuando esta privado en la clase padre
            }
     
//       public void mover2()
//        {
//         //x=x+10;
//         
//         
//     
//         
//         
//
// 
//         
//         //setY(getY()-10); otra forma de acceder al atributo cuando esta privado en la clase padre
//     }
     
}
