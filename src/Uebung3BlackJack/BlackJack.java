package Uebung3BlackJack;

import java.util.HashMap;
import java.util.Map;

public class BlackJack {

    private Map<Player, Integer> players = new HashMap<>();


    boolean add(Player player){
        if (players.containsKey(player)){
            return  false;
        }
        players.put(player,0);
        return true;
    }

    boolean addCard(Player player, Integer cardValue){
        if (players.containsKey(player)){
            players.put(player, players.get(player)+cardValue);
            return true;
        }
        return false;
    }

    Integer getValue(Player player){
        return players.get(player);
    }

    Player getWinner(){

        int max=-1;
        int winners=0;
        Player p = null;
        for (Map.Entry<Player, Integer> m : players.entrySet()) {
            if ( m.getValue() <= 21  ){
                if ( m.getValue()> max) {
                    max = m.getValue();
                    p = m.getKey();
                    winners=1;
                }
                else if (m.getValue()== max){
                    ++winners;
                }
            }
        }
        return winners ==1 ? p : null ;
    }

    @Override
    public String toString() {
        StringBuilder  text = new StringBuilder();
        for ( Map.Entry<Player, Integer> m : players.entrySet()) {
            text.append(m.getKey().getName())
                    .append(", Kartenwert: ")
                    .append(m.getValue())
                    .append("\n");
        }
        return text.toString();
    }
}
