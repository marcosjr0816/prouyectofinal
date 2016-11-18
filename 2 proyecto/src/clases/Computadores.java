/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author rmorales1
 */
public class Computadores implements java.io.Serializable{
     private String codigo;
      private String cantidad;
    private String procesador;
    private String precio;
    private String discoduro;
    private String pantalla;
    private String ram;
   private String marca;
     private String color;
    private String tipo;
private String sistema ;


    
    public Computadores(String codigo,String cantidad,String procesador, String discoduro, String pantalla, String marca,String sistema,  String tipo, String precio, String color, String ram) {
       this.codigo = codigo;
        this.cantidad = cantidad;
        this.procesador = procesador;
        this.precio = precio;
        this.discoduro = discoduro;
           this.color = color;
        this.pantalla = pantalla;
         this.ram = ram;
        this.marca = marca;
        this.tipo = tipo;
        this.sistema = sistema;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    

    

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(String discoduro) {
        this.discoduro = discoduro;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public void guardar(ObjectOutputStream salida) throws IOException{
        salida.writeObject(this);
    }
    
    
            
}
