import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {
    public static void main(String[] args) {
        launch();
    }

    public void start(@org.jetbrains.annotations.NotNull Stage stage) throws Exception{
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("view/add_customer_form.fxml"))));
        stage.show();
    }
}
