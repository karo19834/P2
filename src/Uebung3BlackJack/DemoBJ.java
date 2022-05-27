package Uebung3BlackJack;

public class DemoBJ {
    public static void main(String[] args) {

        Player p1 = new Player("Hansi", 58);
        Player p2 = new Player("Helene", 48);
        Player p3 = new Player("Karolina", 39);
        Player p4 = new Player("Jakob", 11);
        Player p5 = new Player("Viktoria", 5);

        BlackJack blackJack = new BlackJack();

        blackJack.add(p1);
        blackJack.add(p2);
        blackJack.add(p3);
        blackJack.add(p4);
        blackJack.add(p5);

        System.out.println(blackJack);
        blackJack.addCard(p1,14);
        blackJack.addCard(p2,21);
        blackJack.addCard(p3,19);
        blackJack.addCard(p4,16);
        blackJack.addCard(p5,22);
        System.out.println(blackJack);


        System.out.println(blackJack.getValue(p3));

        System.out.println(blackJack.getWinner());

    }
}
