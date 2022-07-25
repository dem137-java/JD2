package bean;

import java.io.Serializable;

public class NewUserInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surname;
	private String birthDate;
	private String eMail;
	private String mobileNo;
	
	public NewUserInfo() {};
	
	public NewUserInfo(String name, String surname, String birthDate, String eMail, String mobileNo) {
		super();
		this.name=name;
		this.surname=surname;
		this.birthDate=birthDate;
		this.eMail=eMail;
		this.mobileNo=mobileNo;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
}
