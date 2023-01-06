import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Clase Biblioteca que hereda de Cancion
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-20
 */
public class Library extends Songs {

        private static Scanner sc = new Scanner(System.in);
        
        /**
         * Inicializando una coleccion de objetos tipo Biblioteca.
         */
        static List<Library> libraryList = new ArrayList<Library>();
        static List<Library> playList = new ArrayList<Library>();

        /**
         * Se Crea una instancia de la clase Biblioteca con parámetros.
         */
        public Library(int id, String cover, String title, String gender, String duration, String description,
                        int date) {
                super(id, cover, title, gender, duration, description, date);
        }

        /**
         * Metodo para crear y recorrer una lista de la Biblioteca.
         */

        public static void showLibrary() {
                libraryList.add(new Library(1, "/path/img/cover.png", "He vuelto por ti", "Salsa", "4:43", "Maelo Ruiz",
                                2007));
                libraryList
                                .add(new Library(2, "/path/img/cover.png", "Cali Pachanguero", "Salsa", "4:51",
                                                "Grupo Niche", 1984));
                libraryList.add(
                                new Library(3, "/path/img/cover.png", "Deja Vu", "Bachata", "3:18",
                                                "Prince Royce, Shakira", 2017));
                libraryList.add(new Library(4, "/path/img/cover.png", "Lloviendo estrellas", "Balada", "4:17",
                                "Cristian Castro", 2001));
                libraryList.add(new Library(5, "/path/img/cover.png", "Hijo de la Luna", "Pop", "4:18", "Mecano",
                                1986));
                libraryList.add(new Library(6, "/path/img/cover.png", "Vida de Rico", "Cumbia", "3:10", "Camilo",
                                2020));
                libraryList.add(
                                new Library(7, "/path/img/cover.png", "Ojos Marrones", "Pop", "3:45",
                                                "Lasso,Sebastian Yatra", 2022));
                libraryList.add(new Library(8, "/path/img/cover.png", "Monotonía", "Bachata", "2:46", "Shakira, Ozuna",
                                2022));
                libraryList.add(new Library(9, "/path/img/cover.png", "Si no te hubieras Ido", "Balada", "4:48",
                                "Marco Antonio Solis", 1999));
                libraryList.add(new Library(10, "/path/img/cover.png", "Perdon,Perdon", "Balada", "3:40", "HA-Ash",
                                2014));
                libraryList
                                .add(new Library(11, "/path/img/cover.png", "Corazon de Acero", "Salsa", "3:45",
                                                "Yiyo Sarante", 2018));
                libraryList.add(new Library(12, "/path/img/cover.png", "Cancion Bonita", "Cumbia", "2:59",
                                "Carlos Vives, Ricky Martin", 2021));
                libraryList.add(
                                new Library(13, "/path/img/cover.png", "Sentada Aqui en mi Alma", "Balada", "4:07",
                                                "Chayanne", 2003));
                libraryList.add(new Library(14, "/path/img/cover.png", "Eres mi sueño", "Pop", "3:16", "Fonseca",
                                2011));
                libraryList.add(new Library(15, "/path/img/cover.png", "Si yo fuera tu ", "Pop", "4:04",
                                "Servando y Florentino", 2006));

                System.out.println("Lista :");
                System.out.println("=====================================================================");
                for (int i = 0; i < libraryList.size(); i++) {
                        Library e = libraryList.get(i);
                        System.out.println(e);
                }

        }

        /**
         * Metodo para crear una lista de reproduccion.
         */
        public static void createPlayList() {
                showLibrary();

                System.out.println("Seleccione las cantidad de la lista");
                int cantidad = sc.nextInt();
                for (int i = 0; i < cantidad; i++) {
                        System.out.println("Seleccione la cancion " + (i + 1));
                        int seleccion = sc.nextInt();
                        for (Library library : libraryList) {
                                if (library.getId() == seleccion) {
                                        playList.add(library);
                                }

                        }

                }

                System.out.println(playList);

                System.out.println(" === Su lista de reproduccion esta completa ==");
        }
}
