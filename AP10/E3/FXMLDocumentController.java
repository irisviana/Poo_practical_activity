/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulapratica10_3;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.ObservableList;
import javafx.beans.InvalidationListener;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

        
/**
 *
 * @author Iris
 */

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button labelbutao;
    
   @FXML
    private TextField labelNome;

    @FXML
    private TextField labelCPF;

    @FXML
    private ChoiceBox<String> labelEstadoCivil;
    
    @FXML
    private Label estadoCivil;
    
    @FXML
    private DatePicker labelData;
    @FXML
    void Cadastrar(ActionEvent event) {
        labelbutao.setText("cliente salvo com sucesso");
    }

       
        
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     ArrayList listaOpecoes=new ArrayList<>();
      listaOpecoes.add("Solteiro(a)");
      listaOpecoes.add("Casado(a)");
      listaOpecoes.add("Viuvo(a)");
      listaOpecoes.add("outro");
      
      this.labelEstadoCivil.setItems(FXCollections.observableArrayList(listaOpecoes));
      
      
      
    
    }    
    
}
