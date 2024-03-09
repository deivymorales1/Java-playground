// Sobrecarga de funciones
public class Funciones {
    public static void main(String[] args){
        
        cuentaRegresiva(10);
        System.out.println(sumar(4, 4));
        
        System.out.println(factorial(5));
        //System.out.println(saludar("Deivy", 27));
    }
    
    
    static int factorial(int numero){
        if(numero > 1){
            numero = numero * factorial(numero - 1);
        }
        return numero;
    }
    
    static void cuentaRegresiva(int numero){
        
        if(numero >= 0){
            System.out.println(numero);
            numero --;
            cuentaRegresiva(numero);
        } else{
            System.out.println("El numero llego a cero");
        }
    }
    
    // Funcion
    static int sumar(int a, int b){ // Parametros
        return a + b;
    }
    
    // Funcion
    static double sumar(double a, double b){
        return a + b;
    }
}