package baitap6;

public class Account {
	private long accountNumber;
	private String name;
	private double balance;
	private final double rate = 0.035;
	private boolean kt = false;

	public Account() {
		accountNumber = 999999;
		balance = 2;
	}

	public Account(long accountNumber, String name, double balance) {
		if (accountNumber > 0) {
			this.accountNumber = accountNumber;
		}
		if (name.length()>=0) {
			this.name = name;
		}
		if (balance >= 2) {
			this.balance = balance;
		}
	}

	public Account(long accountNumber, String name) {
		this.accountNumber = accountNumber;
		this.name = name;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public boolean deposit(double amount) {
		if (amount > 0) {
			kt = true;
			balance+= amount;
		}
		return kt;
	}

	public boolean withdraw(double amount, double fee) {
		if(amount > 0 && amount+fee <= balance) {
			kt = true;
			balance-=amount+fee;
		}
		return kt;
	}

	public void addInterest() {
		balance+=balance*rate;
	}

	public boolean transfer(Account acc2, double amount) {
		if (balance >= amount) {
			acc2.deposit(amount);
			balance-=amount;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}

}
