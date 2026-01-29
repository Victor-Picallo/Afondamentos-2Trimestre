
public class ejercicio01 {
    public static void main(String[] args) {
        int[] notas = {
                6, 10, 5, 5, 4, 4, 6, 6, 5, 4,
                6, 7, 7, 5, 6, 3, 6, 7, 9, 5,
                6, 5, 7, 3, 8, 8, 4, 7, 8, 9
        };

        // Aplicamos los metodos
        System.out.println("Tendencia Central");
        System.out.println("Media: " + Biblioteca.obtenerMedia(notas));
        System.out.println("Mediana: " + Biblioteca.obtenerMediana(notas));
        System.out.println("Moda: " + Biblioteca.obtenerModa(notas));
        System.out.println("------------------------------------------");
        System.out.println("Medias de Dispersion");
        System.out.println("Rango: " + Biblioteca.obtenerRango(notas));
        System.out.println("Varianza: " + Biblioteca.obtenerVarianza(notas));
        System.out.println("Desviación estandar: " + Biblioteca.obtenerDesviacionEstandar(notas));
        System.out.println("Coeficiente de variacion: " + Biblioteca.obtenerCoeficienteVariacion(notas) * 100);
    }
}