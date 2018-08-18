package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Yahoo_com {
	public WebDriver driver;
	public  void openUrl(){
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
		driver.manage().window().maximize();
	}
	public void verifyLogin(){
		driver.findElement(By.id("uh-signin")).click();
		Sleeper.sleepTightInSeconds(5);
		driver.findElement(By.id("persistent")).click();
		Sleeper.sleepTightInSeconds(2);
		
		driver.findElement(By.id("login-username")).sendKeys("peers_selenium");;
		driver.findElement(By.id("login-signin")).click();
		Sleeper.sleepTightInSeconds(5);
		
		driver.findElement(By.id("login-passwd")).sendKeys("selenium123");
		driver.findElement(By.id("login-signin")).click();
		Sleeper.sleepTightInSeconds(12);
	}
	public void verifyLogut(){
		driver.findElement(By.xpath("//button[@class='uh-menu-btn P(0) Bd(0) Pos(r)']")).click();
		Sleeper.sleepTightInSeconds(3);
		//driver.findElement(By.xpath("//div[@class='Bdtc($menuFooterBdr) Bdts(s) Bdtw(1px) Py(14px) Ta(c)']")).click();
		driver.findElement(By.xpath("//a[@class='C(#000) C($menuLink):h Td(n)']")).click();
	}

	public static void main(String[] args) {
		Yahoo_com yc=new Yahoo_com();
		yc.openUrl();
		yc.verifyLogin();
		yc.verifyLogut();

	}

}
