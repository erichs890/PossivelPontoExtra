import java.util.Scanner;
public class PrimeiraQuestao {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.print("Digite o primeiro número: "); // Imprime uma mensagem para o usuário
                int n1 = scanner.nextInt(); // Lê um número inteiro fornecido pelo usuário
                System.out.print("Digite o segundo número: ");
                int n2 = scanner.nextInt();
                int resultado = n1 / n2;
                System.out.println("O resultado da divisão é: " + resultado);
            } catch (ArithmeticException vish) {
                System.out.println("Ocorreu um erro na divisão: " + vish.getMessage());
            }
        }
    }


