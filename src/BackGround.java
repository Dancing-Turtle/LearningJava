import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

public class BackGround extends Pane{
    Scene bg;
    private static GridPane grid;

    public BackGround(){

        ButtonTest bx = new ButtonTest(0, 0);
        SongImage gi = new SongImage();
        HeaderBar h = new HeaderBar();
        InnerContent ic = new InnerContent();

        grid = new GridPane();
        grid.setAlignment(Pos.TOP_CENTER);

        grid.add(h.p, 0, 0);
        grid.add(ic.p, 0, 1);
        //grid.getChildren().addAll(h.p, ic.p);

        bg = new Scene(grid, 0, 0);

    }
}
