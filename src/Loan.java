public class Loan {
    private int amount;
    private int interest;
    private int duration;
    private String paymentMethod;
    private Account account;

    public Loan(int amount, int interest, int duration, String paymentMethod, Account account) {
        this.amount = amount;
        this.interest = interest;
        this.duration = duration;
        this.paymentMethod = paymentMethod;
        this.account = account;
    }
}
