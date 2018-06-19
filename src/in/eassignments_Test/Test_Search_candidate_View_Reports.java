/**
 * 
 */
package in.eassignments_Test;

import org.testng.annotations.Test;

import in.eassignments_Pom.BasePage;
import in.eassignments_Pom.Employer_Login;
import in.eassignments_Pom.Pom_Search_candidate_View_Report;


/**
 * @author Yogiii
 *
 */
public class Test_Search_candidate_View_Reports extends SuperTestNG
{
	Employer_Login  Obj;
	Pom_Search_candidate_View_Report ac;
	BasePage bs;
	
	
	@Test(priority=1)
	public void login() throws Exception
	{
		Obj=new Employer_Login(driver);
		Obj.Login_Employer("gondhaliyogesh94@gmail.com", "yogeshG1234");
		
	}
	@Test(priority=2)
	public void applied_candidate1() throws Exception
	{
		ac=new Pom_Search_candidate_View_Report(driver);
		ac.view_report();
		
		bs=new BasePage(driver);
		bs.title();
		bs.logout();
	}
	
}
