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
    
    private int posX;
    private int posY;
    private String nombre;
    
    public Personaje(String nombre){
        this.nombre = nombre;
        posX = 10;
        posY = 420;
    }
    
    public void corre(){
        nombre = "homerCorre.gif";
        System.out.println("PosX" + posX);
        posX += 3;
    }
    
    public void salta(){
        nombre = "homerSalta2.gif";
        posX += 2;
    }
    
    public void pisa(){
        nombre = "homerPisa.gif";
    }
    

    public String getNombre() {
        return nombre;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
