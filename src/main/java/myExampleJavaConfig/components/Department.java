package myExampleJavaConfig.components;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("department")
public class Department {
	
    private int id;
	private String name;
	private User userСhief;
	private List<User> users;

    public Department() {
	}
	
	public Department(int id, String name, User userСhief) {
		super();
		this.id = id;
		this.name = name;
		this.userСhief = userСhief;
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


	public List<User> getUsers() {
		return users;
	}

	@Autowired
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public User getUserСhief() {
		return userСhief;
	}

	public void setUserСhief(User userСhief) {
		this.userСhief = userСhief;
	}	

}
