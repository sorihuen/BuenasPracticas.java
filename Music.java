/**
 * Clase Musica que implementa la interfaz Comparable
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-20
 */

public class Music implements Comparable<Music> {

    /**
     * Representa el titulo de la Musica.
     */
    private String title;
    /**
     * Representa el genero de la Musica.
     */
    private String gender;
    /**
     * Representa la duracion de la Musica.
     */
    private double duration;
    /**
     * Representa la fecha de la musica.
     */
    private int date;

    /**
     * Se Crea una instancia de la clase Musica con parámetros.
     */
    public Music(String title, String gender, double duration, int date) {
        this.title = title;
        this.gender = gender;
        this.duration = duration;
        this.date = date;
    }

    /**
     * Método get para acceder al titulo de la musica
     * 
     * @return titulo
     */
    public String getTitle() {
        return title;
    }

    /**
     * Método set para modificar el titulo de la musica
     * This palabra clave para representar o llamar al objeto.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método accesador del genero de la Musica
     * 
     * @return genero
     */
    public String getGender() {
        return gender;
    }

    /**
     * Método set para modificar el genero de la musica
     * This palabra clave para representar o llamar al objeto.
     */

    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método accesador del tiempo de duracion de la Musica
     * 
     * @return duracion
     */

    public double getDuration() {
        return duration;
    }

    /**
     * Método set para modificar la duracion de la musica
     * This palabra clave para representar o llamar al objeto.
     */

    public void setDuration(double duration) {
        this.duration = duration;
    }

    /**
     * Método accesador de la fecha de la Musica
     * 
     * @return fecha
     */

    public int getDate() {
        return date;
    }

    /**
     * Método set para modificar la fecha de la musica
     * 
     * @param int fecha.
     *            This palabra clave para representar o llamar al objeto.
     */
    public void setDate(int date) {
        this.date = date;
    }

    /**
     * Metodo toString para mostrar los datos .
     */
    @Override
    public String toString() {
        return "Musica: [Titulo= " + title + ", Genero = " + gender + ", Duracion = " + duration + ", Fecha = " + date
                + "]";
    }

    /**
     * Metodo para comprobar si dos cadenas son identicas o no .
     * 
     * @param object Musica.
     */
    @Override
    public int compareTo(Music music) {
        int retorno = 0;
        if (this.duration > music.duration) {
            retorno = 1;
        } else if (this.duration < music.duration) {
            retorno = -1;
        }

        return retorno;

    }

    /**
     * Metodo para saber si dos objetos son del mismo tipo .
     * 
     * @param object Musica.
     * @return boolean true o false.
     */

    @Override
    public boolean equals(Object obj) {
        Music musicComparation = (Music) obj;
        return this.getGender().equalsIgnoreCase(musicComparation.getGender());

    }
}
