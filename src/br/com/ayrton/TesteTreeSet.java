package br.com.ayrton;

import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {
    public static void main(String[] args) {
        Set<Recibo> recibos = new TreeSet<>();
        recibos.add(new Recibo("Microsoft",1500.00));
        recibos.add(new Recibo("Apple",2500.00));

        recibos.forEach(recibo -> System.out.println(recibo));
    }
}
