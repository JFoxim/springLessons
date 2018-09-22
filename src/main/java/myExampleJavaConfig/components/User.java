package myExampleJavaConfig.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("user")
public class User {
	 
	private int id;
	private String name;
	private String surname;
	private String patronymic;
	private String email;
	private String phone;
	private String address;
	private List<UserRole> roles;	
	
	public User() {
	}
	
	public User(int id, String name, String surname, String patronymic, String email, String phone, 
			String address) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getPatronymic() {
		return patronymic;
	}
	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<UserRole> getRoles() {
		return roles;
	}

	@Autowired
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	
	public void addRole(UserRole role) {
		if (!roles.contains(role))
		    roles.add(role);
	}

}
