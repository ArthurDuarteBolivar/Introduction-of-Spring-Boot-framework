package com.inversao_de_controle.dio.inversao_de_controle;

public class EnviarEmails {
    public EnviarEmails(String tipo, String endereco, String senha){

    }
    public void retornar(String mensagem){
        System.out.println("Email Enviado!");
    }
    public static EnviarEmails obterDadosEmail(){
     return new EnviarEmails("stmp", "contato@gmail.com", "12345");
    }
        
}
