package main;

import models.Produto;
import models.TipoEnvio;
import services.CalculadoraFrete;

public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Camiseta", 0.2, 89.90,
                0.8, 0.4, 0.1, TipoEnvio.TAMANHO);
        Produto produto2 = new Produto("Notebook", 2.0, 3549.90,
                0.3, 0.4, 0.2, TipoEnvio.PRECO);
        Produto produto3 = new Produto("Geladeira", 60.0, 2616.35,
                1.70, 0.7, 0.4, TipoEnvio.PESO);

        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();

        double custoFrete1 = calculadoraFrete.calcularFrete(produto1);
        double custoFrete2 = calculadoraFrete.calcularFrete(produto2);
        double custoFrete3 = calculadoraFrete.calcularFrete(produto3);

        System.out.println("Frete para " + produto1.getNome() + ": R$" + custoFrete1 + " --> Preço final: "
                + (produto1.getPreco() + custoFrete1));
        System.out.println("Frete para " + produto2.getNome() + ": R$" + custoFrete2 + " --> Preço final: "
                + (produto2.getPreco() + custoFrete2));
        System.out.println("Frete para " + produto3.getNome() + ": R$" + custoFrete3 + " --> Preço final: "
                + (produto3.getPreco() + custoFrete3));
    }
}