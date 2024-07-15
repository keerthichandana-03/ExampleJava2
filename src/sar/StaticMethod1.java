package sar;

public class StaticMethod1 {
	static int currentBalance = 1000;

	public static void greetCustomer()
	{
		System.out.println("HEllo Customer");
	}
	public void deposit(int amount) {
		currentBalance = currentBalance+amount;
		
		
	}
	public static void withdrawal(int amount) {
		currentBalance =currentBalance-amount;
		
	}
	public int getCurrentBalance() {
		return currentBalance;
	}
	
	public static void main(String[] args) {
		greetCustomer();
		StaticMethod1 ss = new StaticMethod1();
		ss.deposit(500);
		withdrawal(200);
		System.out.println(ss.getCurrentBalance());

	}

}
