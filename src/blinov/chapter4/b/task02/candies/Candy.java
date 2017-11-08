package blinov.chapter4.b.task02.candies;

public abstract class Candy {
	
	private int weight;
	private int percentageOfSugar;
	
	public Candy(int weight, int percentageOfSugar) {
		this.weight = weight;
		this.percentageOfSugar = percentageOfSugar;
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
		int result = 1;
		result = prime * result + percentageOfSugar;
		result = prime * result + weight;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		if (percentageOfSugar != other.percentageOfSugar)
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Candy [weight=" + weight + ", percentageOfSugar=" + percentageOfSugar + "]";
	}
	
	
	
	
}
