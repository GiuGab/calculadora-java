import java.util.Random;
import java.util.Scanner;

public class numeroSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        int numeroDaMaquina = rand.nextInt(100) + 1;
        int totalTentativas = 0;
        int tentativas = 5;

        while (totalTentativas < 5) {
            System.out.print("Voce tem " + tentativas + " tentativas para acertar o numero aleatorio de 1 a 100: ");

            if (scanner.hasNextInt()) {
                int escolha = scanner.nextInt();
                scanner.nextLine();
                totalTentativas++;
                if (escolha == numeroDaMaquina) {
                    System.out.println("-".repeat(60));
                    System.out.print("Voce acertou com " + totalTentativas + " tentativa!");
                    totalTentativas = 6;
                } else {
                    if (escolha < numeroDaMaquina) {
                        System.out.println("Voce errou! O numero é maior, Tente novamente.");
                    } else {
                        System.out.println("Voce errou! O numero é menor, Tente novamente.");
                    }
                    System.out.println("-".repeat(60));
                    tentativas--;
                    if (tentativas == 0) {
                        System.out.println("Suas tentativas acabaram");
                        totalTentativas = 6;
                    }
                }
                }else {
                System.out.println("Voce nao digitou um numero, tente novamente.");
                System.out.println("-".repeat(60));
                scanner.nextLine();
            }
        }
    }
}