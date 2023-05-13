
package herencia;

/**
 * 
 * @author Brandon Stuart Maldonado Álvarez
 */

public class Empleado extends Persona {
    private int codigo;
    private String cargo; 
   
    
    /**
     * Creamos un constructor Empleado que heredara los parametros de la clase Persona
     * @param nombre un string como nombre
     * @param apellido un string como apellido 
     * @param edad int como edad 
     * @param cedula un long como numero de cedula 
     * @param direccion un string su direccion
     * @param codigo un int que sera el codigo del empleado
     * @param cargo un string que sera el cargo del empleado
     */
    public Empleado(String nombre, String apellido, int edad, long cedula, String direccion, int codigo, String cargo){
    super(nombre, apellido, edad, cedula, direccion); 
    this.codigo = codigo;
    this.cargo = cargo;
    }
    
    /**
     * metodo para obtener el codigo del empleado
     * @return el codigo de empleado
     */
    public int getCod(){
    return codigo;
    }

    /**
     * metodo para obtener el cargo del empleado
     * @return cargo del empleado
     */
    public String getCargo() {
        return cargo;
    }
    
    
    /**
     * Creamos un metodo para mostrar todos los datos de un empleado
     * 
     */
    public void mostrar(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nEdad: "+getEdad()+
                "\nCedula: "+getCedula()+
                "\nDireccion: "+getDireccion()+
                "\nCodigo de empleado: "+codigo+
                "\nCargo: "+cargo);
        
    }
    
    
}
