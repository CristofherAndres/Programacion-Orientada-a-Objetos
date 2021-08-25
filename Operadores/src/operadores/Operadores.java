package operadores;
public class Operadores {
    public static void main(String[] args) {
       
        char letra = 'J';
        
        String string1 = "Hola";
        String string2 = "Mundo";
        String string3 = "";        
        String string4 = "";

        
        String NoHacer = "No hacer";
        
        string3 = string1 +" "+ string2 + " " + letra;
        
        System.out.println(string3);
        System.out.println(NoHacer);
        
        String nombre = "Cristofher";
        
        string4 = "Bienvenido ".concat(nombre);
        System.out.println(string4);
        
        //Obtener el largo de una palabra length
        System.out.println("Largo: "+ string4.length() );                
        System.out.println("Largo: "+ nombre.length() );        

        //Obtener un substring
        System.out.println("Sub: "+nombre.substring(0, 6));
        
        // Pasar a mayusculas UPPERCASE
        System.out.println("Mas: "+nombre.toUpperCase());        
        
                
    }
    
}
