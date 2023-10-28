import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Scanner;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Main{
    public static void main(String[] args) throws MalformedURLException, LineUnavailableException, IOException, UnsupportedAudioFileException {
        new GUI();
        
        /*Scanner scanner = new Scanner(System.in);
        KaraokeMachine BTS = new KaraokeMachine();
        BTS.addSong(new Song("Dynamite", "3:19"));
        BTS.addSong(new Song("Butter", "2:44"));
        BTS.addSong(new Song("Permission to Dance", "3:07"));
        BTS.addSong(new Song("Waste It On Me", "3:12"));
        while(true){
            System.out.println("Welcome to Smooth Like Butter Karaoke!");
            System.out.println("1. Let's Play A Song!");
            System.out.println("2. Let's Stop The Current Song!");
            System.out.println("3. Let's Turn This Game Off!");
            System.out.print("Enter the number corresponding to what you want to do: ");
            int choice = scanner.nextInt();
            if(choice == 1){
                BTS.printSongList();
                System.out.print("Enter a song number to play: ");
                int songNumber = scanner.nextInt();
                if (songNumber > 0 && songNumber <= BTS.getSongs().size()) {
                    Song selectedSong = BTS.getSongs().get(songNumber - 1);
                    BTS.playSong(selectedSong);
                    selectedSong.setCompleted(true);
                    BTS.checkCompletion();
                } 
                else {
                    System.out.println("Invalid song number.");
                }
                break;
            }
            else if(choice == 2){
                BTS.stopSong();
                break;
            }
            else if(choice == 3){
                System.out.println("Thanks For Playing! See you next time!");
                System.exit(0);
            }
            else {
                System.out.println("That's not an option, try again!");
            }
        }*/
    }
}