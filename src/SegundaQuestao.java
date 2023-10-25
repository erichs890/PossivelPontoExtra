public class SegundaQuestao {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Por favor, forneça exatamente dois números como argumentos da linha de comando.");
            }

            int numero1 = Integer.parseInt(args[0]);
            int numero2 = Integer.parseInt(args[1]);

            int resultado = numero1 / numero2;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println("Erro: Os argumentos fornecidos não são números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Ocorreu uma divisão por zero.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
