import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double saldo = 0;
            boolean continuar = true;
            
            while (continuar) {
                
                int opcao = scanner.nextInt();
                
                switch (opcao) {
                    case 1 -> {
                        float valor = scanner.nextFloat();
                        saldo = saldo + valor;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    
                    case 2 -> {
                        float sacar = scanner.nextFloat();
                        if(sacar <= saldo) {
                            saldo = saldo - sacar;
                            System.out.println("Saldo atual: " + saldo);
                        }
                        else
                            System.out.println("Saldo Insuficiente.");
                    }
                    
                    case 3 -> {
                        System.out.println("Saldo atual: " + saldo);
                    }
                    
                    case 0 -> {
                        System.out.println("Programa encerrado.");
                        continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    }
                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            }
        }
    }
}