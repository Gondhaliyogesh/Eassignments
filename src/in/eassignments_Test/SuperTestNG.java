/**
 * 
 */
package in.eassignments_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * @author Yogiii
 *
 */
public class SuperTestNG
{
	WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
		driver.get("http://eassignments.in/ca/");
	}
	
	@AfterClass
	public void postcondition() throws Exception
	{
		driver.close();
		Thread.sleep(5000);
	}
}
