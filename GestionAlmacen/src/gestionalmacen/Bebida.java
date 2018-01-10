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
public abstract class Bebida {

    public static int cantidadBebidas;
    protected int id;
    protected double litros;
    protected double precio;
    protected String marca;

    public Bebida(double litros, double precio, String marca) {
        this.id = cantidadBebidas++;
        this.litros = litros;
        this.precio = precio;
        this.marca = marca;
    }
    /**
     * @return the litros
     */
    public double getLitros() {
        return litros;
    }

    /**
     * @param litros the litros to set
     */
    public void setLitros(double litros) {
        this.litros = litros;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Litros: " + litros + ", precio: " + precio + ", marca: " + marca;
    }

    /**
     * @return the cantidadBebidas
     */
    public static int getCantidadBebidas() {
        return cantidadBebidas;
    }

    /**
     * @param aCantidadBebidas the cantidadBebidas to set
     */
    public static void setCantidadBebidas(int aCantidadBebidas) {
        cantidadBebidas = aCantidadBebidas;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
