import java.util.Comparator;

/**
 * Clase Comparator de Musica que utiliza la interfaz Comparator
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-20
 */
public class ComparatorMusic implements Comparator<Music> {

    /**
     * Metodo que compara dos objetos para la ordenacion.
     * 
     * @param object Musica 1.
     * @param object Musica 2
     * @return respuesta .
     */

    @Override
    public int compare(Music music1, Music music2) {
        int respuesta = 0; // positivo
        if (music1.getDate() > music2.getDate()) {
            respuesta = 1;
        } else if (music1.getDate() < music2.getDate()) {
            respuesta = -1;// negativo
        } else {
            respuesta = 0;

        }
        return respuesta;

    }
}
