package Dao;

import java.sql.Connection;
import java.util.List;

import Controllers.ProfilController;
import Dto.profilDto;
import Dto.userDto;
import InterfaceMetier.IBLog;

public class profilDAO implements IBLog<profilDto, Integer, ProfilController>{

	private static String TABLE = "medecin";
	private static Connection cnx;
	
	public static userConnexionDAO getDao() {
		return new userConnexionDAO();
	}
	
	
	@Override
	public void save(profilDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(profilDto o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public profilDto findOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public profilDto findOneByU_P(profilDto o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<profilDto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public userDto findOneByU_P(userDto o, ProfilController signInUpController) {
		// TODO Auto-generated method stub
		return null;
	}

}
