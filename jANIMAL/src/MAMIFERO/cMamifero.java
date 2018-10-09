
package MAMIFERO;
/**
 *
 * @author JOSHUA
 */
public class cMamifero extends ANIMAL.cAnimal{
    private String sangre;
    private String amantar;
    private String parir;

    public cMamifero(String sangre, String amantar, String parir, String peso, String comida) {
        super(peso, comida);
        this.sangre = sangre;
        this.amantar = amantar;
        this.parir = parir;
    }

    @Override
    public String getDescripcion() {
        return"Descripcion MAMIFERO";
    }
    
    
}
