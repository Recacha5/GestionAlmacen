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
public final class Azucaradas extends Bebida {
    
    private boolean promocion;
    private double porcentajeAzucar;

    public Azucaradas(boolean promocion, double porcentajeAzucar, double litros, double precio, String marca) {
        super(litros, precio, marca);
        this.promocion = promocion;
        this.porcentajeAzucar = porcentajeAzucar;
    }

    /**
     * @return the promocion
     */
    public boolean isPromocion() {
        return promocion;
    }

    /**
     * @param promocion the promocion to set
     */
    public void setPromocion(boolean promocion) {
        this.promocion = promocion;
    }

    /**
     * @return the porcentajeAzucar
     */
    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    /**
     * @param porcentajeAzucar the porcentajeAzucar to set
     */
    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    public double getPrecio() {
        if (isPromocion()) {
            return super.getPrecio()*0.9;
        }else{
            return super.getPrecio();
        }
        
    }

    @Override
    public String toString() {
        return super.toString() + "Porcentaje de Azúcar: " + porcentajeAzucar + "%";
    }

    
}
