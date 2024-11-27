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
    private int direccion;
    
     public Enemigo(int fila, int columna, int x, int y, ImageIcon imagen) {
        super(fila, columna, x, y, imagen);
        
    }
     public void mover()
     {
         if (direccion==0&&(fila>0)&&fila<21) 
         {
           fila--;
             if (fila==0) 
             {
                 direccion=1;
                 fila=1;
                 
             }
         }
         
         
         if ((direccion==1)&&(fila>0)&&(fila<21)) 
         {
            fila++;
             if (fila==21)
             {
               direccion=0;
               columna=20;
             }
         }
             
         if ((direccion==2)&&(columna>0)&&(columna<20)) 
         {
             columna --;
             if (columna==0)
             {
               direccion=3;
               columna=1;
             }
             
             
         }
             
             if ((direccion==3)&&(columna>0)&&(columna<20))
             {
                 columna++;
                 if (columna==20) 
                 {
                    direccion=2;
                    columna=19;
                 }
             }
         
         
         //setY(getY()-10); otra forma de acceder al atributo cuando esta privado en la clase padre
     }
     
}
