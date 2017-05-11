import javafx.scene.control.*;
import javafx.scene.control.Label.*;
import javafx.scene.text.Font;


public class LabelAdd{
    Label lb;
    public LabelAdd(String text){
        lb = new Label(text);
    }
    public LabelAdd(String text, int x, int y){
        lb = new Label(text);
        lb.setTranslateY(y);
        lb.setTranslateX(x);
    }
    public LabelAdd(String text, int x, int y, int fsize){
        lb = new Label(text);
        lb.setFont(Font.font(fsize));
        lb.setTranslateY(y);
        lb.setTranslateX(x);
    }
    public LabelAdd(String text, int x, int y, int fsize, String fontfamily){
        lb = new Label(text);
        lb.setFont(Font.font(fontfamily, fsize));
        lb.setTranslateY(y);
        lb.setTranslateX(x);
    }
}
