/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Jotas
 */
public class storage {  
    public int id;
    public String nombre_producto;
    public int Cantidad; 
    public int precio;
    
    public storage(int id,String nombre_producto, int Cantidad, int precio){
        this.id=id;
        this.nombre_producto=nombre_producto;
        this.Cantidad=Cantidad;
        this.precio=precio;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre_producto() {
        return nombre_producto;
    }
    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }  
}
