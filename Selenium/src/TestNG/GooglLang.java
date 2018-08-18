package TestNG;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class GooglLang {
	public WebDriver driver;
	public void clickLinks(String str){
		driver.findElement(By.xpath(str)).click();
		driver.findElement(By.linkText("English")).click();
		
		
		
	}
  @Test
  public void f() {
	  clickLinks(".//*[@id='SIvCob']/a[1]");//Hindi
	  clickLinks(".//*[@id='SIvCob']/a[2]");//bengali
	  clickLinks(".//*[@id='SIvCob']/a[3]");//Telugu
	  clickLinks(".//*[@id='SIvCob']/a[4]");//Marathi
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
  }

}
