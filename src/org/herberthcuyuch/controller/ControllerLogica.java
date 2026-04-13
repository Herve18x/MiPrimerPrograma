/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.herberthcuyuch.controller;
import java.util.Scanner;

/**
 *
 * @author informatica
 */
public class ControllerLogica {    
    
    public void menuOpciones(int opcion) {
        Scanner leer = new Scanner(System.in);
        System.out.println("1.Verificador de edad.");
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
        System.out.println("Ingrese una opcion.");
        int opcionLogica = leer.nextInt();
    }
    
    switch(menuOpciones){
        case 1:
            verificarEdad()
        case 2:
    
    
    
    
    }
            
            
            
            
            
            
    
    public boolean verificarEdad(int edad){
        System.out.println("Ingrese una edad.");
        edad = leer.nextInt();
        boolean mayorEdad = false;

        if (edad >= 18){ 

            mayorEdad = true;

        }else{

            mayorEdad = false;

        }

        return mayorEdad;

    }
 
}

