/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author carry
 */
public class Cronometro {
    private long start;
    private long stop;

    public void empezar() {
        start = System.nanoTime();
    }

    public void finalizar() {
        stop = System.nanoTime();
    }

    public long getTiempo() {
        return (stop - start);
    }

    public void reset() {
        start = 0;
        stop = 0;
    }
}