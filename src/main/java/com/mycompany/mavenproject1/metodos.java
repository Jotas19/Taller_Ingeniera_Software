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
class metodos {
    int opcion=0;
    public metodos()
    {
         
    }
    public static void ver_ventas(ventas[] venta)
    {
        int i=0;
        for (i=0;i<venta.length;i++)
        {
            JOptionPane.showMessageDialog(null, "Los productos en inventario son: "
                    + "\n ID: "+venta[i].id_venta
                    + "\n Nombre del producto: "+venta[i].nombre_producto
                    + "\n Cantidad: "+venta[i].Cantidad_venta
                    + "\n Precio: "+venta[i].total);
        }  
    }
    public static void agregar_venta(storage[] Inventario, ventas[] venta, int tamaño_ventas, int tamaño_inventario)
    {
        int buscar_producto=0;
        int posicion_producto=0;
        int id_producto=0;
        int Cantidad, total,id; 
        JOptionPane.showMessageDialog(null, "Los productos en inventario son: ");
        for (int j=0;j<Inventario.length;j++)
        {
            JOptionPane.showMessageDialog(null, ""
                    + "\n Id: "+Inventario[j].id
                    + "\n Nombre: "+Inventario[j].nombre_producto
                    + "\n Cantidad: "+Inventario[j].Cantidad
                    + "\n Precio: "+Inventario[j].precio);
        } 
        id_producto = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del producto a ingresar "));
        for (int i=0;i<Inventario.length;i++)
        {
            if(id_producto==Inventario[i].id)
            {
                posicion_producto=Inventario[i].id;
                JOptionPane.showMessageDialog(null, "El producto que desea es: "
                    + "\n Nombre: "+Inventario[i].nombre_producto
                    + "\n Cantidad: "+Inventario[i].Cantidad
                    + "\n Precio: "+Inventario[i].precio);
                
            }
        }
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto que desea"));
        total=Cantidad *Inventario[posicion_producto].getPrecio();
        venta[tamaño_ventas].setId_venta(1);
        venta[tamaño_ventas].setCantidad_venta(Cantidad);
        venta[tamaño_ventas].setTotal(total);
        tamaño_ventas++;
        
    }
    public static void modificar_venta(storage Inventario[], ventas[] venta, int tamaño_ventas)
    {
        int buscar_producto=0;
        int posicion_producto=0;
        int id_producto=0;
        int Cantidad, total,id; 
        JOptionPane.showMessageDialog(null, "Los productos en inventario son: ");
        for (int j=0;j<Inventario.length;j++)
        {
            JOptionPane.showMessageDialog(null, ""
                    + "\n Id: "+Inventario[j].id
                    + "\n Nombre: "+Inventario[j].nombre_producto
                    + "\n Cantidad: "+Inventario[j].Cantidad
                    + "\n Precio: "+Inventario[j].precio);
        } 
        id_producto = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del producto a ingresar "));
        for (int i=0;i<Inventario.length;i++)
        {
            if(id_producto==Inventario[i].id)
            {
                posicion_producto=Inventario[i].id;
                JOptionPane.showMessageDialog(null, "El producto que desea es: "
                    + "\n Nombre: "+Inventario[i].nombre_producto
                    + "\n Cantidad: "+Inventario[i].Cantidad
                    + "\n Precio: "+Inventario[i].precio);
                
            }
        }
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto que desea"));
        total=Cantidad *Inventario[posicion_producto].getPrecio();
        venta[tamaño_ventas].setId_venta(1);
        venta[tamaño_ventas].setCantidad_venta(Cantidad);
        venta[tamaño_ventas].setTotal(total);
        tamaño_ventas++;
        
    }
    public static void eliminar_venta(ventas[] venta, int tamaño_ventas)
    {
        int i=0;
        int eliminar_busqueda=0;
        for (i=0;i<venta.length;i++)
        {
            if(eliminar_busqueda==venta[i].id)
            {
                JOptionPane.showMessageDialog(null, "El producto que busca es: "
                    + "\n Nombre: "+venta[i].nombre_producto
                    + "\n Cantidad: "+venta[i].Cantidad
                    + "\n Precio: "+venta[i].precio);
            }
        }
        
    }
    public static void ver_inventario(storage Inventario[])
    {
        int i=0;
        for (i=0;i<Inventario.length;i++)
        {
            JOptionPane.showMessageDialog(null, "Los productos en inventario son: "
                    + "\n Nombre: "+Inventario[i].nombre_producto
                    + "\n Cantidad: "+Inventario[i].Cantidad
                    + "\n Precio: "+Inventario[i].precio);
        }  
    }
    public static void eliminar_inventario(storage[] Inventario, int tamaño_inventario){
        int i=0;
        int eliminar_busqueda=0;
        for (i=0;i<Inventario.length;i++)
        {
            if(eliminar_busqueda==Inventario[i].id)
            {
                JOptionPane.showMessageDialog(null, "El producto que busca es: "
                    + "\n Nombre: "+Inventario[i].nombre_producto
                    + "\n Cantidad: "+Inventario[i].Cantidad
                    + "\n Precio: "+Inventario[i].precio);
            }
        }
    }
    public static void agregar_inventario(storage[] Inventario, int tamaño_inventario)
    {
        int i=0;
        String nombre_producto;
        int Cantidad, precio,id; 
        tamaño_inventario++;
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del producto a ingresar "));
        nombre_producto = JOptionPane.showInputDialog("Digite el nombre del producto a ingresar");
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto a ingresar "));
        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto a ingresar "));
        
        Inventario[tamaño_inventario].setId(id);
        Inventario[tamaño_inventario].setNombre_producto(nombre_producto);
        Inventario[tamaño_inventario].setCantidad(Cantidad);
        Inventario[tamaño_inventario].setPrecio(precio);
 
    }
    
    public static void modificar_inventario(storage Inventario[], int tamaño_inventario)
    {
        int i=0;
        String nombre_producto;
        int Cantidad, precio,id; 
        tamaño_inventario++;
        id = Integer.parseInt(JOptionPane.showInputDialog("Digite el ID del producto a ingresar "));
        nombre_producto = JOptionPane.showInputDialog("Digite el nombre del producto a ingresar");
        Cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad del producto a ingresar "));
        precio = Integer.parseInt(JOptionPane.showInputDialog("Digite el precio del producto a ingresar "));
        
        Inventario[tamaño_inventario].setId(id);
        Inventario[tamaño_inventario].setNombre_producto(nombre_producto);
        Inventario[tamaño_inventario].setCantidad(Cantidad);
        Inventario[tamaño_inventario].setPrecio(precio);
        
    }
    public static void ingresos_y_egresos()
    { /*
        Map<String, Object[]> datos = new TreeMap<String, Object[]>();
        datos.put("1", new Object[]{"Identificador", "Nombre", "Apellidos"});
        datos.put("2", new Object[]{1, "María", "Remen"});
        datos.put("3", new Object[]{2, "David", "Allos"});
        datos.put("4", new Object[]{3, "Carlos", "Caritas"});
        datos.put("5", new Object[]{4, "Luisa", "Vitz"});
        */
    }
    public static void Reporte_financiero()
    {
        /*
        Map<String, Object[]> datos = new TreeMap<String, Object[]>();
        datos.put("1", new Object[]{"Identificador", "Nombre", "Apellidos"});
        datos.put("2", new Object[]{1, "María", "Remen"});
        datos.put("3", new Object[]{2, "David", "Allos"});
        datos.put("4", new Object[]{3, "Carlos", "Caritas"});
        datos.put("5", new Object[]{4, "Luisa", "Vitz"});
*/
        
    }
    
}
