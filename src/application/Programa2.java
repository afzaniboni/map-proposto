package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import entities.Product2;

public class Programa2 {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		List<Product2> list2 = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		list2.add(new Product2("TV", 900.00));
		list2.add(new Product2("Notebook", 1200.00));
		list2.add(new Product2("Tablet", 450.00));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		list2.sort((p1, p2) -> p1.getName2().toUpperCase().compareTo(p2.getName2().toUpperCase()));

		for (Product p : list) {
			System.out.println(p);
		}
	}
}