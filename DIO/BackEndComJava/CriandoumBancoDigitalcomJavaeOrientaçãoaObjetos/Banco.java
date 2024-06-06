package BackEndComJava.CriandoumBancoDigitalcomJavaeOrientaçãoaObjetos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    public String nome;
    private List<Conta> contas;

    public Banco(){
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Conta> getContas(){
        return contas;
    }
    public void setContas(List<Conta> contas){
        this.contas = contas;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }
    public void removerConta(Conta conta) {
        this.contas.remove(conta);
    }

    public void listarContas() {
        for (Conta conta : contas) {
            conta.imprimirExtrato();
            System.out.println();
        }
    }
}
