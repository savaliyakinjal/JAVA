package Task_2;

interface Sayable1 {

	default void say() {
		System.out.println("Hello, this is default method");
	}

	void sayMore(String msg);
}

public class T2006_DefaultClass implements Sayable1 {

	@Override
	public void sayMore(String msg) {
		System.out.println(msg);

	}

	public static void main(String[] args) {
		T2006_DefaultClass dm = new T2006_DefaultClass();
		dm.say();
		dm.sayMore("Work is worship");
	}
}
