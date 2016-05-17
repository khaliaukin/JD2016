package by.it.sinkevich.jd01_08;

/**
 * @author Sinkevich Denis
 */
public class Main {

    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer("Sony");
        AudioPlayer audioPlayer = new AudioPlayer("Phillips");
        videoPlayer.play();
        videoPlayer.turnOn();
        videoPlayer.play();
        audioPlayer.turnOn();
        audioPlayer.setBroken(true);
        audioPlayer.repair();
        audioPlayer.turnOn();
        audioPlayer.connectToInternet();
        videoPlayer.connectToOtherDevice(audioPlayer);
        videoPlayer.turnOff();
        audioPlayer.turnOff();
    }
}
