/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_iff;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_12_IFF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner (System.in);
        System.out.println("introduce la calificacion");
        califa = captu.nextInt();
        //ESTRUCTURA DE CONTROL IF 
        if(califa >= 70){
        System.out.println("acreditado");
        }else{//bloqueo vedadero ->SI
          System.out.println("no acreditado");      
    }
        
    }
    
}
