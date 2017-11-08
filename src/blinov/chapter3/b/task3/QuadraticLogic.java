package blinov.chapter3.b.task3;

public class QuadraticLogic {
	
	public double[] squareRoot(Quadratic quadratic) {
		int a = quadratic.getA();
		int b = quadratic.getB();
		int c = quadratic.getC();
		double d = Math.sqrt(Math.pow(b, 2) - 4 * a * c);
		double sqRoot1 = (- b - d) / (2 * a);
		double sqRoot2 = (- b + d) / (2 * a);
		double[] sqRoots = {sqRoot1, sqRoot2};
		return sqRoots;
	}
	
	public double valueOfDerivativeByX(Quadratic quadratic, double x) {
		int a = quadratic.getA();
		int b = quadratic.getB();
		int aA = a * 2;
		int bB = b;
		double y = aA * x + bB;
		return y;
	}
	
	public double extremumPoint(int a, int b) {
		double exPoint = (double)(- b) / (2 * a);
		return exPoint;
	}
	
	public double extremum(Quadratic quadratic) {
		int a = quadratic.getA();
		int b = quadratic.getB();
		int c = quadratic.getC();
		double exPoint = extremumPoint(a, b);
		double ex = a * Math.pow(exPoint, 2) + b * exPoint + c;
		return ex;
	}
	
	public double[] descendingInterval(Quadratic quadratic) {
		int a = quadratic.getA();
		int b = quadratic.getB();
		double exPoint = extremumPoint(a, b);
		double pointLeft = exPoint - 1; //Точка из левого интервала
		double der = valueOfDerivativeByX(quadratic, pointLeft);
		double[] decInterval = new double[2];
		
		if (der < 0) {
			decInterval[0] = Double.NEGATIVE_INFINITY;
			decInterval[1] = exPoint;
		} else {
			decInterval[0] = exPoint;
			decInterval[1] = Double.POSITIVE_INFINITY;
		}
		
		return decInterval;
	}
	
	public double[] ascendingInterval(Quadratic quadratic) {
		int a = quadratic.getA();
		int b = quadratic.getB();
		double exPoint = extremumPoint(a, b);
		double pointLeft = exPoint - 1; //Точка из левого интервала
		double der = valueOfDerivativeByX(quadratic, pointLeft);
		double[] ascendInterval = new double[2];
		
		if (der > 0) {
			ascendInterval[0] = Double.NEGATIVE_INFINITY;
			ascendInterval[1] = exPoint;
		} else {
			ascendInterval[0] = exPoint;
			ascendInterval[1] = Double.POSITIVE_INFINITY;
		}
		
		return ascendInterval;
	}
}
