/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.conversionfx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import ni.edu.uni.programacion2.conversionfx.core.CurrencyConvertion;

/**
 * FXML Controller class
 *
 * @author Sistemas-15
 */
public class CurrencyFXMLController implements Initializable {

    ObservableList<String> items = FXCollections.observableArrayList("Cordoba -> Dolar", "Dolar -> Cordoba", "Cordoba -> Euro", "Euro -> Cordoba", "Dolar -> Euro", "Euro -> Dolar");
    @FXML
    public ComboBox<String> cmbChange;
    @FXML
    public TextField txtValor;
    @FXML
    public TextField txtResult;
    @FXML
    public Button btnConvertir;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cmbChange.setItems(items);
    }

    @FXML
    public void btnConvertirAction(ActionEvent event) {
        float value;
        switch (cmbChange.getValue().toString()) {
            case "Cordoba -> Dolar": {
                value = Float.parseFloat(txtValor.getText());
                txtResult.setText(String.valueOf(CurrencyConvertion.CorToDol(value)));
                break;
            }
            case "Dolar -> Cordoba": {
                value = Float.parseFloat(txtValor.getText());
                txtResult.setText(String.valueOf(CurrencyConvertion.DolToCor(value)));
                break;
            }
            case "Cordoba -> Euro": {
                value = Float.parseFloat(txtValor.getText());
                txtResult.setText(String.valueOf(CurrencyConvertion.DolToEu(CurrencyConvertion.CorToDol(value))));
                break;
            }
            case "Euro -> Cordoba": {
                value = Float.parseFloat(txtValor.getText());
                txtResult.setText(String.valueOf(CurrencyConvertion.DolToCor(CurrencyConvertion.EuToDol(value))));
                break;
            }
            case "Dolar -> Euro": {
                value = Float.parseFloat(txtValor.getText());
                txtResult.setText(String.valueOf(CurrencyConvertion.DolToEu(value)));
                break;
            }
            case "Euro -> Dolar": {
                value = Float.parseFloat(txtValor.getText());
                txtResult.setText(String.valueOf(CurrencyConvertion.EuToDol(value)));
                break;
            }
        }
    }

}
