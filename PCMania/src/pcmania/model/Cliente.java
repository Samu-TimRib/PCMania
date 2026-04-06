package pcmania.model;

public class Cliente {

    private String nome;
    private String cpf;

    private Computador[] compras;   //Arrays dos computadores q o cliente levou
    private int qtdCompras;         // quantos PCs foram comprados

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.compras = new Computador[50];
        this.qtdCompras = 0;
    }

    public void addComputador(Computador c) {   //daqui vem do acesso que envia um objeto por inteiro
        if (qtdCompras < compras.length) {      //seguraça para n dar ruim caso tente colocar 51 computadores
            compras[qtdCompras] = c;
            qtdCompras++;
        }
    }

    public float calculaTotalCompra() {
        float total = 0;
        for (int i = 0; i < qtdCompras; i++) {
            total += compras[i].getPreco(); // soma o preço de cada PC
        }
        return total;
    }

    // Getters necessários
    public Computador[] getCompras()  { return compras; }
    public int getQtdCompras()         { return qtdCompras; }

    // Exibe resumo completo do cliente e sua compra
    public void mostrarResumo() {
        System.out.println("-----------------------------");
        System.out.println("Cliente: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("-----------------------------");
        for (int i = 0; i < qtdCompras; i++) {
            System.out.println("--- PC " + (i + 1) + " ---");
                    compras[i].mostraPCConfigs();   //vai no Computador.java e puxa a funcao de mostrar as config
        }
        System.out.printf("TOTAL DA COMPRA: R$ %.2f%n", calculaTotalCompra());
    }
}