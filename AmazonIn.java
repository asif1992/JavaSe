package selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonIn {
	
	WebDriver driver;
	public void Google() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Mustafa\\Downloads\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		
		//WebElement text=driver.findElement(By.name("q"));
		//text.sendKeys("https://www.amazon.in/");
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(5000);
		
		//WebElement search=driver.findElement(By.name("btnK"));
		//search.click();
		//Thread.sleep(3000);
		
		WebElement home=driver.findElement(By.id("nav-your-amazon"));
		home.click();
		Thread.sleep(3000);
		
		WebElement login=driver.findElement(By.id("ap_email"));
		login.sendKeys("9975514711");
		Thread.sleep(3000);
		
		WebElement click=driver.findElement(By.id("continue"));
		click.click();
		
		Thread.sleep(5000);
		
		
		
		
		
		
		
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AmazonIn a=new AmazonIn();
		a.Google();

	}

}
