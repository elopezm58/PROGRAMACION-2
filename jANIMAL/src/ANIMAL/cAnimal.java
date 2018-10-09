
package ANIMAL;

/**
 *
 * @author JOSHUA
 */
public abstract class cAnimal {
    private String peso;
    private String comida;

    public cAnimal(String peso, String comida) {
        this.peso = peso;
        this.comida = comida;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }
    public abstract String getDescripcion();
}
