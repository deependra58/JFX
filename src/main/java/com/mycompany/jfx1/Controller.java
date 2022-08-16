/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.jfx1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Deependra karki
 */
public class Controller implements Initializable {

    private static Scene scene;

    @FXML
    private Label label;
    @FXML
    private CheckBox alliedExpress;
    @FXML
    private CheckBox hunterExpress;
    @FXML
    private CheckBox australianExpress;

    @FXML
    private Label choiceLabel;
    @FXML
    private ChoiceBox choiceBox;
    @FXML
    private ComboBox comboBox;
    @FXML
    private Label comboLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        choiceBox.getItems().add("Australian Post");
        choiceBox.getItems().add("Hunter Express");
        choiceBox.getItems().add("Allied Express");
        choiceBox.getItems().addAll("FedEx", "DHL");
        choiceBox.setValue("Australian Post");

        comboBox.getItems().addAll("Australian Post", "Allied Express", "Hunter Express");
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {

        String post = "";
        if (alliedExpress.isSelected()) {
            post = "Allied Express";
        }
        if (hunterExpress.isSelected()) {
            post += " Hunter Express";
        }
        if (australianExpress.isSelected()) {
            post += " Australian Express";
        }
        label.setText(post);
    }

    @FXML
    private void handleChoiceBox(ActionEvent event) {

        choiceLabel.setText(choiceBox.getValue().toString());
    }

    /**
     *
     * This is for combo box
     */
    @FXML
    private void handleComboBox(ActionEvent event) {
        comboLabel.setText(comboBox.getValue().toString());
    }

    @FXML
    private void handleNextAction(ActionEvent event) throws IOException {

        Parent root=FXMLLoader.load(getClass().getResource("secondary.fxml"));
        Scene scene=new Scene(root);
        Stage window=(Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();

    }

  

}
