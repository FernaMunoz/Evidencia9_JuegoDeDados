package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    public void testLanzar() {
        Dado dado = new Dado();
        dado.lanzar();
        int caraSuperior = dado.getCaraSuperior();

        assertTrue(caraSuperior >= 1 && caraSuperior <= 6);

    }
}

class CalculadoraTest {
    @Test
    public void testSumaDeCaras() {
        Dado dado1 = new Dado();
        Dado dado2 = new Dado();
        dado1.lanzar();
        dado2.lanzar();

        Calculadora calculadora = new Calculadora();
        int sumaEsperada = dado1.getCaraSuperior() + dado2.getCaraSuperior();
        int sumaCalculada = calculadora.sumaDeCaras(dado1, dado2);

        assertEquals(sumaEsperada, sumaCalculada);
    }
}


class JuegoDadosTest {
    @Test
    public void testSimularJugar() {
        JuegoDados juegoDados = new JuegoDados();
        juegoDados.simularJugar();


        assertTrue(juegoDados.dado1.getCaraSuperior() >= 1 && juegoDados.dado1.getCaraSuperior() <= 6);
        assertTrue(juegoDados.dado2.getCaraSuperior() >= 1 && juegoDados.dado2.getCaraSuperior() <= 6);
    }

    @Test
    public void testResultadosJuego() {
        JuegoDados juegoDados = new JuegoDados();
        juegoDados.simularJugar();

        juegoDados.resultadosJuego();
    }
}



