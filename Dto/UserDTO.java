package Dto;

public class UserDTO {

	private Integer ID;
	private String UserName;
	private String birth;
	private Integer cp;
	private String ville;
	private String adresse;
	private String password;

	public UserDTO(String username, String password, String role, String birth, Integer siret, Integer cp, String ville, String adresse) {
		super();
		
	}

	public UserDTO(Integer iD, String userName, String birth, Integer cp, String ville, String adresse, String password) {
		super();
		ID = iD;
		UserName = userName;
		this.birth = birth;
		this.cp = cp;
		this.ville = ville;
		this.adresse = adresse;
		this.password= password;
	}

	public UserDTO(String userName, String password) {
		super();
		this.UserName = userName;
		this.password = password;
	}
	

	public UserDTO(Integer iD, String userName, String role) {
		super();
		ID = iD;
		UserName = userName;
	}

	public UserDTO(String userName, String password, String birth, Integer cp, String ville, String adresse) {
		super();
		this.UserName = userName;
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
	
	

}
