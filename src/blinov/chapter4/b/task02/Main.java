package blinov.chapter4.b.task02;

import java.util.ArrayList;

import blinov.chapter4.b.task02.candies.Candy;
import blinov.chapter4.b.task02.candies.caramel.Caramel;
import blinov.chapter4.b.task02.candies.chocolate.ChocolateCandy;
import blinov.chapter4.b.task02.candies.lollipop.Lollipop;
import blinov.chapter4.b.task02.candies.waffle.WaffleCandy;

public class Main {

	public static void main(String[] args) {
		
		ChocolateCandy candy1 = new ChocolateCandy("������", 35, 72);
		ChocolateCandy candy2 = new ChocolateCandy("���������", 25, 80);
		ChocolateCandy candy3 = new ChocolateCandy("Toffee", 32, 65);
		
		Caramel candy4 = new Caramel("�����", 27, 85);
		Caramel candy5 = new Caramel("�����", 25, 81);
		Caramel candy6 = new Caramel("�����", 28, 82);
		
		Lollipop candy7 = new Lollipop("����", 24, 64);
		Lollipop candy8 = new Lollipop("�����", 26, 87);
		
		WaffleCandy candy9 = new WaffleCandy("������", 34, 67);
		WaffleCandy candy10 = new WaffleCandy("����� �� ������", 36, 68);
		
		ArrayList<Candy> gift = new ArrayList<>();
		gift.add(candy1);
		gift.add(candy2);
		gift.add(candy3);
		gift.add(candy4);
		gift.add(candy5);
		gift.add(candy6);
		gift.add(candy7);
		gift.add(candy8);
		gift.add(candy9);
		gift.add(candy10);
		
		System.out.println("���������� �������:");
		printCandies(gift);
		System.out.println("����� ��� �������: " + weightOfGift(gift) + " �����");
		System.out.println("     *     *     *     ");
		System.out.println("��������������� �� ���� ������ ���������� �������:");
		sortByWeight(gift);
		printCandies(gift);
		System.out.println("     *     *     *     ");
		System.out.println("������� � ����������� ������ �� " + 70 + "% �� " + 85 + "%:");
		Candy candy = findCandy(gift, 70, 85);
		System.out.println(candy.toString());
		
	}
	
	public static int weightOfGift(ArrayList<Candy> candies) {
		int totalWeight = 0;
		for(Candy x : candies) {
			totalWeight = totalWeight + x.getWeight();
		}
		return totalWeight;
	}
	
	public static void sortByWeight(ArrayList<Candy> candies) {
		for(int i = 0; i < candies.size()-1; i++) {
			for(int j = i+1; j < candies.size(); j++) {
				if(candies.get(j).getWeight() < candies.get(i).getWeight()) {
					Candy k = candies.get(i);
					candies.set(i, candies.get(j));
					candies.set(j, k);
				}
			}
		}
	}
	
	public static Candy findCandy(ArrayList<Candy> candies, int min, int max) {
		Candy candy = null;
		for(Candy x : candies) {
			int perSugar = x.getPercentageOfSugar();
			if((perSugar >= min) && (perSugar <= max)) {
				candy = x;
				break;
			}
		}
		return candy;
	}
	
	public static void printCandies(ArrayList<Candy> candies) {
		for(Candy x : candies) {
			System.out.println(x.toString());
		}
	}

}
