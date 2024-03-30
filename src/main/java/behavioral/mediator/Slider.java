package behavioral.mediator;

// concrete Component implementation that represents simple slider
public class Slider extends Component {
	private Integer value = 0;

	public Slider(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String message) {
		mediator.controlChanges(message, this);
	}

	@Override
	public void receive(String message) {
		try {
			int changedValue = Integer.parseInt(message);
			if (changedValue >= 0 && changedValue <= 100) {
				this.value = changedValue;
			}
		} catch (NumberFormatException ignored) {

		}
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
		send(String.valueOf(value));
	}

	@Override
	public String toString() {
		return "Slider: '" + value + "'";
	}
}
