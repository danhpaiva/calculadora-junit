package com.example.calculadora.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculadoraTeste {
  @Test
  public void SomarDoisNumerosComSucesso() {
    Calculadora calculadora = new Calculadora();

    int resultado = calculadora.somar(50, 25);

    assertEquals(75, resultado);
  }
}
