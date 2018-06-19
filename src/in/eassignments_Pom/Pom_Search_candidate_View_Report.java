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
public class Pom_Search_candidate_View_Report extends BasePage
{
	@FindBy(xpath=("html/body/div[1]/header/div[2]/div/nav/ul/li[2]/a"))
	private WebElement applied_candidate_link;
	
	@FindBy(linkText=("Search Candidate"))
	private WebElement search_candidate;
	
	@FindBy(xpath=("html/body/div[1]/section/div/div/div/div/table/tbody[1]/tr/td[2]/a"))
	private WebElement view_requiremnt;
	
	@FindBy(xpath=("html/body/div[1]/section/div/div/div/table/tbody[1]/tr/td[4]/a"))
	private WebElement view_profile;
	

	public Pom_Search_candidate_View_Report(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);

	}
	
	public void view_report()
	{
		Actions act=new Actions(driver);
		act.moveToElement(applied_candidate_link).build().perform();
		
		search_candidate.click();
		view_requiremnt.click();
		view_profile.click();
	}

}
