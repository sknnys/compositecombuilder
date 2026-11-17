package br.ufes.computador.model;

/**
 * @author Clayton
 */
public class Peca extends Componente {

    public Peca(double preco, String descricao) {
        super(preco, descricao);
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }
}
