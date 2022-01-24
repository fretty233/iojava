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
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author prett
 */
public class FXMLDocController implements Initializable {
    
   @FXML 
   private Button btn_login;
   @FXML
   private Button btn_exit;
   @FXML
   private TextField txt_Username;
   @FXML
   private PasswordField password;
   
   @FXML
   public void onClick_btn_login (ActionEvent e) throws IOException{
   //membuat text
   StringBuilder sb = new StringBuilder();
   sb.append(txt_Username.getText().toString() + "\n");
   sb.append(password.getText().toString() + "\n");
   
   File file = new File("src/login/login.txt");
   FileWriter W = new FileWriter(file);
   W.write(sb.toString());
   W.close();
   
   Parent screen2_parent = FXMLLoader.load(getClass().getResource("FXML2.fxml"));
   Scene screen2_scene = new Scene(screen2_parent);
   Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
   app_stage.hide();
   app_stage.setScene(screen2_scene);
   app_stage.show();
   
    }
   @FXML
   public void onClick_btn_exit (ActionEvent e){
   
       Platform.exit();
   }
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
