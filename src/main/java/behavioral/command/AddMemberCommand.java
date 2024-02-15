package behavioral.command;

public class AddMemberCommand implements Command {

	private final MemberService memberService;
	private final String name;
	private final String contacts;

	public AddMemberCommand(String name, String contacts) {
		memberService = new MemberService();
		this.name = name;
		this.contacts = contacts;
	}

	@Override
	public void execute() {
		memberService.addMember(name, contacts);
	}
}
