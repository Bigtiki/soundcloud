package soundcloud;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MCTCouponTest {
	static WebDriver Driver;
	public static void main(String[] args) {
		getMCTcoupon();
		}
public static void getMCTcoupon() {
	System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/geckodriver.exe");
	Driver = new FirefoxDriver();
	

	Driver.get("https://demo.iscripts.com/multicart/demo/index.php");
	
	//WebElement DateLocator1 = Driver.findElement(By.xpath("Xpath://tr[8]/td/a/img".split(":")[1]));
	//String signUpButton = "ID:jqSignup";
	
	//String logOutLink = "Xpath://*[@id=\"drp_div\"]/ul/li/div/div[2]/a";

	
	
	WebElement loginLink = Driver.findElement(By.id("ID:dLabellogin".split(":")[1]));
	loginLink.click();
	System.out.println("Clicked sign in");
	WebElement usernameFIeld = Driver.findElement(By.id("ID:username".split(":")[1]));
	usernameFIeld.sendKeys("user");
	System.out.println("Enter Name");
	WebElement passwordField = Driver.findElement(By.id("ID:password".split(":")[1]));
	passwordField.sendKeys("pass");
	System.out.println("Password");
	WebElement loginButton = Driver.findElement(By.id("ID:jqLogin".split(":")[1]));
	loginButton.click();
	System.out.println("Clicked Log in");
	waitFor(2000);
	WebElement profileNameLabel =Driver.findElement(By.xpath("Xpath://*[@id=\"dLabel\"]/span".split(":")[1]));
	 profileNameLabel.click();
	 System.out.println("Clicked Profile Name");
	 waitFor(1000);
	 WebElement myAccountLink = Driver.findElement(By.xpath("Xpath://*[@id='drp_div']/ul/li/div/div[1]/a".split(":")[1]));
	 myAccountLink.click();
	 System.out.println("Clicked My Account");
	
}
public static void waitFor(int time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
