package main;

import models.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("models.Biblioteca");
        Autor autor1 = new Autor("models.Autor 1");
        Autor autor2 = new Autor("models.Autor 2");
        Autor autor3 = new Autor("models.Autor 3");
        Livro livro1 = new Livro("models.Livro 1", "models.Autor 1", true);
        Livro livro2 = new Livro("models.Livro 2", "models.Autor 2", false);
        Livro livro3 = new Livro("models.Livro 3", "models.Autor 3", true);

        biblioteca.adicionarAutor(autor1);
        biblioteca.adicionarAutor(autor2);
        biblioteca.adicionarAutor(autor3);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        System.out.println(biblioteca.verificarDisponibilidade("models.Livro 1"));
        System.out.println(biblioteca.verificarDisponibilidade("models.Livro 2"));
        System.out.println(biblioteca.verificarDisponibilidade("models.Livro 4"));
    }
}
