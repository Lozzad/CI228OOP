package exOne.Three;

class AccountBetter1 extends Account implements Transfer {
	public boolean transferFrom(Account from, double amount) {
		deposit(from.withdraw(amount));
		return true;
	}
	public boolean transferTo(Account to, double amount) {
		to.deposit(withdraw(amount));
		return true;
	}
}
