package br.com.ayrton;

public class Recibo implements Comparable<Recibo>{
    private String fornecedor;
    private double valor;

    public Recibo() {
    }

    public Recibo(String fornecedor, double valor) {
        this.fornecedor = fornecedor;
        this.valor = valor;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public int compareTo(Recibo o) {
        return this.fornecedor.compareTo(o.fornecedor);
    }

    @Override
    public String toString() {
        return " Fornecedor = " + fornecedor + ", Valor = " + valor;
    }
}
