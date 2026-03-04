class MusicPlayer {

    String songName;
    int volume;

    void play() {
        System.out.println("🎵 Playing: " + songName);
    }

    void increaseVolume() {
        volume += 5;
        System.out.println("🔊 Volume increased to " + volume);
    }
}

public class MusicTest {

    public static void main(String[] args) {

        MusicPlayer player1 = new MusicPlayer();

        player1.songName = "Wild Flowers";
        player1.volume = 10;

        player1.play();
        player1.increaseVolume();
    }
}