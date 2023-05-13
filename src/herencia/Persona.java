    
package herencia;

import java.util.Scanner;

/**
 * 
 * @author Brandon Stuart Maldonado Álvarez
 */
public class Persona {
   
    private String nombre;
    private String apellido;
    private int edad;
    private long cedula;
    private String direccion;

    
    /**
     * Se crea un constructor persona que recibe como parametro:
     * @param nombre un string como nombre
     * @param apellido un string como apellido
     * @param edad int como edad
     * @param cedula un long como numero de cedula
     * @param direccion un string su direccion
     */
    public Persona(String nombre, String apellido, int edad, long cedula, String direccion) {
        this.nombre = nombre;
                this.apellido = apellido;
                        this.edad = edad;
                           this.cedula = cedula;
                             this.direccion = direccion;
        
        
    }
    
   
   //Creamos metodos pare obtener y acceder facilmente a un dato
    
    /**
     * Metodo para obtener el nombre
     * @return el nombre de la persona
     */
    public String getNombre(){
    return nombre;
    }
    
    /**
     * Metodo para obtener el apellido
     * @return apellido de la persona
     */
    public String getApellido(){
        return apellido;
    }
    
    /**
     * Metodo para obtener la edad de la persona
     * @return la edad de la persona 
     */
    public int getEdad(){
        
        return edad;
    }
    
     /**
     * Metodo para obtener la direccion
     * @return  la direccion de la persona
     */
    public String getDireccion() {
        return direccion;
    }
    
     /**
     * Metodo para obtener el numero de la cedula
     * @return numero de cedula
     */
    public long getCedula() {
        return cedula;
    }
    
    
}
