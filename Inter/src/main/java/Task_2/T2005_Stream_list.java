package Task_2;

import java.util.ArrayList;
import java.util.List;

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

public class T2005_Stream_list {
	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product(1, "HP Laptop", 25000f));
		list.add(new Product(2, "Dell Laptop", 30000f));
		list.add(new Product(3, "Lenevo Laptop", 28000f));
		list.add(new Product(4, "Sony Laptop", 28000f));
		list.add(new Product(5, "Apple Laptop", 90000f));
		list.stream().filter(product -> product.price == 30000).forEach(product -> System.out.println(product.name));

		Float totalPrice = list.stream().map(product -> product.price).reduce(0.0f, (sum, price) -> sum + price);
		System.out.println(totalPrice);

		Float totalPrice2=list.stream().map(product->product.price).reduce(0.0f, Float::sum);
		System.out.println(totalPrice2);
		
		long count=list.stream().filter(product->product.price>25000).count();
		System.out.println(count);
	}
}
