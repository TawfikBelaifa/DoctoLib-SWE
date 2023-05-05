package Dto;

public class profilDto {

	private Integer id;	
	private String userName;
	private String password;
	private String birth;	
	private String siret;
	private String adresse;
	private String cp;
	private String ville;
	private String mail;
	private String spe;
	private String Tel;
	private String hoj;
	private String hoh;
	private String description;
	
	
	
	public profilDto(Integer id, String userName, String password, String birth, String siret, String adresse,
			String cp, String ville, String mail, String spe, String tel, String hoj, String hoh, String description) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.birth = birth;
		this.siret = siret;
		this.adresse = adresse;
		this.cp = cp;
		this.ville = ville;
		this.mail = mail;
		this.spe = spe;
		this.Tel = tel;
		this.hoj = hoj;
		this.hoh = hoh;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
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
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSpe() {
		return spe;
	}
	public void setSpe(String spe) {
		this.spe = spe;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getHoj() {
		return hoj;
	}
	public void setHoj(String hoj) {
		this.hoj = hoj;
	}
	public String getHoh() {
		return hoh;
	}
	public void setHoh(String hoh) {
		this.hoh = hoh;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
