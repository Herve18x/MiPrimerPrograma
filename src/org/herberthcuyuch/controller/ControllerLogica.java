package org.herberthcuyuch.controller;

import java.util.Scanner;

public class ControllerLogica {

    public int menuOpciones() {
        Scanner leer = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("MENU LOGICA.");
        System.out.println("1. Verificador de edad.");
        System.out.println("2.");
        System.out.println("3.");
        System.out.println("4.");
        System.out.println("5.");
        System.out.println("6.");
        System.out.println("7.");
        System.out.println("8.");
        System.out.println("9.");
        System.out.println("10.");
        System.out.println("11.");
        System.out.println("0. Salir del sistema.");
        System.out.println("=========================");
        System.out.println("Ingrese una opcion.");

        int opcionLogica = leer.nextInt();
        return opcionLogica;
    }

    public boolean verificarEdad() {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese una edad: ");
        int edad = leer.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true;
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }
    public boolean parImpar(){
    
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero:");
        int n1 = leer.nextInt();
        
        n1 = (n1 % 2);
        if (n1 == 0){
         System.out.println(n1 + " es par.");
         return true; 
        }else{
         System.out.println(n1 + " es impar.");
         return false;
        }
        
        
    }
}
