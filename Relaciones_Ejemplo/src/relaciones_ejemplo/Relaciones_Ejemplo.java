/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relaciones_ejemplo;

/**
 *
 * @author UCF20412
 */
public class Relaciones_Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Chofer c1 = new Chofer();
        c1.setNombre("Juan Perez");
        
        Taxi t1 = new Taxi();
        t1.setMatricula("ABCD-1234");
        
        t1.setConductor(c1); // Generando la relación
        
        t1.verDatos();
    }
    
}
