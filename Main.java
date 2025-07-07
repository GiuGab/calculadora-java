import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero1 = 0;
        boolean numero1Valido = false;
        while(!numero1Valido){
            System.out.print("Digite o primeiro numero: ");

            if(scanner.hasNextInt()){
                numero1 = scanner.nextInt();
                scanner.nextLine();
                numero1Valido = true;
            } else{
                System.out.println("Voce nao digitou um numero! Tente novamente.");
                scanner.nextLine();
            }
        }
        int numero2 = 0;
        boolean numero2Valido = false;
        while(!numero2Valido){
            System.out.print("Digite o segundo numero: ");

            if(scanner.hasNextInt()){
                numero2 = scanner.nextInt();
                scanner.nextLine();
                numero2Valido = true;
            } else{
                System.out.println("Voce nao digitou um numero! Tente novamente.");
                scanner.nextLine();
            }
        }

        List<String> funcoes = List.of("x", "/", "+", "-");
        System.out.println("Qual funcao voce quer fazer?: ");
        int numeroParenteses = 1;
        for (String funcao : funcoes) {
            System.out.println(numeroParenteses + ") " + numero1 + funcao + numero2 + "=");
            numeroParenteses++;
        }

        boolean operacaoValida = false;
        int escolha = 0;

        while (!operacaoValida) {
            System.out.print("Escolha a operacao: ");
            try {
                escolha = scanner.nextInt();

                if (escolha == 1) {
                    System.out.println(numero1 + "x" + numero2 + "= " + numero1 * numero2);
                    operacaoValida = true;
                } else if (escolha == 2) {
                    if(numero2 != 0){
                        System.out.println(numero1 + "/" + numero2 + "= " + numero1 / numero2);
                        operacaoValida = true;
                    } else {
                        System.out.println("Nao e possivel dividir por zero");
                    }
                } else if (escolha == 3) {
                    System.out.println(numero1 + "+" + numero2 + "= " + (numero1 + numero2));
                    operacaoValida = true;
                } else if (escolha == 4) {
                    System.out.println(numero1 + "-" + numero2 + "= " + (numero1 - numero2));
                    operacaoValida = true;
                } else {
                    System.out.println("Escolha uma opcao valida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite uma operacao valida!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}