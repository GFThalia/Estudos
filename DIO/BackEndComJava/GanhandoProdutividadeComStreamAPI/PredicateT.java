package BackEndComJava.GanhandoProdutividadeComStreamAPI;

import java.util.Arrays;
import java.util.List;

public class PredicateT {
    public static void main(String[] args){
        List<String> palavras = Arrays.asList("java", "javascript", "css", "html", "git", "ajax", "jquery");

        palavras.stream()
        .filter(p -> p.length() > 3)
        .forEach(System.out::println);
    }   
}
