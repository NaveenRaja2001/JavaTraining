package Memento;

import java.io.Serializable;
/**
 * 
 * @author naveenraja
 * this class is serialized 
 */
class PersonalDataBase implements Serializable{
	String name;
	int employeeId;
	String collegeName;
	String bloodGroup;
	//constructor
	public PersonalDataBase(String name, int employeeId, String collegeName, String bloodGroup) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.collegeName = collegeName;
		this.bloodGroup = bloodGroup;
	}
	//to print the value 
	@Override
	public String toString() {
		return "PersonalDataBase [name=" + name + ", employeeId=" + employeeId + ", collegeName=" + collegeName
				+ ", bloodGroup=" + bloodGroup + "]";
	}
}
