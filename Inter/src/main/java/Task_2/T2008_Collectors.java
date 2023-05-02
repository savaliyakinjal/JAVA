package Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Product1 {
	int id;
	String name;
	float price;

	public Product1(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class T2008_Collectors {
	public static void main(String[] args) {

		List<Product1> productsList = new ArrayList<>();
		// Adding Products
		productsList.add(new Product1(1, "HP Laptop", 25000f));
		productsList.add(new Product1(2, "Dell Laptop", 30000f));
		productsList.add(new Product1(3, "Lenevo Laptop", 28000f));
		productsList.add(new Product1(4, "Sony Laptop", 28000f));
		productsList.add(new Product1(5, "Apple Laptop", 90000f));
		List<Float> productPriceList = productsList.stream().map(x -> x.price).collect(Collectors.toList());
		System.out.println(productPriceList);

		Set<Float> productPriceList1 = productsList.stream().map(x -> x.price).collect(Collectors.toSet());
		System.out.println(productPriceList1);

		Double sumPrices = productsList.stream().collect(Collectors.summingDouble(x -> x.price));
		System.out.println("Sum of prices: " + sumPrices);
		Integer sumId = productsList.stream().collect(Collectors.summingInt(x -> x.id));
		System.out.println("Sum of id's: " + sumId);

		Double average = productsList.stream().collect(Collectors.averagingDouble(p -> p.price));
		System.out.println("Average price is: " + average);

		Long noOfElements = productsList.stream().collect(Collectors.counting());
		System.out.println("Total elements : " + noOfElements);
	}
}
