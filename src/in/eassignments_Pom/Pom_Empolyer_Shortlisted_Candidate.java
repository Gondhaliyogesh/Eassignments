/**
 * 
 */
package in.eassignments_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Yogiii
 *
 */
public class Pom_Empolyer_Shortlisted_Candidate extends BasePage
{

	public Pom_Empolyer_Shortlisted_Candidate(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);


	}

}
