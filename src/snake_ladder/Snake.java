package snake_ladder;

public class Snake {
    int from ;
    int to ;
    public void move(Player play){
        play.position = this.to;
    }
}
