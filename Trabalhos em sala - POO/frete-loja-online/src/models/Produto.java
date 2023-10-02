package models;

public class Produto {
    private String nome;
    private double peso;
    private double preco;

    private double altura;

    private double largura;

    private double profundidade;

    private TipoEnvio tipoEnvio;

    public Produto(String nome, double peso, double preco,
                   double altura, double largura, double profundidade, TipoEnvio tipoEnvio) {
        this.nome = nome;
        this.peso = peso;
        this.preco = preco;
        this.altura = altura;
        this.largura = largura;
        this.profundidade = profundidade;
        this.tipoEnvio = tipoEnvio;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getPreco(){
        return preco;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getProfundidade() {
        return profundidade;
    }

    public TipoEnvio getTipoEnvio() {
        return tipoEnvio;
    }
}