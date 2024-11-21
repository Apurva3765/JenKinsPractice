package MyTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class TestClass {

	public static String homePath=System.getProperty("user.dir");
	@Test
	public static void test1()
	{
		
		try {
			System.setProperty("webdriver.chrome.driver", homePath + "\\resources\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");		
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			Thread.sleep(10000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
