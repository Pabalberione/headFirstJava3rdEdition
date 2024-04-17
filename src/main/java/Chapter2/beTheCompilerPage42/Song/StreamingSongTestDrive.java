package Chapter2.beTheCompilerPage42.Song;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreammingSong streammingSong = new StreammingSong();
        streammingSong.artist = "The Beatles";
        streammingSong.title = "Come Together";
        streammingSong.play();
        streammingSong.printDetails();
    }
}
