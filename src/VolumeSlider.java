import javafx.scene.control.Slider;

public class VolumeSlider {
    public Slider slider;
    MP3 mp3;
    Double volume;

    public VolumeSlider(){
        slider = new Slider();
        slider.setMin(0);
        slider.setMax(.5);
        slider.setValue(.1);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(.5);
        slider.setBlockIncrement(.01);
        slider.setMinWidth(500);
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(mp3.mp != null){
                mp3.mp.setVolume(slider.getValue());
            }
        });
    }

    public VolumeSlider(int x, int y){
        slider = new Slider();
        slider.setMin(0);
        slider.setMax(.5);
        slider.setValue(.1);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(.5);
        slider.setBlockIncrement(.01);
        slider.setMinWidth(500);
        slider.setMaxWidth(1280-240);
        slider.setTranslateX(x);
        slider.setTranslateY(y);
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            if(mp3.mp != null){
                mp3.mp.setVolume(slider.getValue());
            }
        });
    }
}
