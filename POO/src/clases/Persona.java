package clases;

// Clase persona
public class Persona {
    // atributos
    public String nombre;
    public int edad;
    
    // Constructor y sobrecarga de constructores
    public Persona(){
        System.out.println("Construyendo el objeto");
    }
    
    public Persona(String nombre){
        System.out.println("Hola " + nombre + " desde el constructor");
    }
    
    // Metodo de la clase
    public void mostrarDatos(){
        System.out.println("nombre: " + nombre);
        System.out.println("edad : " + edad);
    }
}
