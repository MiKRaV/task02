/*
* Train: Пункт назначения, Номер поезда, Время отправления, Число мест 
* (общих, купе, плацкарт, люкс).
* Создать массив объектов. Вывести:
* a) список поездов, следующих до заданного пункта назначения;
* b) список поездов, следующих до заданного пункта назначения и 
* отправляющихся после заданного часа;
* c) список поездов, следующих до заданного пункта назначения и имеющих общие места.
*/

package blinov.chapter3.a.train;

import java.util.HashMap;

public class Train {
	public static final String COMMON_SEAT = "общее";
	public static final String COMPARTMENT = "купе";
	public static final String RESERVED_SEAT = "плацкарт";
	public static final String LUX = "люкс";
	
	private String destination;
	private int trainNum;
	private int[] departureTime;
	private HashMap<String, Integer> numOfSeats;
	
	public Train(String destination) {
		this.destination = destination;
	}
	
	public Train(String destination, int[] departureTime) {
		this.destination = destination;
		this.departureTime = departureTime;
	}
	
	public Train(String destination, HashMap<String, Integer> numOfSeats) {
		this.destination = destination;
		this.numOfSeats = numOfSeats;
	}
	
	public Train(String destination, int trainNum, int[] departureTime, HashMap<String, Integer> numOfSeats) {
		this.destination = destination;
		this.trainNum = trainNum;
		this.departureTime = departureTime;
		this.numOfSeats = numOfSeats;
	}
	
	public String getDestination() {
		return destination;
	}
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public int getTrainNum() {
		return trainNum;
	}
	
	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}
	
	public int[] getDepartureTime() {
		return departureTime;
	}
	
	public void setDepartureTime(int[] departureTime) {
		this.departureTime = departureTime;
	}
	
	public HashMap<String, Integer> getNumOfSeats() {
		return numOfSeats;
	}
	
	public void setNumOfSeats(HashMap<String, Integer> numOfSeats) {
		this.numOfSeats = numOfSeats;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if(destination == null) {
			if(other.destination != null)
				return false;
		} else if(!destination.equals(other.destination))
			return false;
		if(trainNum != other.trainNum)
			return false;
		if(departureTime == null) {
			if(other.departureTime != null) 
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if(numOfSeats == null) {
			if(other.numOfSeats != null)
				return false;
		} else if (!numOfSeats.equals(other.numOfSeats))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = result * prime;
		result = result + ((destination == null) ? 0 : destination.hashCode());
		result = result + trainNum;
		result = result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = result + ((numOfSeats == null) ? 0 : numOfSeats.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "Train [destination = " + destination + ", trainNum = " + trainNum + 
				", departureTime = " + departureTime[0] + ":" + departureTime[1] + 
				", numOfSeats = " + numOfSeats + "]";
	}
}
