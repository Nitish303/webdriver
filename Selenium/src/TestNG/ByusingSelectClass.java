package TestNG;

import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class ByusingSelectClass {
	public WebDriver driver;
  @Test
  public void f() {
	  WebElement dropDownLoc=driver.findElement(By.id("reg_mothertongue"));
	  Select s=new Select(dropDownLoc);
	  List<WebElement> dropDownValue=s.getOptions();
	  System.out.println(dropDownValue.size());
	 
	  for (int i = 1; i <dropDownValue.size(); i++) {
		  System.out.println(dropDownValue.get(i).getText());//Print all Value
	  }
	  
	 
	  for (int i = 0; i <dropDownValue.size(); i++) {
		
		 if (dropDownValue .get(i).getText().equalsIgnoreCase("MARATHI")) //Only Marathi
  			System.out.println(dropDownValue.get(i).getText());
	  }
	  
	  for (int j = 1; j <dropDownValue.size(); j++) {
		  if (!dropDownValue.get(j).getText().equalsIgnoreCase("MARATHI"))//Except Marathi
		  System.out.println(dropDownValue.get(j).getText());
		}
		
	}
		
	
  
 
  
  @BeforeTest
  public void beforeTest() {
	  driver=new FirefoxDriver();
	  driver.get("https://eenadupellipandiri.net/");
	  driver.manage().window().maximize();
  }

}
