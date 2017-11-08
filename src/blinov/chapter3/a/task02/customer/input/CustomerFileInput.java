package blinov.chapter3.a.task02.customer.input;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import blinov.chapter3.a.task02.customer.Customer;

public class CustomerFileInput {
	
	public ArrayList<Customer> createCustomerList() {
		System.out.println("Создание базы клиентов");
		ArrayList<Customer> aList = new ArrayList<>();
		
		try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream("E:\\Test.txt")))){
            String line;
            while ((line = reader.readLine()) != null) {
            	aList.add(createCustomer(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		System.out.println("База клиентов успешно создана");
		
		return aList;
	}
	
	public Customer createCustomer(String str) {
		String[] arStr = str.split(",");
		int id = Integer.valueOf(arStr[0]);
		String surname = arStr[1];
		String name = arStr[2];
		String patronymic = arStr[3];
		String address = arStr[4];
		long numCreditCard = Long.valueOf(arStr[5]);
		long bankAccountNuber = Long.valueOf(arStr[6]);
		
		Customer customer = new Customer(id, surname, name, patronymic, address, numCreditCard, bankAccountNuber);
		
		return customer;
	}
}
