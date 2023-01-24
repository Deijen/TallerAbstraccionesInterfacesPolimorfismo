
package Modelos;
import Interfaces.LanzaderaEspacial;
/**
 *Clase TransbordadorEspacial, la cual extiende de la clase NaveTripulada e 
 * implementa la interfaz LanzaderaEspacial
 * @author dipom
 */
public class TransbordadorEspacial extends NaveTripulada implements LanzaderaEspacial{ 
    private double altura; 
    private double diametro;
    private int etapas; 

    /**
    * Constructor por defecto
    */
    public TransbordadorEspacial() {
    }

    /**
    * Constructor sobrecargado.No tiene los atributos de la clase padre.
     * @param altura
     * @param diametro
     * @param etapas
    */
    public TransbordadorEspacial(double altura, double diametro, int etapas) {
        this.altura = altura;
        this.diametro = diametro;
        this.etapas = etapas;
    }

    /**
    * Constructor sobrecargado.Tiene los atributos de la clase padre
     * @param altura
     * @param diametro
     * @param etapas
     * @param descripcionMision
     * @param nombreMision
     * @param propulsion
     * @param numerTripulantes
     * @param capacidadMaxima
    */
    public TransbordadorEspacial(double altura, double diametro, int etapas, String descripcionMision, String nombreMision, double propulsion, int numerTripulantes, int capacidadMaxima) {
        super(descripcionMision, nombreMision, propulsion, numerTripulantes, capacidadMaxima);
        this.altura = altura;
        this.diametro = diametro;
        this.etapas = etapas;
    }

    /**
    * Guetters y setters de la clase TransbordadorEspacial
    */
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public int getEtapas() {
        return etapas;
    }

    public void setEtapas(int etapas) {
        this.etapas = etapas;
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
    * Métodos de la interfaz.
    */
    @Override
    public String toString() {
        return "\n\nAltura: " + this.altura +
                "\nDiametro: " + this.diametro + 
                "\nEtapa: " + this.etapas + 
                "\nNúmero de tripulantes: " + this.numerTripulantes 
                +"\nCapacidad máxima: " + this.capacidadMaxima;
        }

    @Override
    public String tipoMision() {
        return "\nEl tipo de la misión es: " + this.descripcionMision;
    }

    @Override
    public String nombreMision() {
        return "\nEl nombre de la misión es: " + this.nombreMision;
    }

    @Override
    public double propulsion() {
        return this.propulsion;
    }
    
    
    
}
