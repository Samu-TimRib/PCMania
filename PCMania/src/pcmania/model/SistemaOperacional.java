package pcmania.model;

public class SistemaOperacional {

    private String nome;  // Ex: "macOS Sequoia", "Windows 10"
    private int tipo;      // teria que colocar a arquitetura, mas aqui é tudo 64

    public SistemaOperacional(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() { return nome; }
    public int getTipo()    { return tipo; }
}