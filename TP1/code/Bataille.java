import java.util.ArrayList;
import java.util.Random ;

public class Bataille extends Game {

    Player player1;
    Player player2;
    boolean enBataille = false;

    public Bataille(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play(){
        ArrayList<Card> pile = new ArrayList<Card>();
        for (int i =0; i<13;i++){
            for (Color j : Color.values()){
                pile.add(new Card(j,new Value(i)));
            }
        }

        Random rand = new Random();
        int r;
        while(pile.size() > 0){
            try{
                r = rand.nextInt(pile.size());
                player1.getHand().addCard(pile.get(r));
                pile.remove(r);
                r = rand.nextInt(pile.size());
                player2.getHand().addCard(pile.get(r));
                pile.remove(r);
            }catch(Exception e){
               System.err.println("get out of boud"); 
            }
        }

        int playedCard = 0;
        try {
            while(!isFinished()){
                System.out.println("round");
                if (enBataille){
                    if (player1.getHand().getSize() == 1 || player2.getHand().getSize() == 1){
                        enBataille = false;
                    }else{
                        switch (player1.getHand().getCardInIndex(1).getValue().compareTo(player2.getHand().getCardInIndex(1).getValue())) {
                            case 1:
                                player1.addScore(playedCard+2);
                                player1.getHand().removeCard(0);
                                player2.getHand().removeCard(0);
                                player1.getHand().removeCard(0);
                                player2.getHand().removeCard(0);
                                playedCard = 0;
                                enBataille = false;
                                System.out.println("player1 win this round en bataille");
                                break;
                            
                            case -1:
                                player2.addScore(playedCard+2);
                                player1.getHand().removeCard(0);
                                player2.getHand().removeCard(0);
                                player1.getHand().removeCard(0);
                                player2.getHand().removeCard(0);
                                playedCard = 0;
                                enBataille = false;
                                System.out.println("player2 win this round en bataille");
                                break;
                            case 0:
                                enBataille = true;
                                playedCard +=4;
                                player1.getHand().removeCard(0);
                                player2.getHand().removeCard(0);
                                player1.getHand().removeCard(0);
                                player2.getHand().removeCard(0);
                                System.out.println("what another tie en bataille !!!!!!!");
                            default:
                                break;
                        }
                    }
                }else{
                
                    switch (player1.getHand().getCardInIndex(0).getValue().compareTo(player2.getHand().getCardInIndex(0).getValue())) {
                        case 1:
                            player1.addScore(2);
                            player1.getHand().removeCard(0);
                            player2.getHand().removeCard(0);
                            System.out.println("player1 win this round");
                            break;
                        
                        case -1:
                            player2.addScore(2);
                            player1.getHand().removeCard(0);
                            player2.getHand().removeCard(0);
                            System.out.println("player2 win this round");
                            break;
                        case 0:
                            enBataille = true;
                            player1.getHand().removeCard(0);
                            player2.getHand().removeCard(0);
                            playedCard +=2;
                            System.out.println(" uh they did tie, so en bataille");
                        default:
                            break;
                    }
                }
                System.out.println("score "+player1.getScore()+" to "+player2.getScore());
            }
            win();
        }catch(IndexOutOfBoundsException e){
            win();
        }

        

    }

    protected void win(){
        if (player1.getScore() > player2.getScore()){
            System.out.println("It's player1 who wined the game, yeaahhh !!!! with : " + player1.getScore());
        } if (player1.getScore() < player2.getScore()) {
            System.out.println("It's player2 who wined the game, booooooo ! with : " +  player2.getScore());
        } else{System.out.println("tie "+ player1.getScore());}
        
    }

    public boolean isFinished(){
        if (player1.getHand().getSize() == 0 || player2.getHand().getSize() == 0){
            return true;
        } else {
            return false;
        }
    }


}
