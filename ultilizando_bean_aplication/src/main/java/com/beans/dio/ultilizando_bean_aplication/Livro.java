package com.beans.dio.ultilizando_bean_aplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;

public class Livro {
    private String nome;
    private String codigo;

    @Autowired
    AutorLivroInterface autorlivro;

    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void exibir(){
        System.out.println(this.nome + " - " + this.codigo);
        autorlivro.exibirAutor();
    }
    public AutorLivroInterface getAutorlivro() {
        return autorlivro;
    }
    public void setAutorlivro(AutorLivroInterface autorlivro) {
        this.autorlivro = autorlivro;
    }

    
}
