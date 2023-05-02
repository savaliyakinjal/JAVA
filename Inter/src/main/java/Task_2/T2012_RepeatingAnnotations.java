package Task_2;

import java.lang.reflect.Field;

public class T2012_RepeatingAnnotations {
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Products products = new Products();
		Class<?> c = products.getClass();
		Field fd = c.getDeclaredField("volleyBall");
		Country[] countries = fd.getAnnotationsByType(Country.class);
		for (Country country : countries) {
			System.out.println(country.name());
		}
	}
	
}
