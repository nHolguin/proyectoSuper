/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nim.java.clases;

/**
 *
 * @author Nimrod
 */
public class Cajero implements Runnable {

    private Cliente cliente;
    private long tiempoInicial;

    public Cajero(Cliente cliente, long tiempoInicial) {
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

    
    
    @Override
    public void run() {

        System.out.println("El Cajero " + Thread.currentThread().getName() 
                + " está comenzando a procesar la compra de "
                + this.cliente.getNombreCliente() + " en "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg.");

        for (int i = 0; i < this.cliente.getCarritoCompra().length; i++) {
            this.segundosEsperando(cliente.getCarritoCompra()[i]);
            System.out.println("El producto " + (i + 1) + " del cliente " + this.cliente.getNombreCliente()
                    + " ha sido procesado en " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg.");
        }

        System.out.println("El cajero " + Thread.currentThread().getName()
                + " ha terminado de procesar el requerimiento de "
                + this.cliente.getNombreCliente() + " en" + " ha sido procesado en "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg.");

    }

    private void segundosEsperando(int segundos) {

        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }

}
