package selenium.locator;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AlertSe {
	WebDriver driver;
	
	public void GetScreen(String screen) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("F:\\Selenium\\Selenium\\screenshot" +screen+ ".jpeg");
		FileUtils.copyFile(src, dest);
	}

	public static void main(String[] args) {
		

	}

}
