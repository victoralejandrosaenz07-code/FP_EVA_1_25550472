/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//CREA EL SCANNER
        
        System.out.println("introduce el nombre completo");
        nombre = input.nextLine();//CAPTURA TEXTO (nexLine)
        System.out.println("introduce tu edad: ");
        edad = input.nextInt();
        System.out.println("captura tu promedio de la preparatoria");
        promedio = input.nextDouble();
       
        
        
        //CAPTURA DE DATOs
        
        System.out.println("el nombre es:");
        System.out.println(nombre);
        System.out.println("la edad es:");
        System.out.println(edad);
        System.out.println("el promedio es:");
        System.out.println(promedio);
    }
    
}
