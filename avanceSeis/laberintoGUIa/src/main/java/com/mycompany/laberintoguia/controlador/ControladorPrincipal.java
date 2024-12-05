/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laberintoguia.controlador;

import com.mycompany.laberintoguia.modelo.Elemento;
import com.mycompany.laberintoguia.modelo.Laberinto;
import com.mycompany.laberintoguia.vista.GUIGano;
import com.mycompany.laberintoguia.vista.GUIHistoria;
import com.mycompany.laberintoguia.vista.GUILaberinto;
import com.mycompany.laberintoguia.vista.GUIPerdio;
import com.mycompany.laberintoguia.vista.GUIinstrucciones;
import com.mycompany.laberintoguia.vista.GUIprincipal;
import com.mycompany.laberintoguia.vista.LaberintoPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author emily
 */
public class ControladorPrincipal implements ActionListener, MouseListener{
    private GUIprincipal guiPrincipal;
    private GUIinstrucciones guiInstrucciones;
    private GUILaberinto guiLaberinto;
    private GUIHistoria guiHistoria;
    private Laberinto laberintoMatriz;
    private Elemento elemento;
    private LaberintoPanel panelLaberinto;
    private Hilo hilo;
    private ControladorLaberinto controladorLaberinto;
    private GUIGano guiGano;
    private GUIPerdio guiPerdio;

    public ControladorPrincipal() 
    {
        guiPrincipal = new GUIprincipal(this);
        guiInstrucciones = new GUIinstrucciones();
        guiLaberinto = new GUILaberinto();
        panelLaberinto=guiLaberinto.getLaberintoPanel1();
        guiHistoria = new GUIHistoria();
        controladorLaberinto=new ControladorLaberinto(guiLaberinto);
        controladorLaberinto.setLaberintoPanel(panelLaberinto);
        guiLaberinto.setFocusable(true);
        guiLaberinto.requestFocusInWindow();
        panelLaberinto.setControlador(controladorLaberinto);
        hilo = new Hilo(controladorLaberinto);
        guiInstrucciones.escuchar(this);
        guiLaberinto.escuchar(this);
        guiLaberinto.escucharMouse(this);
        guiLaberinto.escucharTeclado(controladorLaberinto);
        guiHistoria.escuchar(this);
        guiPrincipal.setVisible(true);
        guiGano= new GUIGano();
        guiPerdio= new GUIPerdio();
        guiGano.escuchar(this);
        guiPerdio.escuchar(this);
        
        
        
        
        //laberintoMatriz = new Laberinto();
        
        
        
        //instanciar matriz
    }
    
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        System.out.println("Presioinó la coordenada X "+ e.getX()+" coordenada" +e.getY());
       }
    
//   public boolean fin()
//   {
//       if (controladorLaberinto.ifEstado()==false) 
//       {
//           
//               guiGano.setVisible(true);
//               return true;
//       }
//           else
//           {
//               guiPerdio.setVisible(true);
//                return false;
//           }
//     
//   }
//    
       
//        public void fin()
//        {
//            if (controladorLaberinto.isGano()) 
//            {
//                
//            }
//            else
//            {
//                if (controladorLaberinto.isPerdio()) 
//                {
//                    
//                }
//            }
//        }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        switch(e.getActionCommand())
        {
            case "Instrucciones":
                guiPrincipal.setVisible(false);
                guiInstrucciones.setVisible(true);
                
                break;
                
            case "Jugar":
                guiPrincipal.setVisible(false);
                guiLaberinto.setVisible(true);
                hilo.start();
                
                
            break;
            
            case "historia":
                guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                
                break;
                    
            case "Salir":
                System.exit(0);
            break;
            
            case "SalirIntrucciones":
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
                
                
            case "btnSalirLaberinto":
                guiLaberinto.setVisible(false);
                guiPrincipal.setVisible(true);
                break;
             
            case "salirHistoria":
                
            guiHistoria.setVisible(false);
            guiPrincipal.setVisible(true);
            
            break;
            
          

           

        }
    }
    
   
    
   
//    hilo = new Hilo(controladorLaberinto); // Crear un nuevo hilo
//    hilo.start(); // Iniciar el nuevo hilo
////    controladorLaberinto.reiniciarEstado();
//        
    

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void mouseExited(MouseEvent e) {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

   
    
}
