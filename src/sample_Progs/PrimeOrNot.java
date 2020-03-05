package sample_Progs;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {

		int n;
		//int flag= 0;
		System.out.println("Enter th number to be checked:");
		Scanner s = new Scanner(System.in);
		
		n=s.nextInt();
		
		if(n==0 || n==1) {
			System.out.println("Number not prime");
		}
		else {
			for(int i=2;i<=n-1;) {
				int r= n%i;
				if(r==0) {
					System.out.println("Number is not prime");
					break;
				}
				else {
					System.out.println("Number entered is prime");
					break;
				}
			}
		}

}
}	
