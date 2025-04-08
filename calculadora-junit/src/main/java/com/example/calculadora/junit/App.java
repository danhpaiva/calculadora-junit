package com.example.calculadora.junit;

public class App {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resultadoSoma = calculadora.somar(50, 25);
        System.out.println("Resultado Soma: " + resultadoSoma);
    }
}
