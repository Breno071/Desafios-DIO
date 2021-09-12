import java.util.Scanner;

public class SeisNumerosPares {
    public static void main(String[] args) {

        int cont = 0;


        Scanner leitor = new Scanner(System.in);
        int x = leitor.nextInt();

        while (cont < 6) {

            if (x % 2 == 1) {
                System.out.println(x);
                cont++;
            }
            x++;

        }

    }
}
