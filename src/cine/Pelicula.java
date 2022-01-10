
package cine;

public class Pelicula {
       // Atributos
    private String tituloPeli;
    private int duracionPeli;
    private int edadMinima;
    private String director;
    
   // Constructor parametrizado

    public Pelicula(String tituloPeli, int duracionPeli, int edadMinima, String director) {
        this.tituloPeli = tituloPeli;
        this.duracionPeli = duracionPeli;
        this.edadMinima = edadMinima;
        this.director = director;
    }
    
    // Constructor vacío

    public Pelicula() {
    }
    
    // Getters y Setters

    public String getTituloPeli() {
        return tituloPeli;
    }

    public void setTituloPeli(String tituloPeli) {
        this.tituloPeli = tituloPeli;
    }

    public int getDuracionPeli() {
        return duracionPeli;
    }

    public void setDuracionPeli(int duracionPeli) {
        this.duracionPeli = duracionPeli;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    // Método toString()

    @Override
    public String toString() {
        return "- Título Película: " + tituloPeli + "\n- Duración: " + duracionPeli + " minutos \n- Edad Mínima: " + edadMinima + " años \n- Director: " + director;
    }
}
