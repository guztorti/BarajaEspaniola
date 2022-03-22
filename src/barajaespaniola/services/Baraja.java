package barajaespaniola.services;

import barajaespaniola.entities.Carta;
import barajaespaniola.enums.Numero;
import barajaespaniola.enums.Palo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baraja {

    Scanner scn;

    private ArrayList<Carta> baraja;

    private ArrayList<Carta> vistas;

    public Baraja() {
        this.baraja = iniciaBaraja();
        this.vistas = new ArrayList();
        this.scn = new Scanner(System.in).useDelimiter("\n");
    }

    private ArrayList<Carta> iniciaBaraja() {
        ArrayList<Carta> inicia = new ArrayList();
        for (Palo palo : Palo.values()) {
            for (Numero num : Numero.values()) {
                inicia.add(new Carta(palo, num));
            }
        }
        return inicia;
    }

    private void barajar() {
        
        Collections.shuffle(baraja);
    }

    private Carta siguienteCarta() {
         Carta salida;
        if(baraja.size()!=0){
             salida = baraja.get(baraja.size()-1);
             
             baraja.remove(baraja.size()-1);
             return salida;
        }
         System.out.println("No quedan más cartas\nGAME OVER");
         return null;
    }

    private int cartasDisponibles() {
        return baraja.size();
    }

    private ArrayList<Carta> darCartas(int cantidad) {
         while ((cartasDisponibles()-cantidad)<=0){              
              System.out.println("El número máximo de cartas a sacar es: "+cartasDisponibles());
              System.out.println("Ingrese un número menor");
              cantidad = scn.nextInt();
         };
         ArrayList<Carta> salida = new ArrayList();
        
             for (int i = 0; i < cantidad; i++) {
                  salida.add(siguienteCarta());
        
        }
             return salida;
    }

    private ArrayList<Carta> cartasMonton() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private ArrayList<Carta> mostrarBaraja(ArrayList<Carta> cartas) {
         ArrayList salida = new ArrayList();
         for (Carta carta : cartas) {
              salida.add(carta);
         }
         return salida;
    }
    
    public final void menu(){
         int opcion = 0;
         String mensaje = "\tJuego de cartas\n"
                 + "Ingrese la opción\n"
                 + "1\t Barajar.\n"
                 + "2\t Mostrar la siguiente carta.\n"
                 + "3\t Pedir varias cartas.\n"
                 + "4\t Mostrar las cartas que han salido.\n"
                 + "5\t Mostrar las cartas que quedan en la baraja.\n\n"
                 + "9 -\t- SALIR";
         do {              
              System.out.println(mensaje);
              opcion = scn.nextInt();
              switch(opcion){
                   case 1:
                        barajar();
                        break;
                   case 2:
                        System.out.println(cartasDisponibles());
                        System.out.println(siguienteCarta());
                        break;
                   case 3:
                        System.out.println(cartasDisponibles());
                        System.out.println("Ingrese la cantidad de cartas a mostrar:");
                        System.out.println(darCartas(scn.nextInt()));
                        break;
                   case 4:
                        System.out.println(cartasDisponibles());
                        System.out.println(mostrarBaraja(vistas));
                        break;
                   case 5:
                        System.out.println(cartasDisponibles());
                        System.out.println(mostrarBaraja(baraja));
                        break;
                   case 9:
                        System.out.println("Gracias por jugar con nosotros!!");
                        break;
                   default:
                        System.out.println("No se conoce la opción");
              }
         } while (opcion !=9);
    }
}
