package behavioral.state;

public class Mp3Player implements MP3PlayerState {

    MP3PlayerState state;

    public Mp3Player(MP3PlayerState state) {
        this.state = state;
    }

    public void setState(MP3PlayerState state) {
        this.state = state;
    }

    @Override
    public void play() {
        state.play();
    }
}
