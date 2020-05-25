package model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import model.Calculadora;

public class CalculadoraTest{
	
	@Test
	public void somarTest(){
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(3,4);
		assertEquals(7, resultado);
	}

}
