package BuisnessLogic;

import java.io.IOException;
import java.util.List;

import Dao.ConnexionDAO;
import Dto.UserDTO;
import InterfaceMetier.IBLog;
import StaticClass.Logger;

@SuppressWarnings("hiding")
public class ConnexionIMPL<X extends UserDTO,Integer,Z> implements IBLog<X,Integer,Z>{

	
	
	
	@Override
	public void save(X o) {
		// TODO Auto-generated method stub
		ConnexionDAO.getDao().save(o);
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


}
