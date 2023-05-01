/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;


/**
 *
 * @author folis
 */
// defino la main
public class Array {

    public static void main(String[] args) {
// array
        ArrayList<int[]> arrays = new ArrayList<>();
        arrays.add(new int[100]);
        arrays.add(new int[1000]);
        arrays.add(new int[10000]);
        arrays.add(new int[100000]);

// llenar
arrays.forEach((arr) -> {
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
    }
        });

// tiempo
        Cronometro _cronometro = new Cronometro();

        arrays.stream().map((arr) -> {
            _cronometro.empezar();
            Arrays.sort(arr);
            return arr;
        }).map((arr) -> {
            _cronometro.finalizar();
            System.out.println("Tiempo para ordenar un array de " + arr.length + " elementos: " + _cronometro.getTiempo() + " nanosegundos");
            return arr;
        }).forEachOrdered((_item) -> {
            _cronometro.reset();
        });
    }
}
