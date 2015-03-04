/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagenes;

/**
 *
 * @author Eduardo
 */
public class Personaje {
    
    private String nombre;
    
    public Personaje(String nombre){
        this.nombre = nombre;
    }
    
    public void corre(){
        nombre = "homerCorre.gif";
    }

    public String getNombre() {
        return nombre;
    }
    
    
}
