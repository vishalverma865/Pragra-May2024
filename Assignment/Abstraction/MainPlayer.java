package Assignment.Abstraction;

public class MainPlayer {

    public static void main(String[] args) {

    AudioPlayer audioPlayer = new AudioPlayer("Tere Bin", "Zakir Khan");
    VideoPlayer videoPlayer = new VideoPlayer("Shimla Tour", 2.5);
    ImageDisplay imageDisplay = new ImageDisplay("SunFlower", "800X800");

        audioPlayer.play();
    audioPlayer.displayDetails();

   videoPlayer.play();
   videoPlayer.displayDetails();

   imageDisplay.displayImage();
   imageDisplay.displayDetails();





    }
}
