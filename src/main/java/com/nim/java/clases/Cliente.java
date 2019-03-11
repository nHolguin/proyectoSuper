
package com.nim.java.clases;

/**
 *
 * @author Nimrod
 */
public class Cliente {
    
    private String nombreCliente;
    private int[] carritoCompra;

    public Cliente() {
    }

    public Cliente(String nombreCliente, int[] carritoCompra) {
        this.nombreCliente = nombreCliente;
        this.carritoCompra = carritoCompra;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int[] getCarritoCompra() {
        return carritoCompra;
    }

    public void setCarritoCompra(int[] carritoCompra) {
        this.carritoCompra = carritoCompra;
    }
    
}
