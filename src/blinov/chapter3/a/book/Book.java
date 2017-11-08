/*Book: id, Название, Автор(ы), Издательство, Год издания, Количество страниц, Цена, Тип переплета.
Создать массив объектов. Вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
*/

package blinov.chapter3.a.book;

import java.util.Arrays;

public class Book {
	private int id;
	private String title;
	private String[] authors;
	private String publishingHouse;
	private int yearPublishing;
	private int numPages;
	private double price;
	private String binding;
	
	public Book(int id, String title, String[] authors, String publishingHouse, int yearPublishing) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
	}
	
	public Book(int id, String title, String[] authors, String publishingHouse, int yearPublishing, 
			int numPages, double price, String binding) {
		this.id = id;
		this.title = title;
		this.authors = authors;
		this.publishingHouse = publishingHouse;
		this.yearPublishing = yearPublishing;
		this.numPages = numPages;
		this.price = price;
		this.binding = binding;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String[] getAuthors() {
		return authors;
	}
	
	public void setAuthors(String[] authors) {
		this.authors = authors;
	}
	
	public String getPublishingHouse() {
		return publishingHouse;
	}
	
	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	public int getYearPublishing() {
		return yearPublishing;
	}
	
	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}
	
	public int getNumPages() {
		return numPages;
	}
	
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getBinding() {
		return binding;
	}
	
	public void setBinding(String binding) {
		this.binding = binding;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if(id != other.id)
			return false;
		if(title == null) {
			if(other.title != null)
				return false;
		} else if(!title.equals(other.title))
			return false;
		if(authors == null) {
			if(other.authors != null)
				return false;
		} else if(!Arrays.equals(authors, other.authors))
			return false;
		if(publishingHouse == null) {
			if(other.publishingHouse != null)
				return false;
		} else if(!publishingHouse.equals(other.publishingHouse))
			return false;
		if(yearPublishing != other.yearPublishing)
			return false;
		if(numPages != other.numPages)
			return false;
		if(price != other.price)
			return false;
		if(binding == null) {
			if(other.binding != null)
				return false;
		} else if(!binding.equals(other.binding))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result;
		result = result + id;
		result = result + ((title == null) ? 0 : title.hashCode());
		result = result + ((authors == null) ? 0 : authors.hashCode());
		result = result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = result + yearPublishing;
		result = result + numPages;
		result = result + (int) price;
		result = result + ((binding == null) ? 0 : binding.hashCode());
		return result;
	}
	
	@Override 
	public String toString() {
		return "Book [id = " + id + ", title = " + title + ", authors = " + Arrays.toString(authors) + 
				", publishingHouse = " + publishingHouse + ", yearPublishing = " + yearPublishing + 
				", numPages = " + numPages + ", price = " + price + ", binding = " + binding + "]";
	}
}
