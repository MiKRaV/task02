package blinov.chapter4.a.task04;

import java.util.ArrayList;

public class State {

	private String name;
	private City capital;
	private double area;
	private ArrayList<Region> regions;
	
	public State(String name) {
		this.name = name;
	}
	
	public State(String name, City capital, double area, ArrayList<Region> regions) {
		this.name = name;
		this.capital = capital;
		this.area = area;
		this.regions = regions;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public City getCapital() {
		return capital;
	}
	
	public void setCapital(City capital) {
		this.capital = capital;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public ArrayList<Region> getRegions() {
		return regions;
	}
	
	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null) 
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		State other = (State) obj;
		if(name == null) {
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		if(capital == null) {
			if(other.capital != null)
				return false;
		} else if(!capital.equals(other.capital))
			return false;
		if(area != other.area)
			return false;
		if(regions == null) {
			if(other.regions != null)
				return false;
		} else if(!regions.equals(other.regions))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime;
		result = result + ((name == null) ? 0 : name.hashCode());
		result = result + ((capital == null) ? 0 : capital.hashCode());
		result = result + (int) area;
		result = result + ((regions == null) ? 0 : regions.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "State [name = " + name + ", capital = " + capital + ", area = " + area +
				", regions = " + regions + "]";
	}
	
}
