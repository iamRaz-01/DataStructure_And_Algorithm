package snake_ladder;

import java.util.List;

public class Game {
    List<Player> players ;
    List<Snake> snakes;
    List<Ladder> ladder ;
    static int winners = 0 ;

    public void startGame(){
        while(winners < players.size()-1){
            for(Player player :players){
                if(player.rank ==0){
                    int n = Dice.rollDice();
                    player.position+=n;
                    for(Snake snake : snakes){
                        if(snake.from == player.position){
                            player.position = snake.to;
                        }
                    }
                    for(Ladder lad : ladder){
                        if(lad.from == player.position){
                            player.position = lad.to;
                        }
                    }
                    if(player.position>=100){
                        winners++;
                        player.rank = winners;
                    }

                }

            }

        }

    }
 }
