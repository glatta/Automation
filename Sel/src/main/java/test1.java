import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {

	public static void main(String[] args) {
		 WebDriver driver=null;
try{
		System.setProperty("webdriver.chrome.driver", "C://Helmet//chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://google.com");
		 driver.navigate().to("http://www.mailinator.com");
		 System.out.println("abc");
		 driver.findElement(By.xpath("//span[@class='input-group-btn']/button")).click();
	}finally
	{driver.quit();}
	}

}
