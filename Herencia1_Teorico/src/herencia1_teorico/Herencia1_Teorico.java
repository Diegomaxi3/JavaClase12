/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia1_teorico;
import Entity.Animal;
import Entity.Gato;
import Entity.Perro;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class Herencia1_Teorico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal();
        Perro p = new Perro();
        Gato g = new Gato();
        
        ArrayList <Animal> animales= new ArrayList<>();
        animales.add(a);
        animales.add(p);
        animales.add(g);
        for (Animal animal: animales){
           animal.hacerRuido();
        }
    }
    
}
