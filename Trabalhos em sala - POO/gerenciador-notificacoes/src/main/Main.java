package main;

import services.GerenciadorDeNotificacoes;
import tipoenvio.App;
import tipoenvio.Email;
import tipoenvio.Push;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeNotificacoes gerenciadorDeNotificacoes = new GerenciadorDeNotificacoes(new Email());
        gerenciadorDeNotificacoes.notificar("Teste envio de email!");

        gerenciadorDeNotificacoes.setNotificacao(new App());
        gerenciadorDeNotificacoes.notificar("Teste envio pelo app!");

        gerenciadorDeNotificacoes.setNotificacao(new Push());
        gerenciadorDeNotificacoes.notificar("Teste envio por push!");
    }
}