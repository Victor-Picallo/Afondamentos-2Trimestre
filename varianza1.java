public class varianza1 {

    public static void main(String[] args) {
        int[] lista = {4, 0, 7, 2, 9, 1, 5, 8, 3, 6, 2, 0, 9, 4, 7, 1, 5, 8, 3, 2};

        double varianza = Biblioteca.obtenerVarianza(lista);
        double desviacionEstandar = Biblioteca.obtenerDesviacionEstandar(lista);
        double coeficienteVariacion = Biblioteca.obtenerCoeficienteVariacion(lista);

        System.out.println("La varianza es: " + varianza);
        System.out.println("La variacion estandar es: " + Biblioteca.obtenerDesviacionEstandar(lista));
        System.out.println("El coeficiente de variacion es: " + coeficienteVariacion);
        System.out.println("Expresado en porcentaje es: " + (coeficienteVariacion * 100) + "%");
        System.out.println("Cuanto mas cerca de 0 menos variabilidad hay en los datos || Cuanto mas cerca de 100 mas variabilidad hay.");
    }


    
}
