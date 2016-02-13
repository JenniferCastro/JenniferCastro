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
public class Ave extends animal {

    @Override
    public void moverse() {

        System.out.println("El "+getNombre() +" esta volando");

    }

    public Ave() {
        super();
        setNombre("Garza");

    }

}
