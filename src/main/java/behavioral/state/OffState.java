package behavioral.state;

public class OffState implements MP3PlayerState {

    @Override
    public void play() {
        System.out.println("player is Off, turn it on");
    }
}
