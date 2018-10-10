/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OVIPARO;

import INTERFAZ.iAnimal;
import INTERFAZ.iOviparo;

/**
 *
 * @author JOSHUA
 */
public class cAvestrus implements iAnimal, iOviparo{
    private String terrestre;

    public cAvestrus(String terrestre) {
        this.terrestre = "Ave Terrestre ";
    }

    public String getTerrestre() {
        return terrestre;
    }

    public void setTerrestre(String terrestre) {
        this.terrestre = terrestre;
        
        
    }
    
    @Override
    public void comida() {
        System.out.println("El Avestrús es Herbivoro");
    }

    @Override
    public void ponehuevo() {
        System.out.println("El avestrus pone huevos ");
    }
    
}
