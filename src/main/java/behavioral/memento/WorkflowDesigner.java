package behavioral.memento;

public class WorkflowDesigner {
	private final WorkflowCaretaker workflowCaretaker = new WorkflowCaretaker();
	private final Workflow workflow;

	public WorkflowDesigner(String name) {
		this.workflow = new Workflow(name);
	}

	public Workflow getWorkflow() {
		return workflow;
	}

	public void addStep(String step) {
		workflowCaretaker.saveState(workflow.saveState());
		workflow.getSteps().add(step);
	}

	public void removeStep(String step) {
		workflowCaretaker.saveState(workflow.saveState());
		workflow.getSteps().remove(step);
	}

	public void undo() {
		workflow.restoreState(workflowCaretaker.restoreState());
	}

	public void print() {
		System.out.println(workflow);
	}
}
