package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ProjectManager extends Employee {
	private final List<Employee> directReports = new ArrayList<>();

	public ProjectManager(Integer id, String name, Double performanceRating, Employee... employees) {
		super(id, name, performanceRating);
		this.directReports.addAll(List.of(employees));
	}

	@Override
	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);
	}

	public void addEmployee(Employee employee) {
		directReports.add(employee);
	}

	public List<Employee> getDirectReports() {
		return directReports;
	}
}
