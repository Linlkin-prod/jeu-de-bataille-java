import java.util.ArrayList;

public class Hand {
    
    private ArrayList<Card> hand = new ArrayList<Card>();
    private int size;

    public Hand (){
        size = 0;
    }

    public void addCard(Card card){
        hand.add(card);
        size++;
    }

    public void removeCard(int index){
        hand.remove(index);
        size=-1;
    }

    public Card getCardInIndex(int index){
        return hand.get(index);
    }

    public int getSize(){
        return size;
    }

}
