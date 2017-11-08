package blinov.chapter4.a.task04;

import java.util.ArrayList;

public class Region {
	
	private String name;
	private City center;
	private ArrayList<District> districts;
	
	public Region(String name) {
		this.name = name;
	}
	
	public Region(String name, City center) {
		this.name = name;
		this.center = center;
	}
	
	public Region(String name, City center, ArrayList<District> districts) {
		this.name = name;
		this.center = center;
		this.districts = districts;
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
	
	public ArrayList<District> getDistricts() {
		return districts;
	}
	
	public void setDistricts(ArrayList<District> districts) {
		this.districts = districts;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Region other = (Region) obj;
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
		if(districts == null) {
			if(other.districts != null)
				return false;
		} else if(!districts.equals(other.districts))
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
		result = result + ((districts == null) ? 0 : districts.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Region [name = " + name + ", center = " + center + ", districts = " + districts + "]";
	}
}
