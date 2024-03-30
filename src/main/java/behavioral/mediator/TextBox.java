package behavioral.mediator;

// concrete Component implementation that represents simple text box
public class TextBox extends Component {
	private final String label;
	private String value = "";

	public TextBox(String label, Mediator mediator) {
		super(mediator);
		this.label = label;
	}

	@Override
	public void send(String message) {
		mediator.controlChanges(message, this);
	}

	@Override
	public void receive(String message) {
		this.value = message;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
		send(value);
	}

	@Override
	public String toString() {
		return "TextBox '" + label + "': '" + value + "'";
	}
}
