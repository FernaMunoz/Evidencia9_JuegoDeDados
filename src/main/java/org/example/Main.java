package org.example;

import java.util.Random;

class Dado{
    private int caraSuperior;

    public void lanzar(){
        Random random = new Random();
        caraSuperior = random.nextInt(6) + 1;
    }
    public int getCaraSuperior(){
        return caraSuperior;
    }
}
class Calculadora{
    public int sumaDeCaras(Dado dado1, Dado dado2){
        return dado1.getCaraSuperior() + dado2.getCaraSuperior();
    }
}

class JuegoDados{
    public Dado dado1;
    public Dado dado2;

    public JuegoDados(){
        dado1 = new Dado();
        dado2 = new Dado();
    }
    public void simularJugar(){
        dado1.lanzar();
        dado2.lanzar();
    }
    public void resultadosJuego(){
        int resultadoDado1 = dado1.getCaraSuperior();
        int resultadoDado2 = dado2.getCaraSuperior();

        System.out.println("Lanzamiento dado 1, resultado: " + resultadoDado1);
        System.out.println("Lanzamiento dado 2, resultado: " + resultadoDado2);

    }
}

public class Main{
    public static void main(String[] args) {
        JuegoDados juegoDados = new JuegoDados();
        Calculadora calculadora = new Calculadora();

        juegoDados.simularJugar();
        juegoDados.resultadosJuego();

        int sumaDeCaras = calculadora.sumaDeCaras(juegoDados.dado1, juegoDados.dado2);
        System.out.println("La suma de las caras superiores de los dados 1 y 2 es: " + sumaDeCaras);

        if (sumaDeCaras == 7){
            System.out.println("Obtuviste 7, GANASTE");
        } else {
            System.out.println("Perdiste");
        }
    }

}
