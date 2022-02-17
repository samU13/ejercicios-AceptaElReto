import java.util.Scanner;

public class CuantosDias {



        public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);

            int n, dia, mes, sumaDias;

            n = teclado.nextInt();

            for (int i = 0; i < n; i++) {

                dia = teclado.nextInt();
                mes = teclado.nextInt();


                sumaDias = switch (mes) {
                    case 1 -> dia;
                    case 2 -> 31 + dia;
                    case 3 -> 59 + dia;
                    case 4 -> 90 + dia;
                    case 5 -> 120 + dia;
                    case 6 -> 151 + dia;
                    case 7 -> 181 + dia;
                    case 8 -> 212 + dia;
                    case 9 -> 243 + dia;
                    case 10 -> 273 + dia;
                    case 11 -> 304 + dia;
                    case 12 -> 334 + dia;
                    default -> 0;
                };

                System.out.println(365 - sumaDias);


            }

        }
    }

