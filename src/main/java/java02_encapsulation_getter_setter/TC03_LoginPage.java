package java02_encapsulation_getter_setter;

public class TC03_LoginPage {

	String username;
	String password;
	
	// Constructor
	public TC03_LoginPage(String username, String password) {
		this.username = username;
		this.password = password;
	}
	

	// Setters and getters
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	// Login method
	public void doLogin(String un, String pwd) {
		
		System.out.println("Enter username: "+un);
		System.out.println("Enter password: "+pwd);
		System.out.println("Click on login button...");
		
		if(isUserActive(un)) {
			System.out.println("user is logged in...");
		}else {
			System.out.println("user is inactive and account is blocked....");
		}
		
	}
	
	private boolean isUserActive(String un) {
		System.out.println("checking user status: "+ un);
		return true;
	}
	
	
	
	
}
