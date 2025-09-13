/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antro;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_19_ANTRO {
    final static String EDAD = "18";
    final static String CREDENCIAL ="si";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String usu, contra;
     Scanner input = new Scanner(System.in);
     System.out.println("*******BIENVENIDO*****");
     System.out.println(" antro las cariñosas: ");
     System.out.println("edad: ");
     usu = input.nextLine();
      System.out.println("tienes credencial?: ");
     contra = input.nextLine();
     
     if(usu.equals(EDAD)){//COMPARAR CADENAS
         if(contra.equals(CREDENCIAL)){
         System.out.println("ACCESO CONSEDIDO");
     }else{
         System.out.println("ACCESO DENEGADO");
         }
     }else{
             System.out.println("ACCESO ");
             }
    }
    
}
    
    
