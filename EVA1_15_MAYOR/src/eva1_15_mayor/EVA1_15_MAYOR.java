/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_15_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.println("numero 1");
        num1 = input.nextInt();
        System.out.println("numero 2");
        num2 = input.nextInt();
        
        if(num1 > num2){
            System.out.println("el bvalor mayoe es ");
            System.out.println(num1);
        }else{
            System.out.println("el bvalor mayoe es ");
            System.out.println(num2);
        }
    }
    
}
