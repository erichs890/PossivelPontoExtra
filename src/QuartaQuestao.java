public class QuartaQuestao {
    public static void main(String[] args) {
        try {
            verificarString("HELLO");
            verificarString("Hello");
            verificarString("123");
        } catch (NonLetterCharacterException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (NonUppercaseLetterException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void verificarString(String str) throws NonLetterCharacterException, NonUppercaseLetterException {
        for (char c : str.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new NonLetterCharacterException("A string contém um caractere que não é uma letra.");
            }

            if (!Character.isUpperCase(c)) {
                throw new NonUppercaseLetterException("A string contém uma letra que não é maiúscula.");
            }
        }
    }
}

class NonLetterCharacterException extends Exception {
    public NonLetterCharacterException(String message) {
        super(message);
    }
}

class NonUppercaseLetterException extends Exception {
    public NonUppercaseLetterException(String message) {
        super(message);
    }
}
