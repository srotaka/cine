
package cine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CineService {
       EspectadorService eService = new EspectadorService();
    PeliculaService pService = new PeliculaService();
    List<Espectador> espectadoresList = new ArrayList();
    Cine cine = new Cine();

    // Creamos la sala de cine con asientos libres "-"
    public Cine crearSala() {

        pService.crearCartelera();
        String[][] salaMatrix = new String[8][6];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                salaMatrix[i][j] = " - ";
            }
        }

        cine.setSala(salaMatrix);
        cine.setPrecioEntrada(650);
        cine.setPelicula(pService.pelicula);
        pService.imprimirCartelera();
        imprimirSala(cine);
        return cine;
    }

    // Método para imprimir la sala con sus posiciones
    public void imprimirSala(Cine cine) {
        System.out.println("..................................");
        System.out.println("\n\t~ SALA Nº1 ~\n");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                switch (j) {
                    case 0:
                        System.out.print("[A" + (i + 1) + cine.getSala()[i][j] + "] | ");
                        break;
                    case 1:
                        System.out.print("[B" + (i + 1) + cine.getSala()[i][j] + "] | ");
                        break;
                    case 2:
                        System.out.print("[C" + (i + 1) + cine.getSala()[i][j] + "] | ");
                        break;
                    case 3:
                        System.out.print("[D" + (i + 1) + cine.getSala()[i][j] + "] | ");
                        break;
                    case 4:
                        System.out.print("[E" + (i + 1) + cine.getSala()[i][j] + "] | ");
                        break;
                    case 5:
                        System.out.print("[F" + (i + 1) + cine.getSala()[i][j] + "]");
                        break;
                }
            }
            System.out.println("");
        }
        System.out.println("\n\t~ REFERENCIAS ~\n- [X]: Asiento ocupado \n- [-]: Asiento libre");
        System.out.println("\n- VALOR DE LA ENTRADA: $" + cine.getPrecioEntrada());
    }

    // Método para imprimir la lista de espectadores
    public void datosEspectador() {

        eService.crearEspectadores(espectadoresList);
        System.out.println("\n..................................");
        System.out.println("\n\t~ LISTA DE ESPECTADORES ~");
        for (Espectador espectador : espectadoresList) {
            System.out.println(espectador);
        }
        checkEspectador();
    }

    // Método para checkear si el espectador puede entrar a la sala
    public void checkEspectador() {
        Collections.shuffle(espectadoresList);
        Iterator<Espectador> it = espectadoresList.iterator();
        List <Espectador> rechazadosList = new ArrayList();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {

                if (it.hasNext()) {
                    Espectador espectador = it.next();
                    if (espectador.getEdad() > cine.getPelicula().getEdadMinima() && espectador.getDinero() >= cine.getPrecioEntrada()) {
                        cine.getSala()[i][j] = " X ";
                    } else {
                        rechazadosList.add(espectador);
                    }
                }
            }
        }
        System.out.println("\nLos espectadores que cumplían con la edad mínima \ny tenían el dinero suficiente, fueron ubicados en la sala.");
        imprimirSala(cine);
        
        System.out.println("\n..................................");
        System.out.println("\n\t~ LISTA DE ESPECTADORES QUE NO ENTRARON A LA SALA ~\n");
        for (Espectador espectador : rechazadosList) {
            System.out.println(espectador);
        }
        System.out.println("\n- Total de personas que no pudieron acceder: " + rechazadosList.size());
    }
}
