package com.uptc.LockedMan.sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;

import com.uptc.LockedMan.constants.Constants;

/**
 *
 * @author Jorge Ayala
 */
public class Sounds {

    AudioClip infinite;
    AudioClip clip;
    Clip clip2;

    /**
     * esta clase es capas de reproducir sonidos en formato WAV	
     */
    public void PlaySound() {
    	
    }

    /**
     * inici un sonido cualquiera
     * @param sound sonido a reproducir
     * @param wait tiempo que dura el sonido reproduciendose
     */
    public void playSound(String sound, int wait) {
        URL url = Sounds.class.getResource(Constants.PATH_DIRECTORY_SOUNDS + sound + Constants.FORMAT_WAV);
        clip = Applet.newAudioClip(url);
        clip.play();
        try {
            Thread.sleep(wait);
        } catch (Exception e) {
        }
    }

    /**
     * Inicia la ejecución del sonido con diferente volumen
     * @param nameTrak nombre de la cancion a ejecutar
     * @param waitInSeconds tiempo que va a durar el sonido reproduciendose
     * @param volumeDown la cantidad de volumen a reducir (en decibeles)
     */
    public void playVolumeSound(String nameTrak, int waitInSeconds, float volumeDown) {
        try {
            clip2 = AudioSystem.getClip();
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(Sounds.class.getResource(Constants.PATH_DIRECTORY_SOUNDS + nameTrak + Constants.FORMAT_WAV));
            clip2.open(audioInputStream);
            FloatControl gainControl = (FloatControl) clip2.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(volumeDown); // Reduce volume by 10 decibels.
            clip2.loop(waitInSeconds * 1000);
        } catch (Exception e) {
        }
    }

    /**
     * inicia un sonido que se va a repetir indefinidamente
     * @param sound sonido a reproducir
     * @param timeSound tiempo que va a durar el sonido escuchandose
     * @throws InterruptedException en caso de no encontrar la ruta del sonido
     */
    public void loopSound(String sound, int timeSound) throws InterruptedException {
        URL url = Sounds.class.getResource(Constants.PATH_DIRECTORY_SOUNDS + sound + Constants.FORMAT_WAV);
        infinite = Applet.newAudioClip(url);
        infinite.loop();
        Thread.sleep(timeSound);
    }
    
    /**
     * detiene un sonido que es modificado su volumen a travez de decibeles
     */
    public void stopVolumeClip(){
        try {
            clip2.stop();
        } catch (Exception e) {
        }
    }

    /**
     * detiene un sonido, solamente los sonidos que se ejecutan una vez
     */
    public void stopSound() {
        try {
            clip.stop();
        } catch (Exception e) {

        }
    }

    /**
     * pausa o finaliza el sonido repetitivo
     */
    public void stopLoopSound() {
        try {
            infinite.stop();
        } catch (Exception e) {

        }
    }

}
