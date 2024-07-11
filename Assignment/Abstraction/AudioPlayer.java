package Assignment.Abstraction;

public class AudioPlayer extends MediaDevice {
    private String songName;
    private String artist;

    public AudioPlayer(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public void play(){
        System.out.println("Song Playing");
    }

    @Override
    public void displayDetails() {
        System.out.println("Song " + songName + " Artist " + artist);
    }

}

