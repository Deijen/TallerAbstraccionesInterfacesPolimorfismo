
package Modelos;

/**
 *Clase padre para las naves tripuladas
 * @author dipom
 */
public abstract class NaveTripulada {  
    
    protected String descripcionMision;
    protected String nombreMision; 
    protected double propulsion; 
    protected int numerTripulantes; 
    protected int capacidadMaxima; 

    /**
    * Constructor por defecto
    */
    public NaveTripulada() {
    }
    /**
    * Constructor sobrecargado
     * @param descripcionMision
     * @param nombreMision
     * @param propulsion
     * @param numerTripulantes
     * @param capacidadMaxima
    */
    public NaveTripulada(String descripcionMision, String nombreMision, double propulsion, int numerTripulantes, int capacidadMaxima) {
        this.descripcionMision = descripcionMision;
        this.nombreMision = nombreMision;
        this.propulsion = propulsion;
        this.numerTripulantes = numerTripulantes;
        this.capacidadMaxima = capacidadMaxima;
    } 
    
    
    @Override
    public abstract String toString();
    
    
    
    
    
    
   
    
    
}
