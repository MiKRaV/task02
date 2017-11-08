package blinov.chapter4.a.task10;

public class Dog extends Animal {
	
	private String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		
		Dog other = (Dog) obj;
		if(name == null) {
			if(other.name != null)
				return false;
		} else if(!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Dog [name = " + name + "]";
	}
	
	public void printName() {
		System.out.println("Имя: " + name);
	}
	
	public void bark() {
		System.out.println("ГАВ!!!");
	}
	
	public void jump() {
		System.out.println("Прыжок");
	}
	
	public void run() {
		System.out.println("Бег");
	}
	
	public void bite() {
		System.out.println("Укус");
	}

}
