package myExampleLesson1;

import java.util.List;

public class EngineerRole implements UserRole {

	private int id;
	private String name;
	private List<ObjectType> objectTypes;
	
	public EngineerRole() {		
	}
	
	public EngineerRole(int id, String name, List<ObjectType> objectType) {
		this.id = id;
		this.name = name;
		this.objectTypes = objectType;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((objectTypes == null) ? 0 : objectTypes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EngineerRole other = (EngineerRole) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (objectTypes == null) {
			if (other.objectTypes != null)
				return false;
		} else if (!objectTypes.equals(other.objectTypes))
			return false;
		return true;
	}

	public List<ObjectType> getObjectTypes() {
		return objectTypes;
	}

	public void setObjectTypes(List<ObjectType> objectTypes) {
		this.objectTypes = objectTypes;
	}	
	
	public void addObjectType(ObjectType objectType) {
		if (!this.objectTypes.contains(objectType))
			this.objectTypes.add(objectType);		
	}


}
