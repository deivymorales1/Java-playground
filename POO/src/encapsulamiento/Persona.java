
package encapsulamiento;

public class Persona {
    private String nombre;
    private int edad;
    private boolean eliminado;
    
    // Contruye la persona

    public Persona(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
    }
    
    // Obtener nombre
    public String getNombre(){
        return this.nombre;
    }
    
    // Modificar nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
}
