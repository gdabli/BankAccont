package customer;

public class Account {

	private float balance;
	private Currency unit;
	public Account(float balance, Currency unit) {
		this.balance = balance;
		this.unit = unit;
	}
	
	public Currency getCurrency() {
		return unit;
	}
	
	public float getBalance() {
		return balance;
	}
}
