package Dto;

public class DoctorDto extends UserDTO{
	
	private static String role = "Doctor";
	
	private String siret; 
	private String mail;
	private String spe;
	private String Tel;
	private String hoj;
	private String hoh;
	private String description;



	public DoctorDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DoctorDto(Integer iD, String userName, String role, String birth, Integer cp, String ville, String adresse,
			String password) {
		super(iD, userName, birth, cp, ville, adresse, password);
		// TODO Auto-generated constructor stub
	}
	
	
	
	public DoctorDto(String userName, String password, String siret, String birth, Integer cp, String ville, String adresse) {
		super(userName, password, birth, cp, ville, adresse);
	}

	public DoctorDto(Integer iD, String userName, String role) {
		super(iD, userName, role);
		// TODO Auto-generated constructor stub
	}

	public DoctorDto(String userName, String password) {
		super(userName, password);
		// TODO Auto-generated constructor stub
	}

	
	public DoctorDto(Integer iD, String userName, String role, String birth, Integer cp, String ville, String adresse, String password, String mail, String spe, String tel, String hoj, String hoh, String description) {
		super(iD, userName, birth, cp, ville, adresse, password);

		this.mail = mail;
		this.spe = spe;
		this.Tel = tel;
		this.hoj = hoj;
		this.hoh = hoh;
		this.description = description;
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
	
	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}
	
}
