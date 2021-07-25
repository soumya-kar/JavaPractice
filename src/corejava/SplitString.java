package corejava;

public class SplitString {
	
	public static void main(String[] args) {
		String s="org.openqa.selenium.TimeoutException: Expected condition failed: waiting for visibility of element located by By.xpath: //*[@class='user-display'] (tried for 45 second(s) with 500 milliseconds interval)"+
	"at org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:95"+
	"at org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272"+
	"at com.cg.testing.pages.BasePage.waitForElementDisplayed(BasePage.java:51)"+
	"at com.cg.testing.pages.HomePage.getUsernameHeaderText(HomePage.java:22)";
		
		String b= s.split(":")[0];
		System.out.println(b);
	}

}
