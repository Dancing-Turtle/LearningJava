import javafx.geometry.NodeOrientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class BackGround extends Pane{
    public Scene bg;
    static GridPane grid;
    public int sY = 150;

    public BackGround(){

        ButtonTest bx = new ButtonTest(0, 0);
        GridImage gi = new GridImage();
        HeaderBar h = new HeaderBar();
        InnerContent ic = new InnerContent();

        grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);

        grid.add(h.p, 0, 0);
        grid.add(ic.p, 0, 1);
        //grid.getChildren().addAll(h.p, ic.p);

        bg = new Scene(grid, 0, 0);

        //grid.setGridLinesVisible(true);
        //grid.getChildren().add(bx.btn);
        //grid.getChildren().add(sq.rec);
        //grid.add(sq.rec, 0, 0);
        //grid.add(bx.btn, 0, 0);

    }
}
