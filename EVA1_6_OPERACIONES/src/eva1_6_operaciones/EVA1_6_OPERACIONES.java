/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi, radio, area; //todas son doubles
        //ES LO MISMO QUE
        //double pi;
        //doubloe radio;
        //double area;
        //inicializacion
        pi = 3.1416;
        radio = 10;
        //OPERACION
        area = pi * radio * radio;
        //SALIDA DE DATOS
        System.out.println("el area del circulo de radio 10 es: ");
        System.out.println(area);
    }
    
}
