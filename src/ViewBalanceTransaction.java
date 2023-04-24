public class ViewBalanceTransaction extends Transaction{

    public int balance;

    public ViewBalanceTransaction(int balance, String state, int accountID) {
        super(balance, state, accountID);
        this.balance = balance;
    }
}
