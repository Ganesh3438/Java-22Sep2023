package java05_Abstraction;

public abstract class Page {

	// Cannot create the object for abstract class
	// we can creae constructor for abstract class
	
	public Page() {
		System.out.println("page const...");
	}
	public Page(int i) {
		System.out.println("one param page const... "+i);
	}

	public abstract void title();

	public abstract void url();

	public void pageTimeLoadTimeOut() {
		System.out.println("page time out -- 10 sec");
	}

	public final void displayLogo() {
		System.out.println("display logo");
	}

	public static void footer() {
		System.out.println("page footer");
	}

}
