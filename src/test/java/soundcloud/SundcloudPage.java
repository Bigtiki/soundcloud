package soundcloud;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SundcloudPage {
	// private String Name;
	static WebDriver Driver;

	public static void main(String[] args) {
		/*
		 * SundcloudPage obj = new SundcloudPage(); obj.setName("Fahim");
		 * System.out.println("My name is "+ obj.getName());
		 */

		System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/geckodriver.exe");
		Driver = new FirefoxDriver();
		//JavascriptExecutor js = (JavascriptExecutor) Driver;

		Driver.get("https://soundcloud.com/signin");
		//js.executeScript("window.scrollBy(0, 1250)");

		//Driver.findElement(By.xpath("//div[@class='frontHero__signin']/button[@title='Sign in']")).click();
		//waitFor(1000);
		Driver.findElement(By.id("formControl_72")).sendKeys("bteaffiliated@gmail.com");
		Driver.findElement(By.xpath("//form/div/div[1]/div/button")).click();
		waitFor(1000);
		Driver.findElement(By.xpath("//input[@placeholder=\"Your Password *\"]")).sendKeys("");
		waitFor(1000);
		Driver.findElement(By.xpath("//div[@class=\"signinWithPassword\"]/button[@title=\"Sign in\"]")).click();
		
		waitFor(10000);
		try {
			takeSnapShot(Driver, "C:\\Users\\Mufazzal\\eclipse-workspace\\soundcloud\\MyScreenshot2.png");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Driver.quit();

	}

	public static void waitFor(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch bloc
			e.printStackTrace();
		}
	}

	public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =((TakesScreenshot)webdriver);
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination
		File DestFile=new File(fileWithPath);
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		}
	/*
	 * public String getName() { return Name; }
	 * 
	 * public void setName(String name) { Name = name; }
	 */

}
