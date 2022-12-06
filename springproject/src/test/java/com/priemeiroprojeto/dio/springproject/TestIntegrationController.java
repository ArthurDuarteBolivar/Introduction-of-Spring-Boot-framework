package com.priemeiroprojeto.dio.springproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;

@WebMvcTest
@ExtendWith(SpringExtension.class)
public class TestIntegrationController {
    
    @Autowired 
    private MockMvc mvc;

    @Test
    public void testInt() throws Exception{
        RequestBuilder requisicao = get("/test");
        MvcResult resultado = mvc.perform(requisicao).andReturn();
        assertEquals("Bem vindo, DIO", resultado.getResponse().getContentAsString());
    }

}
