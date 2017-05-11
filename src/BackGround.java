import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class BackGround extends Pane{
    public Scene bg;
    static GridPane grid;

    public BackGround(){

        ButtonTest bx = new ButtonTest(0, 0);
        GridImage gi = new GridImage();
        Square sq = new Square(150, 150, Color.RED, 0, 0);
        HeaderBar hb = new HeaderBar();

        grid = new GridPane();
        grid.setGridLinesVisible(true);
        grid.setAlignment(Pos.TOP_CENTER);

        //root.getChildren().add(gi.imgView);
        //root.getChildren().add(bx.btn);
        //root.getChildren().add(sq.rec);
        grid.add(sq.rec, 0, 0);
        grid.add(bx.btn, 0, 1);
        bg = new Scene(grid, 0, 0);
    }
}
