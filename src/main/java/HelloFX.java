import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class HelloFX extends Application {
    public static void run() {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        String version = System.getProperty("javafx.version");
        Label label = new Label("Hello from JavaFX: " + version);
        TextField hejsa = new TextField("Fisk er ikke landdyr");

        Label label1 = new Label("Hello from JavaFX: " + version);
        Label label2 = new Label("Hej IT 62450!");
        Label label3 = new Label("Hej IT 62450!");
        GridPane gridpane = new GridPane();
        gridpane.setGridLinesVisible(true); // Only for debugging/layouting
        gridpane.add(label1,0,0);
        gridpane.add(label2,1,1);
        gridpane.add(label3,0,1);
       // FlowPane stackPane = new FlowPane(label);
        Scene scene = new Scene(gridpane, 1000, 600);
        stage.setScene(scene);
        stage.show();
    }
}

