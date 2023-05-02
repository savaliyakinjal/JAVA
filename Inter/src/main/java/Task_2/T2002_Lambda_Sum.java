package Task_2;

interface Addable {
	int add(int a, int b);
}

public class T2002_Lambda_Sum {
	public static void main(String[] args) {

		Addable a1 = (a, b) -> (a + b);

		System.out.println(a1.add(10, 20));

		Addable a2 = (int a, int b) -> (a + b);
		System.out.println(a2.add(30, 20));

		Addable a3 = (int a, int b) -> {
			return (a + b);
		};
		System.out.println(a3.add(40, 50));
	}
}
