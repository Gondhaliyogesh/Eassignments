/**
 * 
 */
package in.eassignments_Pom;

import org.openqa.selenium.Alert;
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
public class Employer_Profile extends BasePage 
{
	
	@FindBy(xpath=("html/body/div[1]/header/div[2]/div/nav/ul/li[4]/a"))
	private WebElement profile_link;
	
	@FindBy(id=("edit_orgname"))
	private WebElement organization_name;
	
	@FindBy(id=("edit_employer_email"))
	private WebElement email_id;
	
	@FindBy(id=("edit_address"))
	private WebElement address;
	
	@FindBy(id=("country"))
	private WebElement country;
	
	@FindBy(id=("changestate"))
	private WebElement state;
	
	@FindBy(id=("changecity"))
	private WebElement city;
	
	@FindBy(id=("edit_employerinfo"))
	private WebElement employer_info;
	
	@FindBy(id=("edit_contactperson"))
	private WebElement contact_person;
	
	@FindBy(id=("edit_cellno"))
	private WebElement cell_no;
	
	@FindBy(id=("edit_orgtype"))
	private WebElement type_of_organization;
	
	@FindBy(id=("save_employer"))
	private WebElement save_btn;
	

	public Employer_Profile(WebDriver driver) 
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public void E_profile(String org_name,String email,String addres,String c_try,String s_ate,String cty,String e_info,String c_person,String cell_n,String type_org) throws Exception
	{
		Actions profile=new Actions(driver);
		profile.moveToElement(profile_link).click().build().perform();
		
		organization_name.clear();
		organization_name.sendKeys(org_name);
		email_id.clear();
		email_id.sendKeys(email);
		
		address.clear();
		address.sendKeys(addres);
		
		Select conty=new Select(country);
		conty.selectByVisibleText(c_try);
		Thread.sleep(3000);
		
		Select stat=new Select(state) ;
		stat.selectByVisibleText(s_ate);
		Thread.sleep(3000);
		
		Select cit=new Select(city);
		cit.selectByVisibleText(cty);
		
		
		employer_info.clear();
		employer_info.sendKeys(e_info);
		
		contact_person.clear();
		contact_person.sendKeys(c_person);
		
		cell_no.clear();
		cell_no.sendKeys(cell_n);
		
		Select toforg=new Select(type_of_organization);
		toforg.selectByVisibleText(type_org);
		
		save_btn.click();
		Thread.sleep(3000);
		
		Alert art=driver.switchTo().alert();
		art.accept();
		
		Thread.sleep(5000);
		
		
		
	}

}
