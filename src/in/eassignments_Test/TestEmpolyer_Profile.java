/**
 * 
 */
package in.eassignments_Test;

import java.io.FileInputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.eassignments_Pom.BasePage;
import in.eassignments_Pom.Employer_Login;
import in.eassignments_Pom.Employer_Profile;
import jxl.Workbook;

/**
 * @author Yogiii
 *
 */
public class TestEmpolyer_Profile extends SuperTestNG
{
	@Test(priority=1)
	public void login() throws Exception
	{	 
		Employer_Login log=new Employer_Login(driver);
		log.Login_Employer("yogesh@gmail.com", "yogeshG1234");

	}
	@Test(dataProvider="Profile",priority=2)
	public void profile(String org_name,String email,String addres,String c_try,String s_ate,String cty,String e_info,String c_person,String cell_n,String type_org) throws Exception
	{
		Employer_Profile obj=new Employer_Profile(driver);
		obj.E_profile(org_name, email, addres, c_try, s_ate, cty, e_info, c_person, cell_n, type_org);

		BasePage bs=new BasePage(driver);
		bs.logout();
	}

	@DataProvider(name="Profile")
	public String [][] getExcel() throws Exception
	{
		FileInputStream fis=new FileInputStream("F:\\BinaryBridge\\MYFramework\\Eassignments\\Excel\\Employer_Profile.xls");
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
