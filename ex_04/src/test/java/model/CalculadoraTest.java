package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Calculadora;

public class CalculadoraTest{
	
	@Test
	public void somarTest(){
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(2,2);
		assertEquals(4, resultado);
	}
	
	@Test
	public void somarTestZero(){
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(2,0);
		assertEquals(2, resultado);
	}
	
	@Test
	public void somarTestNegativo(){
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(-2,-2);
		assertEquals(-4, resultado);
	}
	
}
