package Dto;

public class UserDTO {

	private Integer ID;
	private String UserName;
	private String Role;
	private String birth;
	private Integer cp;
	private String ville;
	private String adresse;
	private String password;
	private String siret;

	public UserDTO(String username2, String password2, String role2, String birth2, Integer siret2, Integer cp2, String ville2, String adresse2) {
		super();
	}

	public UserDTO(Integer iD, String userName, String role, String birth, Integer cp, String ville, String adresse, String password) {
		super();
		ID = iD;
		UserName = userName;
		Role = role;
		this.birth = birth;
		this.cp = cp;
		this.ville = ville;
		this.adresse = adresse;
		this.password= password;
	}

	public UserDTO(String userName, String role) {
		super();
		UserName = userName;
		Role = role;
	}
	
	public UserDTO(Integer iD, String userName, String role) {
		super();
		ID = iD;
		UserName = userName;
		Role = role;
	}

	public UserDTO(String userName, String password, String role, String birth, Integer cp, String ville, String adresse) {
		super();
		UserName = userName;
		Role = role;
		this.birth = birth;
		this.cp = cp;
		this.ville = ville;
		this.adresse = adresse;
		this.password = password;
	}

	public UserDTO() {
		super();
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getBirth() {
		return birth;
	}
	
	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	
	

}
