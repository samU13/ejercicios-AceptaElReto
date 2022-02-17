import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n;

        n = teclado.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("Hola mundo.");
        }
    }
}
