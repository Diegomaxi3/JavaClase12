/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author Diego
 */
public class Caballo extends Animal {
     
    public Caballo(String nombre,String alimento,String raza,String edad){
        super(nombre,alimento,raza,edad);
    }
    
    @Override
    public void alimentarse(){
        System.out.println("El + " + nombre + " Come: " + alimento);
    }   
}
