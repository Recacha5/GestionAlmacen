/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalmacen;

/**
 *
 * @author Alex Recacha
 */
public class Almacen {
    private Bebida mEstanteria[][];

    public Almacen(int filas, int columnas) {
        mEstanteria = new Bebida[filas][columnas];
    }
    
    
    public double precioTotal(){
        
        
        
        return 2.2;
    }
    
    public double precioTotalMarca(String marca){
        
        
        
        return 2.2;
    }
    
    public double precioTotalColumna(int columna){
        
        
        
        return 2.2;
    }
    
    public boolean agregarProducto(Bebida bebida){
        
        
        
        return true;
    }
    
    public boolean eliminarProducto(int id){
        
        
        
        return true;
    }
    
    public void mostrarInfoAlmacen(){
        
        System.out.println();
        
    }
    
    
    
}
