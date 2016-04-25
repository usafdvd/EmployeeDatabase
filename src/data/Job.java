package data;

public class Job {
	private int id;
	private String name;
	private int minimum_salary;
	private int maximum_salary;
	
	public Job(int id, String name, int minimum_salary, int maximum_salary) {
		super();
		this.id = id;
		this.name = name;
		this.minimum_salary = minimum_salary;
		this.maximum_salary = maximum_salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getMinimum_salary() {
		return minimum_salary;
	}

	public int getMaximum_salary() {
		return maximum_salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMinimum_salary(int minimum_salary) {
		this.minimum_salary = minimum_salary;
	}

	public void setMaximum_salary(int maximum_salary) {
		this.maximum_salary = maximum_salary;
	}
	
	
}
