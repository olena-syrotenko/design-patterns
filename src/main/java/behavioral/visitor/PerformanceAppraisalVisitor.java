package behavioral.visitor;

public class PerformanceAppraisalVisitor implements EmployeeVisitor {
	@Override
	public void visit(Programmer programmer) {
		// 100% personal performance
		System.out.println("Programmer [id=" + programmer.getId() + "] performance appraisal: " + programmer.getPerformanceRating());

	}

	@Override
	public void visit(ProjectLead projectLead) {
		// 25% team performance, 75% personal performance
		double teamPerformance = projectLead.getDirectReports().stream().mapToDouble(Employee::getPerformanceRating).average().orElse(0);
		double leadPerformance = 0.25 * teamPerformance + 0.75 * projectLead.getPerformanceRating();
		System.out.println("Project Lead [id=" + projectLead.getId() + "] performance appraisal: " + leadPerformance);
	}

	@Override
	public void visit(ProjectManager projectManager) {
		// 50% lead performance, 50% personal performance
		double projectPerformance = projectManager.getDirectReports().stream().mapToDouble(Employee::getPerformanceRating).average().orElse(0);
		double managerPerformance = 0.5 * projectPerformance + 0.5 * projectManager.getPerformanceRating();
		System.out.println("Project Manager [id=" + projectManager.getId() + "] performance appraisal: " + managerPerformance);
	}
}
