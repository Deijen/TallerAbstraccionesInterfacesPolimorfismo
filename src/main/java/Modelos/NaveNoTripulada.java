
package Modelos;

/**
 *Clase padre para las naves no tripuladas
 * @author dipom
 */
public abstract class NaveNoTripulada { 
    protected int tiempoEstimadoEnOrbita; 
    protected int duraciónBateria; 
    protected double propulsion; 
    protected String descripcionMision;
    protected String nombreMision;

    /**
    Constructor por defecto
    */
    public NaveNoTripulada() {
    }

    /**
    Constructor sobrecargado
     * @param tiempoEstimadoEnOrbita
     * @param duraciónBateria
     * @param propulsion
     * @param descripcionMision
     * @param nombreMision
    */
    public NaveNoTripulada(int tiempoEstimadoEnOrbita, int duraciónBateria, double propulsion, String descripcionMision, String nombreMision) {
        this.tiempoEstimadoEnOrbita = tiempoEstimadoEnOrbita;
        this.duraciónBateria = duraciónBateria;
        this.propulsion = propulsion;
        this.descripcionMision = descripcionMision;
        this.nombreMision = nombreMision;
    }

    
    
    
    
    
    @Override
    public abstract String toString(); 
    
    
   
    
    
    
}
