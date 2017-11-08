package blinov.chapter4.a.task04;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		int numOfCities = 7;
		ArrayList<City> cities = createCitiesList(numOfCities);
		ArrayList<Region> regions = creatRegionsList(cities);
		State state = new State("Государство", cities.get(0), 546.42, regions);
		StateLogic logic = new StateLogic();
		logic.printCapital(state);
		System.out.println("     *     *     *     ");
		logic.printNumOfRegios(state);
		System.out.println("     *     *     *     ");
		logic.printArea(state);
		System.out.println("     *     *     *     ");
		logic.printRegionCenters(state);

	}
	
	public static ArrayList<City> createCitiesList(int numOfCities) {
		ArrayList<City> cities = new ArrayList<>();
		for(int i = 0; i < numOfCities; i++) {
			int population = (int) (Math.random() * 1000000);
			City city = new City("Город" + i, population);
			cities.add(city);
		}
		
		return cities;
	}
	
	public static ArrayList<Region> creatRegionsList(ArrayList<City> cities) {
		ArrayList<Region> regions = new ArrayList<>();
		for(int i = 0; i < cities.size(); i++) {
			Region region = new Region("Область" + i, cities.get(i));
			regions.add(region);
		}
		
		return regions;
	}
}
