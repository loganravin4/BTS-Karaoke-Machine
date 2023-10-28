import java.util.ArrayList;
public class KaraokeMachine {
    private ArrayList<Song> songs;
    private Song currentSong;
    private boolean allSongsCompleted;
    public KaraokeMachine(){
        songs = new ArrayList<Song>();
        currentSong = null;
        allSongsCompleted = false;
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public void playSong(Song song){
        if(currentSong != null){
            System.out.println("Stopping current song: " + currentSong.getTitle());
        }
        System.out.println("Playing song: " + song.getTitle());
        currentSong = song;
    }
    public void stopSong(){
        if(currentSong != null){
            System.out.println("Stopping current song: " + currentSong.getTitle());
            currentSong = null;
        }
        else {
            System.out.println("No song is currently playing");
        }
    }
    public void printSongList() {
        System.out.println("Song List:");
        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);
            System.out.println((i + 1) + ". " + song.getTitle());
        }
    }
    public ArrayList<Song> getSongs() {
        return songs;
    }
    public boolean areAllSongsCompleted() {
        return allSongsCompleted;
    }
    public void checkCompletion() {
        boolean allCompleted = true;
        for(Song song : songs) {
            if (!song.isCompleted()) {
                allCompleted = false;
                break;
            }
        }

        if(allCompleted) {
            System.out.println("Congratulations! You have completed the Smooth Like Butter Karaoke Machine!");
            allSongsCompleted = true;
        }
    }
}
