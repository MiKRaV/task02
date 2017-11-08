package blinov.chapter3.a.bus;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) {
		
		Bus[] bus = {new Bus(13, new GregorianCalendar(1986, Calendar.APRIL, 15), 546046),
					new Bus(7, new GregorianCalendar(1991, Calendar.SEPTEMBER, 30), 430147),
					new Bus(23, new GregorianCalendar(2007, Calendar.JANUARY, 10), 150968),
					new Bus(13, new GregorianCalendar(2003, Calendar.MARCH, 8), 389341),
					new Bus(41, new GregorianCalendar(1996, Calendar.AUGUST, 29), 600763),
					new Bus(13, new GregorianCalendar(2015, Calendar.NOVEMBER, 23), 79642)}; 
		
		BusLogic logic = new BusLogic();
		
		System.out.println("Список автобусов для маршрута № 13: ");
		ArrayList<Bus> list1 = logic.listOfBusByRouteNum(bus, 13);
		logic.printListOfBus(list1);
		System.out.println();
		
		System.out.println("Список автобусов, которые эксплуатируются больше 20 лет: ");
		ArrayList<Bus> list2 = logic.listOfBusByLifetime(bus, 20);
		logic.printListOfBus(list2);
		System.out.println();
		
		System.out.println("Список автобусов, пробег которых больше 300000 км: ");
		ArrayList<Bus> list3 = logic.listOfBusBymileage(bus, 300000);
		logic.printListOfBus(list3);
		System.out.println();
	}

}
