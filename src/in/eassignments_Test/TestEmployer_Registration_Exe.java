/**
 * 
 */
package in.eassignments_Test;

import java.io.FileInputStream;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import in.eassignments_Pom.Employer_Registration;
import jxl.Workbook;

/**
 * @author Yogiii
 *
 */
public class TestEmployer_Registration_Exe extends SuperTestNG
{
	
	Employer_Registration Emp_Reg;
	
	@Test(dataProvider="Requirement")
	public void Emp_Reg(String organization_type,String organization_name,String address,String contact_person,String cell_no,String email,String country,String state,String city,String employer_info,String passwd,String re_passwd) throws Exception
	{	
		try
		{
			Emp_Reg=new Employer_Registration(driver);
			Emp_Reg.Emp_reg_info(organization_type, organization_name, address, contact_person, cell_no, email, country, state, city, employer_info, passwd, re_passwd);
		}
		catch (Exception e) 
		{
			System.out.println(e.getCause());
		}
	}
	@DataProvider(name="Requirement")
	public String [][] getExcel() throws Exception
	{
		FileInputStream fis=new FileInputStream("F:\\BinaryBridge\\MYFramework\\Eassignments\\Excel\\Employer_Registration_Info.xls");
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



















