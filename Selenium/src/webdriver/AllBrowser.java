package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllBrowser {
	public  static void ff(){
		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		ff();

	}

}
