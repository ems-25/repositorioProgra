/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.modelo;

import com.mycompany.laberintoguia.vista.GUIGano;
import com.mycompany.laberintoguia.vista.GUIPerdio;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author emily
 */
public class AreaJuego {
    private Laberinto laberinto;
    private Principal personaje;
    private ArrayList<Enemigo> enemigos;
    private ArrayList<Premios> premios;
    private boolean perdio;
    private boolean gano;

    private int coordenadasX[] = {10, 20, 40, 70, 90, 110, 135, 160, 185, 215, 240, 265, 285, 310, 343, 360, 389, 410, 440, 465, 490, 515, 535, 560};
    private int coordenadasY[] = {0, 10, 20, 45, 70, 115, 130, 150, 170, 200, 225, 250, 275, 300, 320, 350, 375, 395, 425, 450, 475, 500, 525, 550};

    public AreaJuego() {
        laberinto = new Laberinto();
        enemigos = new ArrayList<>();
        premios = new ArrayList<>();
        posicionarPersonajes();

        perdio = false;
        gano = false;
    }

    public int getCelda() {
        return laberinto.getCelda(personaje.getFila(), personaje.getColumna());
    }

    public void posicionarPersonajes() {
        personaje = new Principal(5, 0, coordenadasX[0], coordenadasY[5], new ImageIcon("./src/main/resources/img/gifLaberinto.gif"));
        enemigos.add(new Enemigo(9, 9, coordenadasX[9], coordenadasY[5], new ImageIcon("./src/main/resources/img/villanoJuego.gif"), 0));
        enemigos.add(new Enemigo(19, 17, coordenadasX[17], coordenadasY[19], new ImageIcon("./src/main/resources/img/villanoJuego.gif"), 2));
        premios.add(new Premios(3, 20, coordenadasX[20], coordenadasY[3], new ImageIcon("./src/main/resources/img/florJuego.gif")));
        premios.add(new Premios(12, 2, coordenadasX[2], coordenadasY[12], new ImageIcon("./src/main/resources/img/florJuego.gif")));
        premios.add(new Premios(21, 11, coordenadasX[11], coordenadasY[21], new ImageIcon("./src/main/resources/img/florJuego.gif")));
        premios.add(new Premios(21, 2, coordenadasX[2], coordenadasY[21], new ImageIcon("./src/main/resources/img/florJuego.gif")));
    }

    public void dibujar(Graphics g) {
        personaje.show(g);
        for (int elemento = 0; elemento < enemigos.size(); elemento++) 
        {
           enemigos.get(elemento).show(g);
         }
        // Dibujar los premios restantes
        for (int elemento = 0; elemento < premios.size(); elemento++) 
        {
           premios.get(elemento).show(g);
         }
    }

    public void moverEnemigo() {
        for (Enemigo enemigo : enemigos) {
            enemigo.mover();
            if (isValido(enemigo.getFila(), enemigo.getColumna()) && laberinto.getCelda(enemigo.getFila(), enemigo.getColumna()) == 1) {
                enemigo.setX(coordenadasX[enemigo.getColumna()]);
                enemigo.setY(coordenadasY[enemigo.getFila()]);
                if (isColision(enemigo)) {
                    personaje.perderVidas();
                    if (personaje.getVidas() == 0) {
                        perdio = true;
                    }
                }
            }
        }
    }

    public void caminar(String direccion) {
        int filaDestino = personaje.getFila();
        int columnaDestino = personaje.getColumna();
        switch (direccion) {
            case "arriba":
                filaDestino--;
                break;
            case "abajo":
                filaDestino++;
                break;
            case "derecha":
                columnaDestino++;
                break;
            case "izquierda":
                columnaDestino--;
                break;
        }

        if (isValido(filaDestino, columnaDestino) && laberinto.getCelda(filaDestino, columnaDestino) == 1) {
            personaje.setFila(filaDestino);
            personaje.setColumna(columnaDestino);
            personaje.setX(coordenadasX[columnaDestino]);
            personaje.setY(coordenadasY[filaDestino]);
        }

        // Verificar colisiones con premios después de moverse
        verificarColisionPremios();
    }

    private void verificarColisionPremios() {
        // Usamos un iterador para evitar problemas al modificar la lista mientras la recorremos
        premios.removeIf(premio -> {
            if (isColisionPremio(premio)) {
                personaje.incrementarPremios(); // Incrementar premios recolectados
                personaje.floresRecolectadas();
                return true; // Eliminar el premio de la lista
            }
            return false;
        });

        // Verificar si se han recolectado todos los premios y se está en la posición objetivo
        if (personaje.getPremiosRecolectados() == 4 && personaje.getFila() == 21 && personaje.getColumna() == 2) {
            gano = true;
        }
        
    }
    
     public boolean fin ()
     {
         if (perdio) 
         {
             System.out.println("PERDIO");
             return true;
         }
         

         return false;
     }
   
    

    public boolean isValido(int filaDestino, int columnaDestino) {
        return filaDestino >= 0 && filaDestino < 24 && columnaDestino >= 0 && columnaDestino < 32;
    }

    public boolean isColision(Enemigo enemigo) {
        return personaje.getColumna() == enemigo.getColumna() && personaje.getFila() == enemigo.getFila();
    }

    public boolean isColisionPremio(Premios premio) {
        return personaje.getColumna() == premio.getColumna() && personaje.getFila() == premio.getFila();
    }

    public boolean isPerdio() {
        return perdio;
    }

    public boolean isGano() {
       return gano;
    }
}
















































///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////








///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.laberintoguia.modelo;
//import com.mycompany.laberintoguia.vista.GUIPerdio;
//import java.awt.Graphics;
//import java.util.ArrayList;
//import javax.swing.ImageIcon;
///**
// *
// * @author emily
// */
//public class AreaJuego {
//    private Laberinto laberinto;
//    private Principal personaje;
//     private ArrayList <Enemigo> enemigos;
//    private Enemigo enemigo;
//    private Principal principal;
//    private GUIPerdio guiPerdio;
//    private int coordenadasX[]={10,20,40,70,90,110,135,160,185,215,240,265,285,310,343,360,389,410,440,465,490,515,535,560};
//    private int coordenadasY[]={0,10,20,45,70,115,130,150,170,200,225,250,275,300,320,350,375,395,425,450,475,500,525,550};
//    private Premios premios1, premios2, premios3,premios4;
//    private boolean perdio;
//    private boolean gano;
//   
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    public AreaJuego() 
//    {
//        laberinto= new Laberinto();
//        enemigos = new ArrayList<Enemigo> (); 
//        posicionarPersonajes();
//        guiPerdio = new GUIPerdio();
//        perdio=false;
//        gano = false;
//    }
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin de constructor
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    public int getCelda ()
//    {
//        return laberinto.getCelda(personaje.getFila(), personaje.getColumna());
//    }
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//     public void posicionarPersonajes()
//     {
//         personaje = new Principal(5,0, coordenadasX[0],coordenadasY[5], new ImageIcon("./src/main/resources/img/gifLaberinto.gif"));
//         enemigo = new Enemigo (5,9,coordenadasX[9],coordenadasY[5], new ImageIcon("./src/main/resources/img/villanoJuego.gif"),0);
//        enemigos.add(enemigo);
//        enemigo = new Enemigo (19,17,coordenadasX[17],coordenadasY[19], new ImageIcon("./src/main/resources/img/villanoJuego.gif"), 2);
//        enemigos.add(enemigo);
//         premios1=new Premios(3,20,coordenadasX[20],coordenadasY[3], new ImageIcon("./src/main/resources/img/florJuego.gif"));
//         premios2 = new Premios(12,2,coordenadasX[2],coordenadasY[12], new ImageIcon("./src/main/resources/img/florJuego.gif"));
//         premios3 = new Premios(21,11,coordenadasX[11],coordenadasY[21], new ImageIcon("./src/main/resources/img/florJuego.gif"));
//         premios4 = new Premios(21,2,coordenadasX[2],coordenadasY[21], new ImageIcon("./src/main/resources/img/florJuego.gif"));
//        
//         
//     
//     }
//     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     //fin posicionar personajes
//     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     
//     
//    public void dibujar (Graphics g)
//     {
//        personaje.show(g);
//        for (int elemento = 0; elemento < enemigos.size(); elemento++) 
//        {
//           enemigos.get(elemento).show(g);
//         }
//        
//        premios1.show(g);
//        premios2.show(g);
//        premios3.show(g);
//        premios4.show(g);
//        
//         
//     }//fin de dibujar
//    
//    
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin de mostrar los personajes
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//    
//    
//    public void moverEnemigo()
//     {
//         enemigo.mover();
//         
//         
//         if(isValido(enemigo.getFila(),enemigo.getColumna())&& (laberinto.getCelda(enemigo.getFila(), enemigo.getColumna()))==1 ) 
//            {
//           
//            enemigo.setX(coordenadasX[enemigo.getColumna()]);
//            enemigo.setY(coordenadasY[enemigo.getFila()]);
//           
//            
//                if (isColision(enemigo)) 
//                {
//                   System.out.println("Colision");
//                   personaje.perderVidas();
//                    if (personaje.getVidas()==0) 
//                    {
//                        perdio=true;
//                      
//                    }
//                   
//                
//                   
//                }
//        
//            }//fin del primer if   
//     }//fin de mover enemigo
//    
//    
//    
//    
//     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin de mover enemigos
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//    
//      public void caminar (String direccion)
//     {
//         int filaDestino = personaje.getFila();
//         int columnaDestino = personaje.getColumna();
//         
//        
//            switch(direccion)
//            {
//             case "arriba" :
//                 filaDestino--;
//                 
//             break;
//             
//             case "abajo" :
//                 filaDestino++;
//                 
//             break;
//             
//             case "derecha" :
//                 columnaDestino++;
//                 
//             break;
//             
//             case "izquierda" :
//                 columnaDestino--;
//                 
//             break;
//            } //fin del switch
//            
//            
//             ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//            if(isValido(filaDestino,columnaDestino)&& (laberinto.getCelda(filaDestino, columnaDestino))==1 ) 
//            {
//            personaje.setFila(filaDestino);
//            personaje.setColumna(columnaDestino);
//            personaje.setX(coordenadasX[columnaDestino]);
//            personaje.setY(coordenadasY[filaDestino]);
//            
//            premiosRecolectados(premios1);
//            premiosRecolectados(premios2);
//            premiosRecolectados(premios3);
//            premiosRecolectados(premios4);
//           
//            }   
//           
//    
//     }//fin del metodo
//     
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin del caminar
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//      
//      //24 filas 32 columnas
//      
//      public boolean isValido(int filaDestino, int columnaDestino) 
//      {
//            // System.out.println("isValido fila destino " + filaDestino + ", columna destino: " + columnaDestino);
//            if (filaDestino >=0 && filaDestino < 24 && columnaDestino >=0 && columnaDestino < 32)
//            {
//              
//              return true;
//            }
//            
//         return false;
//      }//fin de isValido
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin de determinar donde puede y no pasar el personaje
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     
//    public boolean isColision(Enemigo enemigo) 
//    {
//        if (personaje.getColumna() == enemigo.getColumna()&&personaje.getFila() == enemigo.getFila())
//        {
//            return true;
//        }
//        
//        return false;
//    }//fin de iscolision
//    
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin de las colisiones
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    
//     public boolean premiosRecolectados (Premios premios) 
//    {
//        if (personaje.getColumna() == premios.getColumna()&&personaje.getFila() == premios.getFila())
//        {
//            
//            premios.increasePremios();
//            premios.floresRecolectadas();
//            
//            if (premios.getPremios()==4&&personaje.getFila()==premios.getFila()&&personaje.getColumna()==premios.getColumna()) 
//            {
//                gano=true;
//            }
//            
//            
//            return true;
//        }
//        
//        return false;
//    
//    }//fin de premios
//   
//    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//    //fin de las premios recolectados
//    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//     
//     public boolean fin ()
//     {
//         if (perdio) 
//         {
//             System.out.println("PERDIO");
//             return true;
//         }
//         
////         if (premiosRecolectados(premios1)&&premiosRecolectados(premios2)&&premiosRecolectados(premios3)) {
////             System.out.println("gano");
////             return true;
////             
////         }
//         return false;
//     }
//     
//     ///////////////////////////////////////////////is perdio//////////////////////////////////////////////
//    public boolean isPerdio() 
//    {
//        return perdio;
//    }
//    ///////////////////////////////////////////////////////is gano ///////////////////////////////////////////
//    public boolean isGano()
//    {
//        return gano;
//    }
//    
//    //premiosFinales==3&&
//   // personaje.getFila()==21&&personaje.getColumna()==1
//    
//    
//    
//    
//    
//}//fin de la clase
//
//
//
//
//
//
//
//
//
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
