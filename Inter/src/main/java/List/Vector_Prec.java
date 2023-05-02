package List;

import java.util.Vector;

public class Vector_Prec {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		
		vector.add("Java");
		vector.add("Java");
		vector.add("C");
		vector.add("C++");
		vector.addElement("React");
		
		
		System.out.println("Elements are :"+vector);
		System.out.println("********************************************");
		System.out.println("Size is : "+vector.size());
		System.out.println("********************************************");
		System.out.println("Capacity :"+vector.capacity());
		System.out.println("********************************************");
		System.out.println("Index of 2 element :"+vector.elementAt(2));
		System.out.println("********************************************");
		System.out.println("First Element is :"+vector.firstElement());
		System.out.println("********************************************");
		System.out.println("Last Element :"+vector.lastElement());
		System.out.println("********************************************");
		System.out.println("Get() :"+vector.get(1));
		System.out.println("********************************************");
		System.out.println("Remove(index) :"+vector.remove(1)+" "+vector);
		System.out.println("********************************************");
		System.out.println("Hash Code of this vector : "+vector.hashCode());
		
	}
}
