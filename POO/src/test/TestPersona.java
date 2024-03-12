
package test;

import encapsulamiento.*;


public class TestPersona {
    
    public static void main(String[] args){
        
        // Instanciamos objeto y construimos
        Persona persona1 = new Persona("Deivy", 27, false);
        System.out.println(persona1.getNombre()); // Muestro
        persona1.setNombre("Raul"); // Modifico
        System.out.println(persona1.getNombre()); // Muestro
        
        System.out.println(persona1);

    }
}
