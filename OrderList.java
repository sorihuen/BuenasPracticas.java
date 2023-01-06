import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Ordenar Lista
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-20
 */
public class OrderList {

    /**
     * Inicializando una coleccion de objetos tipo musica.
     */

    static List<Music> musicList = new ArrayList<Music>();
    static List<Music> genderList = new ArrayList<Music>();

    private static Scanner sc = new Scanner(System.in);

    /**
     * Metodo para crear y recorrer una lista de musica.
     */
    public static void List() {

        musicList.add(new Music("He vuelto por ti", "Salsa", 4.43, 2007));
        musicList.add(new Music("Cali Pachanguero", "Salsa", 4.51, 1984));
        musicList.add(new Music("Deja Vu", "Bachata", 3.18, 2017));
        musicList.add(new Music("Lloviendo estrellas", "Balada", 4.17, 2001));
        musicList.add(new Music("Hijo de la Luna", "Pop", 4.18, 1986));
        musicList.add(new Music("Vida de Rico", "Cumbia", 3.10, 2020));
        musicList.add(new Music("Ojos Marrones", "Pop", 3.17, 2022));
        musicList.add(new Music("Monotomia", "Bachata", 2.46, 2022));
        musicList.add(new Music("Si no te hubieras Ido", "Balada", 4.48, 1999));
        musicList.add(new Music("Perdon,Perdon", "Balada", 3.40, 2014));
        musicList.add(new Music("Corazon de Acero", "Salsa", 3.45, 2018));
        musicList.add(new Music("Cancion Bonita", "Cumbia", 2.59, 2021));
        musicList.add(new Music("Sentada aqui en mi Alma", "Balada", 4.07, 2003));
        musicList.add(new Music("Eres mi sueño", "Pop", 3.16, 2011));
        musicList.add(new Music("Si yo fuera tu", "Pop", 4.04, 2006));

        for (Music music : musicList) {
            System.out.println(music.toString());
        }
    }

    /**
     * Metodo para seleccionar y ordenar una lista de musica.
     */
    public static void selectionList() {

        List();

        System.out.println("Seleccione el orden:");
        System.out.println("[1].Orden por fechas:");
        System.out.println("[2].Orden por Duracion:");
        int order = sc.nextInt();
        sc.nextLine();

        switch (order) {
            case 1:
                System.out.println("[1].Orden por fechas:");
                Collections.sort(musicList, new ComparatorMusic());
                for (Music music : musicList) {
                    System.out.println(music.toString());
                }

                break;

            case 2:
                System.out.println("[2].Orden por Duracion:");
                Collections.sort(musicList);
                for (Music music : musicList) {
                    System.out.println(music.toString());
                }

                break;
            default:
                System.out.println("Opcion Invalida");

        }

    }

    /**
     * Metodo para mostrar el filtro de una lista de musica.
     */
    public static void showFilters() {
        System.out.println("Seleccion por:");
        System.out.println("[1]. Mismo Genero:");
        System.out.println("[2]. Misma Fechas:");
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("[1].Filtro Genero:");
                filterGener();

                break;

            case 2:
                System.out.println("[1].Filtro Fecha:");
                filterYear();

                break;
            default:
                System.out.println("Opcion Invalida");

        }

    }

    /**
     * Metodo para filtrar por genero una lista de musica.
     */
    public static void filterGener() {
        List();
        System.out.println("Coloque el genero:");
        String gender = sc.next();
        sc.nextLine();
        for (Music music : musicList) {
            if (music.getGender().equalsIgnoreCase(gender)) {
                System.out.println(music.toString());
            }
        }

    }

    /**
     * Metodo para filtrar por fecha una lista de musica.
     */
    public static void filterYear() {
        List();
        System.out.println("Coloque el año:");
        int year = sc.nextInt();
        for (Music music : musicList) {
            if (music.getDate() == year) {
                System.out.println(music.toString());
            }
        }

    }
}
