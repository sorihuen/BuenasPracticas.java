/**
 * Clase abstracta Canciones
 * 
 * @author Suyin Orihuen <sorihuen@gmail.com>
 * @version 1.0.0 2022-12-20
 */

public abstract class Songs {
    /**
     * Representa el id de la Canciones.
     */
    private int id;
    /**
     * Representa la caratula de la Canciones.
     */
    private String cover;
    /**
     * Representa el titulo de la Canciones.
     */
    private String title;
    /**
     * Representa el genero de la Canciones.
     */
    private String gender;
    /**
     * Representa la duracion de la Canciones.
     */
    private String duration;
    /**
     * Representa la descripcion de la Canciones.
     */
    private String description;
    /**
     * Representa la fecha de la Canciones.
     */
    private int date;

    /**
     * Se Crea una instancia de la clase Canciones sin parámetros.
     */
    public Songs() {
    }

    /**
     * Se Crea una instancia de la clase Canciones con parámetros.
     */

    public Songs(int id, String cover, String title, String gender, String duration, String description, int date) {
        this.id = id;
        this.cover = cover;
        this.title = title;
        this.gender = gender;
        this.duration = duration;
        this.description = description;
        this.date = date;

    }

    /**
     * Método get para acceder al id de Canciones
     * 
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * Método set para modificar el Id de Canciones
     * This palabra clave para representar o llamar al objeto.
     */

    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método get para acceder a la caratula de Canciones
     * 
     * @return caratula
     */

    public String getCover() {
        return cover;
    }

    /**
     * Método set para modificar la caratula de Canciones
     * This palabra clave para representar o llamar al objeto.
     */

    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Método get para acceder al titulo de Canciones
     * 
     * @return titulo
     */

    public String getTitle() {
        return title;
    }

    /**
     * Método set para modificar el titulo de Canciones
     * This palabra clave para representar o llamar al objeto.
     */

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Método get para acceder al genero de Canciones
     * 
     * @return genero
     */

    public String getGender() {
        return gender;
    }

    /**
     * Método set para modificar el genero de Canciones
     * This palabra clave para representar o llamar al objeto.
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * Método get para acceder a la duracion de Canciones
     * 
     * @return duracion
     */

    public String getDuration() {
        return duration;
    }

    /**
     * Método set para modificar la duracion de Canciones
     * This palabra clave para representar o llamar al objeto.
     */
    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Método get para acceder a la descripcion de Canciones
     * 
     * @return descripcion
     */
    public String getDescription() {
        return description;
    }

    /**
     * Método set para modificar la descripcion de Canciones
     * This palabra clave para representar o llamar al objeto.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Método get para acceder a fecha de Canciones
     * 
     * @return fecha
     */
    public int getDate() {
        return date;
    }

    /**
     * Método set para modificar la fecha de Canciones
     * This palabra clave para representar o llamar al objeto.
     */

    public void setDate(int date) {
        this.date = date;
    }

    /**
     * Metodo toString para mostrar los datos .
     */
    @Override
    public String toString() {
        return "num [" + id + "] " + title + " /" + "Genero: " + gender + " /" + "Duracion: " + duration + " /"
                + "Descripcion: " + description + "/" + "Fecha: " + date;

    }

}
