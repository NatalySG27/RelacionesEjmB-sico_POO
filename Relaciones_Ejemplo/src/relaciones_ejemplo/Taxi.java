/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones_ejemplo;

/**
 *
 * @author UCF20412
 */
public class Taxi {
    private String matricula;
    private Chofer conductor;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Chofer getConductor() {
        return conductor;
    }

    public void setConductor(Chofer conductor) {
        this.conductor = conductor;
    }
    
    public void printChofer(){
    
    }
    
    public void printMatricula() {
        
    }
    
    public void verDatos(){
        System.out.println("Taxi Matricula: " + this.matricula);
        if(this.conductor != null){
            System.out.println("Y su conductor es: " + this.conductor.getNombre());
        }else{
            System.out.println("No tiene conductor");
        }
    }
}
