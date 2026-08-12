import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o valor do seu limite: ");
        int limite = scanner.nextInt();

        ContaBancaria tur = new ContaBancaria(titular, limite);


        int opcao = 0;
        while (opcao != 5) {


            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo e limite");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma ação: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Quantidade do deposito?: ");
                    int valorDeposito = scanner.nextInt();
                    tur.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Quantidade do saque?: ");
                    int valorSaque = scanner.nextInt();
                    tur.sacar(valorSaque);
                    break;
                case 3:
                    System.out.print("\nTitular: " + tur.getTitular());
                    System.out.print("\nSaldo atual: "  + tur.getSaldo());
                    System.out.print("\nLimite atual: " + tur.getLimite());
                    System.out.println("\nDisponivel pra sacar: " + (tur.getSaldo() + tur.getLimite()));
                    break;
                case 4:
                    System.out.println("\nEncerrando...");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
        }

        scanner.close();
    }
}