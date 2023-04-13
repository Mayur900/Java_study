package hibernatefile;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
//@Table(name = "employee")
public class Departmnet {

	@Id
	private int id;
	
//	@Column(name = "ename")
	private String depName;
	
	private String depAddress;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public String getDepAddress() {
		return depAddress;
	}

	public void setDepAddress(String depAddress) {
		this.depAddress = depAddress;
	}

	
}
