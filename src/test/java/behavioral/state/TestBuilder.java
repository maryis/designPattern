package behavioral.state;

import org.junit.Test;

public class TestBuilder {

    @Test
    public void testSate(){

        MP3PlayerState on=new PlayingState();
        MP3PlayerState off=new OffState();

        Mp3Player player=new Mp3Player(off);
        player.play();

        player.setState(on);
        player.play();

        player.setState(off);
        player.play();
    }
}
