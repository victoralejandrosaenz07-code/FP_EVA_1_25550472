/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_operaciones_logicas;

/**
 *
 * @author Alejandro Saenz
 */
public class EVA1_11_OPERACIONES_LOGICAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int radio = 5;//DECLARAMOS Y INICIALIZAMOS 
    boolean resu;
    //OPERACIONES LOGICAS: COMPARACIONES 
    //RESULTADO: VERDADERO FALSO
    resu = radio > 0;
    System.out.println("radio (5) > 0 -->");
    System.out.println(resu);
    
    resu = radio <  0;//RADIO MENOS QUE CERO
    
    System.out.println("radio (5) < 0 -->");
    System.out.println(resu);
    
    resu = radio ==  0;//RADIO IGUAL QUE CERO
    System.out.println("radio (5) == 0 -->");
    System.out.println(resu);
    
    resu = radio !=  0;//RADIO ES DIFERENTE QUE CERO
    System.out.println("radio (5) != 0 -->");
    System.out.println(resu);
    }
    
}
