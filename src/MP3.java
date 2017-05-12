import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.net.URL;
import java.nio.file.Paths;

public class MP3 {
    static Media m;
    static MediaPlayer mp;
    String songpath;
    VolumeSlider vs;
    //Music: http://www.bensound.com

    public MP3(){
        m = null;
        mp = null;
    }

    public void playSong(String song){
        //songpath = getClass().getResource(song).toString();
        songpath = MP3.class.getResource(song).toString();
        m = new Media(songpath);
        if(mp != null){
            mp.dispose();
        }
        mp = new MediaPlayer(m);
        mp.setVolume(.1);
        mp.play();
    }

    public void stopSong(){
        if(m != null && mp != null){
            mp.dispose();
        }
    }

    public void pauseSong(){
        if(m != null && mp != null){
            mp.pause();
        }
    }

    public void resumeSong(){
        if(m != null && mp != null){
            mp.play();
        }
    }
}
