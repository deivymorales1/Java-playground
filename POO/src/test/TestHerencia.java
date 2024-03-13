
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
        
        String nombre = "Deivy";
        determinarTipo(nombre);
        
        // Conversion de tipos
        // Downcasting
        Persona persona1 = new Empleado(3000, "Deivy R");
        Empleado empleado1 = (Empleado) persona1;
        System.out.println(empleado1.obtenerDetalle());
        
        // Upcasting
        Persona persona2 = empleado1;
        System.out.println(persona2);
        
        
        
    }
    
    public static void imprimer(Persona persona){
        System.out.println(persona.obtenerDetalle());
    }
    
    
    public static void determinarTipo(Object objeto){
        if(objeto instanceof Empleado){
            System.out.println("Es de tipo empleado");
        }else if(objeto instanceof Clientes){
            System.out.println("Es de tipo cliente");
        }else if(objeto instanceof Persona){
            System.out.println("Es de tipo persona");
        }else if(objeto instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
    
}
