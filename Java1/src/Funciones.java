
public class Funciones {
    public static void main(String[] args){
        
        
        System.out.println(sumar(4 ,4)); // argumentos
        System.out.println(saludar("Deivy", 27));
    }
    
    static int sumar(int a, int b){ // Parametros
        return a + b;
    }
    
    
    // Funciones
    static String saludar(String nombre, int edad){
        return "su nombre es " + nombre + " y su edad es: " + edad;
    }
}