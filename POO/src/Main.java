import clases.Persona;

// Entry point
public class Main {

    
    public static void main(String[] args) {
        
        // Instanciamos la clase persona
        Persona persona1 = new Persona();
        persona1.nombre = "Deivy";
        persona1.edad = 27;
        persona1.mostrarDatos();
        
        Persona persona2 = new Persona();
        persona2.nombre = "Neo";
        persona2.edad = 54;
        persona2.mostrarDatos();
        
        
    }
    
}
