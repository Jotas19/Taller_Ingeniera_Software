/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Jotas
 */
public class ventas extends storage{
    
    public int id_venta;
    public int Cantidad_venta; 
    public int total;

    public ventas(int id, String nombre_producto, int Cantidad, int precio, int id_venta, int Cantidad_venta, int total) {
        super(id, nombre_producto, Cantidad, precio);
        this.id_venta=id_venta;
        this.Cantidad_venta=Cantidad_venta;
        this.total=total;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getCantidad_venta() {
        return Cantidad_venta;
    }

    public void setCantidad_venta(int Cantidad_venta) {
        this.Cantidad_venta = Cantidad_venta;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNombre_producto() {
        return nombre_producto;
    }

    @Override
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    @Override
    public int getCantidad() {
        return Cantidad;
    }

    @Override
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
