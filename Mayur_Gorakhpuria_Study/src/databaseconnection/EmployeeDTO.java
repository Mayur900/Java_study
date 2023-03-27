package databaseconnection;

public class EmployeeDTO {

	private int id;
	private String emaiId;
	private String firstName;
	private String lastName;
	private String address;
	private String babyName;
	
	
	public String getBabyName() {
		return babyName;
	}
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmaiId() {
		return emaiId;
	}
	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", emaiId=" + emaiId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", address=" + address + "]";
	}
	
}
