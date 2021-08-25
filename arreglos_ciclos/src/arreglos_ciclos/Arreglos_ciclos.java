package arreglos_ciclos;
public class Arreglos_ciclos {
    public static void main(String[] args) {
        
        // Array en java
        String[] ropas = new String[4];
        
        ropas[0] = "Polera Roja";
        ropas[1] = "Polera Azul";
        ropas[2] = "Pantalon Negro";
        ropas[3] = "Sombrero Blanco";

        int[] numeros = {15,30,45,50,16,15,18,19,16};
        
        for (int numero : numeros) {
            System.out.println("Numero: " + numero);
        }
        
        for (String ropa : ropas) {
            ropa = "dentro del for";
            System.out.println("Ropa: " + ropa);
        }
        
        // Saber cantidad de elementos del array ropas y números
        
        System.out.println("Cantidad de datos del array ropas: " + ropas.length);
        
        for (int i = 0; i < ropas.length; i++) {
            System.out.println(ropas[i]);
        }
       
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numero: " + numeros[i]);
        }
        
        
    }
    
}
