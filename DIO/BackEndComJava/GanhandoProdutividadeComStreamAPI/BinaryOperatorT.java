package BackEndComJava.GanhandoProdutividadeComStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BinaryOperatorT {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> resultado = numeros.stream()
        .reduce(Integer::sum);

        System.out.println(resultado);

    }
}
