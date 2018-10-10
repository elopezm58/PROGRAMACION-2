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
public class cTiburon implements iAnimal, iMamifero{
    private String nadar;

    public cTiburon(String nadar) {
        this.nadar = "Si nada";
    }

    public String getNadar() {
        return nadar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    @Override
    public void comida() {
        System.out.println("El tiburon es carnivoro ");
    }

    @Override
    public void sangre() {
        System.out.println("El tiburon es de Sangre Fria ");
    }
    
    
}
