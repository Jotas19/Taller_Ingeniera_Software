/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import com.mycompany.storage;
import com.mycompany.ventas;
import javax.swing.JOptionPane;
/**
 *
 * @author Jotas
 */
public class Vistas {
    public static void Administrador(storage[] Inventario, int tamaño_inventario)
    {
        int opcion=0;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog( "Bienvenido Administrador."
                    + "\n 1. Ver Inventario"
                    + "\n 2. Agregar Inventario"
                    + "\n 3. Eliminar Inventario"
                    + "\n 4. Modificar Inventario"
                    + "\n"
                    + "\n 5. Salir"));
        switch(opcion)
        {
            case 1:
                metodos.ver_inventario(Inventario);
                break;
            case 2: 
                metodos.agregar_inventario(Inventario, tamaño_inventario);
                tamaño_inventario++; 
                break;
            case 3:
                metodos.eliminar_inventario(Inventario, tamaño_inventario);
                break;
            case 4:
                metodos.modificar_inventario(Inventario, tamaño_inventario);
                break;
            default:    
        }
            
        }while(opcion!=4);   
    }
    public static void Registrador(storage[] Inventario, ventas[] venta, int tamaño_ventas, int tamaño_inventario)
    {
        int opcion=0;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog( "Bienvenido Registrador."
                    + "\n 1. Ingresar Venta"
                    + "\n 2. Modificar Venta"
                    + "\n 3. Eliminar Venta"
                    + "\n"
                    + "\n 4. Salir"));
        switch(opcion)
        {
            case 1: 
                metodos.agregar_venta(Inventario,venta, tamaño_ventas, tamaño_inventario);
                break;
            case 2:
                metodos.modificar_venta(Inventario, venta, tamaño_ventas);
                break;
            case 3: 
                metodos.eliminar_venta(venta, tamaño_ventas);
                break;
            default:    
        }
            
        }while(opcion!=4); 
        
    }
    public static void Contador(ventas[] venta, int tamaño_ventas)
    {
        {
        int opcion=0;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog( "Bienvenido Contador."
                    + "\n 1. Revisar ventas"
                    + "\n 2. Ingresos y egresos"
                    + "\n 3. Reporte financiero"
                    + "\n"
                    + "\n 4. Salir"));
        switch(opcion)
        {
            case 1:
                metodos.ver_ventas(venta);
                break;
            case 2:
                metodos.ingresos_y_egresos();
                break;    
            case 3: 
                
                
            default:    
        }
            
        }while(opcion!=4);    
        }
    } 
}
