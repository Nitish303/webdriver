package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;

public class Hms_PR {
	public WebDriver driver;
	public void openUrl(){
		driver=new FirefoxDriver();
		driver.get("http://www.seleniumbymahesh.com/");
		driver.manage().window().maximize();
		
	}
	public void verifyLogin(){
		driver.findElement(By.linkText("HMS")).click();
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin");
		driver.findElement(By.name("submit")).click();
		
	}
	public void verifyRegistration(){
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Perminent Registration")).click();
		Sleeper.sleepTightInSeconds(5);
		
		
	}
	public void verifyPR(){
		new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		new Select(driver.findElement(By.name("RELATION"))).selectByVisibleText("Brother");
		new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");
		driver.findElement(By.name("PNT_NAME")).sendKeys("Mahesh");
		new Select(driver.findElement(By.name("PAT_IDENTITY"))).selectByVisibleText("AAdhar Card");
		driver.findElement(By.name("LAST_NAME")).sendKeys("D");
		driver.findElement(By.name("PAT_IDENTITY_PROOF")).sendKeys("123457890");
		driver.findElement(By.name("DOB")).sendKeys("18-08-2018");
		driver.findElement(By.className("photo")).sendKeys("C:\\Users\\SHREE\\Desktop\\Chrysanthemum.jpg");
		//new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		//new Select(driver.findElement(By.name("PATIENT_CAT"))).selectByVisibleText("Staff");
		
	}
	

	public static void main(String[] args) {
		Hms_PR hp=new Hms_PR();
		hp.openUrl();
		hp.verifyLogin();;
		hp.verifyRegistration();
		hp.verifyPR();

	}

}
