package bank;

public class BankAccount {
	String name;
	long accountNumber;
	double balance;
	
	public void displayCardInfo() {
		System.out.println("Holder name "+ name+" His/Her account number: "+accountNumber+ " Balance: "+balance);
	}
	public void deposit(int addedMoney) {
		balance = balance+addedMoney;
	}
	public void withdraw(double takenMoney) {
		if(takenMoney>balance) {
			System.out.println("You don`t have enough money");
			return;
		}
		balance = balance -takenMoney;
	}public double lastBalance() {
		return balance;
	}
	public boolean checkForLowBalance() {
		if(balance<1000) {
			return true;
		}else
				return false;
		
	}

}
