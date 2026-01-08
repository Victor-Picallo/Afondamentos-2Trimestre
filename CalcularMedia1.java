// Calcular Media con datos de la tabla de frecuencias
public class CalcularMedia1 {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        int[] f = {2, 3, 5, 4, 1};

        double media = Biblioteca.obtenerMediaDesdeTabla(x, f);
        System.out.println("La media es: " + media);
        
    }
}
