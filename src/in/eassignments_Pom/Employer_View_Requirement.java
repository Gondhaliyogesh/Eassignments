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
public class Employer_View_Requirement extends BasePage
{
	@FindBy(xpath=("html/body/div/header/div[2]/div/nav/ul/li[3]/a"))
	private WebElement requirement_link;

	@FindBy(linkText=("View Requirement"))
	private WebElement view_req_lnk;


	public  Employer_View_Requirement(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void view_req()
	{
		Actions act=new Actions(driver);
		act.moveToElement(requirement_link).build().perform();
		
		view_req_lnk.click();
		
	}
}