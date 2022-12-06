package com.beans.dio.ultilizando_bean_aplication;

public class Autor implements AutorLivroInterface{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibirAutor(){
        System.out.println(this.nome);
    }
}
