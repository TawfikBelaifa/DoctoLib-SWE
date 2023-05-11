package BuisnessLogic;

import java.io.IOException;
import java.util.List;

import Controllers.HomeController;
import Controllers.SignInUpController;
import Dao.DoctorConnexionDAO;
import Dto.DoctorDto;
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

public class DoctorConnexionImpl implements IBLog<DoctorDto, Integer, SignInUpController>{

	@Override
	public void save(DoctorDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(DoctorDto o) {
		
		DoctorDto dto = new DoctorDto();
		
		try {
			DoctorConnexionDAO.getDao().update(o);
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DoctorDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorDto findOneByU_P(DoctorDto o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DoctorDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DoctorDto findOneByU_P(DoctorDto o, SignInUpController c) {
		DoctorDto dto = new DoctorDto();
		try {
			dto =  DoctorConnexionDAO.getDao().findOneByU_P(o);
			
			if(dto != null) {
				c.getSystemApp().getScene().getWindow().hide();
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
	public <T extends UserDTO, Y extends SignInUpController> T findOneByU_PG(T o, Y c) {
		// TODO Auto-generated method stub
		return null;
	}


}
