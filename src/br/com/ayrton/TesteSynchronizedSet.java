package br.com.ayrton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TesteSynchronizedSet {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();

        strings.add("Ayrton Barreto");
        strings.add("Alana Larissa");
        strings.add("Ana Hilário");
        System.out.println(strings);

        System.out.println();

        Set<String> stringSynchronized = Collections.synchronizedSet(strings);
        System.out.println(stringSynchronized);

        /* O método acima transforma uma coleção comum em uma coleção para threads.*/

    }
}
