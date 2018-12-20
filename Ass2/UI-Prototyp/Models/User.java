package Models;

import java.beans.Transient;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ElementCollection(targetClass = Category.class)
	private List<Category> activities;
	
	@ElementCollection(targetClass = Category.class)
	private List<Category> interests;
	
	@Column(name = "email")
	private String EMail;
	
	@Column(name = "password")
	private String Password;
	
	private String Firstname;
	private String LastName;
	private String Gender;
	private String Birthdate;
	private String Adress;
	private String ZIP;
	private String Country;
	
	public User(String firstname, String lastname, String email, String password,
				String gender, String birthdate, String adress, String zip, String country)
	{
		EMail = email;
		Firstname = firstname;
		LastName = lastname;
		Gender = gender;
		Birthdate = birthdate;
		Adress = adress;
		ZIP = zip;
		Country = country;
		EMail = email;
		Password = password;
	}
	
	public User(String firstname, String email, String password) 
	{
		Firstname = firstname;
		EMail = email;
		Password = password;
	}
	
	public User() {}
	
	@Transient
	public List<Category> getActivities() {
		return activities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEMail() {
		return EMail;
	}

	public void setEMail(String eMail) {
		EMail = eMail;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBirthdate() {
		return Birthdate;
	}

	public void setBirthdate(String birthdate) {
		Birthdate = birthdate;
	}

	public String getAdress() {
		return Adress;
	}

	public void setAdress(String adress) {
		Adress = adress;
	}

	public String getZIP() {
		return ZIP;
	}

	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	public void setActivities(List<Category> activities) {
		this.activities = activities;
	}

	@Transient
	public List<Category> getInterests() {
		return interests;
	}

	public void setInterests(List<Category> interests) {
		this.interests = interests;
	}
}
