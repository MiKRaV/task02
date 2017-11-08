/*
 * Bus: Фамилия и инициалы водителя, Номер автобуса, Номер маршрута, Марка, Год начала эксплуатации, Пробег.
 * Создать массив объектов. Вывести:
 * a) список автобусов для заданного номера маршрута;
 * b) список автобусов, которые эксплуатируются больше заданного срока;
 * c) список автобусов, пробег у которых больше заданного расстояния.
 */

package blinov.chapter3.a.bus;

import java.util.Calendar;

public class Bus {
	
	private String SurnameNP;
	private int numOfBus;
	private int routeNum;
	private String brand;
	private Calendar startYear;
	private double mileage;
	
	public Bus(int routeNum, Calendar startYear, double mileage) {
		super();
		this.routeNum = routeNum;
		this.startYear = startYear;
		this.mileage = mileage;
	}

	public Bus(String surnameNP, int numOfBus, int routeNum, String brand, Calendar startYear, double mileage) {
		super();
		SurnameNP = surnameNP;
		this.numOfBus = numOfBus;
		this.routeNum = routeNum;
		this.brand = brand;
		this.startYear = startYear;
		this.mileage = mileage;
	}

	public String getSurnameNP() {
		return SurnameNP;
	}

	public void setSurnameNP(String surnameNP) {
		SurnameNP = surnameNP;
	}

	public int getNumOfBus() {
		return numOfBus;
	}

	public void setNumOfBus(int numOfBus) {
		this.numOfBus = numOfBus;
	}

	public int getRouteNum() {
		return routeNum;
	}

	public void setRouteNum(int routeNum) {
		this.routeNum = routeNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Calendar getStartYear() {
		return startYear;
	}

	public void setStartYear(Calendar startYear) {
		this.startYear = startYear;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SurnameNP == null) ? 0 : SurnameNP.hashCode());
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(mileage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numOfBus;
		result = prime * result + routeNum;
		result = prime * result + ((startYear == null) ? 0 : startYear.hashCode());
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
		Bus other = (Bus) obj;
		if (SurnameNP == null) {
			if (other.SurnameNP != null)
				return false;
		} else if (!SurnameNP.equals(other.SurnameNP))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(mileage) != Double.doubleToLongBits(other.mileage))
			return false;
		if (numOfBus != other.numOfBus)
			return false;
		if (routeNum != other.routeNum)
			return false;
		if (startYear == null) {
			if (other.startYear != null)
				return false;
		} else if (!startYear.equals(other.startYear))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bus [SurnameNP=" + SurnameNP + ", numOfBus=" + numOfBus + ", routeNum=" + routeNum + ", brand=" + brand
				+ ", startYear=" + startYear.get(Calendar.YEAR) + ", mileage=" + mileage + "]";
	}
	
}
