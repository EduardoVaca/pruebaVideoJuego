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
public class Obstaculo {
    private int posX;
    private int posY;
    private int ancho;
    private int alto;
    private String nombre;
    private Colisionador col;
    
    public Obstaculo(String nombre, int alto, int ancho){
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        posX = 700;
        posY = 420;
        col = new Colisionador(posX, posY, alto, ancho);
    }
    
    void avanza(){
        posX -= 2;
        col.setxSuperior(posX);
        col.setxInferior(posX + ancho);
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public String getNombre() {
        return nombre;
    }

    public Colisionador getCol() {
        return col;
    }
    
}
