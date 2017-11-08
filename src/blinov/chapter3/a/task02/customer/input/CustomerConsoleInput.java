package blinov.chapter3.a.task02.customer.input;

import java.util.ArrayList;
import java.util.Scanner;

import blinov.chapter3.a.task02.customer.Customer;

public class CustomerConsoleInput {
	
	Scanner sc = new Scanner(System.in);
	
	public ArrayList<Customer> createCustomerList() {
		int countCustomer = 0;
		System.out.println("�������� ���� ��������");
		ArrayList<Customer> aList = new ArrayList<>();
		
		while(true) {
			System.out.println("�������� ������ ������� � ����? (��/���)");
			String answer = sc.nextLine();
			if(answer.equals("��")) {
				aList.add(createCustomer(countCustomer));	
				System.out.println("������ � " + countCustomer + " �������� � ����");
				countCustomer++;
			} else if(answer.equals("���")) {
				break;
			} else {
				System.out.println("�������� ����");
			}
		}
		
		System.out.println("���� �������� ������� �������");
		
		return aList;
	}
	
	public Customer createCustomer(int id) {
		System.out.println("������� ������� �������");
		String surname = sc.nextLine();
		System.out.println("������� ��� �������");
		String name = sc.nextLine();
		System.out.println("������� �������� �������");
		String patronymic = sc.nextLine();
		System.out.println("������� ����� �������");
		String address = sc.nextLine();
		System.out.println("������� ����� ��������� �������� �������");
		long numCreditCard = Long.valueOf(sc.nextLine());
		System.out.println("������� ����� ����������� ����� �������");
		long bankAccountNuber = Long.valueOf(sc.nextLine());
		
		Customer customer = new Customer(id, surname, name, patronymic, address, numCreditCard, bankAccountNuber);
		return customer;
	}
	

}
