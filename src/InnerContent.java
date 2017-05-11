import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.SubScene;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

public class InnerContent {
    public Pane p;

    public InnerContent(){
        StackPane gridHeader = new StackPane();
        gridHeader.setAlignment(Pos.TOP_CENTER);
        Square sq = new Square(1280, 150, Color.RED);
        LabelAdd l = new LabelAdd("This is an example", 0, 60, 18, "Arial");

        gridHeader.getChildren().add(sq.rec);
        gridHeader.getChildren().add(l.lb);

        p = new Pane(gridHeader);
    }
}
