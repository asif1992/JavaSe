package selenium.locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartShopping {
	WebDriver driver;
	
	public void ScreenShot(String screen) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Selenium\\Selenium\\screenshot\\" +screen+ ".jpeg");
		FileUtils.copyFile(src, dest);
	}

	public void Filpkart() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mustafa\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		ScreenShot("HomeFlipkart");
		WebElement close=driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"));
		close.click();//user not intereset to login
		driver.manage().window().maximize();
		
		
		WebElement ele=driver.findElement(By.xpath("//li[@class='Wbt_B2 _1YVU3_']"));
		Actions a=new Actions(driver);
		a.moveToElement(ele).build().perform();
		Thread.sleep(3000);
		ScreenShot("FlipkartEletronics");
		
		WebElement mi=driver.findElement(By.xpath("//a[@title='Mi']"));
		mi.click();
		

		Thread.sleep(5000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)", "");
		Thread.sleep(3000);
		
		WebElement redmi=driver.findElement(By.partialLinkText("Redmi 6 (Rose Gold, 32 GB)"));
		
		redmi.click();
		Thread.sleep(5000);
		ScreenShot("redmimobile");
		driver.close();
		
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		FlipkartShopping fs=new FlipkartShopping();
		fs.Filpkart();

	}

}
