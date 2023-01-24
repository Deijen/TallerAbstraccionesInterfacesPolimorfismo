
package Modelos;
import Interfaces.LanzaderaEspacial;
/**
 *La clase EstacionEspacial extiende de nave tripulada e implementa los métodos
 * de la interfaz LanzaderaEspacial
 * @author dipom
 */
public class EstacionEspacial extends NaveTripulada implements LanzaderaEspacial{
    private double masa; 
    private double longitud;
    private double ancho; 
    
    /**
    * Constructor por defecto de estación espacial
    */
    public EstacionEspacial() {
    } 
    
    /**
    * Constructor sobrecargado.No tiene los atributos de la clase padre
     * @param masa
     * @param longitud
     * @param ancho
    */
    public EstacionEspacial(double masa, double longitud, double ancho) {
        this.masa = masa;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    /**
    * Constructor sobrecargado.Tiene los atributos de la clase padre.Es el 
       que se usa.
     * @param masa
     * @param longitud
     * @param ancho
     * @param descripcionMision
     * @param nombreMision
     * @param propulsion
     * @param numerTripulantes
     * @param capacidadMaxima
    */
    public EstacionEspacial(double masa, double longitud, double ancho, String descripcionMision, String nombreMision, double propulsion, int numerTripulantes, int capacidadMaxima) {
        super(descripcionMision, nombreMision, propulsion, numerTripulantes, capacidadMaxima);
        this.masa = masa;
        this.longitud = longitud;
        this.ancho = ancho;
    }

    /**
    * Guetters y setters de la clase EstacionEspacial 
    */
    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
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

    public double getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(double propulsion) {
        this.propulsion = propulsion;
    }

    public int getNumerTripulantes() {
        return numerTripulantes;
    }

    public void setNumerTripulantes(int numerTripulantes) {
        this.numerTripulantes = numerTripulantes;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    
    
    
    
    
    
    
    
    /**
    *Métodos de la interfaz 
    */
    @Override
    public String tipoMision() {
        return "\n\nLa misión es: " + this.descripcionMision;
    }

    @Override
    public String nombreMision() {
        return "\n\nEl nombre de la misión es: " + this.nombreMision; 
    }

    @Override
    public double propulsion() {
        return this.propulsion;
    }

    @Override
    public String toString() { 
        return "\n\nMasa: " + this.masa + 
                "\nLongitud: " + this.longitud + 
                "\nAncho: " + this.ancho;
    }

    
    
}
