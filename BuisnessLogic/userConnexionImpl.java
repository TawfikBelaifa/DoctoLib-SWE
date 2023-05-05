package BuisnessLogic;

import java.io.IOException;
import java.util.List;

import Controllers.HomeController;
import Controllers.SignInUpController;
import Dao.userConnexionDAO;
import Dto.userDto;
import InterfaceMetier.IBLog;
import StaticClass.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class userConnexionImpl implements IBLog<userDto, Integer, SignInUpController>{

	@Override
	public void save(userDto o) {
		
			userConnexionDAO.getDao().save(o);
			try {
				Logger.readLog();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}

	@Override
	public void update(userDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public userDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public userDto findOneByU_P(userDto o, SignInUpController signInUpController) {
		userDto dto = new userDto();
		try {
			dto =  userConnexionDAO.getDao().findOneByU_P(o);
			
			if(dto != null) {
				((SignInUpController) signInUpController).getSystemApp().getScene().getWindow().hide();
	    		
	    		try {
	    	    		Stage home = new Stage();
	    	    		FXMLLoader loader = new FXMLLoader();
	    				loader.setLocation(SignInUpController.class.getResource("/InterfaceUsers/Home.fxml"));
	    				//signInUpController.setFxml(loader.load());
	    				Scene scene = new Scene(loader.load());
		    			HomeController HC = loader.getController();
		    			HC.setUSER_SOFT("Bonjour DR. "+dto.getUsername()+" !");
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
	public userDto findOneByU_P(userDto o) {
		// TODO Auto-generated method stub
		return null;
	}

}
