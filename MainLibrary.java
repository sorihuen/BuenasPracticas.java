import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Clase principal 
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-20
*/

public class MainLibrary{
    /**
     * Metodo principal de la clase
     * 
     * @param args Argumentos de la linea de comandos
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion;


        while(!salir){
           
            menu();
         
            try{
                opcion=sc.nextInt();
                sc.nextLine();
                switch(opcion){
                case 1:
                    
                    Library.showLibrary();
                    System.out.println("=====================================================================");
                    System.out.println("");
                

                break;
                case 2:

                    Library.createPlayList();

                break;
                case 3:
                   OrderList.showFilters();
                    
                break;
                case 4:
                
                    OrderList.selectionList();
                    System.out.println("=====================================================================");
               

                break;
                case 0:

                    salir =true;
                break;
                default:
                    System.out.println("La opcion es invalida");
                }

             

            }catch(InputMismatchException e){

                System.out.println("Debes introducir un numero");
                sc.next();
            }     



        }
        System.out.println("Fin del menu");


    }

    /**
     * Metodo para acceder al menu.
    */

    public static void menu(){

        System.out.println("");
        System.out.println("Menu Biblioteca de Canciones ");
        System.out.println("");
        System.out.println("[1] Lista de Canciones");
        System.out.println("[2] Crear Playlist");
        System.out.println("[3] Seleccionar por Genero / Año");
        System.out.println("[4] Ordenar lista por Fechas / Duracion");
        System.out.println("[0] Salir");
        System.out.print("Elija la opcion:");
        


    }
  









}

