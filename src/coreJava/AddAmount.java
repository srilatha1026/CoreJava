package coreJava;

public class AddAmount {

	int amount = 50;
	
	public AddAmount() {
		
		amount = 0+amount;
	}
	
	public AddAmount(int amt) {
		
		amount = amt+amount;
	}	
	
//	public int piggieBank() {
//		newAmount = 
//	}
	
	public static void main(String[] args) {
	
		AddAmount pb1 = new AddAmount();
		int newamount1 = pb1.amount;
		System.out.println("new amount in piggiebank is  " + newamount1);
		
		
		AddAmount pb2 = new AddAmount(50);
		int newamount2 = pb2.amount;
		System.out.println("new amount in piggiebank is  " + newamount2);

	}

}
