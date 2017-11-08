package blinov.chapter4.a.task04;

import java.util.ArrayList;

public class District {
	
	private String name;
	private City center;
	private ArrayList<City> cities;
	
	public District(String name) {
		this.name = name;
	}
	
	public District(String name, City center) {
		this.name = name;
		this.center = center;
	}
	
	public District(String name, City center, ArrayList<City> cities) {
		this.name = name;
		this.center = center;
		this.cities = cities;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public City getCenter() {
		return center;
	}
	
	public void setCenter(City center) {
		this.center = center;
	}
	
	public ArrayList<City> getCities() {
		return cities;
	}
	
	public void setCities(ArrayList<City> cities) {
		this.cities = cities;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		District other = (District) obj;
		if(name == null) {
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		if(center == null) {
			if(other.center != null)
				return false;
		} else if(!center.equals(other.center))
			return false;
		if(cities == null) {
			if(other.cities != null)
				return false;
		} else if(!cities.equals(other))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime;
		result = result + ((name == null) ? 0 : name.hashCode());
		result = result + ((center == null) ? 0 : center.hashCode());
		result = result + ((cities == null) ? 0 : cities.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "District [name = " + name + ", center = " + center + ", cities = " + cities + "]";
	}

}
