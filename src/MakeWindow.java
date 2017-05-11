import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class MakeWindow extends Application{

    int winX = 1280;
    int winY = 720;

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primarystage){
        //Window Creation
        primarystage.setTitle("JavaFX Example");
        primarystage.setMinWidth(winX);
        primarystage.setMinHeight(winY);
        BackGround bg = new BackGround();

        primarystage.setScene(bg.bg);
        primarystage.show();
    }

}
