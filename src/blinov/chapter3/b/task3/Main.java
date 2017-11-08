package blinov.chapter3.b.task3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Quadratic q1 = new Quadratic(2, 6, 3);
		Quadratic q2 = new Quadratic(1, 8, 2);
		Quadratic q3 = new Quadratic(3, 7, 1);
		Quadratic q4 = new Quadratic(2, 9, 2);
		Quadratic q5 = new Quadratic(4, 9, 1);
		
		ArrayList<Quadratic> qList = new ArrayList<>();
		qList.add(q1);
		qList.add(q2);
		qList.add(q3);
		qList.add(q4);
		qList.add(q5);
		
		QuadraticLogic qLogic = new QuadraticLogic();
		
		maxAndMinRoots(qList, qLogic);
	}
	
	public static void maxAndMinRoots(ArrayList<Quadratic> qList, QuadraticLogic qLogic) {
		double maxRoot = qLogic.squareRoot(qList.get(0))[0]; // ��������� �������� ��� ����������� �����;
		double minRoot = qLogic.squareRoot(qList.get(0))[0]; // ��������� �������� ��� ����������� �����;
		
		for(Quadratic x : qList) {
			for(double y : qLogic.squareRoot(x)) {
				if (y > maxRoot) maxRoot = y;
				if (y < minRoot) minRoot = y;
			}
		}
		
		System.out.println("���������� ������: " + maxRoot);
		System.out.println("���������� ������: " + minRoot);
	}
	
	public static void test(Quadratic quadratic, QuadraticLogic qLogic) {
double[] sqRoots = qLogic.squareRoot(quadratic);
		
		for(double x : sqRoots) {
			System.out.println("������: " + x);
		}
		
		System.out.println("����� ����������: " + qLogic.extremumPoint(2, 6));
		
		System.out.println("���������: " + qLogic.extremum(quadratic));
		
		double[] decInt = qLogic.descendingInterval(quadratic);
		System.out.println("�������� ��������: (" + decInt[0] + ", " + decInt[1] + ")");
		
		double[] aInt = qLogic.ascendingInterval(quadratic);
		System.out.println("�������� �����������: (" + aInt[0] + ", " + aInt[1] + ")");
	}

}
