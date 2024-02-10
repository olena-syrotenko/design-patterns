package structural.proxy.protection;

public class SecurityContextHolder {
	private UserRole userRole = UserRole.USER;

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}
}
