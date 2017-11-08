/*
 * House: id, Номер квартиры, Площадь, Этаж, Количество комнат, Улица,Тип здания, Срок эксплуатации.
 * Создать массив объектов. Вывести:
 * a) список квартир, имеющих заданное число комнат;
 * b) список квартир, имеющих заданное число комнат и расположенных на этаже, 
 * который находится в заданном промежутке;
 * c) список квартир, имеющих площадь, превосходящую заданную. 
 */

package blinov.chapter3.a.house;

public class House {
	
	private int id;
	private int apartmentNumber;
	private double area;
	private int floor;
	private int numOfRooms;
	private String street;
	private String type;
	private int serviceLife;
	
	public House(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public House(double area, int floor, int numOfRooms) {
		this.area = area;
		this.floor = floor;
		this.numOfRooms = numOfRooms;
	}

	public House(int id, int apartmentNumber, double area, int floor, int numOfRooms, String street, String type, int serviceLife) {
		this.id = id;
		this.apartmentNumber = apartmentNumber;
		this.area = area;
		this.floor = floor;
		this.numOfRooms = numOfRooms;
		this.street = street;
		this.type = type;
		this.serviceLife = serviceLife;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(int apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getServiceLife() {
		return serviceLife;
	}

	public void setServiceLife(int serviceLife) {
		this.serviceLife = serviceLife;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apartmentNumber;
		result = prime * result + (int) area;
		result = prime * result + floor;
		result = prime * result + id;
		result = prime * result + numOfRooms;
		result = prime * result + serviceLife;
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		House other = (House) obj;
		if (apartmentNumber != other.apartmentNumber)
			return false;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (floor != other.floor)
			return false;
		if (id != other.id)
			return false;
		if (numOfRooms != other.numOfRooms)
			return false;
		if (serviceLife != other.serviceLife)
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", apartmentNumber=" + apartmentNumber + ", area=" + area + ", floor=" + floor
				+ ", numOfRooms=" + numOfRooms + ", street=" + street + ", type=" + type + ", serviceLife="
				+ serviceLife + "]";
	}
	
	
}
