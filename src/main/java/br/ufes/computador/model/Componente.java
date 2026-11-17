package br.ufes.computador.model;

public abstract class Componente {

    protected double preco;
    protected String descricao;

    public Componente(double preco, String descricao) {
        setPreco(preco);
        setDescricao(descricao);
    }

    public abstract String getDescricao();

    public abstract double getPreco();

    public void setPreco(double preco) {
        if (preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo.");
        }
        this.preco = preco;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode ser vazia.");
        }
        this.descricao = descricao.trim();
    }

    @Override
    public String toString() {
        return "Descrição: " + getDescricao() + ", preço: " + String.format("%.2f", getPreco());
    }
}
