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
public class Premios extends Personaje 
{
    private int premios = 0;
    
    public Premios(int fila, int columna, int x, int y, ImageIcon imagen) {
        super(fila, columna, x, y, imagen);
    }

    
            
    public int getPremios() {
        return premios;
    }

    public void setPremios(int premios) {
        this.premios = premios;
    }
    
    public void increasePremios()
    {
        premios++;
    }
    public void floresRecolectadas ()
    {
        
        System.out.println("Premio Recolectado" + " Cantidad de premios restantes: "+ getPremios());
    }
    
}
