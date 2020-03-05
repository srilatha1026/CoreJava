package coreJava;

public class Rectangle {

	int length;
	int breadth;
	
	public Rectangle(int l,int b) {
		length = l;
		breadth = b;
	}
	
	public Rectangle() {
		length = 0;
		breadth = 0;
	}
	
	public Rectangle(int i) {
		length = i;
		breadth = i;
	}
	public int Area() {
		int area = length*breadth;
		return area;
	}
	
	public static void main(String[] args) {
	
		Rectangle r = new Rectangle(2,3);
		int a1 = r.Area();
		System.out.println("When length and breadth are specified,the are is :  "  + a1);
		
		Rectangle r1 = new Rectangle();
		int a2 = r1.Area();
		System.out.println("When length and breadth are zero,the area is =  " + a2);
		
		Rectangle r2= new Rectangle(5);
		int a3 = r2.Area();
		System.out.println("When leangth and breadth are same,the area is = " + a3);

		
	}

}
