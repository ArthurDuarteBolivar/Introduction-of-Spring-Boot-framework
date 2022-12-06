package com.beans.dio.ultilizando_bean_aplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);

        Livro livro = factory.getBean(Livro.class);
        livro.setNome("Os dias de Arthur");
        livro.setCodigo("1DR4GF5");
        
        Autor autor = factory.getBean(Autor.class);
        autor.setNome("Arthur Duarte");
        livro.exibir(); 
    }
}
