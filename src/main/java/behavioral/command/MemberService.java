package behavioral.command;

// represents Receiver
public class MemberService {
	public void addMember(String name, String contacts) {
		System.out.println("Member was added: " + name + " to " + contacts);
	}

	public void removeMember(Integer memberId) {
		System.out.println("Member was removed: " + memberId);
	}
}
