package Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ProfilController implements Initializable {

    @FXML
    private Button btnSignIn;

    @FXML
    private TextField userNameSignin;

    @FXML
    private TextField passwordSignin;

    @FXML
    private TextField confirmePassword;

    @FXML
    private DatePicker birthDate;

    @FXML
    private TextField siretNum;

    @FXML
    private TextField adresse;

    @FXML
    private TextField cp;

    @FXML
    private TextArea descrp;

    @FXML
    private TextField ville;

    @FXML
    private TextField tel;

    @FXML
    private ChoiceBox<String> speChoiceJH;

    @FXML
    private ChoiceBox<String> speChoiceOH;
    
    @FXML
    private ChoiceBox<String> speChoice;

    @FXML
    private TextField nom;

    @FXML
    private TextField prenom;
    
    private String [] choice = {"Medecin Generaliste", "Osthéopathe", "Kinétherapeut", "Psychatre", "Dermatholoque", "Ophtalmologue"};
    private String [] HOJ = {"Lundi - Vendredi", "Lundi-Mardi Jeudi-Vendredi", "Lundi - Jeudi", "5j/7 sauf Jeudi", "5j/7 sauf Mardi"};
    private String [] HOH = {"8h-12h 14h-16h", "10h-12h 14h-18h", "9h-12h 14h-17h", "8h30-12h30 14h30-16h30", "9h30-12h30 14h30-17h30"};
    
    

    @FXML
    void update() {
    	if(!userNameSignin.getText().isEmpty() 
    			//&& birthDate.getValue().getMonthValue() != 0 
    			&& !siretNum.getText().isEmpty() 
    			&& !adresse.getText().isEmpty() 
    			&& !cp.getText().isEmpty() 
    			&& !speChoice.getValue().isEmpty()
    			&& !nom.getText().isEmpty()
    			&& !prenom.getText().isEmpty()
    			&& !tel.getText().isEmpty()
    			&& !descrp.getText().isEmpty()
    			) {
    		
    		System.out.println(descrp.getText());
    		
    		
    	}
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		speChoice.getItems().addAll(choice);
		speChoiceJH.getItems().addAll(HOJ);
		speChoiceOH.getItems().addAll(HOH);
		
	}

}
