/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package animal;

/**
 *
 * @author FrankMontilla
 */
public class Perro extends animal{
    
    public Perro(){
        super();
        setNombre("perro");
    }
    
    public void moverse() {
       System.out.println("el"+getNombre()+" se esta moviendo");
    }
    
}
