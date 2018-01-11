/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionalmacen;

import Menus.Menu;
import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class GestionAlmacen {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean bandera = true;
        int fila = 0, columna = 0;
        
        
        System.out.println("Dime las dimensiones de tu estantería");
        System.out.print("Filas: ");
        fila = sc.nextInt();
        System.out.print("Columnas: ");
        columna = sc.nextInt();
        
        Almacen almacen = new Almacen(fila, columna);
        
        while (bandera){
            Scanner leer = new Scanner (System.in);
            switch(Menu.pintaMenu()){

                case 1: almacen.precioTotal();
                        
                        break;
                case 2: System.out.println("Dime la marca.");
                        almacen.precioTotalMarca(leer.nextLine());
                        break;
                case 3: almacen.precioTotalColumna(leer.nextInt());
                        break;
                case 4: 
                        break;
                case 5:
                        break;
                case 6: 
                        break;
                case 7: bandera = false;
                        break;
                

            }
        }
    }
    
}
