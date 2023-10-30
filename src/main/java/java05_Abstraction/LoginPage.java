package java05_Abstraction;

public class LoginPage extends Page{
	
	
	public LoginPage() {
		System.out.println("login const...");
	}
	
	public LoginPage(int i) {
		System.out.println("one param LoginPage const... "+i);
	}

	@Override
	public void title() {
		
		System.out.println("Login title");
		
	}

	@Override
	public void url() {
		
		System.out.println("https://www.abc.com/login.html");
		
	}
	@Override
	public void pageTimeLoadTimeOut() {
		System.out.println("page time out -- 5 sec");
	}
	
	public void forgotPwd() {
		System.out.println("Forgot pwd");
	}
	


}
