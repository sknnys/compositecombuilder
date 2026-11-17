package br.ufes.computador.builder;

import br.ufes.computador.model.Todo;

public class ComputadorBuilder {

    private Todo computador;
    private Todo gabinete;
    private Todo placaMae;

    public ComputadorBuilder(String descricao, double preco) {
        computador = new Todo(preco, descricao);
    }

    public void adicionarGabinete(String descricao, double preco) {
        if (gabinete != null) {
            throw new IllegalStateException("O computador ja possui um gabinete.");
        }
        gabinete = new Todo(preco, descricao);
        computador.adicionar(gabinete);
    }

    public void adicionarPlacaMae(String descricao, double preco) {
        if (gabinete == null) {
            throw new IllegalStateException("Adicione o gabinete antes da placa-mae.");
        }
        if (placaMae != null) {
            throw new IllegalStateException("O computador ja possui uma placa-mae.");
        }
        placaMae = new Todo(preco, descricao);
        gabinete.adicionar(placaMae);
    }

    public Todo build() {
        if (gabinete == null || placaMae == null) {
            throw new IllegalStateException("O computador precisa de gabinete e placa-mae.");
        }
        return computador;
    }

    public Todo getGabinete() {
        if (gabinete == null) {
            throw new IllegalStateException("O gabinete ainda nao foi criado.");
        }
        return gabinete;
    }

    public Todo getPlacaMae() {
        if (placaMae == null) {
            throw new IllegalStateException("A placa-mae ainda nao foi criada.");
        }
        return placaMae;
    }
}
