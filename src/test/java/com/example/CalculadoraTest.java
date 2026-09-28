package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void probarSuma() {

        Calculadora calculadora = new Calculadora();   //Arrange

        int resultado = calculadora.sumar(2, 3);  //Act

        assertEquals(5, resultado);                    //Assert
    }

    @Test
    void probarResta() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.restar(10, 4);

        assertEquals(6, resultado);
    }

    @Test
    void probarMultiplicacion() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(3, 4);

        assertEquals(12, resultado);
    }

    @Test
    void probarNumeroPositivo() {

        Calculadora calculadora = new Calculadora();

        assertTrue(calculadora.esPositivo(10));
    }

    @Test
    void probarNumeroNegativo() {

        Calculadora calculadora = new Calculadora();

        assertFalse(calculadora.esPositivo(-5));
    }

    @Test
    void dividirPorCeroGeneraExcepcion() {

        Calculadora calculadora = new Calculadora();

        assertThrows(
            IllegalArgumentException.class,
            () -> calculadora.dividir(10, 0)
        );
    }
}