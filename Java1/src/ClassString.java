
public class ClassString {
    public static void main(String[] args){
        String nombre = "Oregon";
        System.out.println(nombre.charAt(3));
        
        System.out.println(nombre.length());
        for(int i = 0; i < nombre.length(); i++){
            System.out.println(nombre.charAt(i));
        }
        
        System.out.println(nombre.substring(0, 4));
    
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.toUpperCase());
        nombre = " O r e g o n";
        System.out.println(nombre.replace(" ", "-"));
        System.out.println(nombre.replace("O", "o"));
        System.out.println("Hola".equals("Hola1"));
        System.out.println(nombre.trim());
        
        
        StringBuilder nuevo = new StringBuilder();
        System.out.println(nuevo);
        
        nuevo.append("Hola");
        nuevo.append(" ");
        nuevo.append("Mundo");
        System.out.println(nuevo.toString());
        
    }
}
