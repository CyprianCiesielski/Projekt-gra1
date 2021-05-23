package com.company;

import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class audio {

        public static void main (String[]args)
        {
            File muzyka = new File("src/Gra/audio/muzykadogry.mp3");
            PlaySound(muzyka);
        }

        static void PlaySound (File Sound)
        {
            try {
                Clip clip = AudioSystem.getClip();
                clip.open(AudioSystem.getAudioInputStream(Sound));
                clip.start();

                Thread.sleep(clip.getMicrosecondLength() / 1000);
            } catch (Exception e) {

            }
        }
}
