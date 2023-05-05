package Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.*;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class HomeController implements Initializable{


	private Parent fxml;
	
	
    @FXML
    private VBox leftSideBarrVbox;

    @FXML
    private AnchorPane profilLabel;

    @FXML
    private Label txtProfil;

    @FXML
    private AnchorPane homeLabel;

    @FXML
    private Label txtHome;

    @FXML
    private AnchorPane setLabel;

    @FXML
    private Label txtSetting;

    @FXML
    private AnchorPane moreLabel;
    
	@FXML
    private Label txtPlus;

    @FXML
    private AnchorPane rdvLabel;

    @FXML
    private Label txtRDV;

    @FXML
    private AnchorPane msgLbl;

    @FXML
    private Label txtRDV1;

    @FXML
    private AnchorPane tmsLbl;

    @FXML
    private Label txtRDV11;

    @FXML
    private AnchorPane cliLbl;

    @FXML
    private Label txtRDV111;

    @FXML
    private AnchorPane sdcLbl;

    @FXML
    private Label txtRDV1111;
    
    @FXML
    private ScrollPane centerContainer;

    @FXML
    private ImageView btnMenu;

    @FXML
    private ImageView imgHome;

    @FXML
    private Label USER_SOFT;

    public VBox getLeftSideBarrVbox() {
		return leftSideBarrVbox;
	}

	public void setLeftSideBarrVbox(VBox leftSideBarrVbox) {
		this.leftSideBarrVbox = leftSideBarrVbox;
	}

	public AnchorPane getProfilLabel() {
		return profilLabel;
	}

	public void setProfilLabel(AnchorPane profilLabel) {
		this.profilLabel = profilLabel;
	}

	public Label getTxtProfil() {
		return txtProfil;
	}

	public void setTxtProfil(Label txtProfil) {
		this.txtProfil = txtProfil;
	}

	public AnchorPane getHomeLabel() {
		return homeLabel;
	}

	public void setHomeLabel(AnchorPane homeLabel) {
		this.homeLabel = homeLabel;
	}

	public Label getTxtHome() {
		return txtHome;
	}

	public void setTxtHome(Label txtHome) {
		this.txtHome = txtHome;
	}

	public AnchorPane getSetLabel() {
		return setLabel;
	}

	public void setSetLabel(AnchorPane setLabel) {
		this.setLabel = setLabel;
	}

	public Label getTxtSetting() {
		return txtSetting;
	}

	public void setTxtSetting(Label txtSetting) {
		this.txtSetting = txtSetting;
	}

	public AnchorPane getMoreLabel() {
		return moreLabel;
	}

	public void setMoreLabel(AnchorPane moreLabel) {
		this.moreLabel = moreLabel;
	}

	public Label getTxtPlus() {
		return txtPlus;
	}

	public void setTxtPlus(Label txtPlus) {
		this.txtPlus = txtPlus;
	}

	public AnchorPane getRdvLabel() {
		return rdvLabel;
	}

	public void setRdvLabel(AnchorPane rdvLabel) {
		this.rdvLabel = rdvLabel;
	}

	public Label getTxtRDV() {
		return txtRDV;
	}

	public void setTxtRDV(Label txtRDV) {
		this.txtRDV = txtRDV;
	}

	public AnchorPane getMsgLbl() {
		return msgLbl;
	}

	public void setMsgLbl(AnchorPane msgLbl) {
		this.msgLbl = msgLbl;
	}

	public Label getTxtRDV1() {
		return txtRDV1;
	}

	public void setTxtRDV1(Label txtRDV1) {
		this.txtRDV1 = txtRDV1;
	}

	public AnchorPane getTmsLbl() {
		return tmsLbl;
	}

	public void setTmsLbl(AnchorPane tmsLbl) {
		this.tmsLbl = tmsLbl;
	}

	public Label getTxtRDV11() {
		return txtRDV11;
	}

	public void setTxtRDV11(Label txtRDV11) {
		this.txtRDV11 = txtRDV11;
	}

	public AnchorPane getCliLbl() {
		return cliLbl;
	}

	public void setCliLbl(AnchorPane cliLbl) {
		this.cliLbl = cliLbl;
	}

	public Label getTxtRDV111() {
		return txtRDV111;
	}

	public void setTxtRDV111(Label txtRDV111) {
		this.txtRDV111 = txtRDV111;
	}

	public AnchorPane getSdcLbl() {
		return sdcLbl;
	}

	public void setSdcLbl(AnchorPane sdcLbl) {
		this.sdcLbl = sdcLbl;
	}

	public Label getTxtRDV1111() {
		return txtRDV1111;
	}

	public void setTxtRDV1111(Label txtRDV1111) {
		this.txtRDV1111 = txtRDV1111;
	}

	public ImageView getBtnMenu() {
		return btnMenu;
	}

	public void setBtnMenu(ImageView btnMenu) {
		this.btnMenu = btnMenu;
	}

	public ImageView getImgHome() {
		return imgHome;
	}

	public void setImgHome(ImageView imgHome) {
		this.imgHome = imgHome;
	}

	public Label getUSER_SOFT() {
		return USER_SOFT;
	}

	public void setUSER_SOFT(String val) {
		this.USER_SOFT.setText(val);
	}

	public HomeController() {
		super();
	}

	public HomeController(VBox leftSideBarrVbox, AnchorPane profilLabel, Label txtProfil, AnchorPane homeLabel,
			Label txtHome, AnchorPane setLabel, Label txtSetting, AnchorPane moreLabel, Label txtPlus,
			AnchorPane rdvLabel, Label txtRDV, AnchorPane msgLbl, Label txtRDV1, AnchorPane tmsLbl, Label txtRDV11,
			AnchorPane cliLbl, Label txtRDV111, AnchorPane sdcLbl, Label txtRDV1111, ImageView btnMenu,
			ImageView imgHome, Label uSER_SOFT) {
		super();
		this.leftSideBarrVbox = leftSideBarrVbox;
		this.profilLabel = profilLabel;
		this.txtProfil = txtProfil;
		this.homeLabel = homeLabel;
		this.txtHome = txtHome;
		this.setLabel = setLabel;
		this.txtSetting = txtSetting;
		this.moreLabel = moreLabel;
		this.txtPlus = txtPlus;
		this.rdvLabel = rdvLabel;
		this.txtRDV = txtRDV;
		this.msgLbl = msgLbl;
		this.txtRDV1 = txtRDV1;
		this.tmsLbl = tmsLbl;
		this.txtRDV11 = txtRDV11;
		this.cliLbl = cliLbl;
		this.txtRDV111 = txtRDV111;
		this.sdcLbl = sdcLbl;
		this.txtRDV1111 = txtRDV1111;
		this.btnMenu = btnMenu;
		this.imgHome = imgHome;
		USER_SOFT = uSER_SOFT;
	}

    @FXML
    void GoBackToHome() {

    }

    @FXML
    void GoToHome() {
    	
    }

    @FXML
    void GoToSetting() {

    }

    @FXML
    void goToMorepage() {

    }

    @FXML
    void goToProfil() {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("/InterfaceUsers/Profil.fxml"));
		try {
			Parent root2 = (Parent) loader.load();
			this.centerContainer.setContent(root2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    @FXML
    void gotToClinicPage() {

    }

    @FXML
    void gotToConsultationPage() {

    }

    @FXML
    void gotToMsgPage() {

    }

    @FXML
    void gotToTeamPage() {

    }

    @FXML
    void gotTordvPage() {

    }

    @FXML
    void showAllMenu() {
    	if(!txtHome.isVisible() && !txtSetting.isVisible() && !txtProfil.isVisible() && !txtPlus.isVisible() && !txtRDV.isVisible() && !txtRDV.isVisible() ) {
        	txtHome.setVisible(true);
        	txtSetting.setVisible(true);
        	txtProfil.setVisible(true);
        	txtPlus.setVisible(true);
        	txtRDV.setVisible(true);
        	txtRDV1.setVisible(true);
        	txtRDV11.setVisible(true);
        	txtRDV111.setVisible(true);
        	txtRDV1111.setVisible(true);
        	leftSideBarrVbox.setMinWidth(200);
    	}else {
    		hideMenu();
    	}

    }
    
    void hideMenu() {
    	txtHome.setVisible(false);
    	txtSetting.setVisible(false);
    	txtProfil.setVisible(false);
    	txtPlus.setVisible(false);
    	txtRDV.setVisible(false);
    	txtRDV1.setVisible(false);
    	txtRDV11.setVisible(false);
    	txtRDV111.setVisible(false);
    	txtRDV1111.setVisible(false);
    	leftSideBarrVbox.setMinWidth(0);
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		hideMenu();
	}

}