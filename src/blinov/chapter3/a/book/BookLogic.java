package blinov.chapter3.a.book;

import java.util.ArrayList;

public class BookLogic {
	
	public ArrayList<String> listAuthorBooks(Book[] book, String author) {
		ArrayList<String> bookList = new ArrayList<>();
		
		for(Book x : book) {
			for(String y : x.getAuthors()) {
				if(y.equals(author)) {
					bookList.add(x.getTitle());
					break;
				}
			}
		}
		
		return bookList;
	}
	
	public ArrayList<String> listPublishingHouseBooks(Book[] book, String publishingHouse) {
		ArrayList<String> bookList = new ArrayList<>();
		
		for(Book x : book) {
			if(x.getPublishingHouse().equals(publishingHouse)) {
				bookList.add(x.getTitle());
			}
		}
		
		return bookList;
	}
	
	public ArrayList<String> listBooksAfterThisYear(Book[] book, int yearPublishing) {
		ArrayList<String> bookList = new ArrayList<>();
		
		for(Book x : book) {
			if(x.getYearPublishing() > yearPublishing) {
				bookList.add(x.getTitle());
			}
		}
		
		return bookList;
	}
	
	public void simplePrintTitles(ArrayList<String> list) {
		for(String x : list) {
			System.out.print(x + ", ");
		}
		System.out.println();
	}
}
