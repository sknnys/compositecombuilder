package br.ufes.computador.builder;

public class Diretor {

    private ComputadorBuilder builder;

    public Diretor(ComputadorBuilder builder) {
        if (builder == null) {
            throw new IllegalArgumentException("O builder nao pode ser nulo.");
        }
        this.builder = builder;
    }

    public void montarPcEscritorio() {
        builder.adicionarGabinete("Gabinete Micro-ATX Slim", 220.00);
        builder.adicionarPlacaMae("Placa-mae B660M", 620.00);
    }

    public void montarPcGamer() {
        builder.adicionarGabinete("Gabinete Gamer Mid Tower", 450.00);
        builder.adicionarPlacaMae("Placa-mae Z790 ATX DDR5", 1680.00);
    }

    public void montarPcServidor() {
        builder.adicionarGabinete("Gabinete Rack 4U", 1150.00);
        builder.adicionarPlacaMae("Placa-mae Servidor C621", 2400.00);
    }
}
