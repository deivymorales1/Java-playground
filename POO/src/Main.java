
import clases.Calculadora;
import static java.lang.Math.*;

// Entry point
public class Main {

    
    public static void main(String[] args) {
        
        // Instanciamos la clase persona
        //Persona persona1 = new Persona();
        //persona1.nombre = "Deivy";
        //persona1.edad = 27;
        //persona1.mostrarDatos();
        
        //Persona persona2 = new Persona();
        //persona2.nombre = "Neo";
        //persona2.edad = 54;
        //persona2.mostrarDatos();
        
        
        System.out.println(Math.PI);
        System.out.println(Calculadora.PI);
        Calculadora.PI = 3.15;
        System.out.println(Calculadora.PI);

        System.out.println(Calculadora.sumar(40, 20));
        
        System.out.println(PI);
        
    }
    
}
