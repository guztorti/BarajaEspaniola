/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package barajaespaniola.enums;

/**
 *
 * @author gustavotorti
 */

public enum Numero {
      n1(1), n2(2), n3(3),n4(4), n5(5), n6(6), n7(7), n8(10), n9(11), n10(12);
      
      private Integer valor;
      private Numero(Integer valor){
           this.valor = valor;
      }

     public Integer getValor() {
          return valor;
     }
      
}
