public class moda1 {

    //forma tipica de presentar variable 
    public static void main(String[] args) {
        // Datos de ejemplo (basados en el ejercicio anterior)
        int[] datos = {0, 1, 1, 2, 0, 3, 1, 2, 1, 1, 0, 2, 4, 1, 2, 1, 0, 2, 3, 1};

        int moda = Biblioteca.obtenerModa(datos);
        System.out.println("La moda de los datos es: " + moda);
    }

    
}
