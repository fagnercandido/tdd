package fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

	@Test
	public void numeroUmTest() {
		Fibonacci fib = new Fibonacci(1);
		assertEquals(1, fib.calcular());
	}
	
	@Test
	public void numeroDoisTest() {
		Fibonacci fib = new Fibonacci(2);
		assertEquals(2, fib.calcular());
	}
	
	@Test
	public void numero5Test() {
		Fibonacci fib = new Fibonacci(5);
		assertEquals(7, fib.calcular());
	}
	
	@Test
	public void numero8Test() {
		Fibonacci fib = new Fibonacci(8);
		assertEquals(12, fib.calcular());
	}
	
	@Test
	public void numero21Test() {
		Fibonacci fib = new Fibonacci(21);
		assertEquals(33, fib.calcular());
	}

}
