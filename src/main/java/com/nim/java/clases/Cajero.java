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
public class Cajero extends Thread {

    private String nombreCajero;
    private Cliente cliente;
    private long tiempoInicial;

    public Cajero() {
    }

    public Cajero(String nombreCajero, Cliente cliente, long tiempoInicial) {
        this.nombreCajero = nombreCajero;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    public String getNombreCajero() {
        return nombreCajero;
    }

    public void setNombreCajero(String nombreCajero) {
        this.nombreCajero = nombreCajero;
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

        System.out.println("El Cajero " + getNombreCajero() + " está comenzando a procesar la compra de "
                + this.cliente.getNombreCliente() + " en "
                + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg. \n");

        for (int i = 0; i < this.cliente.getCarritoCompra().length; i++) {
            this.segundosEsperando(cliente.getCarritoCompra()[i]);
            System.out.println("El producto " + (i + 1) + " del cliente " + this.cliente.getNombreCliente()
                    + " ha sido procesado en " + (System.currentTimeMillis() - this.tiempoInicial) / 1000 + " seg.");
        }

        System.out.println("El cajero " + this.nombreCajero + " ha terminado de procesar el requerimiento de "
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
