package Assignment.Abstraction;

public class VideoPlayer extends MediaDevice{
    private String title;
    private double duration;

    public VideoPlayer(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Video Song Title: " + title + "of duration " + duration );

    }

    public void play(){
        System.out.println("Video Song Playing");
    }
}