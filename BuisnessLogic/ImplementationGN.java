package BuisnessLogic;

import java.io.IOException;
import java.util.List;

import Controllers.HomeController;
import Controllers.SignInUpController;
import Dao.DAOgn;
import Dao.DoctorConnexionDAO;
import Dto.UserDTO;
import InterfaceMetier.IBLog;
import StaticClass.Logger;
import StaticClass.UserSession;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

@SuppressWarnings("hiding")
public class ImplementationGN<X extends UserDTO,Integer,Z> implements IBLog<X,Integer,Z>{

	@Override
	public void save(X o) {
		// TODO Auto-generated method stub
		DAOgn.getDao().save(o);
		try {
			Logger.readLog();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(X o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public X findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public X findOneByU_P(X o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<X> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public X findOneByU_P(X o, Z c) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public <T extends UserDTO, Y extends SignInUpController> T findOneByU_PG(T o, Y c) {
		T dto = (T) new UserDTO();
		try {
			dto =  (T) DAOgn.getDao().findOneByU_PG(o);
			
			if(dto != null) {
				// Creation de la session 
				UserSession.instance.setUserID(dto.getID());
				UserSession.instance.setUsername(dto.getUserName());
				
				c.getSystemApp().getScene().getWindow().hide();
				
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


}
