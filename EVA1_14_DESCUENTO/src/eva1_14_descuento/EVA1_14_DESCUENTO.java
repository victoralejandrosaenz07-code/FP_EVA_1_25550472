/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_14_DESCUENTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double montoVenta, montoPagar;
        Scanner captu = new Scanner(System.in);
        System.out.println("monto de compra");
        montoVenta = captu.nextDouble();
        if(montoVenta > 1000){
            montoPagar = montoVenta - (montoVenta * 0.15);
            //montoPagar = montoVenta * 0.15);
            System.out.println("debes de pagar");
             System.out.println(montoPagar);
        }
    }
    
}
