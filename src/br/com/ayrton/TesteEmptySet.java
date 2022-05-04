package br.com.ayrton;

import java.util.Collections;
import java.util.Set;

public class TesteEmptySet {
    public static void main(String[] args) {
        Set<String> nomes = Collections.emptySet();
        nomes.add("Paulo");
        //nomes.forEach(s -> System.out.println(s));
    }
}
