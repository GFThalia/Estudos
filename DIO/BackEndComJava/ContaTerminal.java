package estudos.DIO.BackEndComJava;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal{
public static void main(String[] args){
    //TODO: conhecer e importar a classe Scanner
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    //Exibir as mensagens para o usuario
    //E obter pela scanner os valores digitados no terminal
    System.out.println("Digite o numero da conta");
    int numero = scanner.nextInt();
    System.out.println("Digite a agencia da conta");
    String agencia = scanner.next();
    System.out.println("Digite seu nome");
    String nome = scanner.next();
    System.out.println("Digite seu saldo");
    double saldo = scanner.nextDouble();
   
    //Exibir a mensagem conta criada
    System.out.println("Numero:"+ numero);
    System.out.println("Agencia:"+agencia);
    System.out.println("Nome:"+ nome);
    System.out.println("Saldo:"+ saldo);
}
}