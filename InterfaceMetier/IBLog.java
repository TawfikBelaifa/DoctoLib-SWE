package InterfaceMetier;
import java.util.List;

import Controllers.SignInUpController;
import Dto.UserDTO;

public interface IBLog<T, U, Y> {
	public void save(T o);
	public void update(T o);
	public void delete(U id);
	public T findOne(U id);
	public T findOneByU_P(T o);
	public List<T> findAll();
	T findOneByU_P(T o, Y c);
	<T extends UserDTO,Y extends SignInUpController> T findOneByU_PG(T o, Y c);
}