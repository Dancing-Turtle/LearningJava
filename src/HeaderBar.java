import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;

public class HeaderBar {
    SubScene sc;
    BackGround bground;

    public HeaderBar(){
        GridPane gridHeader = new GridPane();
        gridHeader.setGridLinesVisible(true);
        gridHeader.setAlignment(Pos.TOP_CENTER);

        sc = new SubScene(gridHeader, 0 ,0);
    }
}
