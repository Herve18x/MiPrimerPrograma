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
<<<<<<< Updated upstream
=======

>>>>>>> Stashed changes
                ControllerLogica logica = new ControllerLogica();

                int opcionLogica = -1;
                while (opcionLogica != 0) {

<<<<<<< Updated upstream
                switch (opcionLogica) {
                    case 1:
                        logica.verificarEdad();
                        break;

                    case 0:
                        System.out.println("Saliendo del menú de lógica");
                        break;
=======
                    opcionLogica = logica.menuOpciones();
>>>>>>> Stashed changes

                    switch (opcionLogica) {
                        case 1:
                            logica.verificarEdad();
                            break;
                        case 2:
                            logica.parImpar();
                            break;
                        case 3:
                            logica.semaforo();
                            break;
                        case 4:
                            logica.loginSimple();
                            break;
                        case 5:
                            logica.mayorDeDos();
                            break;
                        case 6:
                            logica.añoBisiesto();
                            break;
                        case 7:
                            logica.triangulo();
                            break;
                        case 8:
                            logica.comparadorTexto();
                            break;
                        case 0:
                            System.out.println("Saliendo del menú de lógica");
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                }
                break;



            case 4: 
                System.out.println("no se ha configurado la opcion, vuelve a ingresar un valor.");
                break;
        }
    } 
}
