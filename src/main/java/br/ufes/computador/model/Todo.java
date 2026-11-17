package br.ufes.computador.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Clayton
 */
public class Todo extends Componente {

    private final List<Componente> componentes = new ArrayList<>();

    public Todo(double preco, String descricao) {
        super(preco, descricao);
    }

    public void adicionar(Componente componente) {
        if (componente == null) {
            throw new IllegalArgumentException("Não é possível adicionar um componente nulo.");
        }
        if (componente == this) {
            throw new IllegalArgumentException("Um componente composto não pode ser incluído nele mesmo.");
        }
        if (this.equals(componente)) {
            throw new IllegalArgumentException("Um componente composto não pode ser incluído nele mesmo.");
        }
        if (this.getDescricao().equals(componente.getDescricao())) {
            throw new IllegalArgumentException("Um componente com a mesma descrição não pode ser incluído.");
        }
        if (this.getDescricao().contains(componente.getDescricao())
                || componente.getDescricao().contains(this.getDescricao())) {
            throw new IllegalArgumentException("Este componente já está contido na descrição do todo.");
        }
        this.componentes.add(componente);
    }

    @Override
    public String getDescricao() {
        String descricaoTodo = this.descricao;
        for (Componente componente : this.componentes) {
            descricaoTodo = descricaoTodo + ", " + componente.getDescricao();
        }
        return descricaoTodo;
    }

    @Override
    public double getPreco() {
        double precoTodo = this.preco;
        for (Componente componente : this.componentes) {
            precoTodo += componente.getPreco();
        }
        return precoTodo;
    }
}
