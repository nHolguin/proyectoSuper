
package com.nim.java.proyectosuper;

import com.nim.java.clases.Cajero;
import com.nim.java.clases.Cliente;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Nimrod
 */
public class Main {
    
    private static final int numeroCajeros = 2;

    public static void main(String[] args) {
        
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        long inicio = System.currentTimeMillis();
        
        clientes.add(new Cliente("Cliente 1", new int[] {1,1,5,4,2}));//13 seg
        clientes.add(new Cliente("Cliente 2", new int[] {2,3,5,4,1}));//15 seg
        clientes.add(new Cliente("Cliente 3", new int[] {3,4,5,1,2}));//15 seg
        clientes.add(new Cliente("Cliente 4", new int[] {4,1,5,2,1}));//12 seg
        clientes.add(new Cliente("Cliente 5", new int[] {3,2,5,3,2}));//15 seg
        clientes.add(new Cliente("Cliente 6", new int[] {2,1,5,1,5}));//14 seg
        
        ExecutorService executor = Executors.newFixedThreadPool(numeroCajeros);
        
        for(Cliente cliente: clientes) {
            Runnable cajera = new Cajero(cliente, inicio);
            executor.execute(cajera);
        }
        
        executor.shutdown();
        
        while(!executor.isTerminated()) {
            
        }
        
        long fin = System.currentTimeMillis();
        System.out.println("Tiempo de total del proceso "+(fin-inicio)/1000+" Seg.");
        
    }
    
}
