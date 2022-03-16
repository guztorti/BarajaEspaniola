/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package barajaespaniola.services;

import barajaespaniola.entities.Carta;
import barajaespaniola.enums.Numero;
import barajaespaniola.enums.Palo;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author gustavotorti
 */
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
          for (Palo palo: Palo.values()) {
               for (Numero num : Numero.values()) {
                    inicia.add(new Carta(palo, num));
               }
          }
          return inicia;
     }
     
     private ArrayList<Carta> barajar(ArrayList<Carta> baraja){
          ArrayList<Carta> auxiliar = new ArrayList();
          ArrayList<Carta> salida = new ArrayList();
          
          
          return salida;
     }
     
}
