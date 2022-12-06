package com.injecao_de_dependencias.dio.injecao_de_depedencias;

public class Condutor {
    public static void main(String[] args) {
        Condutor condutor = new Condutor(new Moto());
        condutor.automovel();
    }

    private Veiculo veiculo;
    
    public Condutor(Veiculo obj){
        this.veiculo = obj;
    }

    public void automovel(){
        veiculo.acao();
    }
}
