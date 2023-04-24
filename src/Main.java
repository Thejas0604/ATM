import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        addTestData();
        System.out.println("Welcome!");
        Client client = null;
        Scanner newInput1 = null;
        while (client == null) {
            newInput1 = new Scanner(System.in);
            System.out.println("Enter your pin: ");
            String pinInput = newInput1.nextLine();
            client = Client.clients.get(pinInput);
            if (client == null) {
                System.out.println("Retry");
            }
        }
        var accounts = client.getAccount();
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + "." + accounts.get(i).getAccountNo());
        }
        int accountIndex = - 1;

        while (accountIndex < 0 || accountIndex >= accounts.size()) {
            System.out.println("Enter account: ");
            accountIndex = newInput1.nextInt() -1;
            if (accountIndex < 0 || accountIndex >= accounts.size()) {
                System.out.println("Invalid Input.");
            }
        }
        var account = accounts.get(accountIndex);
        System.out.println("1.View Balance");
        System.out.println("2.Withdraw money");
        System.out.println("3.Deposit money");
        System.out.println("4.Exit");

        int choice = 0;
        while (choice < 1 || choice > 4) {
            System.out.println("Enter Choice: ");
            choice = newInput1.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid Input.");
            }
        }


        int amount = 0;

        if(choice == 3 || choice == 2) {
            System.out.println("Enter Transaction Amount");
            amount = newInput1.nextInt() ;
        }

        switch(choice){
            case 1:
                Transaction.viewBalance(account);
                break;
            case 2:
                Transaction.withdrawMoney(account, amount);
                break;
            case 3:
                Transaction.depositMoney(account, amount);
                break;
        }

        System.out.println("Thank you for visiting ABC bank.");

    }

    public static void addTestData(){
        Client thejas = new Client(123,"Thejas","Sri Lankan","Male","Student",22,"Kottawa");
        Account acc1 = new Account(1234,"Monaragala","LKR",50000);
        Account acc2 = new Account(2536,"Kottawa","LKR",10000);
        thejas.addAccount(acc1);
        thejas.addAccount(acc2);
        Client.setPin(thejas,"0604");
    }
}