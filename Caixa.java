import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        int opcao = 0;
        double saldo = 0;
        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("""
                    1. Consultar saldos;
                    2. Receber valor;
                    3. Transferir valor;
                    4. Sair.""");

            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(String.format("Seu saldo é de %.2f", saldo));
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double valorReceber = leitura.nextDouble();
                    saldo += valorReceber;
                    System.out.println(String.format("Seu saldo após a transferência é de %.2f", saldo));
                    break;
                case 3:
                    System.out.println("Informe o valor a transferir:");
                    double valorTransferir = leitura.nextDouble();
                    if (valorTransferir > saldo) {
                        System.out.println("Você não possui saldo suficiente para transferir esse valor.");
                        break;
                    } else {
                        saldo -= valorTransferir;
                        System.out.println(String.format("Transferência realizada com sucesso. Seu saldo atual é de %.2f", saldo));
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
