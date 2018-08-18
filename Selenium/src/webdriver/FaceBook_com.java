package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBook_com {
	public WebDriver driver;
	public  void openUrl(){
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
	public void verifyLogin(){
		driver.findElement(By.id("email")).sendKeys("Mahesh");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.findElement(By.id("pass")).sendKeys(Keys.ENTER);
	}

	public static void main(String[] args) {
		FaceBook_com fl=new FaceBook_com();
		fl.openUrl();
		fl.verifyLogin();
		

	}

}
