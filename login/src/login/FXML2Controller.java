/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
/**
 * FXML Controller class
 *
 * @author prett
 */
public class FXML2Controller implements Initializable {

      @FXML
    private Button btn_submit;
    @FXML
    private Button btn_exit;
    @FXML 
    TextField teks;
    
    @FXML
    public void onClick_btn_submit (ActionEvent e)throws IOException{
        StringBuilder sb = new StringBuilder();
        sb.append(teks.getText().toString() + "\n");
       
        File file = new File("src/login/out.txt");
        FileWriter W = new FileWriter(file);
        W.write(sb.toString());
        W.close();
    }
    
    @FXML
    public void onClick_btn_exit (ActionEvent e){
   
       Platform.exit();
   }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
