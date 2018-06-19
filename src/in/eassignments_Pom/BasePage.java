/**
 * 
 */
package in.eassignments_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Yogiii
 *
 */
public class BasePage 
{
	WebDriver driver;

	@FindBy(xpath=("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a"))
	WebElement Logout_btn;

	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public String title()
	{
		String str=driver.getTitle();
		return str;
	}
	public void logout() throws Exception
	{
		
		
		Actions act=new Actions(driver);
		act.moveToElement(Logout_btn).click().build().perform();
		Thread.sleep(3000);
		
		
	}
}
