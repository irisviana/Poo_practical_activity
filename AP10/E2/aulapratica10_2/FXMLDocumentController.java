/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica10_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Iris
 */
public class FXMLDocumentController implements Initializable {
    
   @FXML
    private TextField labelA;

    @FXML
    private TextField labelB;

    @FXML
    private Label labelResultado;

    
    @FXML
    private void Somar(ActionEvent event) {
        try{
        long soma=Long.parseLong(this.labelA.getText())+Long.parseLong(this.labelB.getText());
        this.labelResultado.setText(String.valueOf(soma));
        }catch(Exception e){
            this.labelResultado.setText("valores não inicializados");
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
