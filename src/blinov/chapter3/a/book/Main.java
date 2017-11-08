
package blinov.chapter3.a.book;

public class Main {

	public static void main(String[] args) {
		BookLogic bLogic = new BookLogic();
		
		Book book1 = new Book(1, "�����1", new String[] {"�����1", "�����3"}, "������������1", 2000);
		Book book2 = new Book(2, "�����2", new String[] {"�����2"}, "������������2", 1996);
		Book book3 = new Book(3, "�����3", new String[] {"�����1", "�����2"}, "������������2", 1970);
		Book book4 = new Book(4, "�����4", new String[] {"�����4"}, "������������3", 2010);
		Book book5 = new Book(2, "�����5", new String[] {"�����3"}, "������������4", 2017);
		
		Book[] books = {book1, book2, book3, book4, book5};
		
		System.out.println("����� ������1:");
		bLogic.simplePrintTitles(bLogic.listAuthorBooks(books, "�����1"));
		
		System.out.println("����� ������������2:");
		bLogic.simplePrintTitles(bLogic.listPublishingHouseBooks(books, "������������2"));
		
		System.out.println("�����, ���������� ����� 2000 ����:");
		bLogic.simplePrintTitles(bLogic.listBooksAfterThisYear(books, 2000));

	}

}
