
package cine;

public class Espectador {
      // Atributos
    private String nombreEspectador;
    private Integer edad;
    private Integer dinero;
    
    // Constructor parametrizado

    public Espectador(String nombreEspectador, Integer edad, Integer dinero) {
        this.nombreEspectador = nombreEspectador;
        this.edad = edad;
        this.dinero = dinero;
    }
    
    // Constructor vacío

    public Espectador() {
    }
    
    // Getters y Setters

    public String getNombreEspectador() {
        return nombreEspectador;
    }

    public void setNombreEspectador(String nombreEspectador) {
        this.nombreEspectador = nombreEspectador;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }
    
    // toString()

    @Override
    public String toString() {
        return "- Nombre Espectador: " + nombreEspectador + "\n- Edad: " + edad + " años \n- Dinero disponible: $" + dinero + "\n";
    }
}
