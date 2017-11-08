package blinov.chapter3.a.house;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		House[] houses = {new House(81, 4, 3),
							new House(125.7, 3, 4),
							new House(34.5, 2, 1),
							new House(56.6, 5, 2),
							new House(67, 6, 2),
							new House(97.2, 4, 4)};
		
		HouseLogic logic = new HouseLogic();
		
		System.out.println("список квартир, имеющих 2 комнаты");
		ArrayList<House> list1 = logic.listOfHouseByNumOfRooms(houses, 2);
		logic.printListOfHouses(list1);
		System.out.println();
		
		System.out.println("список квартир, имеющих 3 комнаты и расположенных на этажах в интервале 2-5");
		ArrayList<House> list2 = logic.listOfHouseByNumOfRoomsAndFloor(houses, 3, 2, 5);
		logic.printListOfHouses(list2);
		System.out.println();
		
		System.out.println("список квартир, имеющих площадь, превосходящую 67 м2");
		ArrayList<House> list3 = logic.listOfHouseByLargeArea(houses, 67);
		logic.printListOfHouses(list3);
		System.out.println();
				
	}

}
