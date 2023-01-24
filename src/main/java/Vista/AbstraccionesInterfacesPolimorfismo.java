/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;
import Modelos.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author dipom
 */
public class AbstraccionesInterfacesPolimorfismo {

    public static void main(String[] args) {
       
        boolean salir = false;
        int opcion; 
        //ArrayList<NaveTripulada> listaNavesTripuladas; 
        //ArrayList<NaveNoTripulada> listaNavesNoTripuladas; 
        
        
        do{
            opcion =Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                       Porfavor escoga una opcion: 
                                                                       
                                                                       1) Crear nave espacial
                                                                       
                                                                       
                                                                       2) salir """, "Bienvenido a Space exe", JOptionPane.INFORMATION_MESSAGE)); 
            
            
            switch (opcion) {
                case 1:
                    int opcionNave; 
                    
                    opcionNave = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                    Seleccione el tipo de nave a crear 
                                                                                    1) Nave tripulada 
                                                                                    
                                                                                    2) Nave no tripulada""", "Tipo de nave", JOptionPane.INFORMATION_MESSAGE));
                    
                    if(opcionNave == 1){
                        int opcionNaveTripulada; 
                        
                        opcionNaveTripulada = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                                 Escoge una de las naves tripuladas: 
                                                                                                 1) Transbordador espacial 
                                                                                                 2) Estaci\u00f3n espacial""", "Naves tripuladas", opcionNave)); 
                      
                        if(opcionNaveTripulada == 1){ 
                            TransbordadorEspacial TE = new TransbordadorEspacial(100, 100, 2, "Alunizaje", "Apolo 11", 50.0, 3, 4);
                            JOptionPane.showMessageDialog(null, TE.toString() + TE.tipoMision() + TE.nombreMision() + "\nLa propulsión es :" + TE.propulsion() + " Km/s", "Informacion de nave", JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        else if (opcionNaveTripulada == 2){
                            EstacionEspacial EE = new EstacionEspacial(30, 50, opcion, "Estudio de gravedad cero", "Gravedad cero", 60.0, 3, 6);
                            JOptionPane.showMessageDialog(null, EE.toString() + EE.tipoMision() + EE.nombreMision() + "\nLa propulsión es: " + EE.propulsion() + " Km/s", "Informacion de nave", JOptionPane.INFORMATION_MESSAGE);

                        }
                        
                    }
                    
                    else if (opcionNave == 2)
                    {
                        int opcionNaveNoTripulada; 
                        opcionNaveNoTripulada = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                                                   Escoge una de las naves no tripuladas: 
                                                                                                   1) Satelite 
                                                                                                   2) Sonda espacial""", JOptionPane.INFORMATION_MESSAGE));
                        if (opcionNaveNoTripulada ==1)
                        { 
                            Satelite sat = new Satelite(45, 30 , 40, 65, "Brindar cobertura a la empresa XYZ", "Cobertura para todos");
                            JOptionPane.showMessageDialog(null, sat.toString() + sat.tipoMision() + sat.nombreMision() + "\nLa propulsión es: " + sat.propulsion() + " Km/s", "Informacion de nave", JOptionPane.INFORMATION_MESSAGE);
                        } 
                        
                        else if(opcionNaveNoTripulada == 2)
                        {
                            SondaEspacial SE = new SondaEspacial("Marte", 30, 40, 65, "Sonda para estudiar el planeta marte", "Estudio marte");
                            JOptionPane.showMessageDialog(null, SE.toString() + SE.tipoMision() + SE.nombreMision() + "\nLa propulsión es: " + SE.propulsion() + " Km/s", "Informacion de nave", JOptionPane.INFORMATION_MESSAGE);
                        }
                    
                    }
                    
                    
                    break; 
                    
                    
                
                case 2: 
                    salir = true; 
                    break;
                    
                   
            }
            
        }while (!salir);
        
    }
}
