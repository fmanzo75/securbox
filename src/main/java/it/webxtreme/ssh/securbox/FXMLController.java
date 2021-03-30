/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.webxtreme.ssh.securbox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtUserIp"
    private TextField txtUserIp; // Value injected by FXMLLoader

    @FXML // fx:id="txtPassword"
    private TextField txtPassword; // Value injected by FXMLLoader

    @FXML // fx:id="txtPort"
    private TextField txtPort; // Value injected by FXMLLoader

    @FXML // fx:id="txtCommand"
    private TextField txtCommand; // Value injected by FXMLLoader

    @FXML // fx:id="btnEsegui"
    private Button btnEsegui; // Value injected by FXMLLoader

    @FXML // fx:id="btnConnetti"
    private Button btnConnetti; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML
    void handleConnetti(ActionEvent event) {

    }

    @FXML
    void handleEsegui(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtUserIp != null : "fx:id=\"txtUserIp\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPassword != null : "fx:id=\"txtPassword\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtPort != null : "fx:id=\"txtPort\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtCommand != null : "fx:id=\"txtCommand\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnEsegui != null : "fx:id=\"btnEsegui\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnConnetti != null : "fx:id=\"btnConnetti\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}
