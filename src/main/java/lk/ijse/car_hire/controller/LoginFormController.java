package lk.ijse.car_hire.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane rootNode;

    public void clickedOnReg(MouseEvent mouseEvent) {
        try {
            Parent root=FXMLLoader.load(this.getClass().getResource("/view/registration_form.fxml"));
            Scene scene=new Scene(root);
            Stage stage= (Stage) this.rootNode.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Create New User Account");
            stage.centerOnScreen();

        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    public void btnClickOnExit(ActionEvent actionEvent) {
        Platform.exit();
    }
}
