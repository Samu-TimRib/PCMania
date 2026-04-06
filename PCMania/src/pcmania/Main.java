package pcmania;

import java.util.Scanner;               //Scanner ja usado em aual
import pcmania.model.*;                 //Aqui foi ajuda de IA, onde eu puxo todas as classes do model(objetos do mundo)
import pcmania.util.ProcessarPedido;    //E esse puxa a classe que não se refere ao um objeto específico

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float MATRICULA = 634;

        // promo 1
        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        Computador pc1 = new Computador("Apple", MATRICULA, so1);
        pc1.addHardware(new HardwareBasico("Processador Core i3", 2200));
        pc1.addHardware(new HardwareBasico("Memória RAM", 8));
        pc1.addHardware(new HardwareBasico("HD", 500));
        pc1.addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));

        // promo 2
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        Computador pc2 = new Computador("Samsung", MATRICULA + 1234, so2);
        pc2.addHardware(new HardwareBasico("Processador Core i5", 3370));
        pc2.addHardware(new HardwareBasico("Memória RAM", 16));
        pc2.addHardware(new HardwareBasico("HD", 1024)); // 1TB = 1024GB
        pc2.addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));

        // promo 3
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);
        Computador pc3 = new Computador("Dell", MATRICULA + 5678, so3);
        pc3.addHardware(new HardwareBasico("Processador Core i7", 4500));
        pc3.addHardware(new HardwareBasico("Memória RAM", 32));
        pc3.addHardware(new HardwareBasico("HD", 2048)); // 2TB = 2048GB
        pc3.addMemoriaUSB(new MemoriaUSB("HD Externo", 1024));

        // Array das promo
        Computador[] promocoes = {pc1, pc2, pc3};

        Cliente cliente = new Cliente("Samu", "123.456.789-10");

        int opcao;
        do {
            System.out.println("===== PC Mania =====");

            System.out.printf("[1] Apple  - Core i3 - R$ %.2f%n",    MATRICULA);        //%.0f%n esse macete foi pego no tecnico com isso você pode controlar a saida dos valores
            System.out.printf("[2] Samsung - Core i5 - R$ %.2f%n",   MATRICULA + 1234); //nesse eu coloquei para ter 2 casas decimais
            System.out.printf("[3] Dell   - Core i7 - R$ %.2f%n",    MATRICULA + 5678);
            System.out.println("[0] Finalizar compra");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            if (opcao >= 1 && opcao <= 3) {

                cliente.addComputador(promocoes[opcao - 1]);    //acessa a classe cliente, na função add... e envia o objeto em si do computador
                System.out.println("PC adicionado!");           //que esta no array, para salvar todos os dados

            } else if (opcao != 0) {

                System.out.println("Opção inválida.");

            }
        } while (opcao != 0); // repete até digitar 0

        ProcessarPedido.processar(cliente.getCompras(), cliente.getQtdCompras()); //Metodo estatico, pois não tem objeto, tudo é passado nos parametros

        // Exibe resumo final
        cliente.mostrarResumo();

        sc.close();
    }
}