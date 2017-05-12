import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class InnerContent {
    public Pane p;
    private int x;
    private int y = 100;
    String song;

    public InnerContent(){
        StackPane gridHeader = new StackPane();
        gridHeader.setAlignment(Pos.CENTER);
        Square sq = new Square(1280, 720-150, Color.RED, 0);
        //LabelAdd l = new LabelAdd("This is an example", 0, 0, 18, "Arial");
        ButtonTest btnPlay = new ButtonTest("Play", 150, 150, x-175, y);
        ButtonTest btnPause = new ButtonTest("Pause", 150, 150, x, y);
        ButtonTest btnStop = new ButtonTest("Stop", 150, 150, x+175, y);
        VolumeSlider vs = new VolumeSlider(0, y+125);
        SongImage si = new SongImage("Assets/Img/energy.jpg", 0, y-225);
        MP3 mp3 = new MP3();

        Image energy = new Image("Assets/Img/energy.jpg");
        Image goinghigher = new Image("Assets/Img/goinghigher.jpg");

        ListView<String> songList = new ListView<>();
        ObservableList<String> songs = FXCollections.observableArrayList(
                "Energy", "Going Higher"
        );
        songList.setItems(songs);
        songList.setMaxWidth(120);
        songList.setTranslateX(580);
        songList.setTranslateY(20);

        btnPlay.btn.setOnAction(event -> {
            System.out.println(songList.getSelectionModel().getSelectedItem());
            switch (songList.getSelectionModel().getSelectedItem()){
                case "Energy":
                    mp3.playSong("Assets/Songs/energy.mp3");
                    si.imgView.setImage(energy);
                    song = songList.getSelectionModel().getSelectedItem();
                    break;
                case "Going Higher":
                    mp3.playSong("Assets/Songs/goinghigher.mp3");
                    si.imgView.setImage(goinghigher);
                    song = songList.getSelectionModel().getSelectedItem();
            }
        });
        btnPause.btn.setOnAction(event -> {
            if(btnPause.btn.getText() == "Pause"){
                mp3.mp.pause();
                btnPause.btn.setText("Play");
            } else {
                mp3.mp.play();
                btnPause.btn.setText("Pause");
            }
        });
        btnStop.btn.setOnAction(event -> {
            mp3.mp.dispose();
        });



        gridHeader.getChildren().addAll(sq.rec,si.imgView, btnPlay.btn, btnPause.btn, btnStop.btn, songList, vs.slider);

        p = new Pane(gridHeader);
    }
}
