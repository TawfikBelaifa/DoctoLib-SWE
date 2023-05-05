package Dto;

public class userDto{

	private Integer id;
	private String username;
	private String password;
	private String birth;
	private Integer siret;
	private Integer cp;
	private String ville;
	private String speChoice;
	private String adresse;
	
	


	public userDto(String username, String password, String birth, Integer siret, Integer cp, String ville,
			String speChoice, String adresse) {
		super();
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.siret = siret;
		this.cp = cp;
		this.ville = ville;
		this.speChoice = speChoice;
		this.adresse = adresse;
	}


	public userDto(Integer id, String username, String password, String birth, Integer siret, Integer cp, String ville,
			String speChoice, String adresse) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.siret = siret;
		this.cp = cp;
		this.ville = ville;
		this.speChoice = speChoice;
		this.adresse = adresse;
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


	public String getSpeChoice() {
		return speChoice;
	}


	public void setSpeChoice(String speChoice) {
		this.speChoice = speChoice;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public userDto(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	public userDto(Integer id, String username, String password, Integer siret) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.siret = siret;
	}


	public userDto(String username, String password, String birth, Integer siret) {
		super();
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.siret = siret;
	}


	public userDto() {
		super();
	}


	public userDto(Integer id, String username, String password, String birth, Integer siret) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.birth = birth;
		this.siret = siret;
	}




	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public void setBirth(String timestamp) {
		this.birth = timestamp;
	}
	public Integer getSiret() {
		return siret;
	}
	public void setSiret(Integer siret) {
		this.siret = siret;
	}

	
	
	
	
}
