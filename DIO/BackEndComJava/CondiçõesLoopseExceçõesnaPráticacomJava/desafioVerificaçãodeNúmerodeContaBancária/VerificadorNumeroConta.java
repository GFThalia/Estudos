package DIO.BackEndComJava.CondiçõesLoopseExceçõesnaPráticacomJava.desafioVerificaçãodeNúmerodeContaBancária;

import java.util.Scanner; 

import java.util.Scanner; 

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leia a entrada do usuário como uma string representando o número da conta:
            String numeroConta = scanner.nextLine();

            // Chame o método verificarNumeroConta, passando o número da conta como argumento:
            verificarNumeroConta(numeroConta);

            // Se não houver exceção, imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Capture a exceção do tipo IllegalArgumentException e imprima a mensagem de erro associada:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Método verificarNumeroConta que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) {
        // Verifique se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            // Se não tiver 8 dígitos, lance uma exceção do tipo IllegalArgumentException:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
