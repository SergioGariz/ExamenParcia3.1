import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test void sumaTest() 
	{
		Calculadora calc = new Calculadora(); 
		assertEquals(6, calc.suma(1,5), "La salida debería ser la suma de los dos números"); 
	
	}
	
	@Test void divideTest()
	{
		Caluladora calc = new Calculadora();
		assertEquals(2, calc.divide(6,2), "La salida deberia ser la division de los dos numeros");
	}
	
}

