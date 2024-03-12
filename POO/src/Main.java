
import clases.Persona;
import clases.Calculadora;
import clases.Rectangulos;

// Entry point
public class Main {
    // Variable constante
    final int a = 10;
    
    public static void main(String[] args) {
        
        
        // Instanciamos el objeto
        Persona persona1 = new Persona();
        
        
        Persona persona2 = new Persona(); 
        // Instanciamos la clase persona
        //Persona persona1 = new Persona();
        //persona1.nombre = "Deivy";
        //persona1.edad = 27;
        //persona1.mostrarDatos();
        
        //Persona persona2 = new Persona();
        //persona2.nombre = "Neo";
        //persona2.edad = 54;
        //persona2.mostrarDatos();
        
        
        //System.out.println(Math.PI);
        //System.out.println(Calculadora.PI);
        //Calculadora.PI = 3.15;
        //System.out.println(Calculadora.PI);

        //System.out.println(Calculadora.sumar(40, 20));
        
        //System.out.println(PI);
        
        
        // Clase calculadora
        Calculadora calcular = new Calculadora();
        System.out.println(calcular.resta(50, 30));
        
        // Clase rectangulos
        Rectangulos r1 = new Rectangulos();
        System.out.println(r1.area(4, 2));
        
    }
    
}
