package blinov.chapter3.a.train;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map1 = new HashMap<>();
		map1.put(Train.COMMON_SEAT, 56);
		map1.put(Train.RESERVED_SEAT, 20);
		Train train1 = new Train("Минск", 23, new int[] {13, 45}, map1); 
		
		HashMap<String, Integer> map2 = new HashMap<>();
		map2.put(Train.COMMON_SEAT, 12);
		map2.put(Train.RESERVED_SEAT, 45);
		Train train2 = new Train("Минск", 13, new int[] {1, 13}, map2); 
		
		HashMap<String, Integer> map3 = new HashMap<>();
		map3.put(Train.COMPARTMENT, 36);
		map3.put(Train.RESERVED_SEAT, 45);
		Train train3 = new Train("Минск", 45, new int[] {15, 15}, map3); 
		
		HashMap<String, Integer> map4 = new HashMap<>();
		map4.put(Train.COMPARTMENT, 36);
		map4.put(Train.RESERVED_SEAT, 45);
		Train train4 = new Train("Гродно", 17, new int[] {15, 15}, map4); 
		
		Train[] trains = new Train[] {train1, train2, train3, train4};
		
		TrainLogic tLogic = new TrainLogic();
		
		System.out.println("Поезда, следующие до Минска");
		ArrayList<Train> list1 = tLogic.listByDestination(trains, "Гродно");
		for (Train x : list1) {
			System.out.println(x + ", ");
		}
		
		System.out.println();
		
		System.out.println("Поезда, следующие до Минска после 13 часов");
		ArrayList<Train> list2 = tLogic.listByDestinationAndDepartureTime(trains, "Минск", 13);
		for (Train x : list2) {
			System.out.println(x + ", ");
		}
		
		System.out.println();
		
		System.out.println("Поезда, следующие до Минска и имеющие общие места");
		ArrayList<Train> list3 = tLogic.listByDestinationAndSeat(trains, "Минск", Train.COMMON_SEAT);
		for (Train x : list3) {
			System.out.println(x + ", ");
		}
	}

}
