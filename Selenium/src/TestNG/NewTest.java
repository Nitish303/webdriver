package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
	public WebDriver driver;
  @Test
  public void f() {
	 List<WebElement> links = driver.findElements(By.tagName("a"));
	 System.out.println(links.size());
	 int count=0;
	 for (int i = 0; i <links.size(); i++) {
		 if (!links.get(i).getText().isEmpty()) {
			 count=count+1;
			 System.out.println(count+"."+links.get(i).getText());
			 
			 
			
		}
		
	}
	 System.out.println("Number of visible links are:"+count);
	 int hidden=links.size()-count;
	 System.out.println("Number of Hidden links are:"+hidden);
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://eenadupellipandiri.net/");
	  driver.manage().window().maximize();
  }

}
