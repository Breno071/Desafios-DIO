import java.util.Scanner;

public class TempoDeJogo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inicio, fim, horas;
        inicio = scan.nextInt();
        fim = scan.nextInt();
        if (inicio < fim) {
            horas = fim - inicio;
        } else {
            horas = (24 - inicio) + fim;
        }


        if (horas == 0) {
            System.out.print("O JOGO DUROU 24 HORA(S)\n");
        } else if (horas < 0) {
            System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
        } else if (horas > 24) {
            System.out.print("O JOGO DUROU " + (horas) + " HORA(S)\n");
        } else {
            System.out.print("O JOGO DUROU " + horas + " HORA(S)\n");
        }
    }
}
