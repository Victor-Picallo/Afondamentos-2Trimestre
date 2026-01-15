public class varianza1 {

    public static void main(String[] args) {
        int[] lista = {5, 3, 8, 1, 4, 7, 9, 2, 6, 5, 3, 8, 1, 4, 7, 9, 2, 6, 5, 3, 8, 1, 4, 7, 9, 2, 6};

        double varianza = Biblioteca.obtenerVarianza(lista);
        System.out.println("La varianza es: " + varianza);
    }
    
}
