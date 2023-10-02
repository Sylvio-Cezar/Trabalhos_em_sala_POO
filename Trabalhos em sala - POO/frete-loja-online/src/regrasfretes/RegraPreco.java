package regrasfretes;

import interfaces.IRegraFrete;
import models.Produto;

public class RegraPreco implements IRegraFrete {
    @Override
    public double calcular(Produto produto) {
        if (produto.getPreco() <= 79.90 || produto.getPreco() >= 3500) {
            return 0;
        }
        return produto.getPreco() * 0.4;
    }
}