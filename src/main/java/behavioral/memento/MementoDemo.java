package behavioral.memento;

public class MementoDemo {
	public static void main(String[] args) {
		WorkflowDesigner workflowDesigner = new WorkflowDesigner("Workflow Demo");
		workflowDesigner.addStep("step1");
		workflowDesigner.addStep("step2");
		workflowDesigner.addStep("step3");
		// displayed workflow with 3 steps
		workflowDesigner.print();

		workflowDesigner.removeStep("step2");
		// displayed workflow with 2 steps
		workflowDesigner.print();

		// undo removing step2
		workflowDesigner.undo();
		workflowDesigner.print();

		// undo adding step3
		workflowDesigner.undo();
		workflowDesigner.print();
	}
}
