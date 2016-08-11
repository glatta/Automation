import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Testing {
	
	@Test
	public void test()
	{WebDriver driver = null;
		try{
		
			
	
	
	System.setProperty("webdriver.chrome.driver", "C://Helmet//chromedriver.exe");
		 driver=new ChromeDriver();
		// driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://www.google.com");
		 	
		 driver.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
		}finally
		{driver.quit();}
	}
}
