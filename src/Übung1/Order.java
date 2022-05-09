package Übung1;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article [] articles;

    public Order( int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';
    }

    public void addArticle( Article a){
        articles[nrArticles] = a;
        nrArticles = nrArticles + 1;
    }


    public int findMostExpensiveArticle() {
        int most = 0;
        for (int i = 1; i < articles.length; i++) {
            if (articles[i].getPrice() > articles[most].getPrice()) {
                most = i;
            }
        }
        return most + 1;
    }

    public int findMostExpensiveOrderPosition() {
        int most = 0;
        for (int i = 1; i < articles.length; i++) {
            if ((articles[i].getPrice() * articles[i].getNumber()) > (articles[most].getPrice() * articles[most].getNumber())) {
                most = i;
            }
        }
        return most + 1;
    }

    public double sumOrder() {
        double sum = 0;
        for (Article a : articles) {
            sum += (a.getPrice());
        }
        return sum;
    }
    public double calculateTax() {
        double sum = 0;
        for (Article a : articles) {
            if (a.getPrice() < 20) {
                sum += (a.getPrice() * 0.05);
            } else {
                sum += (a.getPrice() * 0.2);
            }
        }
        return sum;
    }
    public double sumOrderWithTax() {
        return calculateTax() + sumOrder();
    }
}
