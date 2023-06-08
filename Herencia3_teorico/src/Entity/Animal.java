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
public class Animal {
    protected String nombre;
    protected String alimento;
    protected String raza;
    protected String edad;
    
    public Animal (String nombre,String alimento,String raza,String edad){
       this.alimento = alimento;
       this.edad = edad;
       this.nombre = nombre;
       this.raza = raza;
    };
    
    public void alimentarse(){};
}
