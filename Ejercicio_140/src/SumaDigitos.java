import java.util.Scanner;

public class SumaDigitos {




        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int entrada, valor;
            int suma = 0;
            String cadena = " = ";

            entrada = teclado.nextInt();
            while (entrada >= 0) {
                if (entrada == 0) {
                    valor = 0;
                    cadena = valor + cadena;
                } else {
                    while (entrada > 0) {
                        if (entrada < 10) {
                            cadena = (entrada % 10) + cadena;
                            valor = entrada % 10;
                            entrada /= 10;
                            suma += valor;
                        } else {
                            cadena = " + " + (entrada % 10) + cadena;
                            valor = entrada % 10;
                            entrada /= 10;
                            suma += valor;
                        }
                    }
                }
                cadena = cadena + suma;
                System.out.println(cadena);
                entrada = teclado.nextInt();
                cadena = " = ";
                suma = 0;
            }

        }

    }

