
package OVIPARO;

import INTERFAZ.iAnimal;
import INTERFAZ.iOviparo;

/**
 *
 * @author JOSHUA
 */
public class cAguila implements iAnimal, iOviparo{
    private String aereo;

    public cAguila(String aereo) {
        this.aereo = "Ave Aereo";
    }

    public String getAereo() {
        return aereo;
    }

    public void setAereo(String aereo) {
        this.aereo = aereo;
    }
    
    
    
    @Override
    public void comida() {
        System.out.println("El aguila es Carnivoro");
    }

    @Override
    public void ponehuevo() {
        System.out.println("El aguila si pone Huevo");
    }
    
}
