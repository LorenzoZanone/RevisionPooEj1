/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciorevision;


/**
 *
 * @author ET36
 */
public class Accesorio extends Producto {
    
    private double peso;
    private String metal;
    
    public Accesorio(double peso, String metal, String desc, double precio) {
        super(desc, precio);
        this.peso = peso;
        this.metal = metal;
    }
    
    @Override
    public double CalcularPrecio() {
        double preciofinal = 0;
        if (metal.equalsIgnoreCase("Oro")) {
            preciofinal = peso * 100;
        } else if (metal.equalsIgnoreCase("Plata")) {
            preciofinal = peso * 50;
            
        } else if (metal.equalsIgnoreCase("Acero")) {
            preciofinal = peso * 25;
            
        }
        return preciofinal;
        
    }
    
    @Override
    public double getPrecio() {
        return precio;
    }
    
    @Override
    public String toString() {
        return "Bijouterie";
    }
    
}
