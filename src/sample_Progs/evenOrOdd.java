package sample_Progs;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
			
		int i ;
		
		System.out.println("Enter the integer to be checked:");
		
		Scanner s = new Scanner(System.in);
		i=s.nextInt();
		
		if(i%2==0){
			System.out.println("The number is even");
		}else {
			System.out.println("The number is odd");
		}
			
		
		
		
		
		
	}

}
