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
    private Button buttonClear;

    private TextField calcDisplay;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage)throws Exception{
        BinaryConverter a = new BinaryConverter();

        //Calculator display & buttons
        calcDisplay = new TextField();
        calcDisplay.setAlignment(Pos.CENTER_RIGHT);
        calcDisplay.setId("calcDisplay");
        calcDisplay.setTranslateY(-225);

        button1 = new Button("1");
        button1.setId("button");
        button1.setTranslateY(-50);
        button1.setOnAction((event) ->{
            calcDisplay.appendText("1");
        });

        button0 = new Button("0");
        button0.setId("button");
        button0.setTranslateY(50);
        button0.setOnAction((event) ->{
            calcDisplay.appendText("0");
        });

        buttonSquare = new Button("▢");
        buttonSquare.setId("button");
        buttonSquare.setTranslateX(307);
        buttonSquare.setTranslateY(-50);
        buttonSquare.setOnAction(actionEvent -> {
            a.store(calcDisplay.getText(),"square");
            calcDisplay.clear();
        });

        buttonSquareRoot = new Button("√");
        buttonSquareRoot.setId("button");
        buttonSquareRoot.setTranslateX(407);
        buttonSquareRoot.setTranslateY(-50);
        buttonSquareRoot.setOnAction(actionEvent -> {
            a.store(calcDisplay.getText(),"root");
            calcDisplay.clear();
        });

        buttonAddition = new Button("+");
        buttonAddition.setId("button");
        buttonAddition.setTranslateX(307);
        buttonAddition.setTranslateY(50);
        buttonAddition.setOnAction(actionEvent -> {
            a.store(calcDisplay.getText(),"add");
            calcDisplay.clear();
        });

        buttonSubtraction = new Button("-");
        buttonSubtraction.setId("button");
        buttonSubtraction.setTranslateX(407);
        buttonSubtraction.setTranslateY(50);
        buttonSubtraction.setOnAction(actionEvent -> {
            a.store(calcDisplay.getText(),"subtract");
            calcDisplay.clear();
        });

        buttonMultiplication = new Button("X");
        buttonMultiplication.setId("button");
        buttonMultiplication.setTranslateX(307);
        buttonMultiplication.setTranslateY(150);
        buttonMultiplication.setOnAction(actionEvent -> {
            a.store(calcDisplay.getText(),"multiply");
            calcDisplay.clear();
        });

        buttonDivision = new Button("÷");
        buttonDivision.setId("button");
        buttonDivision.setTranslateX(407);
        buttonDivision.setTranslateY(150);
        buttonDivision.setOnAction(actionEvent -> {
            a.store(calcDisplay.getText(),"divide");
            calcDisplay.clear();
        });

        buttonEquals = new Button("=");
        buttonEquals.setId("button");
        buttonEquals.setTranslateX(307);
        buttonEquals.setTranslateY(250);
        buttonEquals.setOnAction(actionEvent -> {
            try {
                String result = a.execute(calcDisplay.getText());
                calcDisplay.setText(result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        buttonClear = new Button("Clear");
        buttonClear.setId("button");
        buttonClear.setStyle("-fx-font-size: 20");
        buttonClear.setTranslateX(407);
        buttonClear.setTranslateY(250);
        buttonClear.setOnAction((event) ->{
           calcDisplay.setText("");
           a.clearStorage();;
        });
        //End of Display

        gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.getChildren().addAll(calcDisplay, button1, button0, buttonSquare, buttonSquareRoot, buttonAddition,
                buttonSubtraction, buttonMultiplication, buttonDivision, buttonEquals, buttonClear);
        mainScene = new Scene(gridPane, 650, 650);
        mainScene.getStylesheets().add(this.getClass().getResource("/styles.css").toExternalForm());
        window = primaryStage;
        window.setTitle("Binary Calculator");
        window.setScene(mainScene);
        window.show();
    }
}
