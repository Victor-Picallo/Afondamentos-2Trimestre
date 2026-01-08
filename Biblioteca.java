import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    
    // Metodo para obtener la moda
    public static int obtenerModa(int[] lista) {
        HashMap<Integer, Integer> frecuencias = new HashMap<>();

        // 1. Llenar el mapa con las frecuencias
        for (int x : lista) {
            frecuencias.put(x, frecuencias.getOrDefault(x, 0) + 1);
        }

        // 2. Buscar el valor con la frecuencia máxima
        int moda = lista[0];
        int maxFrecuencia = 0;

        for (Map.Entry<Integer, Integer> entrada : frecuencias.entrySet()) {
            if (entrada.getValue() > maxFrecuencia) {
                maxFrecuencia = entrada.getValue();
                moda = entrada.getKey();
            }
        }

        return moda;
    }

    // Obtener la media
    public static double obtenerMediaDesdeTabla(int[] x, int[] f) {
        double sumaProductos = 0;
        int totalDatos = 0;

        for (int i = 0; i < x.length; i++) {
            sumaProductos += x[i] * f[i];
            totalDatos += f[i];
        }

        if (totalDatos == 0) return 0; // Evita division por 0

        return sumaProductos / totalDatos;
    }

    //Metodo para obtener datos de la tabla de frecuencias
}