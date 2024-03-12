
package test;
import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args){
        //Persona persona1 = new Persona("Deivy", 'M', 27, "Helechales");
        //System.out.println(persona1);
        
        // Crear empleado
        Empleado empleado1 = new Empleado(3000, "Antony");
        System.out.println(empleado1);
        
        Empleado empleado2 = new Empleado(4000, "Joel");
        System.out.println(empleado2);
        
        Empleado empleado3 = new Empleado(5000, "Marcos");
        System.out.println(empleado3);
        
        var fecha = new Date();
        Clientes cliente1 = new Clientes(fecha, true, "German", 'M', 25, "Helechos");
        System.out.println(cliente1);
    }
}
