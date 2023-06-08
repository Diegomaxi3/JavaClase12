/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia3_teorico;
import Entity.Animal;
import Entity.Gato;
import Entity.Perro;
import Entity.Caballo;
/**
 *
 * @author Diego
 */
public class Herencia3_teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal p = new Perro("Alberto","Doggi","Buldog","5");
        Animal g = new Gato("Nar","Gatti","Calle","2");
        Animal c = new Caballo("Prueba","Alfalfa","Poni","3");
        p.alimentarse();
        g.alimentarse();
        c.alimentarse();
      
    }
    
}
