package coreJava;

public class Programming {

	String s;
	
	public Programming() {
		s = "I love Programming";
		
	}
	
	public Programming(String a) {
		s = "I love " + a;
		
	}
	
	
	public static void main(String[] args) {
		Programming p1 = new Programming();
		String str1 = p1.s;
		System.out.println(str1);
		
		Programming p2 = new Programming("Java");
		String str2 = p2.s;
		System.out.println(str2);

	}

}
