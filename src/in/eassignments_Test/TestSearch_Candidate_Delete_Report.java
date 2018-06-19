/**
 * 
 */
package in.eassignments_Test;

import org.testng.annotations.Test;

import in.eassignments_Pom.BasePage;
import in.eassignments_Pom.Employer_Login;
import in.eassignments_Pom.Pom_Search_Candidate_Delete_Report;
import in.eassignments_Pom.Pom_Search_candidate_View_Report;

/**
 * @author Yogiii
 *
 */
public class TestSearch_Candidate_Delete_Report extends SuperTestNG
{
	Employer_Login  Obj;
	Pom_Search_Candidate_Delete_Report ac;
	BasePage bs;
	
	
	@Test(priority=1)
	public void login() throws Exception
	{
		Obj=new Employer_Login(driver);
		Obj.Login_Employer("gondhaliyogesh94@gmail.com", "yogeshG1234");
		
	}
	@Test(priority=2)
	public void applied_candidate2() throws Exception
	{
		ac=new Pom_Search_Candidate_Delete_Report(driver);
		ac.search_candidate_delete();
		
		bs=new BasePage(driver);
		bs.title();
		bs.logout();
	}
	
}
