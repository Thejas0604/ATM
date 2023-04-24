public class SavingsAccount extends Account {
    private     int interest;
    public SavingsAccount(int accountNo, String branch, String currency, int balance,int interest) {
        super(accountNo, branch, currency, balance);
        this.interest = interest;

    }
    public void calculateInterest(){
        interest = getBalance()*5/100;
    }
}
