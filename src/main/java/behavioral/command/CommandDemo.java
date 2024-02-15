package behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommandDemo {
	public static void main(String[] args) {
		List<Command> commands = new ArrayList<>();
		commands.add(new AddMemberCommand("test1", "group1"));
		commands.add(new AddMemberCommand("test2", "group2"));
		commands.add(new RemoveMemberCommand(1));

		ExecutorService executor = Executors.newSingleThreadExecutor();
		commands.forEach(command -> executor.submit(command::execute));
		executor.shutdown();
	}
}
