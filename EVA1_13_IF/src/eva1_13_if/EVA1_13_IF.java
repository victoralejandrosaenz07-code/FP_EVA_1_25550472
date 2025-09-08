/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner input = new Scanner(System.in);
        System.out.println("captura tu año de nacimiento");
        califa = input.nextInt();
        
        if (califa >=2007){
            System.out.println("puede comprar alcohol");
        }else{
            System.out.println("no puede comprar alcohol");
        }
    }
    
}
