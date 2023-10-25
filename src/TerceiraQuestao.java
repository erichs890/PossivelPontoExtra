import java.util.Scanner;
public class TerceiraQuestao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a primeira string: ");
            String string1 = scanner.nextLine();

            System.out.print("Digite a segunda string: ");
            String string2 = scanner.nextLine();

            if (string1 == null || string2 == null) {
                throw new NullPointerException("Uma das strings é nula.");
                }

                int comparacao = string1.compareTo(string2);

                if (comparacao < 0) {
                    System.out.println("A primeira string é lexicograficamente menor que a segunda.");
                } else if (comparacao > 0) {
                    System.out.println("A primeira string é lexicograficamente maior que a segunda.");
                } else {
                    System.out.println("As strings são lexicograficamente iguais.");
                }
            } catch (NullPointerException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }

