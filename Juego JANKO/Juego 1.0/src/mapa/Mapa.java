package mapa;

import graficos.Pantalla;
import mapa.cuadro.Cuadro;

public abstract class Mapa {
    protected int ancho;
    protected int alto;
    
    protected int[]cuadros;
    
    public Mapa(int ancho, int alto){
        this.ancho=ancho;
        this.alto=alto;
        cuadros = new int[ancho*alto];
        generarMapa();
        
    }
    public Mapa(String ruta){
        cargarMapa(ruta);
    }
    protected void generarMapa(){  }
    
    private void cargarMapa(String ruta){   }
    
    public void actualizar(){  }
    
    public void mostrar(int compensacionX,int compensacionY,Pantalla pantalla){
        
        pantalla.estableceDiferencia(compensacionX, compensacionY);
        
        int o=compensacionX >>4;// es =/16
        int e=(compensacionX+pantalla.obtenAncho()+ Cuadro.LADO) >>4;
        int n=compensacionY >>4;
        int s=(compensacionY+pantalla.obtenAlto()+ Cuadro.LADO) >>4;
        
        for(int y =n; y<s ;y++){
           for(int x=o; x<e ;x++){
             obtenCuadro(x,y).mostrar(x, y, pantalla);
        
             } 
        }
    }
    public Cuadro obtenCuadro(final int x, final int y){
       if(x < 0 ||y < 0 || x >= ancho|| y >= alto){ return Cuadro.Vacio; }
        switch(cuadros[x+y*ancho]){
            case 0:  return Cuadro.ASFALTO;
            case 1: 
            case 2:    
            case 3:
            
            default: 
                return Cuadro.Vacio;
        
        
        }
        
        
        
    }
    
    
}
