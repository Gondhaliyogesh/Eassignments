package in.eassignments_Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import in.eassignments_Pom.BasePage;
import in.eassignments_Pom.Employer_Login;


public class TestEmployer_Login_Exe extends SuperTestNG
{

	Employer_Login  Obj;
	BasePage bs;

	@Test 
	public void Employer_Log() throws Exception
	{
		Obj =new Employer_Login(driver);

		Obj.Login_Employer("yogesh@gmail.com","yogeshG1234");
		Thread.sleep(4000);
		
		bs=new BasePage(driver);
		String title=bs.title();
		Assert.assertEquals(title, title);
		System.out.println(title);
		bs.logout();
	}
}

