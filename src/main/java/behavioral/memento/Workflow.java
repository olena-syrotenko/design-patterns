package behavioral.memento;

import java.util.LinkedList;
import java.util.List;

public class Workflow {
	private String name;
	private List<String> steps = new LinkedList<>();

	public Workflow(String name) {
		this.name = name;
	}

	public Workflow(String name, List<String> steps) {
		this.name = name;
		this.steps = steps;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getSteps() {
		return steps;
	}

	public void setSteps(List<String> steps) {
		this.steps = steps;
	}

	public void addStep(String step) {
		this.steps.addLast(step);
	}

	public void removeStep(String step) {
		this.steps.remove(step);
	}

	public WorkflowMemento saveState() {
		return new WorkflowMemento(this);
	}

	public void restoreState(WorkflowMemento workflowMemento) {
		this.name = workflowMemento.getState().getName();
		this.steps = new LinkedList<>(workflowMemento.getState().getSteps());
	}

	@Override
	public String toString() {
		return "Workflow '" + name + "'\nBEGIN -> " + String.join(" -> ", steps) + " -> END";
	}
}
