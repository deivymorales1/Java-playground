
package clases;


public class Calculadora {
    // atributos
    public static final double PI = 3.151592;
   
    // Metodo estatico
    public static int sumar(int a, int b){
        return a + b;
    }
    
    public static double sumar(double a, double b){
        return a + b;
    }
    
    // Sobrecarga de metodos
    public int resta(int a, int b){
        return a - b;
    }
    
    public double resta(double a, double b){
        return a - b;
    }
}
