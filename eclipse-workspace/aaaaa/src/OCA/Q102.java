package OCA;
public class Q102 {
	public int amount;

	public Q102(int amount) {	this.amount = amount;}

	public int getAmount() {		return amount;}

	public void changeAmount(int x) {		amount += x;}

	public static void main(String[] args) {

		Q102 acct = new Q102((int) (Math.random() * 1000));
//		this.amount = 0;
//		amount = 0;
//		acct (0) ;
//		acct.amount = 0;		//	true
//		acct.getAmount () = 0;
//		acct.changeAmount(0);
		acct.changeAmount(-acct.amount);
//		acct.changeAmount(-acct.getAmount());
		System.out.println(acct.getAmount());

	}
}
