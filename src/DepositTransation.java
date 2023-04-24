public class DepositTransation extends Transaction {
    public int amount;
    public DepositTransation(int balance, String state, int accountID, int amount) {
        super(balance, state, accountID);
        this.amount = amount;
    }
}
