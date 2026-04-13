/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.herberthcuyuch.main;
import org.herberthcuyuch.view.ViewMenuPrincipal;
import org.herberthcuyuch.controller.ControllerLogica;

/**
 *
 * @author Herberth Cuyuch
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instanciar <- new
        ViewMenuPrincipal menu = new ViewMenuPrincipal();
        menu.mostrarMenu();
       
        int opcion = menu.getOpcionMenu();
        
        switch(opcion){
            case 1:
                System.out.println("no se ha configurado la opcion, vuelve a ingresar un valor.");
                break; 
            case 2:
                System.out.println("no se ha configurado la opcion, vuelve a ingresar un valor.");
                break;
            case 3:
                ControllerLogica logica = new ControllerLogica();
                logica.menuOpciones(opcion);
                break;
            case 4: 
                System.out.println("no se ha configurado la opcion, vuelve a ingresar un valor.");
                break;
        }
    } 
}
