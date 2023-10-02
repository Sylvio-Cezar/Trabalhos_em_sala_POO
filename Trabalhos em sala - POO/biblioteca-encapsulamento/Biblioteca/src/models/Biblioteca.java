package models;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    private List<Autor> autores;

    public Biblioteca(String nome) {
        this.nome = nome;
        this.livros = new ArrayList<>();
        this.autores = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
    }

    public void adicionarAutor(Autor autor) {
        this.autores.add(autor);
    }

    public boolean verificarDisponibilidade(String titulo) {
        for (Livro livro : this.livros) {
            if (livro.getTitulo().equals(titulo) && livro.isDisponivel()) {
                return true;
            }
        }

        return false;
    }
}
