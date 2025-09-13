/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_18_ACCESO {
    final static String USUARIO = "victor";
    final static String PWD ="1222";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     String usu, contra;
     Scanner input = new Scanner(System.in);
     System.out.println("*******BIENVENIDO*****");
     System.out.println("USUSARIO: ");
     usu = input.nextLine();
     System.out.println("CONTRASEÑA: ");
     contra = input.nextLine();
     
     if(usu.equals(USUARIO)){//COMPARAR CADENAS
         if(contra.equals(PWD)){
         System.out.println("ACCESO CONSEDIDO");
     }else{
         System.out.println("ACCESO DENEGADO");
         }
     }else{
             System.out.println("ACCESO ");
             }
    }
    
}
