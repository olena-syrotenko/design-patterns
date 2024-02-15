package behavioral.command;

public class RemoveMemberCommand implements Command {
	private final MemberService memberService;
	private final Integer memberId;

	public RemoveMemberCommand(Integer memberId) {
		memberService = new MemberService();
		this.memberId = memberId;
	}

	@Override
	public void execute() {
		memberService.removeMember(memberId);
	}
}
