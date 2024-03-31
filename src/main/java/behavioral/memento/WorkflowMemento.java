package behavioral.memento;

import java.util.LinkedList;

// can be inner class of Task entity
public class WorkflowMemento {
	private final Workflow workflow;

	public WorkflowMemento(Workflow workflow) {
		this.workflow = new Workflow(workflow.getName(), new LinkedList<>(workflow.getSteps()));
	}

	public Workflow getState() {
		return workflow;
	}
}
