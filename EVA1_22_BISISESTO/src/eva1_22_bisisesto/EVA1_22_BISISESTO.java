/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_22_bisisesto;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_22_BISISESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int year, resi4, resi100, resi400;
    System.out.println("año a bereficar");
    year = captu.nextInt();
    resi4 = year %4;
    resi100 = year %100;
    resi400 = year %400;
    if(resi4 == 0){
        if(resi100 == 0){
             if(resi400 == 0){
                 }else{
        System.out.println("el año");
        System.out.println(year);
        System.out.println("es bisisesto");
             }
            }else{
        System.out.println("el año");
        System.out.println(year);
        System.out.println("NO es bisisesto");
        }
        }else{
        System.out.println("el año");
        System.out.println(year);
        System.out.println("SI es bisisesto");
    }
    }
    
}
