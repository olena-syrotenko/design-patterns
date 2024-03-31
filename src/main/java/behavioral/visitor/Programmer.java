package behavioral.visitor;

public class Programmer extends Employee {
	private String department;

	public Programmer(Integer id, String name, Double performanceRating, String department) {
		super(id, name, performanceRating);
		this.department = department;
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
