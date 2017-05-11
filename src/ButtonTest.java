import javafx.scene.control.Button;

public class ButtonTest {

    public Button btn;
    int btnX, btnY;

    public ButtonTest(){
        //Button
        btn = new Button();
        btn.setMinWidth(100);
        btn.setMinHeight(100);
        btn.setOnAction(event -> {
            System.out.print("Pressed");
        });
    }

    public ButtonTest(double locX, double locY){
        btn = new Button();
        btn.setMinWidth(100);
        btn.setMinHeight(100);
        btn.setTranslateX(locX);
        btn.setTranslateY(locY);
        btn.setOnAction(event -> {
            System.out.print("Pressed");
        });
    }

    public ButtonTest(double sizeX, double sizeY, double transX, double transY){
        btn = new Button();
        btn.setMinWidth(sizeX);
        btn.setMinHeight(sizeY);
        btn.setTranslateX(transX);
        btn.setTranslateY(transY);
        btn.setOnAction(event -> {
            System.out.print("Pressed");
        });
    }
}
