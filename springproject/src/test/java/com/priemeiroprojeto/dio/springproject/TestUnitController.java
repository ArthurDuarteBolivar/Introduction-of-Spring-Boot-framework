package com.priemeiroprojeto.dio.springproject;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestUnitController {
    @Test
    public void testUnit(){
        TextControler controller = new TextControler();
        String resutlado = controller.saudacao("DIO");
        assertEquals("Bem vindo, DIO", resutlado);

    }

}
