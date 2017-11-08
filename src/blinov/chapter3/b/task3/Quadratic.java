/*
 * Определить класс Квадратное уравнение. Реализовать методы для поиска корней, 
 * экстремумов, а также интервалов убывания/возрастания. Создать массив/список/множество объектов
 * и определить наибольшие и наименьшие по значению корни.
 */

package blinov.chapter3.b.task3;

public class Quadratic {
	
	private int a;
	private int b;
	private int c;
	
	public Quadratic(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public int getB() {
		return b;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getC() {
		return c;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null) 
			return false;
		if(getClass() != obj.getClass())
			return false;
		Quadratic other = (Quadratic) obj;
		if(a != other.a)
			return false;
		if(b != other.b)
			return false;
		if(c != other.c)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		result = result + a;
		result = result + b;
		result = result + c;
		return result;
	}
	
	@Override
	public String toString() {
		return "Quadratic [a = " + a + ", b = " + b + ", c = " + c + "]";
	}
}
