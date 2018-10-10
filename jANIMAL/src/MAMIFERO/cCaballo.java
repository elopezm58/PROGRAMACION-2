/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MAMIFERO;

import INTERFAZ.iAnimal;
import INTERFAZ.iMamifero;

/**
 *
 * @author JOSHUA
 */
public class cCaballo implements iAnimal, iMamifero{
    private String colorPelo;

    public cCaballo(String colorPelo) {
        this.colorPelo = "Marron ";
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    @Override
    public void comida() {
        System.out.println("El Caballo es Herbivoro ");
    }

    @Override
    public void sangre() {
        System.out.println("El Caballo es de Sangre Caliente");
    }
    

    
}
