
package herencia;

// Extends hereda de otra persona
public class Empleado extends Persona {
    // Atributos
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(double sueldo, String nombre) {
        super(nombre); // el super envia el dato a la superclase
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

   
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

 
    
    
}
