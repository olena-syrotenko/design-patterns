package behavioral.visitor;

public class DisplayEmployeeVisitor implements EmployeeVisitor {
	@Override
	public void visit(Programmer programmer) {
		System.out.println(programmer.getId() + ". " + programmer.getName() + ", " + programmer.getDepartment() + " programmer");
	}

	@Override
	public void visit(ProjectLead projectLead) {
		System.out.println(
				projectLead.getId() + ". " + projectLead.getName() + ", project lead with team of " + projectLead.getDirectReports().size() + " programmers");
	}

	@Override
	public void visit(ProjectManager pm) {
		System.out.println(pm.getId() + ". " + pm.getName() + ", project manager with " + pm.getDirectReports().size() + " projects");
	}
}
