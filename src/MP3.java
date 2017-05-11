import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.nio.file.Paths;

public class MP3 {
    Media m;
    MediaPlayer mp;
    //Music: http://www.bensound.com

    public MP3(){
        m = null;
        mp = null;
    }

    public void playSong(String song){
        m = new Media(Paths.get(song).toUri().toString());
        mp.dispose();
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
