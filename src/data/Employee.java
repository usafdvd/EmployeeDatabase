package data;

public class Employee {
	private String firstname;
	private String lastname;
	private int departmentId;
	private int jobId;
	private int id;

	public Employee(String firstname, String lastname, int departmentId, int jobId) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.departmentId = departmentId;
		this.jobId = jobId;
	}
	public Employee(int id, String firstname, String lastname, int departmentId, int jobId) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.departmentId = departmentId;
		this.jobId = jobId;
	}

	public Employee() {
	}

	public int getId() {
		return id;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public int getJobId() {
		return jobId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setJobId(int jobId) {
		this.jobId = jobId;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}

	public void setLastName(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname + "]";
	}
}
