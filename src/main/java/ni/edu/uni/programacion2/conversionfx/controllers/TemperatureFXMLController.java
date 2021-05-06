/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.conversionfx.controllers;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import ni.edu.uni.programacion2.conversionfx.core.TemperatureConvertion;

/**
 * FXML Controller class
 *
 * @author JADPA26
 */
public class TemperatureFXMLController implements Initializable {
    @FXML
    public TextField txtCelcius;
    @FXML
    public TextField txtFah;
    @FXML
    public Button btnCompute;
    @FXML
    public Button btnClean;
    @FXML
    public RadioButton rbtnCelcius;
    @FXML
    public ToggleGroup Temperature;
    @FXML
    public RadioButton rbtnFahren;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void btnComputeAction() {
        float value;
        if (rbtnCelcius.isSelected()) {
            value = Float.parseFloat(txtCelcius.getText());
            txtFah.setText(String.valueOf(TemperatureConvertion.CelciusToFah(value)));
        }else if (rbtnFahren.isSelected()) {
            value = Float.parseFloat(txtFah.getText());
            txtCelcius.setText(String.valueOf(TemperatureConvertion.FahToCelcius(value)));
        }
        
        
//        if (txtCelcius.getText().isBlank() && txtFah.getText().isBlank()) {
//            return;
//        }
//        if (txtCelcius.getText().isBlank()) {
//            c = 0;
//        } else {
//            c = Float.parseFloat(txtCelcius.getText());
//            txtFah.setText(String.valueOf(TemperatureConvertion.CelciusToFah(c)));
//        }
//        if (txtFah.getText().isBlank()) {
//            f = 0;
//        } else {
//            f = Float.parseFloat(txtFah.getText());
//            txtCelcius.setText(String.valueOf(TemperatureConvertion.FahToCelcius(f)));
//        }
    }

    @FXML
    public void btnCleanAction() {
        cleanTextField();
    }

    @FXML
    public void rbtnCelciusAction(ActionEvent event) {
        activateTextField();
    }

    @FXML
    public void rbtnFahrenAction(ActionEvent event) {
        activateTextField();
    }

    public void activateTextField() {
        if (rbtnCelcius.isSelected()) {
            txtCelcius.setEditable(true);
            txtFah.setEditable(false);
            txtCelcius.requestFocus();

        } else if (rbtnFahren.isSelected()) {
            txtCelcius.setEditable(false);
            txtFah.setEditable(true);
            txtFah.requestFocus();
        }
        cleanTextField();

    }

    public void cleanTextField() {
        txtCelcius.setText("");
        txtFah.setText("");
    }

}
