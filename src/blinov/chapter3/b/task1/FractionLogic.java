package blinov.chapter3.b.task1;

public class FractionLogic {
	
	public Fraction addition(Fraction fr1, Fraction fr2) {
		int m = fr1.getM() * fr2.getN() + fr2.getM() * fr1.getN();
		int n = fr1.getN() * fr2.getN();
		
		Fraction fr = new Fraction(m, n);
		
		return fr;
	}
	
	public Fraction subtraction(Fraction fr1, Fraction fr2) {
		int m = fr1.getM() * fr2.getN() - fr2.getM() * fr1.getN();
		int n = fr1.getN() * fr2.getN();
		
		Fraction fr = new Fraction(m, n);
		
		return fr;
	}
	
	public Fraction multiplication(Fraction fr1, Fraction fr2) {
		int m = fr1.getM() * fr2.getM();
		int n = fr2.getN() * fr2.getN();
		
		Fraction fr = new Fraction(m, n);
		
		return fr;
	}
	
	public Fraction division(Fraction fr1, Fraction fr2) {
		int m = fr1.getM() * fr2.getN();
		int n = fr1.getN() * fr1.getM();
		
		Fraction fr = new Fraction(m, n);
		
		return fr;
	}

}
