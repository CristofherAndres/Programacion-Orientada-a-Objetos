package ipc;

import java.util.Scanner;

public class IPC {
    public static void main(String[] args) {
        
        // Definir nuestras variables
        
        float IPCFeb, IPCMar, precio, precioFeb, precioMar, diferencia;
        
        // Inicialización de variables
        IPCFeb = (float) 0.3;
        IPCMar = (float) 0.6;
        
        
        //Entrada
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresar precio producto: ");
        precio = sc.nextFloat();
        System.out.println(precio);
        
        // Proceso
        
        precioFeb = precio * (1+IPCFeb);        
        precioMar = precio * (1+IPCMar);
        
        diferencia = precioMar - precioFeb;
        
        System.out.println("Precio febrero: "+precioFeb);        
        System.out.println("Precio Marzo: "+precioMar);
        System.out.println("Diferencia: "+diferencia);



        
        
        
        
    }
}
