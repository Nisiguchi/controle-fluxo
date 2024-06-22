import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String numeroConta = scanner.next();
            verificarNumeroConta(numeroConta);
            System.out.println( "Numero de conta valido.");

        } catch (ContaInvalidaException e) {
            System.out.println("Erro: ");
        }
        scanner.close();

    }

    static String verificarNumeroConta(String numeroConta) throws ContaInvalidaException {
        if (numeroConta.length() != 8)
            throw new ContaInvalidaException();

        return "Erro: Numero de conta invalido. Digite exatamente 8 digitos.";
        
    }
}