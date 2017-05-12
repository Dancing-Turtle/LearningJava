import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SongImage {
    public ImageView imgView;

    public SongImage(){
        imgView = new ImageView();
        Image img  = new Image("Assets/Img/grid.jpg");
        imgView.setImage(img);
    }

    public SongImage(String strImage){
        imgView = new ImageView();
        Image img  = new Image(strImage);
        imgView.setImage(img);
    }

    public SongImage(String strImage, int x , int y){
        imgView = new ImageView();
        Image img  = new Image(strImage);
        imgView.setFitHeight(200);
        imgView.setFitHeight(200);
        imgView.setImage(img);
        imgView.setTranslateY(y);
        imgView.setTranslateX(x);
    }
}