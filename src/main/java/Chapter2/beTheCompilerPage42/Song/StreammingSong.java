package Chapter2.beTheCompilerPage42.Song;

public class StreammingSong {
    String title;
    String artist;
    int duration;

    void play(){
        System.out.println("Playing song");
    }

    void printDetails(){
        System.out.println("This is " + title + " by " + artist);
    }
}
