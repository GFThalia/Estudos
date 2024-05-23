package BackEndComJava.GanhandoProdutividadeComStreamAPI;

import java.util.Arrays;
import java.util.List;

public class ConsumerT {
    public static void main(String[] args){
    List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        /*numeros.forEach(n -> {
            if(n % 2 == 0){
             System.out.println(n);
            }
         });
         */
        numeros.stream().filter(n -> n %2 == 0)
        .forEach(System.out::println);

    }
}
