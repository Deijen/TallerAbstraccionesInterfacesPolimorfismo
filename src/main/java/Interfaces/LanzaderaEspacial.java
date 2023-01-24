
package Interfaces;

/**
 *Interfaz que representa una lanzadera espacial. Todas las naves, tripuladas o
 * no tripuladas, implementan una lanzadera espacial.
 * @author dipom
 */
public  interface LanzaderaEspacial { 
    
    /**
     * Método para el tipo de mision.Cada nave tiene una misión diferente. No 
     * se sabrá la misión de la nave hasta que dicha nave exista.
     * @return String 
    */
    public String tipoMision();
    /**
     * Método para el nombre de la misión.Cada nave tiene un nombre de misión 
     * diferente. No se sabrá el nombre de la misión hasta que la nave exista.
     * @return String
    */
    public String nombreMision(); 
    /**
     * Método para la propulsión de la misión.
     * @return 
    */
    public double propulsion();
}
