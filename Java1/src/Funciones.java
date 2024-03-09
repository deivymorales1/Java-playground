// Sobrecarga de funciones
public class Funciones {
    public static void main(String[] args){
        
        //cuentaRegresiva(10);
        System.out.println(sumar(  "Deivy", 4, 9 , 6));
        
        //System.out.println(factorial(4));
        //System.out.println(saludar("Deivy", 27));
    }
    
        
    // Funcion
    static int sumar(  String nombre,int...numeros){ // Parametros
        int suma = 0;
        for(int num : numeros){
            suma += num;
        }
        System.out.println(nombre);
        return suma;
    }
    
    // Funcion
    /*static double sumar(double a, double b){
        return a + b;
    }*/
    
    
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

}