
package herencia;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * 
 * @author Brandon Stuart Maldonado Álvarez
 */

public class Herencia {


public static void main(String[] args) {
Scanner in = new Scanner(System.in);

/**
* Creamos empleados con sus respectivos datos, como nombre, apellido, edad, etc.
*/
Empleado empleado1 = new Empleado("Brandon", "Maldonado", 18, 1169442125, "Cl. 46 #45-304", 101, "Gerente");
Empleado empleado2 = new Empleado("Ana", "Pulgarin", 20, 1234567890, "Cl. 41 #72-24", 102, "Cajer@");
Empleado empleado3 = new Empleado("Juan", "Gallego",20, 12763722, "Cl. 26 #63-21", 103, "Socio" );
Empleado empleado4 = new Empleado("Sneyder", "Marin", 18, 1364889767, "Cl. 49B #21-38", 104, "Cajer@");
Empleado empleado5 = new Empleado("Jose", "Alarcon", 20, 521742121, "Cl. 31 A # 62 A 22", 105, "Vigilante");
Empleado empleado6 = new Empleado("Erlin", "Durango", 20, 262519532, "Cl. 41 #45-102", 106, "Socio");

/**
* Creamos productos con sus respectivos datos, como nombre, tipo, precio y cantidad.
*/

Producto producto1 = new Producto ("Doritos", "Snacks", 2000, 1);
Producto producto2 = new Producto ("Pepsi","Bebida",1500,1);
Producto producto3 = new Producto ("Aguardiente", "Licor", 25000, 1);
Producto producto4 = new Producto ("Cepillo", "Aseo Personal", 7000, 1);
Producto producto5 = new Producto("Celular", "Electronica", 1000000, 1);


int cod, ingresar, contraseña=1234, opc=0, t=0;
String cliente, Comprar, nombre;
int[] ventas = new int[5];



do{
try{
/**
* Creamos un menu para acceder a cada opcion
* nota: la contraseña de la primera opcion es "1234"
*/
opc = Integer.parseInt(JOptionPane.showInputDialog(null,
"1. Consultar informacion de empleados"
+ "\n2. Realizar compra"
+ "\n3. Informacion de productos"
+ "\n4. Mostrar el total de ventas"
+ "\n5. Salir\n"
+ "Elige una Opcion...","Supermercado",JOptionPane.QUESTION_MESSAGE));

switch(opc){
case 1:

/**
* En el caso uno, analizaremos si el codigo digitado por consola es igual al del empleado numero uno
* Si es false, se inicia un bucle de ifs anidados para comparar el codigo digitado por consola
* Si no coincide con ningun codigo de empleado se muestra un mensaje por consola
*/

ingresar = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cómo desea buscar un empleado?"
        + "\n1- Por su nombre"
        + "\n2- Por su codigo",
"Menu administrativo", JOptionPane.QUESTION_MESSAGE));

if(ingresar == 1){
System.out.println("");
    System.out.println("Ingrese el nombre del empleado");
    nombre=in.next();
    
    if (nombre.equals(empleado1.getNombre())) {
        empleado1.mostrar();
    }
    else if (nombre.equals(empleado2.getNombre())) {
        empleado2.mostrar();
    }
    else if (nombre.equals(empleado3.getNombre())) {
        empleado3.mostrar();
    }
    else if (nombre.equals(empleado4.getNombre())) {
        empleado4.mostrar();
    }
    else if (nombre.equals(empleado5.getNombre())) {
        empleado5.mostrar();
    }
    else if (nombre.equals(empleado6.getNombre())) {
        empleado6.mostrar();
    }
}
    
 if (ingresar == 2){
     
     System.out.println("");
     System.out.println("Ingrese el nombre del empleado");
    cod=in.nextInt();
 
 if (cod == empleado1.getCod()) {
        empleado1.mostrar();
    }
    else if (cod == empleado2.getCod()) {
        empleado2.mostrar();
    }
    else if (cod == empleado3.getCod()) {
        empleado3.mostrar();
    }
    else if (cod == empleado4.getCod()) {
        empleado4.mostrar();
    }
    else if (cod == empleado5.getCod()) {
        empleado5.mostrar();
    }
    else if (cod == empleado6.getCod()) {
        empleado6.mostrar();
    }
     
 }   
    
    
else{
JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Error",JOptionPane.INFORMATION_MESSAGE );
}


break; //break del case 1

/**
* En el caso dos, se registra primero el nombre del cliente y luego se pide el nombre del producto a comprar
* nota: el producto a comprar se debe ingresar tal cual y como se haya registrado
* Si el nombre coincide con uno de los productos del inventario, se realiza la compra y se muestra un mensaje en pantalla
* Se registra la venta y se actualiza la cantidad del producto
* No se podra comprar un producto con 0 cantidades
*/
case 2:

System.out.println("");

System.out.println("Ingrese su nombre, por favor");
cliente = in.next();
System.out.println("¿Que desea comprar?");
Comprar=in.next();

if( Comprar.equals(producto1.getNombre() ) && producto1.getCantidad() >=1){
System.out.println("Compra exitosa "+
"\nProducto: "+producto1.getNombre()+
"\nCliente: "+cliente);
producto1.compra();
producto1.ventas();

ventas[0]=ventas[0]+producto1.getPrecio();
}else if(Comprar.equals(producto1.getNombre()) && producto1.getCantidad() <=0){
Producto.mensaje();
}

else if( Comprar.equals(producto2.getNombre() ) && producto2.getCantidad() >=1){
System.out.println("Compra exitosa!"+
"\nProducto: "+producto2.getNombre()+
"\nCliente: "+cliente);
producto2.compra();
producto2.ventas();
ventas[1]=ventas[1]+producto2.getPrecio();
}else if(Comprar.equals(producto2.getNombre()) && producto2.getCantidad() <=0){
Producto.mensaje();
}

else if( Comprar.equals(producto3.getNombre() ) && producto3.getCantidad() >=1){
System.out.println("Compra exitosa!"+
"\nProducto: "+producto3.getNombre()+
"\nCliente: "+cliente);
producto3.compra();
producto3.ventas();
ventas[2]=ventas[2]+producto3.getPrecio();
}else if(Comprar.equals(producto3.getNombre()) && producto3.getCantidad() <=0){
Producto.mensaje();
}

else if( Comprar.equals(producto4.getNombre() ) && producto4.getCantidad() >=1){
System.out.println("Compra exitosa!"+
"\nProducto: "+producto4.getNombre()+
"\nCliente: "+cliente);
producto4.compra();
producto4.ventas();
ventas[3]=ventas[3]+producto4.getPrecio();
}else if(Comprar.equals(producto4.getNombre()) && producto4.getCantidad() <=0){
Producto.mensaje();
}

else if( Comprar.equals(producto5.getNombre() ) && producto5.getCantidad() >=1){
System.out.println("Compra exitosa!"+
"\nProducto: "+producto5.getNombre()+
"\nCliente: "+cliente);
producto5.compra();
producto5.ventas();
ventas[4]=ventas[4]+producto5.getPrecio();
}else if(Comprar.equals(producto5.getNombre()) && producto5.getCantidad() <=0){
Producto.mensaje();
}

else{
System.out.println("Ese producto no existe");
}





break; //break del case 2

case 3:

/**
* En el caso tres simplemente se muestra los datos de todos los productos
*/

System.out.println("");
producto1.mostrar();
System.out.println("");
producto2.mostrar();
System.out.println("");
producto3.mostrar();
System.out.println("");
producto4.mostrar();
System.out.println("");
producto5.mostrar();

    


break; //break del case 3

case 4:

/**
* En el caso 4 se muestra el registro de ventas
*/

System.out.println("");
System.out.println("El producto "+producto1.getNombre()+" ha sido vendido "+producto1.getVentas()+" vez");
System.out.println("Con un total de ventas de "+ventas[0]);

System.out.println("\nEl producto "+producto2.getNombre()+" ha sido vendido "+producto2.getVentas()+" vez");
System.out.println("Con un total de ventas de "+ventas[1]);

System.out.println("\nEl producto "+producto3.getNombre()+" ha sido vendido "+producto3.getVentas()+" vez");
System.out.println("Con un total de ventas de "+ventas[2]);

System.out.println("\nEl producto "+producto4.getNombre()+" ha sido vendido "+producto4.getVentas()+" vez");
System.out.println("Con un total de ventas de "+ventas[3]);

System.out.println("\nEl producto "+producto5.getNombre()+" ha sido vendido "+producto5.getVentas()+" vez");
System.out.println("Con un total de ventas de "+ventas[4]);

System.out.println("\nEl total de ventas ha sido: "+t);



break; //break del case 4


default:
System.out.println("Esta opcion no existe");
}


}catch(NumberFormatException n){
JOptionPane.showMessageDialog(null,"Error "+n.getMessage());

}
}while(opc!=5);



}//main



}//clase
