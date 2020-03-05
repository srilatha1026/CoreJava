package coreJava;

public class Students {

	 String studName;
	
	public Students(String name) {
		
		studName = name;
	}
	public Students() {
		
		studName = "Unknown";
	}
	
	
	public static void main(String[] args) {

		Students withName = new Students("simlat");
		Students withoutName = new Students();
		
		System.out.println(withName.studName);
		System.out.println(withoutName.studName);
		
		}

}
