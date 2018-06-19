/**
 * 
 */
package in.eassignments_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Yogiii
 *
 */
public class Employer_Post_Requirement extends BasePage
{	
	

	@FindBy(xpath=("html/body/div[1]/header/div[2]/div/nav/ul/li[3]/a"))
	 private WebElement Requirements_Link;

	 @FindBy(linkText=("Post Requirement"))
	 private WebElement Post_requirement_link;

	@FindBy(xpath=(".//*[@id='requirementInsert']/div[3]/div/div/div/label"))
	private WebElement Qualification;

	@FindBy(id=("job_location"))
	private WebElement Location;

	@FindBy(id=("atitle"))
	private WebElement Assignment_title;

	@FindBy(id=("job_details"))
	private WebElement Assignment_details;

	@FindBy(id=("experienced"))
	private WebElement Reqirement;

	@FindBy(id=("experience_box"))
	private WebElement Reqirement_Sel;

	@FindBy(id=("datepicker"))
	private WebElement Start_Datepicker;

	@FindBy(xpath=("//select[@class='ui-datepicker-month']"))
	private WebElement Start_Month;

	@FindBy(xpath=("//select[@class='ui-datepicker-year']"))
	private WebElement Start_Year;

	@FindBy(xpath=("//table[@class='ui-datepicker-calendar']//tbody/tr[5]/td[2]/a"))
	private WebElement Start_Day;

	@FindBy(id=("datepicker2"))
	private WebElement End_Datepicker;

	@FindBy(xpath=("//select[@class='ui-datepicker-month']"))
	private WebElement End_Month;

	@FindBy(xpath=("//select[@class='ui-datepicker-year']"))
	private WebElement End_Year;

	@FindBy(xpath=("//table[@class='ui-datepicker-calendar']//tbody/tr[5]/td[2]/a"))
	private WebElement End_Day;

	@FindBy(id=("requirement"))
	private WebElement Add_Requirement;

	public Employer_Post_Requirement(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void post_requirement(String location,String a_title,String a_details,String requirement,String s_month,String s_year,String e_month,String e_year) throws Exception
	{
		Actions act=new Actions(driver);
		act.moveToElement(Requirements_Link).build().perform();
		
		Post_requirement_link.click();
		
		Qualification.click();
		Location.sendKeys(location);

		Select A_title=new Select(Assignment_title);
		A_title.selectByVisibleText(a_title);

		Assignment_details.sendKeys(a_details);

		Reqirement.click();

		Select Reqmt=new Select(Reqirement_Sel);
		Reqmt.selectByValue(requirement);	

		Actions S_date=new Actions(driver);
		S_date.moveToElement(Start_Datepicker).doubleClick().build().perform();
		Thread.sleep(3000);

		Select S_month=new Select(Start_Month);
		S_month.selectByValue(s_month);
		Thread.sleep(3000);

		Select S_year=new Select(Start_Year);
		S_year.selectByValue(s_year);
		Thread.sleep(3000);

		Actions S_day=new Actions(driver);
		S_day.moveToElement(Start_Day).click().build().perform();
		Thread.sleep(3000);

		Actions E_date=new Actions(driver);
		E_date.moveToElement(End_Datepicker).doubleClick().build().perform();
		Thread.sleep(3000);

		Select E_month=new Select(End_Month);
		E_month.selectByValue(e_month);
		Thread.sleep(3000);

		Select E_year=new Select(End_Year);
		E_year.selectByValue(e_year);
		Thread.sleep(3000);

		Actions E_day=new Actions(driver);
		E_day.moveToElement(End_Day).click().build().perform();
		Thread.sleep(3000);

		Add_Requirement.click();
		
		Thread.sleep(4000);
	}
}
