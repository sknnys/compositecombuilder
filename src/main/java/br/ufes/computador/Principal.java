package br.ufes.computador;

import br.ufes.computador.builder.ComputadorBuilder;
import br.ufes.computador.builder.Diretor;
import br.ufes.computador.model.Peca;
import br.ufes.computador.model.Todo;

public class Principal {

    public static void main(String[] args) {
        ComputadorBuilder builderEscritorio = new ComputadorBuilder("PC Escritorio", 120.00);
        Diretor diretorEscritorio = new Diretor(builderEscritorio);
        diretorEscritorio.montarPcEscritorio();

        builderEscritorio.getPlacaMae().adicionar(new Peca(690.00, "Processador Intel Core i3-12100"));
        builderEscritorio.getPlacaMae().adicionar(new Peca(260.00, "Memoria RAM 16GB DDR4"));
        builderEscritorio.getPlacaMae().adicionar(new Peca(240.00, "SSD NVMe 500GB"));
        builderEscritorio.getGabinete().adicionar(new Peca(230.00, "Fonte 400W"));
        builderEscritorio.getGabinete().adicionar(new Peca(65.00, "Cooler Box"));

        Todo pcEscritorio = builderEscritorio.build();
        pcEscritorio.adicionar(new Peca(720.00, "Monitor IPS 23,8 Full HD"));
        pcEscritorio.adicionar(new Peca(85.00, "Teclado USB ABNT2"));
        pcEscritorio.adicionar(new Peca(55.00, "Mouse Optico USB"));

        ComputadorBuilder builderGamer = new ComputadorBuilder("PC Gamer", 250.00);
        Diretor diretorGamer = new Diretor(builderGamer);
        diretorGamer.montarPcGamer();

        builderGamer.getPlacaMae().adicionar(new Peca(2490.00, "Processador Intel Core i7-14700K"));
        builderGamer.getPlacaMae().adicionar(new Peca(890.00, "Memoria RAM 32GB DDR5"));
        builderGamer.getPlacaMae().adicionar(new Peca(950.00, "SSD NVMe 2TB"));
        builderGamer.getPlacaMae().adicionar(new Peca(4290.00, "Placa de Video GeForce RTX 4070 Super"));
        builderGamer.getGabinete().adicionar(new Peca(720.00, "Fonte Modular 850W"));
        builderGamer.getGabinete().adicionar(new Peca(460.00, "Water Cooler 240mm"));

        Todo pcGamer = builderGamer.build();
        pcGamer.adicionar(new Peca(1750.00, "Monitor Gamer 27 165Hz"));
        pcGamer.adicionar(new Peca(380.00, "Teclado Mecanico RGB"));
        pcGamer.adicionar(new Peca(290.00, "Mouse Gamer 26000 DPI"));

        ComputadorBuilder builderServidor = new ComputadorBuilder("PC Servidor Web", 350.00);
        Diretor diretorServidor = new Diretor(builderServidor);
        diretorServidor.montarPcServidor();

        builderServidor.getPlacaMae().adicionar(new Peca(3600.00, "Processador Intel Xeon Silver 4310"));
        builderServidor.getPlacaMae().adicionar(new Peca(1980.00, "Memoria RAM 64GB DDR4 ECC"));
        builderServidor.getPlacaMae().adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB Unidade 1"));
        builderServidor.getPlacaMae().adicionar(new Peca(1420.00, "SSD Enterprise 1.92TB Unidade 2"));
        builderServidor.getPlacaMae().adicionar(new Peca(890.00, "Placa de Rede Dual Port 10GbE"));
        builderServidor.getGabinete().adicionar(new Peca(1450.00, "Fonte Redundante 750W"));
        builderServidor.getGabinete().adicionar(new Peca(320.00, "Cooler Servidor Alto Fluxo"));

        Todo pcServidor = builderServidor.build();
        pcServidor.adicionar(new Peca(460.00, "Monitor LED 19,5"));
        pcServidor.adicionar(new Peca(70.00, "Teclado Compacto USB"));
        pcServidor.adicionar(new Peca(40.00, "Mouse Optico Basico USB"));

        mostrarComputador(pcEscritorio);
        mostrarComputador(pcGamer);
        mostrarComputador(pcServidor);
    }

    public static void mostrarComputador(Todo computador) {
        System.out.println("Descricao: " + computador.getDescricao());
        System.out.println("Preco total: " + computador.getPreco());
        System.out.println();
    }
}
