
package clases;

public class Rectangulos {
    // Variables de la clase
    public int base;
    public int altura;
    
    // Los constructores no devuelven valor solo ejecutan cuando se isntancia
    public Rectangulos(){
        System.out.println(base);
        System.out.println(altura);
    }    
    
    public int area(int base, int altura){
        this.base = base;
        this.altura = altura;
        return this.base * this.altura;
    }
    
    public int perimetro(int b, int a){
        base = b;
        altura = a;
        return 2 * (base + altura);
    }
    
}
