package com.beans.dio.ultilizando_bean_aplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Livro getlivro(){
        return new Livro();
    }
    
    @Bean
    public AutorLivroInterface getAutorlivro(){
        return new Autor();
    }
}
