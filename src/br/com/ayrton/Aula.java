package br.com.ayrton;

public class Aula implements Comparable<Aula>{
    private String titulo;
    private Integer tempo;

    public Aula(String titulo, Integer tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getTempo() {
        return tempo;
    }

    @Override
    public String toString() {
        return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.getTitulo().compareTo(outraAula.getTitulo());
    }
}
