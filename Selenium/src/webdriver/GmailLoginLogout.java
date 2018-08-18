package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginLogout {
	public WebDriver driver;
	public  void openUrl(){
		driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
	}
	public void verifylogin(){
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("selenium.durgasoft@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("selenium1234");
		driver.findElement(By.xpath(".//*[@id='passwordNext']/content/span")).click();
		Sleeper.sleepTightInSeconds(12);
		
	}
	public void verifylogout(){
		driver.findElement(By.cssSelector("span.gb_8a.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
		
	}

	public static void main(String[] args) {
		GmailLoginLogout gl=new GmailLoginLogout();
		gl.openUrl();
		gl.verifylogin();
		gl.verifylogout();

	}

}
