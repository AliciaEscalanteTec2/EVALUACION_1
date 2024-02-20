/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EVA1_5_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //DECLARAR NUESTRAS VARIABLES
        String nombre;
        int edad;
        
        System.out.println("Hola!, buen dia");
        System.out.println("Por favor introduce tu nombre: ");
        //Para guardar el valor, se debe de hacer una serie de pasos:
        
        //CREAR NUESTRO SCANNER
        Scanner captura = new Scanner(System.in);
        //CAPTURA
        nombre = captura.nextLine();
        
        System.out.println("Ahora, introduce tu edad: ");
        edad = captura.nextInt();
        System.out.println("Anotado! :) ");
        System.out.println("Tu nombre es: ");
        System.out.println(nombre);
        System.out.println("Tu edad es : ");
        System.out.println(edad);
        
        //ALICIA ESCALANTE SOSA 
        //No.control: 24550008
        
    }
    
}
