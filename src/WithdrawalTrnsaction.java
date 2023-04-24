public class WithdrawalTrnsaction extends Transaction {
    public int amount;
    public WithdrawalTrnsaction(int balance, String state, int accountID, int amount) {
        super(balance, state, accountID);
        this.amount = amount;
    }
}
