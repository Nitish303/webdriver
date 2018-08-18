package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglLangParameter {
	public WebDriver driver;
	
	public void openUrl(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
	}
	
	public void clickLinks(String str){
		driver.findElement(By.xpath(str)).click();
		driver.findElement(By.linkText("English")).click();
		
	}

	public static void main(String[] args) {
		GooglLangParameter gp=new GooglLangParameter();
		gp.openUrl();
		gp.clickLinks(".//*[@id='SIvCob']/a[1]");//Hindi
		gp.clickLinks(".//*[@id='SIvCob']/a[2]");//Bengali
		gp.clickLinks(".//*[@id='SIvCob']/a[3]");//Telugu
		gp.clickLinks(".//*[@id='SIvCob']/a[4]");//Marathi

	}

}
