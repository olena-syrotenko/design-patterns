package behavioral.mediator;

public class MediatorDemo {

	// When value of one of UI components is changed than values of other components are set to this one
	// if changed TextBox value is not digit between 0 and 100 than slider value is not changed
	public static void main(String[] args) {
		UIMediator mediator = new UIMediator();

		TextBox textBox1 = new TextBox("textBox1", mediator);
		TextBox textBox2 = new TextBox("textBox2", mediator);
		Slider slider = new Slider(mediator);

		System.out.println("--Initial state");
		mediator.drawUI();

		System.out.println("\n--Change value of the first text box to 80");
		textBox1.setValue("80");
		mediator.drawUI();

		System.out.println("\n--Change value of the second text box to 'Test'");
		textBox2.setValue("Test");
		mediator.drawUI();

		System.out.println("\n--Change value of the slider to 100");
		slider.setValue(100);
		mediator.drawUI();
	}
}
