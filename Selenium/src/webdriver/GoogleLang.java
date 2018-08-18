package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GoogleLang {
	public WebDriver driver;
	public void openUrl(){
		driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	public void hindi(){
		driver.findElement(By.xpath(".//*[@id='SIvCob']/a[1]")).click();
		driver.findElement(By.linkText("English")).click();
		
		Sleeper.sleepTightInSeconds(5);
	}
   public void bengali(){
	   driver.findElement(By.xpath(".//*[@id='SIvCob']/a[2]")).click();
	   driver.findElement(By.linkText("English")).click();
	  // Sleeper.sleepTightInSeconds(5);
		
	}
   public void telugu(){
	   driver.findElement(By.xpath(".//*[@id='SIvCob']/a[3]")).click();
	   driver.findElement(By.linkText("English")).click();
	   //Sleeper.sleepTightInSeconds(5);
	
   }
  public void marathi(){
	  driver.findElement(By.xpath(".//*[@id='SIvCob']/a[4]")).click();
	  driver.findElement(By.linkText("English")).click();
	 // Sleeper.sleepTightInSeconds(5);
	
  }

	public static void main(String[] args) {
		
		GoogleLang gl=new GoogleLang();
		gl.openUrl();
		gl.hindi();
		gl.bengali();
		gl.telugu();
		gl.marathi();

	}

}
