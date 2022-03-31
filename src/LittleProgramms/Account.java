package LittleProgramms;

public class Account {
    private String owner;
    private String iban;
    private String bic;
    private double balance;

    public Account( String owner, String iban, String bic){
        this.owner= owner;
        this.iban = iban;
        this.bic= bic;
        balance= 0.0;
    }
    public void  add ( double wert){
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
}
