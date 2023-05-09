package InterfaceMetier;

import java.util.List;

import Dto.PatientDto;

public interface IBLog2P<T,U> {

	public void save(T o);
	public void update(T o);
	public void delete(U id);
	public T findOne(U id);
	public T findOneByU_P(T o);
	public List<T> findAll();
	PatientDto findOneByU_P(PatientDto o);
	
}

