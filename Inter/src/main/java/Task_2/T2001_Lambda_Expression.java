package Task_2;

interface Sayable{
	public String say(String name) ;
}


public class T2001_Lambda_Expression {
	public static void main(String[] args) {

		Sayable s1=(name)->{
			return "Hello "+ name;
		};
		
		System.out.println(s1.say("kinjal"));
		
		
		
		Sayable s2=name->{
			return "Hii "+name;
		};
		
		System.out.println(s2.say("kajal"));
	}
}
