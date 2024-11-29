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
    private Enemigo enemigo, enemigo2;
    private Principal principal;
    private int vida=3;
    private int coordenadasX[]={10,20,40,70,90,110,135,160,185,215,240,265,285,310,343,360,389,410,440,465,490,515,535,560};
    private int coordenadasY[]={0,10,20,45,70,115,130,150,170,200,225,250,275,300,320,350,375,395,425,450,475,500,525,550};
    private Premios premios, premios2, premios3;

    public AreaJuego() 
    {
        laberinto= new Laberinto();
        posicionarPersonajes();
    }
    
    public int getCelda ()
    {
        return laberinto.getCelda(personaje.getFila(), personaje.getColumna());
    }
    
     public void posicionarPersonajes()
     {
         personaje = new Personaje(5,0, coordenadasX[0],coordenadasY[5], new ImageIcon("./src/main/resources/img/gifLaberinto.gif"));
         enemigo = new Enemigo (5,9,coordenadasX[9],coordenadasY[5], new ImageIcon("./src/main/resources/img/villanoJuego.gif"));
         enemigo2 = new Enemigo (19,17,coordenadasX[17],coordenadasY[19], new ImageIcon("./src/main/resources/img/villanoJuego.gif"));
         premios=new Premios(5,9,coordenadasX[20],coordenadasY[3], new ImageIcon("./src/main/resources/img/florJuego.gif"));
         premios2 = new Premios(5,9,coordenadasX[2],coordenadasY[12], new ImageIcon("./src/main/resources/img/florJuego.gif"));
         premios3 = new Premios(5,9,coordenadasX[11],coordenadasY[21], new ImageIcon("./src/main/resources/img/florJuego.gif"));
         
     
     }
     
    
     
     
    public void dibujar (Graphics g)
     {
         personaje.show(g);
         enemigo.show(g);
         enemigo2.show(g);
         premios.show(g);
         premios2.show(g);
         premios3.show(g);
     }//fin de dibujar
    
    public void moverEnemigo()
     {
         enemigo.mover();
         
         
         if(isValido(enemigo.getFila(),enemigo.getColumna())&& (laberinto.getCelda(enemigo.getFila(), enemigo.getColumna()))==1 ) 
            {
           
            enemigo.setX(coordenadasX[enemigo.getColumna()]);
            enemigo.setY(coordenadasY[enemigo.getFila()]);
           
            
                if (isColision(enemigo)) 
                {
                   System.out.println("Colision");
//                   principal.perderVidas();
//                   System.out.println("perdió una vida" + principal.getVidas()); 
                
                   
                }
        
            }//fin del primer if   

     }//fin de mover enemigo
    
    public void moverEnemigo2()
    {
        enemigo2.mover2();
        if(isValido(enemigo2.getFila(),enemigo2.getColumna())&& (laberinto.getCelda(enemigo2.getFila(), enemigo2.getColumna()))==1 ) 
            {
           
            enemigo2.setX(coordenadasX[enemigo2.getColumna()]);
            enemigo2.setY(coordenadasY[enemigo2.getFila()]);
            
             if (isColision(enemigo2)) 
                {
                   System.out.println("Colision");
 
                }
        
            }
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
            
            
            
            if(isValido(filaDestino,columnaDestino)&& (laberinto.getCelda(filaDestino, columnaDestino))==1 ) 
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
            if (filaDestino >=0 && filaDestino < 24 && columnaDestino >=0 && columnaDestino < 32)
            {
              
              return true;
            }
            
         return false;
      }//fin de isValido

     
     
    public boolean isColision(Enemigo enemigo) 
    {
        if (personaje.getColumna() == enemigo.getColumna()&&personaje.getFila() == enemigo.getFila())
        {
            return true;
        }
        
        return false;
        
        
    }//fin de iscolision
    
   
        
                   
    
    
  
}//fin de la clase


