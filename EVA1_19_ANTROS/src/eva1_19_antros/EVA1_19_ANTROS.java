/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_antros;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_19_ANTROS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int edad;
        boolean credencial;
        System.out.println("captura tu edad");
        edad = captu.nextInt();
        System.out.println("tienes credencial para votar");
        credencial = captu.nextBoolean();
        if((edad >= 18) && (credencial == true)){
            System.out.println("puedes entrar!!");
        }else{
            System.out.println("no puedes entar!!");
        }
    }
    
}
