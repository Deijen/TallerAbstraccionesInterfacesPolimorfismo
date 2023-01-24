
package Modelos;
import Interfaces.LanzaderaEspacial;
/**
 *Clase SondaEspacial la cual extiende de la clase NaveNoTripulada e implementa 
 * la interfaz Lanzadera espacial
 * @author dipom
 */
public class SondaEspacial extends NaveNoTripulada implements LanzaderaEspacial{ 
    private String planetaAEstudiar;  

    /**
    * Constructor por defecto
    */
    public SondaEspacial() {
    }

    /**
    * Constructor sobrecargado.No tiene los atributos de la clase padre. 
     * @param planetaAEstudiar
    */
    public SondaEspacial(String planetaAEstudiar) {
        this.planetaAEstudiar = planetaAEstudiar;
    }

    /**
    * Constructor sobrecargado.Tiene los atributos de la clase padre
     * @param planetaAEstudiar
     * @param tiempoEstimadoEnOrbita
     * @param duraciónBateria
     * @param propulsion
     * @param descripcionMision
     * @param nombreMision
    */
    public SondaEspacial(String planetaAEstudiar, int tiempoEstimadoEnOrbita, int duraciónBateria, double propulsion, String descripcionMision, String nombreMision) {
        super(tiempoEstimadoEnOrbita, duraciónBateria, propulsion, descripcionMision, nombreMision);
        this.planetaAEstudiar = planetaAEstudiar;
    }

    /**
    * Guetters y setters de la clase SondaEspacial 
    */
    public String getPlanetaAEstudiar() {
        return planetaAEstudiar;
    }

    public void setPlanetaAEstudiar(String planetaAEstudiar) {
        this.planetaAEstudiar = planetaAEstudiar;
    }

    public int getTiempoEstimadoEnOrbita() {
        return tiempoEstimadoEnOrbita;
    }

    public void setTiempoEstimadoEnOrbita(int tiempoEstimadoEnOrbita) {
        this.tiempoEstimadoEnOrbita = tiempoEstimadoEnOrbita;
    }

    public int getDuraciónBateria() {
        return duraciónBateria;
    }

    public void setDuraciónBateria(int duraciónBateria) {
        this.duraciónBateria = duraciónBateria;
    }

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }

    public String getDescripcionMision() {
        return descripcionMision;
    }

    public void setDescripcionMision(String descripcionMision) {
        this.descripcionMision = descripcionMision;
    }

    public String getNombreMision() {
        return nombreMision;
    }

    public void setNombreMision(String nombreMision) {
        this.nombreMision = nombreMision;
    }

   

  
    

   /**
   * Métodos de la interfaz 
   */
    
    @Override
    public String toString() {
        return  "\n\nPlaneta a estudiar: " + this.planetaAEstudiar +
                "\nTiempo estimado en orbita: " + this.tiempoEstimadoEnOrbita + " años" +
                "\nDuración de la bateria: " + this.duraciónBateria + " años";
                
    }

    @Override
    public String tipoMision() {
        return "\ndescripción de la misión: " + this.descripcionMision;
    }

    @Override
    public String nombreMision() {
        return "\nel nombre de la misión es: " + this.nombreMision;
    }

    @Override
    public double propulsion() {
        return this.propulsion;
    }
    
    
    
}
