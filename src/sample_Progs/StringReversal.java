package sample_Progs;

public class StringReversal {

	public static void main(String[] args) {
		
		String str1 ="My name is Latha";
		int lengthOfString = str1.length();
		String str2 = "";
		for(int i=lengthOfString-1;i>=0;i--) {
			
			str2= str2+str1.charAt(i);
		}
	
	System.out.println("Reversed string is:" + str2);
	
	}
	

}
