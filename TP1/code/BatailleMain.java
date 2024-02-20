public class BatailleMain {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Bataille bataille = new Bataille(player1, player2);
        bataille.play();

        // player1.getHand().addCard(new Card(Color.DIAMOND,new Value(3)));
        // player2.getHand().addCard(new Card(Color.DIAMOND,new Value(1)));
        // System.out.println(player1.getHand().getCardInIndex(0).getValue().getValue());
        // System.out.println(player1.getHand().getCardInIndex(0).getValue().compareTo(player2.getHand().getCardInIndex(0).getValue()));
    }
}
