public class Account {
    private int accountNo;
    private String currency;
    private String branch;
    private int balance;

    public Account(int accountNo,String branch,String currency,int balance){
        this.accountNo = accountNo;
        this.currency = currency;
        this.branch = branch;
        this.balance = balance;
    }

    public void deposit(int n){
        this.balance += n;
        System.out.println("Remaining balace:"+this.balance);
    }
    public void withdraw(int n){
        this.balance -= n;
        System.out.println("Remaining balace:"+this.balance);
    }

    public int getBalance(){
        return this.balance;
    }

    public int getAccountNo() {
        return accountNo;
    }
}
