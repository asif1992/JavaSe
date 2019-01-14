package selenium.locator;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class AmazonShopping {
	WebDriver driver;
	
	public void  Getscreen(String screen) throws IOException
	{
		//ResourceBundle rb=ResourceBundle.getBundle("config");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Selenium\\Selenium\\screenshot\\" +screen +".jpeg" );
		FileUtils.copyFile(src, dest);
		
	}
	public void Amazon() throws InterruptedException, IOException
	{
		System.out.println("Enter your choice");
		System.out.println("\n1:Chrome \n2:Firefox\n3:InternetExplorer\n4:Wron Choice");
		String ch;
		Scanner ss=new Scanner(System.in);
		ch=ss.nextLine();
		switch(ch)
		{
		case "chrome":
		{
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Getscreen("Homeamazon");
			
			WebElement spa=driver.findElement(By.xpath("//div[@id='nav-shop']"));
			Actions ac=new Actions(driver);
			ac.moveToElement(spa).build().perform();
			
			WebElement tv=driver.findElement(By.xpath("//span[@text='TV, Appliances, Electronics']"));
			Actions aa=new Actions(driver);
			aa.moveToElement(tv).build().perform();
			
		    Thread.sleep(3000);
		     driver.close();
		}
		case "firefox":
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mustafa\\Downloads\\Selenium\\geckodriver-v0.23.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			Getscreen("forgot");
			/*WebElement forgot =driver.findElement(By.linkText("Forgotten account?"));
			forgot.click();*/
			//Select day=new Select(driver.findElement(By.id("day")));
			//day.selectByIndex(2);
			//Thread.sleep(3000);
			
			driver.close();
	
		}
		ss.close();
		}
        
		
		
	}

	public static void main(String[] args) throws InterruptedException, IOException
	{
		AmazonShopping as=new AmazonShopping();
		as.Amazon();

	}

}
