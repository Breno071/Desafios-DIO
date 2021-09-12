import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();

        if (a < 0 || b < 0){
            a = Math.abs(a);
            b = Math.abs(b);
        }
        if (b % a == 0 || a % b == 0 ) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
