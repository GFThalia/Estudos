package BackEndComJava.CriandoumBancoDigitalcomJavaeOrientaçãoaObjetos;

public class Main {
    public static void main(String[] args){
        Cliente lia = new Cliente();
        lia.setNome("Thalia");
        lia.setId("123456");

        Conta cp = new ContaPoupanca(lia);
        cp.depositar(100);

        Banco banco = new Banco();
        banco.setNome("Banco Digital");
        banco.adicionarConta(cp);

        System.out.println("Informações do banco:");
        System.out.println("Nome do banco: " + banco.getNome());
        System.out.println("\nListando todas as contas:");
        banco.listarContas();
    }
}
