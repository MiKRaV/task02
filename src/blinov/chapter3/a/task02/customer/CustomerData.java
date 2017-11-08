package blinov.chapter3.a.task02.customer;

import java.util.ArrayList;
import java.util.Scanner;

import blinov.chapter3.a.task02.customer.input.CustomerConsoleInput;
import blinov.chapter3.a.task02.customer.input.CustomerFileInput;

public class CustomerData {
	
	public static ArrayList<Customer> createListCustomer() {
		
		Scanner sc = new Scanner(System.in);
		String inputValue;
		ArrayList<Customer> aList = null;
		
		while(true) {
			System.out.println("Для ввода клиентов с консоли введите \"1\", " +
					"для чтения клиентов из файла введите \"2\"");
			inputValue = sc.nextLine();
			if (!inputValue.equals("1") && !inputValue.equals("2")) {
				System.out.println("Неверный ввод");
			} else {
				break;
			}
		}
		
		switch(inputValue) {
		case "1": 
			CustomerConsoleInput cInput = new CustomerConsoleInput();
			aList = cInput.createCustomerList();
			break;
			
		case "2":
			CustomerFileInput cFileInput = new CustomerFileInput();
			aList = cFileInput.createCustomerList();
			break;
		}
		
		sc.close();
		
		return aList;
	}
	
	public static void sortAlphabetically(ArrayList<Customer> listCustomer) {
		
		for(int i = 0; i < listCustomer.size(); i++) {
			for(int j = i; j < listCustomer.size(); j++) {
				
				String client1 = listCustomer.get(i).getSurname() + " " + 
						listCustomer.get(i).getName() + " " + listCustomer.get(i).getPatronymic();
				String client2 = listCustomer.get(j).getSurname() + " " + 
						listCustomer.get(j).getName() + " " + listCustomer.get(j).getPatronymic();
				
				if(client1.compareTo(client2) > 0) {
					Customer customer = listCustomer.get(i);
					listCustomer.set(i, listCustomer.get(j));
					listCustomer.set(j, customer);
				}
			}
		}
	}
	
	public static ArrayList<Customer> listCardNumberCustomers(ArrayList<Customer> listCustomer, long start, long end) {
		ArrayList<Customer> cList = new ArrayList<>();
		
		for(Customer x : listCustomer) {
			if ((x.getNumCreditCard() >= start) && (x.getNumCreditCard() <= end)) {
				cList.add(x);
			}
		}
		return cList;
	}
	
	public static ArrayList<Customer> copyList(ArrayList<Customer> listCustomer) {
		ArrayList<Customer> cList = new ArrayList<>();
		
		for(Customer x : listCustomer) {
			cList.add(x);
		}
		
		return cList;
	}
	
	public static void printCustumerData(ArrayList<Customer> listCustomer) {
		ArrayList<Customer> list = listCustomer;
		for(Customer x : list) {
			System.out.println("ID: " + x.getId());
			System.out.println("ФИО: " + x.getSurname() + " " + x.getName() + " " + x.getPatronymic());
			System.out.println("Адрес: " + x.getAddress());
			System.out.println("Номер банковской карточки: " + x.getNumCreditCard());
			System.out.println("Номер банковского счета: " + x.getBankAccountNuber());
			System.out.println("   *    *   *   ");
		}
		
	}
	
	
}
