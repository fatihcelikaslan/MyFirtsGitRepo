package bank;

public class AccountActivity {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount();
		account1.name = "Jacky";
		account1.accountNumber = 123456L;
		account1.balance = 100000;
		account1.displayCardInfo();
		account1.deposit(50000);
		account1.displayCardInfo();
		account1.withdraw(800000);
		account1.displayCardInfo();
		account1.lastBalance();
		System.out.println("Last balance is: "+account1.lastBalance());

	}

}
