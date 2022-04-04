package LittleProgramms;

public class MaybeTest {
    public static void main(String[] args) {
        Maybe <Double> gehalt = new Maybe<>(2030.36, 2);
        gehalt.print();
        Maybe<Account> meinKonto = new Maybe<>(new Account("Lazra", "AT45", "REDFG"),1);
        meinKonto.print();
    }
}
