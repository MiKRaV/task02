package blinov.chapter3.a.task02.customer.input;

import java.util.ArrayList;
import java.util.Scanner;

import blinov.chapter3.a.task02.customer.Customer;

public class CustomerConsoleInput {
	
	Scanner sc = new Scanner(System.in);
	
	public ArrayList<Customer> createCustomerList() {
		int countCustomer = 0;
		System.out.println("Создание базы клиентов");
		ArrayList<Customer> aList = new ArrayList<>();
		
		while(true) {
			System.out.println("Добавить нового клиента в базу? (да/нет)");
			String answer = sc.nextLine();
			if(answer.equals("да")) {
				aList.add(createCustomer(countCustomer));	
				System.out.println("Клиент № " + countCustomer + " добавлен в базу");
				countCustomer++;
			} else if(answer.equals("нет")) {
				break;
			} else {
				System.out.println("неверный ввод");
			}
		}
		
		System.out.println("База клиентов успешно создана");
		
		return aList;
	}
	
	public Customer createCustomer(int id) {
		System.out.println("Введите фамилию клиента");
		String surname = sc.nextLine();
		System.out.println("Введите имя клиента");
		String name = sc.nextLine();
		System.out.println("Введите отчество клиента");
		String patronymic = sc.nextLine();
		System.out.println("Введите адрес клиента");
		String address = sc.nextLine();
		System.out.println("Введите номер кредитной карточки клиента");
		long numCreditCard = Long.valueOf(sc.nextLine());
		System.out.println("Введите номер банковского счета клиента");
		long bankAccountNuber = Long.valueOf(sc.nextLine());
		
		Customer customer = new Customer(id, surname, name, patronymic, address, numCreditCard, bankAccountNuber);
		return customer;
	}
	

}
