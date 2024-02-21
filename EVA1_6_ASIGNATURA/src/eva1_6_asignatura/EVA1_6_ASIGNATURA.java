/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_asignatura;

import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class EVA1_6_ASIGNATURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String clave, nombre, carrera;
        int creditos, horasTeoricas, horasPracticas;
        boolean tipoMateria;
        
        Scanner captu = new Scanner(System.in);
        
        System.out.println("BIENVENIDO AL INSTITUTO TECNOLOGICO DE CHIHUAHUA II ");
        System.out.println();
        
        System.out.println("Cual es la clave de la materia?");
        clave = captu.nextLine(); //El nextLine lee lo que se escribe en el teclado
        //hasta que se de ENTER y lo guarda en este caso en la variable CLAVE
        
        System.out.println("Cual es el nombre de la materia? ");
        nombre = captu.nextLine();
        
        System.out.println("Que tipo de materia es? ( TRUE > Especialidad FALSE > Generica) ");
        tipoMateria = captu.nextBoolean();
        
        System.out.println("Con cuantos creditos cuenta la materia? ");
        creditos = captu.nextInt();
        
        System.out.println("Con cuantas horas teoricas cuenta la materia? ");
        horasTeoricas = captu.nextInt();
        
        System.out.println("Con cuantas horas practicas cuenta la materia? ");
        horasPracticas = captu.nextInt();
        
        System.out.println("Cual es el nombre de la carrera? ");
        carrera = captu.next();
        
        System.out.println("Anotado! :) ");
        System.out.println();
        System.out.println("Tus resultados son: ");
        System.out.println();
        System.out.println("Clave de la materia: "+clave);
        System.out.println("Nombre de la materia: "+nombre);
        System.out.println("Tipo de materia: "+tipoMateria);
        System.out.println("Creditos de la materia: "+creditos);
        System.out.println("Horas teoricas de la materia: "+horasTeoricas);
        System.out.println("Horas practicas de la materia: "+horasPracticas);
        System.out.println("Nombre de la carrera: "+carrera);
        
        //ALICIA ESCALANTE SOSA   No.Control: 24550008
    }
    
}
