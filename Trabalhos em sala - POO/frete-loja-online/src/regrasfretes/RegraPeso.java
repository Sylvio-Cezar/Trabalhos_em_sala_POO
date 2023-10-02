package regrasfretes;

import interfaces.IRegraFrete;
import models.Produto;

public class RegraPeso implements IRegraFrete {
    @Override
    public double calcular(Produto produto) {
        return produto.getPeso() * 2.0;
    }
}