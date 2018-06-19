/**
 * 
 */
package in.eassignments_Test;

import java.io.FileInputStream;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.eassignments_Pom.BasePage;
import in.eassignments_Pom.Employer_Login;
import in.eassignments_Pom.Employer_Post_Requirement;
import in.eassignments_Pom.Employer_View_Requirement;
import jxl.Workbook;

/**
 * @author Yogiii
 *
 */
public class TestEmployer_Post_Requirement_Exe extends SuperTestNG
{		
	
	Employer_Login  Obj1;
	Employer_Post_Requirement obj;
	Employer_View_Requirement obj2;
	
	@Test(priority=1)
	public void E_log() throws Exception
	{
		Obj1=new Employer_Login(driver);
		Obj1.Login_Employer("1@gmail.com", "yogeshG1234");
	}
	
	@Test (dataProvider="Post-requirement",priority=2)
	public void post_requirement(String location,String a_title,String a_details,String requirement,String s_month,String s_year,String e_month,String e_year) throws Exception
	{	
		obj=new Employer_Post_Requirement(driver);
		obj.post_requirement(location, a_title, a_details, requirement, s_month, s_year, e_month, e_year);
		
		String str=driver.getCurrentUrl();
		Assert.assertEquals(str, "http://eassignments.in/ca/employers/post-requirement.php#");
		
	}
	
	@Test(priority=3)
	public void view_reqmnt() throws Exception
	{
		obj2=new Employer_View_Requirement(driver);
		obj2.view_req();
		
		Thread.sleep(3000);
		
		BasePage bs=new BasePage(driver);
		bs.logout();
		
		
	}
	
	@DataProvider(name="Post-requirement")
	public String [][] getExcel() throws Exception
	{
		FileInputStream fis=new FileInputStream("F:\\BinaryBridge\\MYFramework\\Eassignments\\Excel\\Employer_Post_Requirement.xls");
		Workbook wb=Workbook.getWorkbook(fis);
		int rows=wb.getSheet(0).getRows();
		int cols=wb.getSheet(0).getColumns();
		
		String [][]data=new String[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data[i][j]=wb.getSheet(0).getCell(j,i).getContents();
			}
		}
		
		
		return data;
		
	}

	
}
