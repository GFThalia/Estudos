package estudos.DIO.BackEndComJava.desafioControleDeFluxo.domain;
import java.util.Scanner;
import estudos.DIO.BackEndComJava.desafioControleDeFluxo.exception.ParametrosInvalidosException;

public class Contador {
    
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

            if (parametroUm >= parametroDois) {
                throw new ParametrosInvalidosException();
            }else {
                int diferenca = parametroDois - parametroUm;
                for (int indice = 1; indice <= diferenca; ++indice) {
                    System.out.println("Interação: " + indice);
                }
            }
    }

    public static int lerInteiro(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Digite um número inteiro:");
            }
        }
    }

}
