
package herencia;


/**
 * 
 * @author Brandon Stuart Maldonado Álvarez
 */


public class Producto {
private String nombre;
private String tipo;
private int precio;
private int cantidad;
private int ventas;

/**
 * Constructor Producto con el que crearemos un nuevo producto
 * @param nombre string como nombre del producto
 * @param tipo string para definir la categoria de nustro producto
 * @param precio int para establecer un precio al producto
 * @param cantidad int para definir la cantidad al producto
 */
public Producto(String nombre, String tipo, int precio, int cantidad){

this.nombre = nombre;
this.tipo = tipo;
this.precio = precio;
this.cantidad = cantidad;
}


/**
     * Metodo para obtener el nombre del producto
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para obtener la categoria del producto
     * @return la categoria o tipo de nuestro producto
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Metodo para obtener el precio de un producto
     * @return el precio del producto
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Metodo para obtener la cantidad del producto
     * @return la cantidad del producto
     */
    public int getCantidad() {
        return cantidad;
    }
    
    
    
/**
 * metodo para mostrar los datos de cada producto
 */
public void mostrar(){
     System.out.println("Nombre: "+getNombre()+
                       "\nTipo de producto: "+getTipo()+
                       "\nPrecio: "+getPrecio()+
                       "\nCantidad disponible: "+getCantidad());
}


/**
 * metodo para gestionar una compra
 * @return la cantidad - 1
 * Se usa para confirmar una compra y poder actualizar la cantidad de un producto
 */
public int compra(){

cantidad = cantidad - 1;
return cantidad;
}

/**
 * Metodo para gestionar la venta de un producto
 * Este metodo ira sumando n1 a la variable ventas
 */
public void ventas(){
ventas++;

}

/**
 * metodo para obtener el numero de ventas
 * @return el numero de ventas de un producto
 */
public int getVentas(){
    return ventas;
    }

/**
 * Metodo para mostrar mensaje por pantalla cuando el producto no esta disponible
 */
public static void mensaje(){
        System.out.println("Lo siento, este producto no esta disponible");
    }

}

