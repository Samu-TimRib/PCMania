package pcmania.model;

public class Computador {

    private String marca;
    private float preco;

    private HardwareBasico[] hardwares; //quais componentes ele vai ter, vulgo peças
    private int qtdHardwares; // quantos pecas foram adicionados

    private MemoriaUSB memoriaUSB;  //Isso vai fazer com que a memória seja salva no objeto do computador

    private SistemaOperacional sistemaOperacional;  //Isso vai fazer com que o SO seja salvo no objeto do computador

    public Computador(String marca, float preco, SistemaOperacional so) {
        this.marca = marca;
        this.preco = preco;
        this.sistemaOperacional = so;
        this.hardwares = new HardwareBasico[10]; // array com espaço para 10
        this.qtdHardwares = 0;    // começa vazio
        this.memoriaUSB = null;   // sem brinde inicialmente
    }

    // Adiciona uma peca no próximo espaço livre do array
    public void addHardware(HardwareBasico hw) {
        if (qtdHardwares < hardwares.length) {  //limita a quantidade de precas que pode ter, ou seja, n tem como colocar um 11 peca
            hardwares[qtdHardwares] = hw; // insere na posição atual
            qtdHardwares++;               // avança o contador
        }
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public float getPreco() { return preco; }

    public void mostraPCConfigs() {
        System.out.println("  Marca: " + marca);
        System.out.printf("  Preço: R$ %.2f%n", preco);
        for (int i = 0; i < qtdHardwares; i++) {
            System.out.println("  " + hardwares[i].getNome() + ": " + (int)hardwares[i].getCapacidade());
        }
        System.out.println("  SO: " + sistemaOperacional.getNome() + " (" + sistemaOperacional.getTipo() + " bits)");
        if (memoriaUSB != null) {
            System.out.println("  Vem com: " + memoriaUSB.getNome() + " " + memoriaUSB.getCapacidade() + "Gb");
        }
    }
}