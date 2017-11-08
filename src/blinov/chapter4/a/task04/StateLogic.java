package blinov.chapter4.a.task04;

public class StateLogic {
	
	public void printCapital(State state) {
		System.out.println("Столица: " + state.getCapital());
	}
	
	public void printNumOfRegios(State state) {
		System.out.println("Количество областей: " + state.getRegions().size());
	}
	
	public void printArea(State state) {
		System.out.println("Площадь: " + state.getArea());
	}
	
	public void printRegionCenters(State state) {
		System.out.print("Областные центры: ");
		for(Region x : state.getRegions()) {
			System.out.print(x.getCenter().getName() + ", ");
		}
	}
}
