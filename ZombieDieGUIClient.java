import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ZombieDieGUIClient extends Application {
    public void start(Stage stage){
        Scene scene = new Scene(new ZombieDieGUI(), 10000, 10000);

        stage.setTitle("Zombie Die.java");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}





