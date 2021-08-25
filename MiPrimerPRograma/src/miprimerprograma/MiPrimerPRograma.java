package miprimerprograma;

import java.util.Scanner;

public class MiPrimerPRograma {

    public static void main(String[] args) {
               
        // Declarar variables
        int Num_1;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un valor número:   ");
        Num_1 = leer.nextInt();
        
        // Validar si es par o impar
        
        if (Num_1 % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
        
        
        
    }
    
}
