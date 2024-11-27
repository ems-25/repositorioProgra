/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author emily
 */
public class AreaJuego {
    private Laberinto laberinto;
    private Personaje personaje;
    private int coordenadasX[]={0,10,40,70,90,110,135,160,185,215,240,265,285,310,343,360,389,410,440,465,490,515,535,560};
    private int coordenadasY[]={0,0,20,45,70,100,130,150,170,200,225,250,275,300,320,350,375,395,425,450,475,500,525,550};
    private Enemigo enemigo;

    public AreaJuego() 
    {
        laberinto= new Laberinto();
        posicionarPersonajes();
    }
     public void posicionarPersonajes()
     {
         personaje = new Personaje(0,1, 0,1, new ImageIcon("./src/main/resources/img/gifLaberinto.gif"));
         enemigo = new Enemigo (15,0,30,100, new ImageIcon("./src/main/resources/img/villanoJuego.gif"));
     }
     
    
     
     
      public void caminar (String direccion)
     {
         int filaDestino = personaje.getFila();
         int columnaDestino = personaje.getColumna();
         
        
            switch(direccion)
            {
             case "arriba" :
                 filaDestino--;
                 
             break;
             
             case "abajo" :
                 filaDestino++;
                 
             break;
             
             case "derecha" :
                 columnaDestino++;
                 
             break;
             
             case "izquierda" :
                 columnaDestino--;
                 
             break;
            } //fin del switch
            
            if ((isValido(filaDestino, columnaDestino)) && (laberinto.getCelda(filaDestino, columnaDestino) == 0)) 
            {
            personaje.setFila(filaDestino);
            personaje.setColumna(columnaDestino);
            personaje.setX(coordenadasX[columnaDestino]);
            personaje.setY(coordenadasY[filaDestino]);
        
            }   
     }//fin del metodo
      
      
      //24 filas 32 columnas
      public boolean isValido(int filaDestino, int columnaDestino) 
      {
            // System.out.println("isValido fila destino " + filaDestino + ", columna destino: " + columnaDestino);
            if (filaDestino >=0 && filaDestino < 21 && columnaDestino >= 0 && columnaDestino < 20)
            {
              System.out.println("Entre");
              return true;
            }
            
         return false;
      }//fin de isValido
 
    
     public void dibujar (Graphics g)
     {
         personaje.show(g);
         enemigo.show(g);
         
     }//fin de dibujar
    
     public void moverEnemigo()
     {
         enemigo.mover();
         if ((isValido(enemigo.getFila(), enemigo.getColumna())) && (laberinto.getCelda(enemigo.getFila(), enemigo.getColumna()) == 0)) 
            {
            
            enemigo.setX(coordenadasX[enemigo.getColumna()]);
            enemigo.setY(coordenadasY[enemigo.getColumna()]);
        
            }   
     }//fin de mover enemigo
     
    public boolean isColision(Enemigo enemigo) 
    {
        if (personaje.getFila() == enemigo.getFila() && personaje.getColumna() == enemigo.getColumna())
        {
            return true;
        }
        
        return false;
        
        
    }//fin de iscolision
}


