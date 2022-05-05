package br.com.ayrton;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
    public static void main(String[] args) {
        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        Set<String> acessoChaves = nomesParaIdade.keySet();
        System.out.println(acessoChaves);

        System.out.println();

        Collection<Integer> acessoValores = nomesParaIdade.values();
        System.out.println(acessoValores);
    }
}
