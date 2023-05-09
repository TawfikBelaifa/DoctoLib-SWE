package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import BuisnessLogic.DoctorConnexionImpl;
import BuisnessLogic.PatientConnexionImpl;
import Dto.DoctorDto;
import Dto.PatientDto;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.util.Duration;

public class SignInUpController implements Initializable{


	private Parent fxml;
	
	 @FXML
	    private BorderPane SystemApp;

	    @FXML
	    private Button btnToMoveSignIn;

	    @FXML
	    private Button btnToMoveLogIn;

	    @FXML
	    private AnchorPane signUpFrame;

	    @FXML
	    private Button btnLogin;

	    @FXML
	    private TextField username;

	    @FXML
	    private TextField password;

	    @FXML
	    private AnchorPane signinFrame;

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
	    private ImageView softExit;

	    @FXML
	    private TextField adresse;

	    @FXML
	    private TextField cp;

	    @FXML
	    private TextField ville;

	    @FXML
	    private TextField mail;

	    @FXML
	    private CheckBox doct;
	    
	    @FXML
	    private CheckBox doctConnexion;

	    @FXML
	    private ChoiceBox<String> speChoice;
    
    private String [] choice = {"Medecin Generaliste", "Osthéopathe", "Kinétherapeut", "Psychatre", "Dermatholoque", "Ophtalmologue"};


    @FXML
    void ToMoveLogIn() {
    	TranslateTransition t = new TranslateTransition(Duration.seconds(1), signinFrame);
    	t.setToX(+540.5);
    	t.play();
    	TranslateTransition b = new TranslateTransition(Duration.seconds(1), signUpFrame);
    	b.setToX(0);
    	b.play();
    	btnToMoveLogIn.setDisable(true);
    	btnToMoveSignIn.setDisable(false);
    }

    @FXML
    void ToMoveSignIn() {
    	TranslateTransition a = new TranslateTransition(Duration.seconds(1), signUpFrame);
    	a.setToX(0);
    	a.play();
    	TranslateTransition c = new TranslateTransition(Duration.seconds(1), signinFrame);
    	c.setToX(0);
    	c.play();
    	btnToMoveSignIn.setDisable(true);
    	btnToMoveLogIn.setDisable(false);
    }
    
    @FXML
    void exitSoft() {
    	System.exit(0);
    }
    
    @FXML
    void toLogin() throws IOException {
    	if( !username.getText().isEmpty() && !password.getText().isEmpty()) {
    		if(doctConnexion.isSelected()) {
    			DoctorConnexionImpl DrCoImpl = new DoctorConnexionImpl();
    			DrCoImpl.findOneByU_P(new DoctorDto(username.getText(), password.getText()), this);
    		}else {
    			PatientConnexionImpl PaCoImpl = new PatientConnexionImpl();
    			PaCoImpl.findOneByU_P(new PatientDto(username.getText(), password.getText()), this);
    		}
    		
    	}else {
    		Alert alert = new Alert(AlertType.ERROR,"ez remplir tout les champs", ButtonType.OK);
    		alert.showAndWait();
    	}

    }
    
    public Parent getFxml() {
		return fxml;
	}

	public void setFxml(Parent fxml) {
		this.fxml = fxml;
	}

	public BorderPane getSystemApp() {
		return SystemApp;
	}

	public void setSystemApp(BorderPane systemApp) {
		SystemApp = systemApp;
	}

	public Button getBtnToMoveSignIn() {
		return btnToMoveSignIn;
	}

	public void setBtnToMoveSignIn(Button btnToMoveSignIn) {
		this.btnToMoveSignIn = btnToMoveSignIn;
	}

	public Button getBtnToMoveLogIn() {
		return btnToMoveLogIn;
	}

	public void setBtnToMoveLogIn(Button btnToMoveLogIn) {
		this.btnToMoveLogIn = btnToMoveLogIn;
	}

	public AnchorPane getSignUpFrame() {
		return signUpFrame;
	}

	public void setSignUpFrame(AnchorPane signUpFrame) {
		this.signUpFrame = signUpFrame;
	}

	public Button getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(Button btnLogin) {
		this.btnLogin = btnLogin;
	}

	public TextField getUsername() {
		return username;
	}

	public void setUsername(TextField username) {
		this.username = username;
	}

	public TextField getPassword() {
		return password;
	}

	public void setPassword(TextField password) {
		this.password = password;
	}

	public AnchorPane getSigninFrame() {
		return signinFrame;
	}

	public void setSigninFrame(AnchorPane signinFrame) {
		this.signinFrame = signinFrame;
	}

	public Button getBtnSignIn() {
		return btnSignIn;
	}

	public void setBtnSignIn(Button btnSignIn) {
		this.btnSignIn = btnSignIn;
	}

	public TextField getUserNameSignin() {
		return userNameSignin;
	}

	public void setUserNameSignin(TextField userNameSignin) {
		this.userNameSignin = userNameSignin;
	}

	public TextField getPasswordSignin() {
		return passwordSignin;
	}

	public void setPasswordSignin(TextField passwordSignin) {
		this.passwordSignin = passwordSignin;
	}

	public TextField getConfirmePassword() {
		return confirmePassword;
	}

	public void setConfirmePassword(TextField confirmePassword) {
		this.confirmePassword = confirmePassword;
	}

	public DatePicker getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(DatePicker birthDate) {
		this.birthDate = birthDate;
	}

	public TextField getSiretNum() {
		return siretNum;
	}

	public void setSiretNum(TextField siretNum) {
		this.siretNum = siretNum;
	}

	public ImageView getSoftExit() {
		return softExit;
	}

	public void setSoftExit(ImageView softExit) {
		this.softExit = softExit;
	}

	public TextField getAdresse() {
		return adresse;
	}

	public void setAdresse(TextField adresse) {
		this.adresse = adresse;
	}

	public TextField getCp() {
		return cp;
	}

	public void setCp(TextField cp) {
		this.cp = cp;
	}

	public TextField getVille() {
		return ville;
	}

	public void setVille(TextField ville) {
		this.ville = ville;
	}

	public ChoiceBox<String> getSpeChoice() {
		return speChoice;
	}

	public void setSpeChoice(ChoiceBox<String> speChoice) {
		this.speChoice = speChoice;
	}

	public String[] getChoice() {
		return choice;
	}

	public void setChoice(String[] choice) {
		this.choice = choice;
	}

	public SignInUpController() {
		super();
	}

	public void toSignIn() {
    	if( !userNameSignin.getText().isEmpty() && !speChoice.getValue().isEmpty()  && !speChoice.getValue().isEmpty() && !passwordSignin.getText().isEmpty() &&  !confirmePassword.getText().isEmpty() && (birthDate.getValue().getMonthValue() != 0) && !siretNum.getText().isEmpty()) {
    		if(passwordSignin.getText().equalsIgnoreCase(confirmePassword.getText())) {
    			PatientConnexionImpl coImpl = new PatientConnexionImpl();
            	coImpl.save(new PatientDto(userNameSignin.getText(), passwordSignin.getText(), birthDate.getValue().toString(),Integer.valueOf(siretNum.getText()), Integer.valueOf(cp.getText()) , ville.getText(), speChoice.getValue(), adresse.getText()));
            	Alert alert = new Alert(AlertType.CONFIRMATION,"Inscription réussi", ButtonType.NEXT);
	    		alert.showAndWait();
	    		ToMoveLogIn();
    		}else {
    			Alert alert = new Alert(AlertType.ERROR,"Mot de passe incorrect", ButtonType.OK);
	    		alert.showAndWait();
    		}
       	}
    }
	
    @FXML
    void checkedDr() {
    	if( siretNum.isDisabled() && mail.isDisable() && birthDate.isDisable() && adresse.isDisable() && cp.isDisable() && ville.isDisable() && speChoice.isDisable()) {
    		siretNum.setDisable(false);
    		birthDate.setDisable(false);
    		adresse.setDisable(false);
    		cp.setDisable(false);
    		ville.setDisable(false);
    		speChoice.setDisable(false);
    		mail.setDisable(false);
    	}else {
    		siretNum.setDisable(true);
    		birthDate.setDisable(true);
    		adresse.setDisable(true);
    		cp.setDisable(true);
    		ville.setDisable(true);
    		speChoice.setDisable(true);
    		mail.setDisable(true);
    	}
    }
	


	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btnToMoveSignIn.setDisable(true);
		speChoice.getItems().addAll(choice);
		
	}

}