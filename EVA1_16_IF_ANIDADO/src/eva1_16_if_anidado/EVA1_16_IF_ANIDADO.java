/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_if_anidado;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_16_IF_ANIDADO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int mes;
        Scanner captu = new Scanner(System.in);
        System.out.println("captura el numero de mes(1 a 12)");
        mes = captu.nextInt();
        
        if(mes == 1){
            System.out.println("enero");
           }else if(mes == 2){
               System.out.println("febrero");
           }else if(mes == 3){
               System.out.println("marzo");
           }else if(mes == 4){
               System.out.println("abril");
           }else if(mes == 5){
               System.out.println("mayo");
           }else if(mes == 6){
               System.out.println("junio");
           }else if(mes == 7){
               System.out.println("julio");
           }else if(mes == 8){
               System.out.println("agosto");
           }else if(mes == 9){
               System.out.println("septiembre");
           }else if(mes == 10){
               System.out.println("octubre");
           }else if(mes == 11){
                System.out.println("noviembre");
           }else if(mes == 12){
               
        }
    }
    
}
