public class Player {

    private Hand hand ;
    private int score ;

    public Player(){
        hand = new Hand();
        score = 0;
    }

    public Hand getHand(){
        return hand;
    }

    public int getScore(){
        return score;
    }

    public void addScore(int value){
        score += value;
    }
    
}
