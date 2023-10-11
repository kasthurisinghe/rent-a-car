package lk.ijse.car_hire.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Dashboard {
    public AnchorPane rootNode;
    public AnchorPane baseNode;
    public Label labTitle;


    public void btncCickOnCustomer(ActionEvent actionEvent) throws IOException {
        labTitle.setText("Customer Details");
        Parent root=FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.baseNode.getChildren().clear();
        this.baseNode.getChildren().add(root);
    }

    public void btnClickOnCarCategory(ActionEvent actionEvent) {
labTitle.setText("Car Category");
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("/view/car_category_form.fxml"));
            this.baseNode.getChildren().clear();
            this.baseNode.getChildren().add(root);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    public void btnClickOnRent(ActionEvent actionEvent) {
        labTitle.setText("Rental Details");
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("/view/rent_form.fxml"));
            this.baseNode.getChildren().clear();
            this.baseNode.getChildren().add(root);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }

    public void btnClickOnCar(ActionEvent actionEvent) {
        labTitle.setText("Details of Car");
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("/view/car_form.fxml"));
            this.baseNode.getChildren().clear();
            this.baseNode.getChildren().add(root);
        } catch (IOException e) {
            new Alert(Alert.AlertType.ERROR,e.getMessage()).show();
        }
    }
}
