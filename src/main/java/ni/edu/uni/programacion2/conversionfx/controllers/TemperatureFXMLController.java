/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ni.edu.uni.programacion2.conversionfx.controllers;


import java.net.URL;
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
        
    }
    @FXML
    public void btnCleanAction(){
        
    }
}