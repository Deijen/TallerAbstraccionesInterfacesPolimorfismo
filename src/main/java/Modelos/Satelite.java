
package Modelos;
import Interfaces.LanzaderaEspacial;
/**
 *Clase satelite, la cual hereda de la clase NaveNoTripulada e implementa la 
 * interfaz LanzaderaEspacial
 * @author dipom
 */
public class Satelite extends NaveNoTripulada implements LanzaderaEspacial{
    private int numOrbitas; 

    /**
    * Constructor por defecto 
    */
    public Satelite() {
    }

    /**
    * Constructor sobrecardado.No tiene los atributos de la clase padre
     * @param numOrbitas
    */
    public Satelite(int numOrbitas) {
        this.numOrbitas = numOrbitas;
    }

    /**
    * Constructor sobrecargado.Es el que se usa.Tiene los atributos de la 
        clase padre.
    * 
     * @param numOrbitas
     * @param tiempoEstimadoEnOrbita
     * @param duraciónBateria
     * @param propulsion
     * @param descripcionMision
     * @param nombreMision
    */
    public Satelite(int numOrbitas, int tiempoEstimadoEnOrbita, int duraciónBateria, double propulsion, String descripcionMision, String nombreMision) {
        super(tiempoEstimadoEnOrbita, duraciónBateria, propulsion, descripcionMision, nombreMision);
        this.numOrbitas = numOrbitas;
    }

    
    /**
    * Guetters y setters de la clase Satelite
    */
    public int getNumOrbitas() {
        return numOrbitas;
    }

    public void setNumOrbitas(int numOrbitas) {
        this.numOrbitas = numOrbitas;
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
        return "\n\nNúmero de orbitas: " + this.numOrbitas +
               "\nTiempo estimado en orbita: " + this.tiempoEstimadoEnOrbita + " años " +
                "\nDuración de la bateria: " + this.duraciónBateria + " años";
    }

    @Override
    public String tipoMision() {
        return "\n\nDescripción de la misión: " + this.descripcionMision;
    }

    @Override
    public String nombreMision() {
        return "\n\nEl nombre de la misión es: " + this.nombreMision;
    }

    @Override
    public double propulsion() {
        return this.propulsion;
    }
    
    
    
}
