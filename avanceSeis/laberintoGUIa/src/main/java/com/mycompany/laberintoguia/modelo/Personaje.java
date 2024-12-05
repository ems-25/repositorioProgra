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
public class Personaje extends Elemento 
{
    protected int fila; 
    protected int columna;
    private int premiosRecolectados;
   
    public Personaje (int fila, int columna, int x, int y, ImageIcon imagen)
    {
        super (x, y, imagen);
        this.fila=fila;
        this.columna=columna;
        
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    // Nuevo método para obtener el número de premios recolectados
    public int getPremiosRecolectados() {
        return premiosRecolectados;
    }
    
    public void incrementarPremios() {
        this.premiosRecolectados++;
    }


    public void floresRecolectadas()
    {
        System.out.println("Premio Recolectado" + " Cantidad de premios recolectados: "+ getPremiosRecolectados());
       
    }
}























////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package com.mycompany.laberintoguia.modelo;
//
//import javax.swing.ImageIcon;
//
///**
// *
// * @author emily
// */
//public class Personaje extends Elemento 
//{
//    protected int fila; 
//    protected int columna;
//   
//    public Personaje (int fila, int columna, int x, int y, ImageIcon imagen)
//    {
//        super (x, y, imagen);
//        this.fila=fila;
//        this.columna=columna;
//        
//    }
//
//    public int getFila() {
//        return fila;
//    }
//
//    public void setFila(int fila) {
//        this.fila = fila;
//    }
//
//    public int getColumna() {
//        return columna;
//    }
//
//    public void setColumna(int columna) {
//        this.columna = columna;
//    }
//    
//}
