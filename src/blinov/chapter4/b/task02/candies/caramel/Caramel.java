package blinov.chapter4.b.task02.candies.caramel;

import blinov.chapter4.b.task02.candies.Candy;

public class Caramel extends Candy{
	
	private String name;
	private int weight;
	private int percentageOfSugar;
	
	public Caramel(String name, int weight, int percentageOfSugar) {
		super(weight, percentageOfSugar);
		this.name = name;
		this.weight = weight;
		this.percentageOfSugar = percentageOfSugar;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getPercentageOfSugar() {
		return percentageOfSugar;
	}
	
	public void setPercentageOfSugar(int percentageOfSugar) {
		this.percentageOfSugar = percentageOfSugar;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + percentageOfSugar;
		result = prime * result + weight;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Caramel other = (Caramel) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (percentageOfSugar != other.percentageOfSugar)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Caramel [name=" + name + ", weight=" + weight + ", percentageOfSugar=" + percentageOfSugar + "]";
	}
	
	
}
