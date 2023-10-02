package models;

import interfaces.IRegraFrete;
import regrasfretes.RegraPeso;
import regrasfretes.RegraPreco;
import regrasfretes.RegraTamanho;

public enum TipoEnvio {
    PESO(new RegraPeso()),
    PRECO(new RegraPreco()),
    TAMANHO(new RegraTamanho());

    private IRegraFrete regraFrete;

    TipoEnvio(IRegraFrete regraFrete) {
        this.regraFrete = regraFrete;
    }

    public IRegraFrete getRegraFrete() {
        return this.regraFrete;
    }
}