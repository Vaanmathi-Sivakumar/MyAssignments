package selenium.assignment.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver =new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize(); //To maximize the window/browser size
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaanmathi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivakumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Vaan");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Vaan@gmail.com");
		WebElement soureDropDown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropDown =new Select(soureDropDown);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		String actualResult="View Lead";
		
		String expectedResult=driver.getTitle();
		
		if(actualResult.equals(expectedResult))
		{
			System.out.println("create Lead created successfully");
		}
		else
		{
			System.out.println("create Lead not created successfully");
		}
		

	}

}
