package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HMS_Login_Logout {
static WebDriver driver;
public static void oepnURL(){
	driver=new FirefoxDriver();
	driver.get("");
	driver.manage().window().maximize(); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
