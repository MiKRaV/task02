package blinov.chapter3.a.train;

import java.util.ArrayList;

public class TrainLogic {
	
	public ArrayList<Train> listByDestination(Train[] trains, String destination) {
		ArrayList<Train> trainsList = new ArrayList<>();
		for(Train x : trains) {
			if(x.getDestination().equals(destination))
				trainsList.add(x);
		}
		
		return trainsList;
	}
	
	public ArrayList<Train> listByDestinationAndDepartureTime(Train[] trains, String destination, int hour) {
		ArrayList<Train> trainsList = new ArrayList<>();
		for(Train x : trains) {
			if(x.getDestination().equals(destination)) {
				int depHour = x.getDepartureTime()[0];
				int depMinute = x.getDepartureTime()[1];
				if((depHour == hour && depMinute > 0) || (depHour > hour)) 
					trainsList.add(x);
			}	
		}
		
		return trainsList;
	}
	
	public ArrayList<Train> listByDestinationAndSeat(Train[] trains, String destination, String seat) {
		ArrayList<Train> trainsList = new ArrayList<>();
		for(Train x : trains) {
			if(x.getDestination().equals(destination)) {
				if(x.getNumOfSeats().containsKey(seat)) {
					if(x.getNumOfSeats().get(seat) > 0)
						trainsList.add(x);
				}
			}
		}
		
		return trainsList;
	}
}
