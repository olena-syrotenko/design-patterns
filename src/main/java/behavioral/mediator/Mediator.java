package behavioral.mediator;

// represents a Mediator interface
public interface Mediator {
	void controlChanges(String changedValue, Component component);

	void registerComponent(Component component);
}
