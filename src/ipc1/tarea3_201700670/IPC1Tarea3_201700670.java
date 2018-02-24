/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.tarea3_201700670;

import java.util.Scanner;

/**
 *
 * @author Andrea Palomo
 */
public class IPC1Tarea3_201700670 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner (System.in); //se llama una variable para ser ingresado por el ususario
        int res; //variable entera para ingrsar en el menú
        System.out.println("[IPC1]Tarea3_201700670"); // Este es un menú de opciones que se mostrará al usuario
        System.out.println();
        System.out.println("MENÚ DE OPCIONES");
        System.out.println("1.USUARIOS");
        System.out.println("2. CONTADOR DE DÍGITOS");
        System.out.println("3. TRES NÚMEROS DE MAYOR A MENOR");
        System.out.println("4. CALCULAR PROMEDIO");
        System.out.println("5. SALIR");
        res=entrada.nextInt(); //se ingresa el número de la opción del menú
        
        switch(res){
            case 1://es cada opción a realizar y su debido procedimiento de realización
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.exit(0); //salir del programa
                break;
            default:
                break;
               
        }
    }
}
