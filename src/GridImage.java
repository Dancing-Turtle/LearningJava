import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class GridImage {
    public ImageView imgView;

    public GridImage(){
        imgView = new ImageView();
        Image img  = new Image("Assets/Img/grid.jpg");
        imgView.setImage(img);
    }
}
