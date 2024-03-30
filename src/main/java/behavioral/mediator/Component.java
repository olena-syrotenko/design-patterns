package behavioral.mediator;

public abstract class Component {
	protected Mediator mediator;

	public Component(Mediator mediator) {
		this.mediator = mediator;
		mediator.registerComponent(this);
	}

	public abstract void send(String message);

	public abstract void receive(String message);
}
