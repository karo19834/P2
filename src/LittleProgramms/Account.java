package LittleProgramms;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;
    private  int accountID;
    private static int uniqueID=1;

    public Account( String owner, String iban, String bic){
        this.owner= owner;
        this.iban = iban;
        this.bic= bic;
        balance= 0.0;
        accountID = uniqueID++;

    }

    public int getAccountID() {
        return accountID;
    }

    public void  add (double wert){
        balance += wert;
    }
    public double deposit ( double wert) {
        if (balance > wert) {
            balance -= wert;
        } else {
            wert = balance;
            balance = 0;
        }
        return wert;
    }


    public double getBalance (){
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                ", bic='" + bic + '\'' +
                ", balance=" + balance +
                ", accountID=" + accountID +
                '}';
    }
}
