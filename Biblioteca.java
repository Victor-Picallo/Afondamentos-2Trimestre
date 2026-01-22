import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
    //Metodo que agrupa datos en un hash map
    public static HashMap<Integer, Integer> agruparDatos(int[] lista) {
        HashMap<Integer, Integer> frecuencias = new HashMap<>();

        for (int x : lista) {
            frecuencias.put(x, frecuencias.getOrDefault(x, 0) + 1);
        }

        return frecuencias;
    }
    
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

    // Obetener media directamente de la lista
    public static double obtenerMedia(int[] lista) {
        double suma = 0;

        for (int x : lista) {
            suma += x;
        }

        return suma / lista.length;
    }

    // Obtener la mediana pasandole la lista en bruto sin ordenar
    public static double obtenerMediana(int[] lista) {
        int n = lista.length;
        int[] listaOrdenada = lista.clone();
        java.util.Arrays.sort(listaOrdenada);

        if (n % 2 == 1) {
            return listaOrdenada[n / 2];
        } else {
            return (listaOrdenada[(n / 2) - 1] + listaOrdenada[n / 2]) / 2.0;
        }
    }

    // Rango de datos 
    public static int obtenerRango(int[] lista) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        for (int x : lista) {
            if (x < min) min = x;
            if (x > max) max = x;
        }

        return max - min;
    }

    // Obtener varianza
    public static double obtenerVarianza(int[] lista) {
        double media = obtenerMedia(lista);
        double sumaDiferenciasCuadradas = 0;

        for (int x : lista) {
            sumaDiferenciasCuadradas += Math.pow(x - media, 2);
        }

        return sumaDiferenciasCuadradas / lista.length;
    }

    //Obetener desviacion estandar
    public static double obtenerDesviacionEstandar(int[] lista) {
        double varianza = obtenerVarianza(lista);
        return Math.sqrt(varianza);
    }

    //Varianza entre medi de variabilidad relativa para comparar distrubuciones
    public static double obtenerCoeficienteVariacion(int[] lista) {
        double media = obtenerMedia(lista);
        double desviacionEstandar = obtenerDesviacionEstandar(lista);
        if (media == 0) return 0; // Evita division por 0
        return desviacionEstandar / media;
    }
}