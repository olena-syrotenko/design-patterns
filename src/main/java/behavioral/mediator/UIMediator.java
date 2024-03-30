package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// concrete Mediator that represents interaction between UI elements
public class UIMediator implements Mediator {

	private final List<Component> components = new ArrayList<>();

	@Override
	public void controlChanges(String changedValue, Component component) {
		components.stream().filter(c -> c != component).forEach(c -> c.receive(changedValue));
	}

	@Override
	public void registerComponent(Component component) {
		components.add(component);
	}

	public void drawUI() {
		components.forEach(System.out::println);
	}

}
