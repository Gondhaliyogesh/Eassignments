package in.eassignments_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Employer_Login extends BasePage
{

	@FindBy(xpath="html/body/div[1]/header/div[1]/div/div/ul/li[3]/a")
	WebElement log_lnk;

	@FindBy(xpath=".//*[@id='social-icons-conatainer']/div[1]/div[1]/input[2]")
	WebElement radio_btn;

	@FindBy(id="user_mail")
	WebElement usern;

	@FindBy(id="login-pass")
	WebElement Passwd;

	@FindBy(xpath="//button[@class='btn btn-success modal-login-btn submit']")
	WebElement login_btn;

	//@FindBy(xpath=("html/body/div[1]/header/div[1]/div/div/ul/li[3]/a"))
	//WebElement Logout_btn;

	/*@FindBy(xpath=(".//*[@id='showsuccess']/div/div/div[2]/center/a"))
	WebElement Again_Login_btn;*/


	public Employer_Login(WebDriver driver)
	{  
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void Login_Employer(String uname,String passwd) throws Exception 
	{	

		log_lnk.click();
		radio_btn.click();
		usern.sendKeys(uname);
		Passwd.sendKeys(passwd);
		login_btn.click(); 



	}


}

