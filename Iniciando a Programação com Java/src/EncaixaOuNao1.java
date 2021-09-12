import java.util.Arrays;
import java.util.Scanner;

public class EncaixaOuNao1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();
        String a = "", b = "";
        String[] c;
        scan.nextLine();

        for (int i = 0; i < count; i++) {
            c = scan.nextLine().split(" ");
            a = c[0];
            b = c[1];


            if (a.length() >= b.length()) {
                if (a.subSequence(a.length() - b.length(), a.length()).equals(b)) System.out.println("encaixa");
                else System.out.println("nao encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }


    }
}
