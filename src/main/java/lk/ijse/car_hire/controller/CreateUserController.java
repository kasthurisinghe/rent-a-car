package lk.ijse.car_hire.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CreateUserController {

    public AnchorPane root;
    public TextField txtId;
    public TextField txtFirst;
    public TextField txtxLast;
    public TextField txtNic;
    public TextField txtAddress;
    public TextField txtPhone;
    public TextField txtAge;
    public TextField txtPassw;

    public void btnClickOnBack(ActionEvent actionEvent) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/view/login_form.fxml"));
            Scene scene=new Scene(parent);
            Stage stage= (Stage) this.root.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("User Login");
            stage.centerOnScreen();

        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage());
        }
    }

    public void btnClickOncreate(ActionEvent actionEvent) {
    }
}
