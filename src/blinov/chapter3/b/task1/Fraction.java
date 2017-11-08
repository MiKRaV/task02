/*
 * Реализовать методы сложения, вычитания, умножения и деления объектов 
 * (для тех классов, объекты которых могут поддерживать арифметические действия).
 * 
 * Определить класс Дробь (Рациональная Дробь) в виде пары чисел m и n.
 * Объявить и инициализировать массив из k дробей, ввести/вывести значения для массива дробей. 
 * Создать массив/список/множество объектов и передать его в метод, 
 * который изменяет каждый элемент массива с четным индексом путем добавления следующего за ним элемента.
 */

package blinov.chapter3.b.task1;

public class Fraction {
	
	private int m;
	private int n;
	
	public Fraction(int m, int n) {
		this.m = m;
		this.n = n;
	}
	
	public int getM() {
		return m;
	}
	
	public void setM(int m) {
		this.m = m;
	}
	
	public int getN() {
		return n;
	}
	
	public void setN(int n) {
		this.n = n;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + m + n;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) 
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Fraction other = (Fraction) obj;
		if(m != other.m)
			return false;
		if(n != other.n)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Fraction [m = " + m + ", n = " + n + "]";
	}
}
