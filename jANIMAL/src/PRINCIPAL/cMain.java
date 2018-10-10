/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRINCIPAL;

import MAMIFERO.cCaballo;
import MAMIFERO.cTiburon;
import OVIPARO.cAguila;
import OVIPARO.cAvestrus;

/**
 *
 * @author JOSHUA
 */
public class cMain {
    public static void main(String[] args) {
        cCaballo caballo = new cCaballo ("Caballo");
        cTiburon tiburon = new cTiburon ("Tiburon");
        cAguila aguila = new cAguila ("Aguila");
        cAvestrus avestrus = new cAvestrus("Avestrus");
        
        
       System.out.println("===================================");
       System.out.println("Caballo ");
       System.out.println("El color del Caballo es: "+caballo.getColorPelo());
       caballo.comida(); 
       caballo.sangre();
       
       System.out.println("===================================");
       System.out.println("Tiburon ");
       System.out.println("El tiburon: "+tiburon.getNadar());
       tiburon.comida();
       tiburon.sangre();
       
       System.out.println("===================================");
       System.out.println("Aguila ");
       System.out.println("El Aguila es: "+aguila.getAereo());
       aguila.comida();
       aguila.ponehuevo();
       
       System.out.println("===================================");
       System.out.println("Avestrus ");
       System.out.println("El Avestrus es: "+avestrus.getTerrestre());
       avestrus.comida();
       avestrus.ponehuevo();
    }
  
}
