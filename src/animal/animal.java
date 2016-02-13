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
public abstract class animal {
    
    private String nombre;
    public animal(){
    
    }
    
    public void comer(){
    System.out.println("el "+nombre+" esta comiendo.");
    }
    
    public abstract void moverse();
            
    public void setNombre(String s){
     nombre=s;
    }
    
    public String getNombre(){
    return nombre;
    }
    
    
}
