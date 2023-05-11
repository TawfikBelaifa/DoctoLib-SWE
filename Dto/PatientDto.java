package Dto;

public class PatientDto extends UserDTO{

	private static String role = "Patient";

	public PatientDto() {
		super();
	}

	public PatientDto(Integer iD, String userName, String role) {
		super(iD, userName, role);
		// TODO Auto-generated constructor stub
	}

	public PatientDto(String userName, String password) {
		super(userName, password);
		// TODO Auto-generated constructor stub
	}

	public PatientDto(Integer iD, String userName, String role, String birth, Integer cp, String ville, String adresse, String password) {
		super(iD, userName, role, birth, cp, ville, adresse, password);
	}

	public PatientDto(String username, String password, String birth, Integer siret, Integer cp, String ville, String adresse) {
		super(username, password, role, birth, siret ,cp, ville, adresse);
	}
	
	public PatientDto(String username, String password, String birth, Integer cp, String ville, String adresse) {
		super(username, password, role, birth ,cp, ville, adresse);
	}
	
}
