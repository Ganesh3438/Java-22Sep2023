package java05_Abstraction;

public class Test {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage(10);
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageTimeLoadTimeOut();
		lp.forgotPwd();
		LoginPage.footer();
		Page.footer();
		
		System.out.println("----------------------------------------------");
		// Child class object can be referred by parent abstract class ref variable
		// top casting
		
		Page p = new LoginPage();
		p.title();
		p.url();
		p.displayLogo();
		p.pageTimeLoadTimeOut();
		Page.footer();
		
		
//		LoginPage lp = new Page(); // NA
		

	}

}
