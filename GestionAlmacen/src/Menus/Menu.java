/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.util.Scanner;

/**
 *
 * @author Alex Recacha
 */
public class Menu {
    
    public static int pintaMenu(){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("----------Menú Almacén----------");
        System.out.println("1- Precio de todas las bebidas.");
        System.out.println("2- Precio total de una marca.");
        System.out.println("3- Precio de una estantería.");
        System.out.println("4- Agregar producto.");
        System.out.println("5- Eliminar un producto.");
        System.out.println("6- Ver todos los productos.");
        System.out.println("7- Salir.");
        System.out.println("--------------------------------");
        
        System.out.println("Dime una opcion...");
        return sc.nextInt();
    }
    
}
