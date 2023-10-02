package services;

import models.Produto;

public class CalculadoraFrete {
    public double calcularFrete(Produto produto) {
        return produto.getTipoEnvio().getRegraFrete().calcular(produto);
    }
}