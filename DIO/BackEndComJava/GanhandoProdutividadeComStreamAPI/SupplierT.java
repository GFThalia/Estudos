package BackEndComJava.GanhandoProdutividadeComStreamAPI;


import java.util.List;
import java.util.stream.Stream;

public class SupplierT {
    public static void main(String[] args){
        //Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)";
        List<String> listaSaudacoes = Stream.generate(()-> "Olá, seja bem-vindo(a)")
        .limit(3)
        .toList();

        listaSaudacoes.forEach(System.out::println);
    }   
}
