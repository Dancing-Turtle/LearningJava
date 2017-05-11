import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Square {
    Rectangle rec;

    public Square(){
        rec = new Rectangle(100, 100);
        rec.setFill(Color.RED);
    }

    public Square(double sizeX, double sizeY){
        rec = new Rectangle(sizeX, sizeY);
        rec.setFill(Color.RED);
    }

    public Square(double sizeX, double sizeY, Color color){
        rec = new Rectangle(sizeX, sizeY);
        rec.setFill(color);
    }

    public Square(double sizeX, double sizeY, Color color, double transx, double transY){
        rec = new Rectangle(sizeX, sizeY);
        rec.setFill(color);
        rec.setTranslateX(transx);
        rec.setTranslateY(transY);
    }
}
