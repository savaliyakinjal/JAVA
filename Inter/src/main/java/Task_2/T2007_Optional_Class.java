package Task_2;

import java.util.Optional;

public class T2007_Optional_Class {

	public static Optional<String> getName() {
		String name = "kinjal";
		return Optional.ofNullable(name);
	}

	public static void main(String[] args) {

//		String str = null;
		String str = "Java is my favorite";

//		if (str == null) {
//			System.out.println("This is null object....");
//		} else {
//			System.out.println(str.length());
//		}

		Optional<String> optional = Optional.ofNullable(str);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());

		System.out.println(optional.orElse("No value in this object"));

		Optional<String> nameOptional = getName();
		System.out.println(nameOptional.orElse("null return"));
	}
}
