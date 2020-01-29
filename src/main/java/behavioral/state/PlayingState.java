package behavioral.state;

public class PlayingState implements MP3PlayerState {
    @Override
    public void play() {
        System.out.println("the system is playing now");
    }
}
