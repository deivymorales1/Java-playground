
package test;
import herencia.*;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args){
        //Persona persona1 = new Persona("Deivy", 'M', 27, "Helechales");
        //System.out.println(persona1);
        
        // Crear empleado
        Persona persona = new Persona("Deivy", 'M', 27, "Colombia");
        imprimer(persona);
        
        Empleado empleado = new Empleado(4000, "Joel");
        imprimer(empleado);
        var fecha = new Date();
        Clientes cliente = new Clientes(fecha, true, "German", 'M', 25, "Helechos");
        imprimer(cliente);
    }
    
    public static void imprimer(Persona persona){
        System.out.println(persona.obtenerDetalle());
    }
}
