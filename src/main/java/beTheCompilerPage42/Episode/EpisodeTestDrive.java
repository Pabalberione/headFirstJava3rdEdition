package beTheCompilerPage42.Episode;

public class EpisodeTestDrive {
    public static void main(String[] args) {
        Episode episode = new Episode();
        episode.seriesNumber = 4;
        //episode.play(); //Por que pone un metodo de la otra clase?
        episode.skipIntro();
        episode.skipToNext();
    }
}
