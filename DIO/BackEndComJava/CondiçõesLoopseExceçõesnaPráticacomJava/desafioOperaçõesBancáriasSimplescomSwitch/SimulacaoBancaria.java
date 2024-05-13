package BackEndComJava.CondiçõesLoopseExceçõesnaPráticacomJava.desafioOperaçõesBancáriasSimplescomSwitch;

import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (true) {
            // Exibir menu de opções para o usuário
            // Ler a opção do usuário
            int opcao = scanner.nextInt();

            // Utilizar switch para executar a operação escolhida pelo usuário
            switch (opcao) {
                case 1:
                    // Depositar
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    // Sacar
                    double valorSaque = scanner.nextDouble();
                    if (saldo >= valorSaque) {
                        saldo -= valorSaque;
                        System.out.println("Saldo atual: " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;
                case 3:
                    // Consultar Saldo
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    // Encerrar
                    System.out.println("Programa encerrado.");
                    return; // Encerra o programa
                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
