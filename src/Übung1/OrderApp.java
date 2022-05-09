package Übung1;

public class OrderApp {
    public static void main(String[] args) {

        Article a1 = new Article("Einhorn", 1, 34.8);
        Article a2 = new Article("Pony", 2, 43.2);
        Article a3 = new Article("Fee", 3, 26.9);

        Order o1 = new Order(3);
        o1.addArticle(a1);
        o1.addArticle(a2);
        o1.addArticle(a3);

        System.out.println(o1);
        System.out.println("Teuerste Artikel Position " + o1.findMostExpensiveArticle());
        System.out.println("Teuerste Bestellung Position " + o1.findMostExpensiveOrderPosition());
        System.out.println("Summe netto " + o1.sumOrder());
        System.out.println("Steuer " + o1.calculateTax());
        System.out.println("Summe brutto " + o1.sumOrderWithTax());

    }
}
