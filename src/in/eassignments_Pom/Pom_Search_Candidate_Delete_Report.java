/**
 * 
 */
package in.eassignments_Pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * @author Yogiii
 *
 */
public class Pom_Search_Candidate_Delete_Report extends BasePage
{
	@FindBy(xpath=("html/body/div[1]/header/div[2]/div/nav/ul/li[2]/a"))
	private WebElement applied_candidate_link;
	
	@FindBy(linkText=("Search Candidate"))
	private WebElement search_candidate;
	
	@FindBy(linkText=("Delete"))
	private WebElement delete_data;
	
	public Pom_Search_Candidate_Delete_Report(WebDriver driver)
	{
		super(driver);
		
	}
	public void search_candidate_delete() throws Exception
	{
		Actions act=new Actions(driver);
		act.moveToElement(applied_candidate_link).build().perform();
		
		search_candidate.click();
		Thread.sleep(3000);
		
		/*//delete_data.click();
		
		Thread.sleep(3000);
		
		Alert arc=driver.switchTo().alert();
		arc.accept();
		
		Thread.sleep(5000);*/
	}
	
}
