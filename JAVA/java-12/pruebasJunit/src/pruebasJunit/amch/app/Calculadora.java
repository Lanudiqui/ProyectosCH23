package pruebasJunit.amch.app;

public class Calculadora {
	
	public int sumar(int var1, int var2) {
		return var1 + var2;
	}
	
	public int restar(int var1, int var2) {
		return var1 - var2;
	}
	
	public double dividir(double a, double b) {
		return a/b;
	}
	
	public double divisionByZero(double x, double y) {
		if (y==0) {
			throw new ArithmeticException("Division por 0");
		}
		
		return x/y;
	}
}
