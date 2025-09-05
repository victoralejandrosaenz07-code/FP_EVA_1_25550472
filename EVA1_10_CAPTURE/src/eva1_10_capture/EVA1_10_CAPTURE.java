/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_capture;

import java.util.Scanner;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_10_CAPTURE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double velocidad, tiempo, distancia;
        Scanner captu = new Scanner(System.in);
        System.out.println("introdusca la distancia: ");
        distancia = captu.nextDouble();
        System.out.println("introduce el tiempo: ");
        tiempo = captu.nextDouble();
        //calculo:
        velocidad = distancia / tiempo;
        System.out.println();
        System.out.print(velocidad);
        System.out.println("m/s");
    }
    
}
