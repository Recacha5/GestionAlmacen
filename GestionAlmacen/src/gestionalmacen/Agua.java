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
public final class Agua extends Bebida {
    
    private String procedencia;

    public Agua(String procedencia, double litros, double precio, String marca) {
        super(litros, precio, marca);
        this.procedencia = procedencia;
    }

    /**
     * @return the procedencia
     */
    public String getProcedencia() {
        return procedencia;
    }

    /**
     * @param procedencia the procedencia to set
     */
    public void setProcedencia(String procedencia) {
        this.procedencia = procedencia;
    }

    @Override
    public String toString() {
        return super.toString() + "Procedencia: " + procedencia;
    }
    
    
    
}
