public class rango1 {

    public static void main(String[] args) {
        int[] lista = {5, 3, 8, 1, 4, 7, 9, 2, 6, 5, 3, 8, 1, 4, 7, 9, 2, 6, 5, 3, 8, 1, 4, 7, 9, 2, 6};

        int rango = Biblioteca.obtenerRango(lista);
        System.out.println("El rango es: " + rango);

        double media = Biblioteca.obtenerMedia(lista);
        double exp = media/rango;

        System.out.println("La media es: " + media);
        System.out.println("La esperanza es: " + exp);
    }
    
}
