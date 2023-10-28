import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.Timer;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane; 

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class GUI implements ActionListener {
    private JLabel CurrSong;
    private JLabel lyricLabel;
    public static String convertToMultiline(String orig)
    {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
    

    public GUI() throws MalformedURLException, LineUnavailableException, IOException, UnsupportedAudioFileException {
        
        String filepathDynamite = "[ONTIVA.COM] BTS (방탄소년단) - DYNAMITE (Official Audio)-128k.wav";
        String filepathButter = "[ONTIVA.COM] BTS (방탄소년단) - BUTTER (Official Audio)-128k.wav";
        File dynamiteFile = new File(filepathDynamite);
        File butterFile = new File(filepathButter);
        Audio dynamiteAudio = new Audio(dynamiteFile);
        Audio butterAudio = new Audio(butterFile);
        JFrame frame = new JFrame();
        frame.setSize(1000,1010);
        
        Timer timerDyna1 = new Timer(7500, e -> {
            lyricLabel.setText(convertToMultiline("Shoes on, get up in the morn'\n Cup of milk, let's rock and roll\nKing Kong, kick the drum\nRolling on like a Rolling Stone\nSing-song when I'm walkin' home\nJump up to the top, LeBron\nDing-dong, call me on my phone\nIce tea and a game of ping pong"));
        });
        Timer timerDyna2 = new Timer(25000, e -> {
            lyricLabel.setText(convertToMultiline("This is gettin' heavy, can you hear the bass boom? I'm ready (Woo-hoo)\nLife is sweet as honey, yeah, this beat cha-ching like money, huh\nDisco overload, I'm into that, I'm good to go\nI'm diamond, you know I glow up\nHey, so let's go"));
        });
        Timer timerDyna3 = new Timer(41500, e -> {
            lyricLabel.setText(convertToMultiline("'Cause I, I, I'm in the stars tonight\nSo watch me bring the fire and set the night alight (Hey)\nShinin' through the city with a little funk and soul\nSo I'ma light it up like dynamite, woah-oh-oh"));
        });
        Timer timerDyna4 = new Timer(59000, e -> {
            lyricLabel.setText(convertToMultiline("Bring a friend join the crowd whoever wanna come along\nWord up talk the talk just move like we off the wall\nDay or night, the sky's alight, so we dance to the break of dawn (Hey)\nLadies and gentlemen, I got the medicine, so you should keep ya eyes on the ball (Huh)"));
        });
        Timer timerDyna5 = new Timer(76000, e -> {
            lyricLabel.setText(convertToMultiline("This is gettin' heavy, can you hear the bass boom? I'm ready (Woo-hoo)\nLife is sweet as honey, yeah, this beat cha-ching like money, huh\nDisco overload, I'm into that, I'm good to go\nI'm diamond, you know I glow up\nHey, Let's go"));
        });
        Timer timerDyna6 = new Timer(92000, e -> {
            lyricLabel.setText(convertToMultiline("'Cause I, I, I'm in the stars tonight\nSo watch me bring the fire and set the night alight (Hey)\nShinin' through the city with a little funk and soul\nSo I'ma light it up like dynamite, woah-oh-oh"));
        });
        Timer timerDyna7 = new Timer(109000, e -> {
            lyricLabel.setText(convertToMultiline("Dyn-na-na-na, na-na-na-na-na, na-na-na, life is dynamite\nDyn-na-na-na, na-na-na-na-na, na-na-na, life is dynamite\nShinin' through the city with a little funk and soul\nSo I'ma light it up like dynamite, woah-oh-oh"));
        });
        Timer timerDyna8 = new Timer(126000, e -> {
            lyricLabel.setText(convertToMultiline("Dyn-na-na-na, na-na, na-na, ayy\nDyn-na-na-na, na-na, na-na, ayy\nDyn-na-na-na, na-na, na-na, ayy\nLight it up like dynamite\nDyn-na-na-na, na-na, na-na, ayy\nDyn-na-na-na, na-na, na-na, ayy\nDyn-na-na-na, na-na, na-na, ayy\nLight it up like dynamite"));
        });
        Timer timerDyna9 = new Timer(143000, e -> {
            lyricLabel.setText(convertToMultiline("'Cause I, I, I'm in the stars tonight\nSo watch me bring the fire and set the night alight\nShinin' through the city with a little funk and soul\nSo I'ma light it up like dynamite"));
        });
        Timer timerDyna10 = new Timer(159000, e -> {
            lyricLabel.setText(convertToMultiline("(This is ah) 'Cause I, I, I'm in the stars tonight\nSo watch me bring the fire and set the night alight (Alight, oh)\nShinin' through the city with a little funk and soul\nSo I'ma light (Light ) it (It) up (Up) like (Like) dynamite (Dynamite), woah-oh-oh"));
        });
        Timer timerDyna11 = new Timer(177000, e -> {
            lyricLabel.setText(convertToMultiline("Dyn-na-na-na, na-na-na-na-na, na-na-na, life is dynamite (Life is dynamite)\nDyn-na-na-na, na-na-na-na-na, na-na-na, life is dynamite (Oh)\nShinin' through the city with a little funk and soul\nSo I'ma light it up like dynamite, woah-oh-oh"));
        });
        Timer timerDyna12 = new Timer(196000, e -> {
            lyricLabel.setText(convertToMultiline(""));
            CurrSong.setText("Current Song: No Song Is Playing Currently");
        });
        timerDyna1.setRepeats(false);
        timerDyna2.setRepeats(false);
        timerDyna3.setRepeats(false);
        timerDyna4.setRepeats(false);
        timerDyna5.setRepeats(false);
        timerDyna6.setRepeats(false);
        timerDyna7.setRepeats(false);
        timerDyna8.setRepeats(false);
        timerDyna9.setRepeats(false);
        timerDyna10.setRepeats(false);
        timerDyna11.setRepeats(false);
        timerDyna12.setRepeats(false);
        Timer timerButter1 = new Timer(21500, e -> {
            lyricLabel.setText(convertToMultiline("Ooh, when I look in the mirror\nI'll melt your heart into two\nI got that superstar glow, so\nOoh (do the boogie, like)"));
        });
        Timer timerButter2 = new Timer(30000, e -> {
            lyricLabel.setText(convertToMultiline("A side step, right-left, to my beat\nHigh like the moon, rock with me, baby\nKnow that I got that heat\nLet me show you 'cause talk is cheap\nSide step, right-left, to my beat\nGet it, let it roll"));
        });
        Timer timerButter3 = new Timer(47500, e -> {
            lyricLabel.setText(convertToMultiline("Smooth like butter, pull you in like no other\nDon't need no Usher to remind me you got it bad\nAin't no other that can sweep you up like a robber\nStraight up, I (got ya)\nMaking you fall like that (break it down)"));
        });
        Timer timerButter4 = new Timer(65000, e -> {
            lyricLabel.setText(convertToMultiline("Ooh, when I look in the mirror\nI'll melt your heart into two\nI got that superstar glow, so\nOoh (do the boogie, like)"));
        });
        Timer timerButter5 = new Timer(74000, e -> {
            lyricLabel.setText(convertToMultiline("Side step, right-left, to my beat\nHigh like the moon, rock with me, baby\nKnow that I got that heat\nLet me show you 'cause talk is cheap\nA side step, right-left, to my beat\nGet it, let it roll"));
        });
        Timer timerButter6 = new Timer(98500, e -> {
            lyricLabel.setText(convertToMultiline("Get it, let it roll\nGet it, let it roll"));
        });
        Timer timerButter7 = new Timer(109000, e -> {
            lyricLabel.setText(convertToMultiline("Ice on my wrist, I'm the nice guy\nGot the right body and the right mind\nRolling up the party, got the right vibe\nSmooth like (butter), hate us (love us)"));
        });
        Timer timerButter8 = new Timer(117000, e -> {
            lyricLabel.setText(convertToMultiline("Fresh boy, pull up and we lay low\nAll the players get moving when the bass low\nGot ARMY right behind us when we say so\nLet's go"));
        });
        Timer timerButter9 = new Timer(126000, e -> {
            lyricLabel.setText(convertToMultiline("Side step, right-left, to my beat (right-left, to my beat)\nHigh like the moon, rock with me, baby\nYou know that I got that heat\nLet me show you 'cause talk is cheap (you know that talk is cheap)\nSide step, right-left, to my beat\nGet it, let it roll"));
        });
        Timer timerButter10 = new Timer(143000, e -> {
            lyricLabel.setText(convertToMultiline("Smooth like (butter), cool shade (stunner)\nAnd you know we don't stop\nHot like (summer), ain't no (bummer)\nYou'll be like, 'Oh my God'"));
        });
        Timer timerButter11 = new Timer(152000, e -> {
            lyricLabel.setText(convertToMultiline("We gon' make you rock, and you say (yeah)\nWe gon' make you bounce, and you say (yeah)\nHotter, sweeter, cooler, butter!\nGet it, let it roll"));
        });
        Timer timerButter12 = new Timer(163000, e -> {
            lyricLabel.setText(convertToMultiline(""));
            CurrSong.setText("Current Song: No Song Is Playing Currently");
        });
        timerButter1.setRepeats(false);
        timerButter2.setRepeats(false);
        timerButter3.setRepeats(false);
        timerButter4.setRepeats(false);
        timerButter5.setRepeats(false);
        timerButter6.setRepeats(false);
        timerButter7.setRepeats(false);
        timerButter8.setRepeats(false);
        timerButter9.setRepeats(false);
        timerButter10.setRepeats(false);
        timerButter11.setRepeats(false);
        timerButter12.setRepeats(false);
        JButton dynamiteButton = new JButton("Dynamite");
        dynamiteButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    CurrSong.setText("Current Song: Dynamite");
                    butterAudio.stop();
                    timerButter1.stop();
                    timerButter2.stop();
                    timerButter3.stop();
                    timerButter4.stop();
                    timerButter5.stop();
                    timerButter6.stop();
                    timerButter7.stop();
                    timerButter8.stop();
                    timerButter9.stop();
                    timerButter10.stop();
                    timerButter11.stop();
                    timerButter12.stop();
                    dynamiteAudio.reset();
                    dynamiteAudio.play();
                    lyricLabel.setText(convertToMultiline("'Cause I, I, I'm in the stars tonight \n So watch me bring the fire and set the night alight"));
                    timerDyna1.restart();
                    timerDyna1.start();
                    timerDyna2.restart();
                    timerDyna2.start();
                    timerDyna3.restart();
                    timerDyna3.start();
                    timerDyna4.restart();
                    timerDyna4.start();
                    timerDyna5.restart();
                    timerDyna5.start();
                    timerDyna6.restart();
                    timerDyna6.start();
                    timerDyna7.restart();
                    timerDyna7.start();
                    timerDyna8.restart();
                    timerDyna8.start();
                    timerDyna9.restart();
                    timerDyna9.start();
                    timerDyna10.restart();
                    timerDyna10.start();
                    timerDyna11.restart();
                    timerDyna11.start();
                    timerDyna12.restart();
                    timerDyna12.start();


                }
            }
        );
        dynamiteButton.setBounds(10,770,485,200);
        dynamiteButton.setForeground(Color.GRAY);

        
        JButton butterButton = new JButton("Butter");
        butterButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    CurrSong.setText("Current Song: Butter");
                    lyricLabel.setText(convertToMultiline("Smooth like butter, like a criminal undercover\nGon' pop like trouble breaking into your heart like that, ooh\nCool shade, stunner, yeah, I owe it all to my mother, uh\nHot like summer, yeah, I'm making you sweat like that (break it down!)"));
                    dynamiteAudio.stop();
                    timerDyna1.stop();
                    timerDyna2.stop();
                    timerDyna3.stop();
                    timerDyna4.stop();
                    timerDyna5.stop();
                    timerDyna6.stop();
                    timerDyna7.stop();
                    timerDyna8.stop();
                    timerDyna9.stop();
                    timerDyna10.stop();
                    timerDyna11.stop();
                    timerDyna12.stop();
                    butterAudio.reset();
                    butterAudio.play();
                    timerButter1.restart();
                    timerButter1.start();
                    timerButter2.restart();
                    timerButter2.start();
                    timerButter3.restart();
                    timerButter3.start();
                    timerButter4.restart();
                    timerButter4.start();
                    timerButter5.restart();
                    timerButter5.start();
                    timerButter6.restart();
                    timerButter6.start();
                    timerButter7.restart();
                    timerButter7.start();
                    timerButter8.restart();
                    timerButter8.start();
                    timerButter9.restart();
                    timerButter9.start();
                    timerButter10.restart();
                    timerButter10.start();
                    timerButter11.restart();
                    timerButter11.start();
                    timerButter12.restart();
                    timerButter12.start();

                }
            }
        );
        butterButton.setBounds(505,770,485,200);
        butterButton.setForeground(Color.GRAY);
        JButton stopPlayingButton = new JButton("Stop Playing BTS");
        stopPlayingButton.setBounds(10,670,980,90);
        stopPlayingButton.setForeground(Color.GRAY);
        stopPlayingButton.addActionListener(
            new ActionListener(){
                public void actionPerformed(ActionEvent e) {
                    CurrSong.setText("Current Song: No Song Is Playing Currently");
                    dynamiteAudio.stop();
                    butterAudio.stop();
                    lyricLabel.setText("");
                    timerDyna1.stop();
                    timerDyna2.stop();
                    timerDyna3.stop();
                    timerDyna4.stop();
                    timerDyna5.stop();
                    timerDyna6.stop();
                    timerDyna7.stop();
                    timerDyna8.stop();
                    timerDyna9.stop();
                    timerDyna10.stop();
                    timerDyna11.stop();
                    timerDyna12.stop();
                    timerButter1.stop();
                    timerButter2.stop();
                    timerButter3.stop();
                    timerButter4.stop();
                    timerButter5.stop();
                    timerButter6.stop();
                    timerButter7.stop();
                    timerButter8.stop();
                    timerButter9.stop();
                    timerButter10.stop();
                    timerButter11.stop();
                    timerButter12.stop();
                }
                
            }
        );
        CurrSong = new JLabel("Current Song: No Song Is Playing Currently");
        lyricLabel = new JLabel("");
        CurrSong.setBounds(30,30,900,50);
        lyricLabel.setBounds(100, 210, 900, 400);
        CurrSong.setFont(new Font(Font.DIALOG,  Font.BOLD, 30));
        lyricLabel.setFont(new Font(Font.DIALOG,  Font.BOLD, 20));
        stopPlayingButton.setFont(new Font(Font.DIALOG,  Font.PLAIN, 20));
        dynamiteButton.setFont(new Font(Font.DIALOG,  Font.PLAIN, 20));
        butterButton.setFont(new Font(Font.DIALOG,  Font.PLAIN, 20));
        
        CurrSong.setForeground(Color.GRAY);
        lyricLabel.setForeground(Color.GRAY);
        JPanel panel = new JPanel();
        
        panel.setLayout(null);
        panel.setBackground(bgroundColor);
        panel.add(CurrSong);
        panel.add(lyricLabel);
        panel.add(stopPlayingButton);
        panel.add(dynamiteButton);
        panel.add(butterButton);
        

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Machine"); 
        frame.setVisible(true);
    }
    Color  bgroundColor  = new Color(230, 230, 250);

}