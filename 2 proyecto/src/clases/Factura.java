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
 * @author jpayares4
 */
public class Factura implements java.io.Serializable {

    private String fecha;
    private String nfactura;
    private String fpago;
    private Computadores equipo;
    private Cliente cliente;
    
   

    public Factura(String fecha, String nfactura, String fpago, Cliente cliente, Computadores equipo) {
        this.fecha = fecha;
        this.nfactura = nfactura;
        this.fpago = fpago;
        this.equipo = equipo;
        this.cliente = cliente;
       
      
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNfactura() {
        return nfactura;
    }

    public void setNfactura(String nfactura) {
        this.nfactura = nfactura;
    }

    public String getFpago() {
        return fpago;
    }

    public void setFpago(String fpago) {
        this.fpago = fpago;
    }

    public Computadores getEquipo() {
        return equipo;
    }

    public void setEquipo(Computadores equipo) {
        this.equipo = equipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void guardar(ObjectOutputStream salida) throws IOException {
        salida.writeObject(this);
    }

}
