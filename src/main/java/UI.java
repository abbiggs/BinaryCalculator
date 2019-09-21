import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class UI extends Application {

    private Stage window;
    private Scene mainScene;
    private GridPane gridPane;

    private Button button1;
    private Button button0;
    private Button buttonSquare;
    private Button buttonSquareRoot;
    private Button buttonAddition;
    private Button buttonSubtraction;
    private Button buttonMultiplication;
    private Button buttonDivision;
    private Button buttonEquals;

    private TextField calcDisplay;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)throws Exception{

        //Calculator display & buttons
        calcDisplay = new TextField();
        calcDisplay.setAlignment(Pos.CENTER_RIGHT);
        calcDisplay.setId("calcDisplay");
        calcDisplay.setTranslateX(20);
        calcDisplay.setTranslateY(-225);

        button1 = new Button("1");
        button1.setId("button");
        button1.setTranslateX(70);
        button1.setTranslateY(-50);

        button0 = new Button("0");
        button0.setId("button");
        button0.setTranslateX(70);
        button0.setTranslateY(50);

        buttonSquare = new Button("▢");
        buttonSquare.setId("button");
        buttonSquare.setTranslateX(325);
        buttonSquare.setTranslateY(-50);

        buttonSquareRoot = new Button("√");
        buttonSquareRoot.setId("button");
        buttonSquareRoot.setTranslateX(425);
        buttonSquareRoot.setTranslateY(-50);

        buttonAddition = new Button("+");
        buttonAddition.setId("button");
        buttonAddition.setTranslateX(325);
        buttonAddition.setTranslateY(50);

        buttonSubtraction = new Button("-");
        buttonSubtraction.setId("button");
        buttonSubtraction.setTranslateX(425);
        buttonSubtraction.setTranslateY(50);

        buttonMultiplication = new Button("X");
        buttonMultiplication.setId("button");
        buttonMultiplication.setTranslateX(325);
        buttonMultiplication.setTranslateY(150);

        buttonDivision = new Button("÷");
        buttonDivision.setId("button");
        buttonDivision.setTranslateX(425);
        buttonDivision.setTranslateY(150);

        buttonEquals = new Button("=");
        buttonEquals.setId("button");
        buttonEquals.setTranslateX(425);
        buttonEquals.setTranslateY(250);
        //End of Display

        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.getChildren().addAll(calcDisplay, button1, button0, buttonSquare, buttonSquareRoot, buttonAddition,
                buttonSubtraction, buttonMultiplication, buttonDivision, buttonEquals);
        mainScene = new Scene(gridPane, 650, 650);
        mainScene.getStylesheets().add(this.getClass().getResource("/styles.css").toExternalForm());
        window = primaryStage;
        window.setTitle("Binary Calculator");
        window.setScene(mainScene);
        window.show();
    }
}
