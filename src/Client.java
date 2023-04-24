import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class Client {

    List<Account> accounts;
    List<Loan> loans;
    static HashMap<String, Client> clients = new HashMap<String, Client>();
    private int id;
    private String name;
    private String nationality;
    private String gender;
    private String occupation;
    private int age;
    private String address;



    public Client(int id,String name,String nationality,String gender,String occupation,int age,String address){
        this.id = id;
        this.name = name;
        this.nationality = nationality ;
        this.gender = gender;
        this.occupation = occupation;
        this.age = age;
        this.address = address;
        this.accounts = new ArrayList<>();
        this.loans = new ArrayList<>();

    }


    public void addAccount(Account account){
        accounts.add(account);
    }

    public List<Account> getAccount(){
        return accounts;

    }

    public String getName() {
        return name;
    }

    public static void setPin(Client client, String pin){
        clients.put(pin, client);
    }

}
