package behavioral.visitor;

// represents a Visitor interface
public interface EmployeeVisitor {
	void visit(Programmer programmer);

	void visit(ProjectLead projectLead);

	void visit(ProjectManager projectManager);
}
