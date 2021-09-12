import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int contador = N;
        while (contador > 1){
            N = N * (contador - 1);
            contador--;
        }
        System.out.println(N);
    }
}
