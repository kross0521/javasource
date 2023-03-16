	package ch7;

public class Account {
	String accountNo;
	String owner;
	int balance;

	
	
	
	
	
	
	
	int withdraw(int amount) {
	if (balance < amount) {
		//throw new RuntimeException("잔액부족");
		throw	new 	BalanceInsufficientException("잔액부족");
	}
	 balance -= amount;
	 return balance;
	}


}