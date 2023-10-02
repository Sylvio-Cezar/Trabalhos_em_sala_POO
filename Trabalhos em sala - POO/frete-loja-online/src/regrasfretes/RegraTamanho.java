package regrasfretes;

import interfaces.IRegraFrete;
import models.Produto;

public class RegraTamanho implements IRegraFrete {
    @Override
    public double calcular(Produto produto) {
        return (produto.getAltura() * produto.getLargura() * produto.getProfundidade()) * 400.0;
    }
}