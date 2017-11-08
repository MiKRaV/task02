package blinov.chapter4.a.task04;

public class City {
	
	private String name;
	private int population;
	
	public City(String name) {
		this.name = name;
	}
	
	public City(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPopulation() {
		return population;
	}
	
	public void setPopulation(int population) {
		this.population = population;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if(name == null) {
			if(other.name != null) 
				return false;
		} else if(!name.equals(other))
			return false;
		if(population != other.population)
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime;
		result = result + ((name == null) ? 0 : name.hashCode());
		result = result + population;
		return result;
	}
	
	@Override
	public String toString() {
		return "City [name = " + name + ", population = " + population + "]";
	}

}
