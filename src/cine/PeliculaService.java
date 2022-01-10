
package cine;

public class PeliculaService {
     Pelicula pelicula;
    // Método para crear la cartelera
    public void crearCartelera() {

        pelicula = new Pelicula ("BATMAN: THE DARK KNIGHT", 118, 16, "CHRISTOPHER NOLAN");
        
    }
    // Método para imprimir la cartelera
    public void imprimirCartelera() {
         System.out.println("\t~ BIENVENIDOS A STAR CINEMA ~");
        //System.out.println("\n..................................");
        System.out.println("\n\t~ CARTELERA SEMANAL ~");
        System.out.println(pelicula);
        }
}
