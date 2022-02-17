import java.util.Scanner;

public class Chicles {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long numEnvoltorios,numRegalo, numChicles, numComidos, numEnvoltoriosRestantes;

        while (true) {
            numEnvoltoriosRestantes = 0;
            numComidos = 0;
            numEnvoltorios = teclado.nextInt();
            if (numEnvoltorios == 0) {
                break;
            }
            numRegalo = teclado.nextInt();
            numChicles = teclado.nextInt();
            if (numRegalo >= numEnvoltorios && numChicles >= numEnvoltorios) {
                System.out.println("RUINA");
            } else if (numRegalo == 0) {
                numComidos = numChicles;
                System.out.println(numComidos + " " + numChicles);
            } else {
                while (numChicles > 0) {
                    numComidos += numChicles;
                    numEnvoltoriosRestantes += numChicles;
                    numChicles = numEnvoltoriosRestantes / numEnvoltorios * numRegalo;
                    numEnvoltoriosRestantes -= numEnvoltoriosRestantes / numEnvoltorios * numEnvoltorios;
                }
                System.out.println(numComidos + " " + numEnvoltoriosRestantes);
            }
        }
    }

}
