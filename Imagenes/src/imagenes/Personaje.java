/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagenes;

import java.awt.Graphics;

/**
 *
 * @author Eduardo
 */
public class Personaje {
    
    private int posX;
    private int posY;
    private int ancho;
    private int alto;
    private String nombre;
    private Colisionador col;
    
    public Personaje(String nombre, int alto, int ancho){
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        posX = 150;
        posY = 420;
        col = new Colisionador(posX, posY, alto, ancho);
    }
    
    public void corre(){
        nombre = "homerCorre.gif";
        
        posX += 3;
        col.setxInferior(posX + ancho);
        col.setxSuperior(posX);
        
    }
    
    public void salta(){
        nombre = "homerSalta2.gif";
        posX += 2;
        posY -=2;
        col.setxSuperior(posX);
        col.setxInferior(posX + ancho);
        col.setySuperior(posY);
        col.setyInferior(posY + alto);
        System.out.println("PosYsuperior: " + col.getySuperior());
        System.out.println("PosYinferior " + col.getyInferior());
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

    public Colisionador getCol() {
        return col;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
