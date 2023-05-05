package InterfaceMetier;
import java.util.List;

import Dto.userDto;

public interface IBLog<T, U, Y> {
	public void save(T o);
	public void update(T o);
	public void delete(U id);
	public T findOne(U id);
	public T findOneByU_P(T o);
	public List<T> findAll();
	userDto findOneByU_P(userDto o, Y signInUpController);
}