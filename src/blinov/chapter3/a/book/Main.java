
package blinov.chapter3.a.book;

public class Main {

	public static void main(String[] args) {
		BookLogic bLogic = new BookLogic();
		
		Book book1 = new Book(1, "Книга1", new String[] {"Автор1", "Автор3"}, "Издательство1", 2000);
		Book book2 = new Book(2, "Книга2", new String[] {"Автор2"}, "Издательство2", 1996);
		Book book3 = new Book(3, "Книга3", new String[] {"Автор1", "Автор2"}, "Издательство2", 1970);
		Book book4 = new Book(4, "Книга4", new String[] {"Автор4"}, "Издательство3", 2010);
		Book book5 = new Book(2, "Книга5", new String[] {"Автор3"}, "Издательство4", 2017);
		
		Book[] books = {book1, book2, book3, book4, book5};
		
		System.out.println("Книги Автора1:");
		bLogic.simplePrintTitles(bLogic.listAuthorBooks(books, "Автор1"));
		
		System.out.println("Книги Издательства2:");
		bLogic.simplePrintTitles(bLogic.listPublishingHouseBooks(books, "Издательство2"));
		
		System.out.println("Книги, выпущенные после 2000 года:");
		bLogic.simplePrintTitles(bLogic.listBooksAfterThisYear(books, 2000));

	}

}
