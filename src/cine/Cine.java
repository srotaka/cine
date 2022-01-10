
package cine;

public class Cine {
      // Atributos
    private Pelicula pelicula;
    private String[][] sala;
    private int precioEntrada;
    
    // Constructor parametrizado

    public Cine(Pelicula pelicula, String[][] sala, int precioEntrada) {
        this.pelicula = pelicula;
        this.sala = sala;
        this.precioEntrada = precioEntrada;
    }
    
    // Constructor vacío

    public Cine() {
    }
    
    // Getters y Setters

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String[][] getSala() {
        return sala;
    }

    public void setSala(String[][] sala) {
        this.sala = sala;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }
    
    // toSTring()

    @Override
    public String toString() {
        return "\n\t~ STAR CINEMA ~" + "\n- Película: " + pelicula + "\n- Sala: " + sala + "\n- Precio de la Entrada: $" + precioEntrada;
    }
    
}
