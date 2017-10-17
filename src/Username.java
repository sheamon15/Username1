/**
 *@Author:Shea Salloum
 *@Date 10/15/17
 *
 */import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Optional;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Username extends Application {
    @Override
    public void start(Stage primayStage) {
        TextInputDialog textinputdialog = new TextInputDialog();// Creates a box for user to input
        textinputdialog.setTitle("AUTHENTICATION!!!");
        textinputdialog.setContentText("ENTER YOUR USERNAME AND PASSWORD");
        Optional<String> input = textinputdialog.showAndWait();
        String option = input.get();

        if (option.equals("Shea,What")) {// Authenticates the passwsord
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setContentText("Welcome Shea");
            alert.showAndWait();
        } else {
            Alert hi = new Alert(AlertType.INFORMATION);
            hi.setContentText("Wrong Username and password");
            hi.showAndWait();


        }
    }

}
