import java.util.Scanner;

public class relojespejo {

    public static void main(String[] args) {

        final Scanner s = new Scanner(System.in);

        int horas, mins, casos = s.nextInt();
        String [] horaEspejo;
        s.nextLine();

        for (int i = 0; i < casos; i++) {

            horaEspejo = s.nextLine().split(":");
            horas = Integer.parseInt(horaEspejo[0]);
            mins  = Integer.parseInt(horaEspejo[1]);

            mins = 60 - mins;
            if (mins == 60){
                mins = 0;
            }
            horas = 12 - horas;

            if (mins != 0){
                horas--;
            }
            horas = (horas + 12) % 12;
            if (horas == 0) {
                horas = 12;
            }

            System.out.printf("%02d:%02d\n", horas, mins);
        }

    }

}

