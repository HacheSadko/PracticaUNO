package edu.ipn.cecyt9.Peliculas;
/**
 *
 * @author Pablo Fernando Rosas
 */ 
public class PeliculaConstructor {
    private String titulo;
    private String Actor;
    private String duracion;
    private String genero;
    private int año;

    public void Pelicula1(String titulo) {
        this.titulo = titulo;
    }

    public void Pelicula2(String Actor) {
        this.Actor = Actor;
    }

    public void Pelicula3(String duracion) {
        this.duracion = duracion;
    }

    public void Pelicula4(String genero) {
        this.genero = genero;
    }

    public void Pelicula5(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", Actor=" + Actor + ", duracion=" + duracion + ", genero=" + genero + ", a\u00f1o=" + año + '}';
    }
   
}
