import java.util.Scanner;

public class Escudos {
    public static void main(String[] args) {

        int numeroSoldados, restoDeSoldados, ladoFormacion, escudosSuperiores, escudosLaterales, totalEscudos;

        Scanner teclado = new Scanner(System.in);

        numeroSoldados = teclado.nextInt();

        while (numeroSoldados != 0) {
            totalEscudos = 0;
            restoDeSoldados = numeroSoldados;
            while (restoDeSoldados > 0) {

                ladoFormacion = (int) Math.sqrt(restoDeSoldados);
                escudosSuperiores = (int) Math.pow(ladoFormacion, 2);
                escudosLaterales = ladoFormacion * 4;
                totalEscudos += escudosSuperiores + escudosLaterales;
                restoDeSoldados = restoDeSoldados - escudosSuperiores;

            }
            System.out.println(totalEscudos);
            numeroSoldados = teclado.nextInt();
        }
    }
}
