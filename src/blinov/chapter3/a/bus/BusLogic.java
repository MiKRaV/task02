package blinov.chapter3.a.bus;

import java.util.GregorianCalendar;

import java.util.ArrayList;
import java.util.Calendar;

public class BusLogic {
	
	public ArrayList<Bus> listOfBusByRouteNum(Bus[] bus, int routeNum) {
		ArrayList<Bus> list = new ArrayList<>();
		for (Bus x : bus) {
			if(x.getRouteNum() == routeNum)
				list.add(x);
		}
		return list;
	}

	public ArrayList<Bus> listOfBusByLifetime(Bus[] bus, int routeNum) {
		ArrayList<Bus> list = new ArrayList<>();
		for (Bus x : bus) {
			GregorianCalendar currentDate = (GregorianCalendar) Calendar.getInstance();
			int difference = currentDate.get(Calendar.YEAR) - x.getStartYear().get(Calendar.YEAR);
			if(difference > routeNum)
				list.add(x);
		}
		return list;
	}
	
	public ArrayList<Bus> listOfBusBymileage(Bus[] bus, double mileage) {
		ArrayList<Bus> list = new ArrayList<>();
		for (Bus x : bus) {
			if(x.getMileage() > mileage)
				list.add(x);
		}
		return list;
	}
	
	public void printListOfBus(ArrayList<Bus> bus) {
		for (Bus x : bus) {
			System.out.println(x.toString());
		}
	}
}
