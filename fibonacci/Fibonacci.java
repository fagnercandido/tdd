package fibonacci;

public class Fibonacci {

	private int value;

	public Fibonacci(int value) {
		this.value = value;
	}

	public int calcular() {
		int total = 2;
		int anteriorA = 1, anteriorB = 1;
		if (this.value == 1) {
			return 1;
		}
		while(somarAnteriores(anteriorA, anteriorB) < this.value) {
			total = somarAnteriores(anteriorA, anteriorB)+total;
			int temporario = anteriorB;
			anteriorB = anteriorB + anteriorA;
			anteriorA = temporario;
		}
		return total;
	}

	private int somarAnteriores(int anteriorA, int anteriorB) {
		return anteriorA+anteriorB;
	}

}
