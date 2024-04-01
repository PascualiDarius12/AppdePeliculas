package modelo;

import java.io.Serializable;

public class Pelicula implements Serializable {
    private String titulo;
    private String resumen;
    private String director;
    private String Actor;
    private int imagen;

    public Pelicula(String titulo, String resumen, String director, String actor, int imagen) {
        this.titulo = titulo;
        this.resumen = resumen;
        this.director = director;
        Actor = actor;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return Actor;
    }

    public void setActor(String actor) {
        Actor = actor;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}
