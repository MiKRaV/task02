package blinov.chapter3.b.task1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		Fraction[] fr = main.createAndtInitArrayOfFractions(6);
		
		System.out.println("Вывод изначального массива дробей:");
		main.printArrayOfFraction(fr);
		System.out.println("     *     *     *     ");
		
		System.out.println("Вывод измененного массива дробей:");
		main.replacingAnEvenElement(fr);
		main.printArrayOfFraction(fr);
		System.out.println("     *     *     *     ");
		
		main.inputValues(fr);
		System.out.println("Вывод массива дробей после ввода значений:");
		main.printArrayOfFraction(fr);
		System.out.println("     *     *     *     ");

	}
	
	//Создание и инициализация массива дробей
	public Fraction[] createAndtInitArrayOfFractions(int numOfFractions) {
		Fraction[] fr = new Fraction[numOfFractions];
		
		for(int i = 0; i < fr.length; i++) {
			int m = (int) (Math.random() * 100);
			int n = (int) (Math.random() * 100);
			
			fr[i] = new Fraction(m, n);		
		}
		return fr;
	}
	
	//Ввод значений для массива дробей
	public void inputValues(Fraction[] fr) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < fr.length; i++) {
			System.out.println("Введите значения для дроби " + i);
			System.out.print("m: ");
			fr[i].setM(sc.nextInt());
			System.out.print("n: ");
			fr[i].setN(sc.nextInt());
			System.out.println();
		}
	}
	
	//Печать массива дробей
	public void printArrayOfFraction(Fraction[] fractions) {
		for(Fraction x : fractions) {
			System.out.print("[" + x.getM() + "/" + x.getN() + "]" + " ");
		}
		System.out.println();
	}
	
	//Замена четного элемента добавлением к нему следующего
	public void replacingAnEvenElement(Fraction[] fr) {
		FractionLogic fLogic = new FractionLogic();
		
		for(int i = 0; i < fr.length; i++) {
			if((i % 2 == 0) && (i + 1 < fr.length)) {
				fr[i] = fLogic.addition(fr[i], fr[i+1]);
			}
		}
	}

}
