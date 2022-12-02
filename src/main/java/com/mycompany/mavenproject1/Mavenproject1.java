/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;
import com.mycompany.storage;
import com.mycompany.ventas;
import javax.swing.JOptionPane;
/**
 *
 * @author Jotas
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        int tamaño_inventario=3,tamaño_ventas = 3;
        ventas venta[]= new ventas[tamaño_ventas];
        storage Inventario[]=new storage[tamaño_inventario];
        
        Inventario[0]=new storage(1,"Pan de bono",50,2000);
        Inventario[1]=new storage(2,"Pan de yuca",50,2000);
        Inventario[2]=new storage(3,"Pan de bono",50,2000);
        int opcion=0;
        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog( "Menú Principal de ingreso"
                    + "\n 1. Administrador"
                    + "\n 2. Registrador"
                    + "\n 3. Contador"
                    + "\n"
                    + "\n 4. Salir"));
        switch(opcion)
        {
            case 1: 
                Vistas.Administrador(Inventario,tamaño_inventario);
                break;
            case 2:
                Vistas.Registrador(Inventario, venta, tamaño_ventas, tamaño_inventario);
                break;
            case 3: 
                Vistas.Contador(venta, tamaño_ventas);
                break;
            default:    
        }    
        }while(opcion!=4);
        
    }
    
}
