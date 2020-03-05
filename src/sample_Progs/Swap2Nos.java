package sample_Progs;

import java.util.Scanner;

public class Swap2Nos {

	public static void main(String[] args) {
		int i;
		System.out.println("Enter i:");
		Scanner s = new Scanner(System.in);
		i=s.nextInt();
		int n;
		System.out.println("Enter n:");
		Scanner s1 = new Scanner(System.in);
		n=s1.nextInt();
		
		 i = i+n; //2+3
		 n= i-n;
		 i=i-n;

		 
		 System.out.println("Now i:"+i);
		 System.out.println("Now n:"+n);
	}

}
