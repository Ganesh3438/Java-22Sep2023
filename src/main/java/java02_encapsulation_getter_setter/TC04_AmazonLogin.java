package java02_encapsulation_getter_setter;

public class TC04_AmazonLogin {

	public static void main(String[] args) {
		
		// The moment we create object for TC03_Login a constructor will be called 
		// We can set the values using constructor as well  
		TC03_LoginPage login = new TC03_LoginPage("pooja@gmail.com", "123456");
		
		// Calling a method doLogin
		login.doLogin(login.getUsername(), login.getPassword()); 
		
	    System.out.println("-----------------------------------------");
		
		// Setters are mainly used for update the values
		// Let say for example if I want to update my password 123456 to 143143
		login.setPassword("143143");
		login.doLogin(login.getUsername(), login.getPassword());
		
		
	}

} 
