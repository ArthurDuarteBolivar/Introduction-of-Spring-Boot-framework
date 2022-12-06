package com.inversao_de_controle.dio.inversao_de_controle;

public class Pedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();
    }

    private EnviarEmails enviar = EnviarEmails.obterDadosEmail();

    public void gravar(){
        // this.enviar =  new EnviarEmails("stmp", "contato@gmail.com", "senha");
        this.enviar.retornar("Pedido criado!");
    }
}
