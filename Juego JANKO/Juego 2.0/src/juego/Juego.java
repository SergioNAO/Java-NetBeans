
package juego;

import control.Teclado;
import graficos.Pantalla;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import mapa.Mapa;
import mapa.MapaCargado;
import mapa.MapaGenerado;

public class Juego extends Canvas implements Runnable{
    
    private static final long serialVersionUID = 1L;    
    
    private static final int ANCHO = 800;
    private static final int ALTO = 600;
     
    private static volatile boolean enFuncionamiento = false;
    
    private static final String NOMBRE = "Juego";
    
    private static int aps=0;
    private static int fps=0;
    
    private static int x=0;
    private static int y=0;
  
    private static JFrame ventana;
    private static Thread thread;
    private static Teclado teclado;
    private static Pantalla pantalla;
    
    private static Mapa mapa;
    
    private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO, BufferedImage.TYPE_INT_RGB);
    private static int []pixeles =((DataBufferInt)imagen.getRaster().getDataBuffer()).getData();
    

    private Juego (){
    setPreferredSize(new Dimension(ANCHO, ALTO));
    
    pantalla=new Pantalla(ANCHO, ALTO);
     
    //mapa = new MapaGenerado(64,64);
    mapa=new MapaCargado("/mapas/Mapa_Pixeliado1.png");
    teclado =new Teclado();
    addKeyListener(teclado); 
    
    ventana = new JFrame(NOMBRE);
    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ventana.setResizable(false);
    ventana.setLayout(new BorderLayout());
    ventana.add(this, BorderLayout.CENTER);
    ventana.pack();
    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);
    }
    
    public static void main(String[] args){
    Juego juego = new Juego();
    juego.iniciar();
    }
    
    public synchronized void iniciar(){
     enFuncionamiento = true;   
        
    thread =new Thread(this, "Graficos");
    thread.start();
    }
    
    public synchronized void detener(){
    enFuncionamiento = false;
    
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void actualizar(){
        teclado.actualizar(); 
        if(teclado.arriba){y--;}
        if(teclado.abajo){y++;}
        if(teclado.izquierda){x--;}
        if(teclado.derecha){x++;}
        
        
    aps++;
    }
    
    private void mostrar(){
    BufferStrategy estrategia= getBufferStrategy();
    if(estrategia==null){
        createBufferStrategy(3);
        return;
    }
    
    //pantalla.limpiar();
    mapa.mostrar(x, y, pantalla);
    
    
    System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
       //for(int i=0;i<pixeles.length;i++){
      //  pixeles[i]= pantalla.pixeles[i];}
    
Graphics g= estrategia.getDrawGraphics();
g.drawImage(imagen, 0, 0, getWidth(),getHeight(),null);
        g.setColor(Color.blue);
        g.fillRect(ANCHO/2, ALTO/2, 16, 16);
        g.dispose();
        estrategia.show();
        fps++;
    
    }
    
    
    public void run() {
        final int NS_POR_SEGUNDO=1000000000;
        final byte APS_OBJETIVO=60;
        final double NS_POR_ACTUALIZACION=NS_POR_SEGUNDO/APS_OBJETIVO;
        
        long referenciaActualizacion= System.nanoTime();
        long referenciaContador = System.nanoTime();
        
        double tiempoTranscurrido;
        double delta = 0;
        
        requestFocus();
        
       while(enFuncionamiento){
           final long inicioBucle = System.nanoTime();
           tiempoTranscurrido= inicioBucle-referenciaActualizacion;
           referenciaActualizacion=inicioBucle;
           delta += tiempoTranscurrido/ NS_POR_ACTUALIZACION;
           
       while( delta >= 1) {
       actualizar();
       delta--;
       }    
       
       mostrar();
       
       if(System.nanoTime() - referenciaContador > NS_POR_SEGUNDO ){
       ventana.setTitle(NOMBRE + " || APS: "+aps+" || FPS: "+fps );
       aps=0; 
       fps=0;
       referenciaContador=System.nanoTime();
       }
       
       }
    }
    
}
