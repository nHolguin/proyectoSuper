
package com.nim.java.proyectosuper;

import com.nim.java.clases.Cajero;
import com.nim.java.clases.Cliente;

/**
 *
 * @author Nimrod
 */
public class Main {

    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Miguel",new int [] {1,5,3,2,4});
        Cliente cliente2 = new Cliente("Susana",new int [] {7,2,6,4,1,3,5});
        
        long tiempoInicial = System.currentTimeMillis();
        
        Cajero cajero1 = new Cajero("Carlos", cliente1, tiempoInicial);
        Cajero cajero2 = new Cajero("Marta", cliente2, tiempoInicial);
        
        cajero1.start();
        cajero2.start();
        
    }
    
}
