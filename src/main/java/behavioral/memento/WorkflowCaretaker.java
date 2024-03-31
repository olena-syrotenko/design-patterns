package behavioral.memento;

import java.util.Stack;

public class WorkflowCaretaker {
	private final Stack<WorkflowMemento> workflowSnapshots = new Stack<>();

	public void saveState(WorkflowMemento workflowMemento) {
		if (workflowMemento != null) {
			workflowSnapshots.push(workflowMemento);
		}
	}

	public WorkflowMemento restoreState() {
		if (!workflowSnapshots.empty()) {
			return workflowSnapshots.pop();
		}
		return null;
	}
}
