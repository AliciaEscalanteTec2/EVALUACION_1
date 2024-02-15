/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_tipos_datos;

/**
 *
 * @author Usuario
 */
public class EVA1_3_TIPOS_DATOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //BYTE:
        byte pruebaByte; //1 byte = 8 bits -> 256
        //pruebaByte = 256; 
        //Si ponemos en la pruebaByte el número 256 saldrá error, ya que lo va
        //a tomar como número entero 
        pruebaByte = -127;
        pruebaByte = 127; //Acepta de -128 a 127
        //pruebaByte = 128;
        pruebaByte = -128;
        
        //SHORT:
        short pruebaShort; //2 bytes = 16 bits = --> 65536
        pruebaShort = -32768; //No cabe
        pruebaShort = 32767; //No pasarnos de este número 
        System.out.println(pruebaShort); //Imprime la variable pruebaShort
        pruebaShort++; //++ --> Operador, suma uno al contenido de la variable
        System.out.println(pruebaShort);
        
        
    }
    
}
