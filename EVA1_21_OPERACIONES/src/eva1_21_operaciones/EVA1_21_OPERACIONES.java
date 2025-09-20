/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_21_operaciones;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_21_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int valor = 2,expo = 3;
        Math.pow(valor, expo);
        double resu;
        resu = Math.pow(valor, expo);
        System.out.print("2 al cubo =");
        System.out.println(resu);
        //RAIZ CUADADA
        int valor2 = 100;
        double resu2;
        resu2 = Math.sqrt(valor2);
        System.out.print("raiz cuadrada de 100 =");
        System.out.println(resu2);
        //OTRAS RAICES
        int valor3 = 125;
        double resu3;
        resu3 = Math.pow(valor3, 1.0/3.0);
         System.out.print("la raiz cubica de 125 =");
        System.out.println(resu3);
        //DIVICION ENTRE ENTEROS
        System.out.print("7/3=");
        System.out.println(7.0/3.0);
        //DIVICION EXACTA
        int num1 = 2024, num2 = 4;
        int residuo;
        residuo = num1 % num2;//CALCULO DEL RESUDUO
        System.out.print("2023 / 4 el residuo es");
        System.out.println(residuo);
    }
    
}
