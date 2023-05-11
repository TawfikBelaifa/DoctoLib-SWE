package InterfaceMetier;

import java.util.List;

import Controllers.SignInUpController;
import Dto.PatientDto;
import Dto.UserDTO;

public interface IBLog2P<T,U> {

	public void save(T o);
	public void update(T o);
	public void delete(U id);
	public T findOne(U id);
	public T findOneByU_P(T o);
	public List<T> findAll();
	<T extends UserDTO> T findOneByU_PG(T o);
	
}

