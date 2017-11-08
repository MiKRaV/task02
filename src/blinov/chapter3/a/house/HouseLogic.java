package blinov.chapter3.a.house;

import java.util.ArrayList;

public class HouseLogic {
	
	public ArrayList<House> listOfHouseByNumOfRooms(House[] houses, int numOfRooms) {
		ArrayList<House> list = new ArrayList<>();
		for(House x : houses) {
			if(x.getNumOfRooms() == numOfRooms)
				list.add(x);
		}
		return list;
	}
	
	public ArrayList<House> listOfHouseByNumOfRoomsAndFloor(House[] houses, int numOfRooms, int minFloor, int maxFloor) {
		ArrayList<House> list = listOfHouseByNumOfRooms(houses, numOfRooms);
		for(int i = 0; i < list.size(); ) {
			if((list.get(i).getFloor() >= minFloor) && (list.get(i).getFloor() <= maxFloor)) {
				i++;
			} else {
				list.remove(i);
			}
		}
		return list;
	}
	
	public ArrayList<House> listOfHouseByLargeArea(House[] houses, double area) {
		ArrayList<House> list = new ArrayList<>();
		for(House x : houses) {
			if(x.getArea() > area)
				list.add(x);
		}
		return list;
	}
	
	public void printListOfHouses(ArrayList<House> houses) {
		for (House house : houses) {
			System.out.println(house.toString());
		}
	}
}
