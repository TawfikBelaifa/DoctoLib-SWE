package BuisnessLogic;

import java.io.IOException;
import java.util.List;

import Controllers.HomeController;
import Controllers.SignInUpController;
import Dao.PatientConnexionDAO;
import Dto.PatientDto;
import InterfaceMetier.IBLog;
import StaticClass.Logger;
import StaticClass.UserSession;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class PatientConnexionImpl implements IBLog<PatientDto, Integer, SignInUpController>{

	@Override
	public void save(PatientDto o) {
		
			PatientConnexionDAO.getDao().save(o);
			try {
				Logger.readLog();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void update(PatientDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PatientDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public PatientDto findOneByU_P(PatientDto o, SignInUpController signInUpController) {
		PatientDto dto = new PatientDto();
		try {
			dto =  PatientConnexionDAO.getDao().findOneByU_P(o);
			
			if(dto != null) {
				signInUpController.getSystemApp().getScene().getWindow().hide();
				UserSession.sessionCreate(dto.getUserName(), dto.getID(), null);
	    		try {
	    	    		Stage home = new Stage();
	    	    		FXMLLoader loader = new FXMLLoader();
	    				loader.setLocation(SignInUpController.class.getResource("/InterfaceUsers/Home.fxml"));
	    				//signInUpController.setFxml(loader.load());
	    				Scene scene = new Scene(loader.load());
		    			HomeController HC = loader.getController();
		    			HC.setUSER_SOFT("Bonjour DR. "+dto.getUserName()+" !");
	    				home.setScene(scene);
	    				//home.initStyle(StageStyle.UTILITY);
	    				home.show();
	    				home.setTitle("DoctoLib");
	    				
	    				
	    		} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else {
	    		Alert alert = new Alert(AlertType.ERROR,"Nom user ou password incorrect", ButtonType.OK);
	    		alert.showAndWait();
        	}
			Logger.readLog();
		}catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		return dto;
		

	}

	@Override
	public PatientDto findOneByU_P(PatientDto o) {
		// TODO Auto-generated method stub
		return null;
	}

}
