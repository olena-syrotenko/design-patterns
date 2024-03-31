package behavioral.visitor;

import java.util.List;

public class VisitorDemo {
	public static void main(String[] args) {
		List<Employee> employees = defineEmployeeList();

		System.out.println("-------Call DisplayVisitor");
		EmployeeVisitor displayVisitor = new DisplayEmployeeVisitor();
		employees.forEach(e -> e.accept(displayVisitor));

		System.out.println("-------Call PerformanceAppraisalVisitor");
		EmployeeVisitor performanceVisitor = new PerformanceAppraisalVisitor();
		employees.forEach(e -> e.accept(performanceVisitor));
	}

	private static List<Employee> defineEmployeeList() {
		Employee javaProgrammer1 = new Programmer(1, "John", 85., "Java");
		Employee javaProgrammer2 = new Programmer(2, "Sam", 96., "Java");
		Employee jsProgrammer1 = new Programmer(3, "Tom", 79., "JavaScript");
		Employee jsProgrammer2 = new Programmer(4, "Jack", 82., "JavaScript");
		Employee lead1 = new ProjectLead(5, "Carter", 98., javaProgrammer1, javaProgrammer2);
		Employee lead2 = new ProjectLead(6, "Grayson", 91., jsProgrammer1, jsProgrammer2);
		Employee pm = new ProjectManager(7, "Avery", 94., lead1, lead2);
		return List.of(javaProgrammer1, javaProgrammer2, jsProgrammer1, jsProgrammer2, lead1, lead2, pm);
	}
}
