package pcmania.model;

public class HardwareBasico {   //que vai ser as peças dos PCs


    private String nome;       //"Processador Core i3", "Memória RAM", "HDD"
    private float capacidade;  //os valores que vem na frente

    public HardwareBasico(String nome, float capacidade) {

        this.nome = nome;
        this.capacidade = capacidade;
    }


    public String getNome() { return nome; }
    public float getCapacidade() { return capacidade; }

    //sem ‘setter’ que n precisa mexer em nada

}