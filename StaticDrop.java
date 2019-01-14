package selenium.locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDrop {
	WebDriver driver;
	public void GetScreen(String screen) throws IOException //screeen shot to the method
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Selenium\\Selenium\\screenshot\\ " +screen + " .jpeg");
		FileUtils.copyFile(src, dest);
	}
	
	public void drop() throws InterruptedException, IOException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
	
		/*WebElement forgot =driver.findElement(By.linkText("Forgotten account?"));
		forgot.click();*/
		
		WebElement first=driver.findElement(By.xpath("//input[@name='firstname']"));
		first.sendKeys("Asif ");
		
		WebElement last=driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("Mulani");
		
		WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("asifmulani54@gmail.com");
		
		WebElement email1=driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
		email1.sendKeys("asifmulani54@gmail.com");
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("123456798");
		
		
		Select day=new Select(driver.findElement(By.id("day")));//static drop down 
		day.selectByIndex(15);
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByIndex(5);
		
		Select year= new Select (driver.findElement(By.id("year")));//static drop down by visible text
		year.selectByVisibleText("2016");
		
		WebElement rmale=driver.findElement(By.id("u_0_a"));
		rmale.click();
		
		
	
		Thread.sleep(3000);
		GetScreen("Facebook");
		driver.close();
		// TODO Auto-generated method stub
	}


	public static void main(String[] args) throws InterruptedException, IOException
	{
	  StaticDrop sd=new StaticDrop();
	  sd.drop();

	}

}
