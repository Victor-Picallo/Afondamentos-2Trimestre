import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class EstadisticasApiStreams {

    //Estadisticas con Api Streams
    public static void main(String[] args) {
        int[] miColeccion = {4, 0, 7, 2, 9, 1, 5, 8, 3, 6, 2, 0, 9, 4, 7, 1, 5, 8, 3, 2};

        //1.- Usamos IntSummaryStatistic para las estadisticas basicas
        IntSummaryStatistics stats = Arrays.stream(miColeccion).summaryStatistics();

        //Estadisticas basicas
        System.out.println("Estadisticas basicas con Api Streams:");
        System.out.println("Cantidad de elementos: " + stats.getCount());
        System.out.println("Suma: " + stats.getCount());
        System.out.println("Minimo: " + stats.getMin());
        System.out.println("Maximo: " + stats.getMax());
        System.out.println("Suma: " + stats.getSum());
        System.out.println("Media: " + stats.getAverage());

        //2.- Para la varianza (Necesitamos un paso extra con map)
        double media = stats.getAverage();
        double varianza = Arrays.stream(miColeccion)
                                .mapToDouble(x -> Math.pow(x - media, 2))
                                .average()
                                .orElse(0.0);

        //3.- Coeficiente de variacion (Media relativa)
        double desviacionTipica = Math.sqrt(varianza);
        double cv = (desviacionTipica / media) * 100;

        System.out.println("Estadisiticas avanzadas con Api Streams:");
        System.out.println("Varianza: " + varianza);
        System.out.println("Desviacion tipica: " + desviacionTipica);
    }

}
