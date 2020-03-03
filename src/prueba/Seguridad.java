/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author olive
 */
public class Seguridad {
    
     int edad;
     
    //metodo para validar el campo del nip
    public void validarNip( String nip, String cnip)
    {
        
        if(!nip.equals(cnip))
        {   JOptionPane.showMessageDialog(null, "Los Nips no coinsiden");
        } else {
            
        }
    }
    
    //metodo para validar la edad del la persona
    public int validarEdad(String anio)
    {
        int anioac =2020;
         int anioIn = Integer.parseInt(anio);
         edad = anioac-anioIn;
         String edadString = Integer.toString(edad);
         return edad;
         
         
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
