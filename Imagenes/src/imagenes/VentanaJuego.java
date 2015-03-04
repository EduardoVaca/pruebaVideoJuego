/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imagenes;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;

/**
 *
 * @author Eduardo
 */
public class VentanaJuego extends JFrame  implements KeyListener{
    
    private long tiempoInicial = System.currentTimeMillis();
    private long tiempoActual = tiempoInicial;
    private long periodoRepintado = 32;
    Personaje homero = new Personaje("homer.png");
    
    public static VentanaJuego instancia = null;
    //Es estatico para que no sea necesario crear un objeto para acceder a esta instancia 
    public static VentanaJuego Singleton()
    {

        if(instancia == null)
        {
            instancia = new VentanaJuego();
            instancia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            instancia.setBounds(100, 100, 800, 640);  
            instancia.setVisible(true);
            instancia.createBufferStrategy(2);
            instancia.addKeyListener(instancia);

            
        }
        return instancia;
    }
    
    @Override
    public void paint(Graphics g)
    {
        tiempoActual = System.currentTimeMillis();
        if(tiempoActual - tiempoInicial >= periodoRepintado){
            tiempoInicial = tiempoActual;
            //Se recupera el buffer
            //Se deja que pase un vez al menos para empezar a cambiar el dibujo
            BufferStrategy buffer = Singleton().getBufferStrategy();
            if(buffer != null)
            {
                Graphics segundoBuffer = buffer.getDrawGraphics();
                //mostrar imagen de la carpeta
                segundoBuffer.drawImage(Imagenes.Singleton().imagen("city.jpg"), 0, 0, null);
                segundoBuffer.drawImage(Imagenes.Singleton().imagen(homero.getNombre()), homero.getPosX(), homero.getPosY(), null);
                buffer.show();
            }
            
        }
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_RIGHT: homero.corre();
                                    break;
            case KeyEvent.VK_UP: homero.salta();
                                    break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        homero.setNombre("homer.png");
        
    }

}
