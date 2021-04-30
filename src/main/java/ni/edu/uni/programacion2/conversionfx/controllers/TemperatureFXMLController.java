/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.conversionfx.controllers;


import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JADPA26
 */
public class TemperatureFXMLController implements Initializable {
    private final DecimalFormat df = new DecimalFormat("#.0");
    @FXML
    public TextField txtCelcius;
    @FXML
    public TextField txtFah;
    @FXML
    public Button btnCompute;
    @FXML 
    public Button btnClean;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    public void btnComputeAction(){
        double c,f;
        if(txtCelcius.getText().isBlank() && txtFah.getText().isBlank()){
            return;
        }
        if(txtCelcius.getText().isBlank()){
            c=0;
        }else{
            c=Double.parseDouble(txtCelcius.getText());
            txtFah.setText(String.valueOf(df.format(convAF(c))));
        }
        if(txtFah.getText().isBlank()){
            f=0;
        }else{
            f=Double.parseDouble(txtFah.getText());
            txtCelcius.setText(String.valueOf(df.format(convAC(f))));
        }
    }
    @FXML
    public void btnCleanAction(){
        txtCelcius.setText("");
        txtFah.setText("");
    }
    
    private double convAC(double a) {
        return (a - 32) * 5 / 9;
    }

    private double convAF(double a) {
        return (a * 9 / 5) + 32;
    }
}
