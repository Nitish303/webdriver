package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class PopUp_window {
	public WebDriver driver;
	public  void openUrl(){
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
		driver.manage().window().maximize();
	}
	public void verifyPopUp(){
		// String str = driver.getWindowHandle();
		driver.findElement(By.linkText("Feedback")).click();
		Sleeper.sleepTightInSeconds(5);
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		Object[] s = windows.toArray();
		
		//driver.switchTo().window("mywindow");
		driver.switchTo().window(s[1].toString());
		driver.findElement(By.id("name")).sendKeys("Mahesh");
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		new Select(driver.findElement(By.id("car"))).selectByVisibleText("Audi");
		driver.findElement(By.id("message")).sendKeys("hi welcome to mahesh");
		driver.close();
		
		//driver.switchTo().window(str);
		driver.switchTo().window(s[2].toString());
		driver.findElement(By.name("ADDRESS")).sendKeys("Hyderabad");
		driver.findElement(By.name("MOBILE_NO")).sendKeys("123747890");
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.linkText("Logout")).click();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
