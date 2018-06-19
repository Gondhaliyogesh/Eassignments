package in.eassignments_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Employer_Registration 
{
	private WebDriver driver;

	@FindBy (xpath=("//a[@href='#']/br"))
	private WebElement E_Registation_link;

	@FindBy(linkText=("Employer Registration"))
	private WebElement E_Registration_link;

	@FindBy(id=("orgtype"))
	private WebElement E_OrganizationType;

	@FindBy(id=("orgname"))
	private WebElement E_OrganizarionNmae;

	@FindBy(id=("address"))
	private WebElement E_Address;

	@FindBy(id=("contactperson"))
	private WebElement E_ContactPerson;

	@FindBy(id=("cellno"))
	private WebElement E_CellNo;

	@FindBy(id=("employer_email"))
	private WebElement E_Email;

	@FindBy(id=("country"))
	private WebElement E_Country;

	@FindBy(name=("state"))
	private WebElement E_State;

	@FindBy(id=("changecity"))
	private WebElement E_City;

	@FindBy(id=("employerinfo"))
	private WebElement E_Info;

	@FindBy(id=("password"))
	private WebElement E_Password;

	@FindBy(id=("passwordConfirm"))
	private WebElement E_Repassword;
	
	@FindBy(xpath=(".//*[@id='save_employer']"))
	private WebElement E_Register;
	
	public Employer_Registration(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public void Emp_reg_info(String organization_type,String organization_name,String address,String contact_person,String cell_no,String email,String country,String state,String city,String employer_info,String passwd,String re_passwd) throws Exception		
	{
		Actions act=new Actions(driver);
		act.moveToElement( E_Registation_link).build().perform();

		E_Registration_link.click();

		Select sel=new Select(E_OrganizationType);
		sel.selectByVisibleText(organization_type);

		E_OrganizarionNmae.sendKeys(organization_name);

		E_Address.sendKeys(address);

		E_ContactPerson.sendKeys(contact_person);

		E_CellNo.sendKeys(cell_no);

		E_Email.sendKeys(email);

		Select Countr=new Select(E_Country);
		Countr.selectByVisibleText(country);
		Thread.sleep(4000);

		Select Stat=new Select(E_State);
		Stat.selectByVisibleText(state);
		Thread.sleep(3000);

		Select Cit=new Select(E_City);
		Cit.selectByVisibleText(city);
		Thread.sleep(3000);

		E_Info.sendKeys(employer_info);

		E_Password.sendKeys(passwd);
		E_Repassword.sendKeys(re_passwd);
		
		Thread.sleep(3000);
		Actions act1=new Actions(driver);
		act1.moveToElement(E_Register).click().build().perform();
		
		Thread.sleep(3000);
		
	}
}	
