package blinov.chapter3.a.task02.start;

import java.util.ArrayList;

import blinov.chapter3.a.task02.customer.Customer;
import blinov.chapter3.a.task02.customer.CustomerData;

public class Start {

	public static void main(String[] args) {
		
		ArrayList<Customer> aList = CustomerData.createListCustomer();
		
		System.out.println("�������� ���� ��������");
		CustomerData.printCustumerData(aList);
		System.out.println("");
		
		System.out.println("��������������� � ���������� ������� ���� ��������");
		ArrayList<Customer> aListCopy = CustomerData.copyList(aList);
		CustomerData.sortAlphabetically(aListCopy);
		CustomerData.printCustumerData(aListCopy);
		System.out.println("");
		
		long start = 111;
		long end = 333;
		System.out.println("������ �������� � �������� ���� � �������� ���������");
		ArrayList<Customer> aListNumCard = CustomerData.listCardNumberCustomers(aList, start, end);
		CustomerData.printCustumerData(aListNumCard);
		
	}

}
