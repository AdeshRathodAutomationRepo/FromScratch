package testDeclaration;

public class Important extends Basics {
	
	Basics basics = new Basics();

	public void clickOnElement() {
		super.clickOnElement();
		System.out.println("Hello this is Important class");
	}
	
	public static void main(String[]args) {
		Important imp = new Important();
		imp.clickOnElement();
	}
	
}
