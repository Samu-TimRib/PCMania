package pcmania.model;

public class MemoriaUSB {

    private String nome;    // "Pen-drive" ou "HD Externo"
    private int capacidade; // tamanho

    public MemoriaUSB(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public String getNome()   { return nome; }
    public int getCapacidade() { return capacidade; }
}