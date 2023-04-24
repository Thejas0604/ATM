import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public abstract class Transaction {
    public Transaction(int balance, String state, int accountID) {
        this.balance = balance;
        this.state = state;
        this.date = LocalDate.now();
        this.accountID = accountID;
        this.transactionID = new Random().nextInt();
    }

    private static ArrayList<Transaction> transactionList = new ArrayList<Transaction>();
    private int balance;
    private String state;
    private LocalDate date;
    private int accountID;
    private int transactionID;




    public static void withdrawMoney(Account acc,int amount){
        acc.withdraw(amount);
        transactionList.add(new WithdrawalTrnsaction(acc.getBalance(), "Success", acc.getAccountNo(), amount));
    }
    public static void depositMoney(Account acc,int amount){
        acc.deposit(amount);
        transactionList.add(new DepositTransation(acc.getBalance(), "Success", acc.getAccountNo(), amount));
    }
    public static void viewBalance(Account acc){
        transactionList.add(new ViewBalanceTransaction(acc.getBalance(), "Success", acc.getAccountNo()));
        System.out.println("Account Balance:" +acc.getBalance());
    }
}
