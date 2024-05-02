package practice;


import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Incontacts_add_Organisation {

	public static void main(String[] args) throws Throwable  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		// goto contacts
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index'] ")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("nalluri");
		// link to child browser
		driver.findElement(By.xpath("//img[@alt='Select'][1]")).click();
		Thread.sleep(5000);
		//windows handling
		Set<String> allwindows=driver.getWindowHandles();
		ArrayList<String>win=new ArrayList<String>(allwindows);
		String mwin=win.get(0);
		String cwin=win.get(1);
		Thread.sleep(5000);
		//switch to chlid window
		driver.switchTo().window(cwin);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("TCS");
		driver.findElement(By.xpath("//input[@name='search']")).click();
		Thread.sleep(5000);
		//back to main Browser
		driver.switchTo().window(mwin);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='assigntype'][2]")).click();
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
	    Thread.sleep(5000);
		//verify last name
		String expName="nalluri";
		String actName=driver.findElement(By.className("dvHeaderText")).getText();
		Thread.sleep(5000);
		if(actName.contains(expName)) {
		System.out.println("TestCase-1 is Pass which is regarding lastName");
		}
				else {
					System.out.println("TestCase-1 is Fail which is regarding lastName");
				}
				Thread.sleep(5000);
				//verify the organization (adding) name
				String  expOrgName="TCS";
				String actOrgName=driver.findElement(By.xpath("//td[@id='mouseArea_Organization Name']")).getText();		
				if(actOrgName.contains(expOrgName)) {
				System.out.println("Testcase-2 is Pass which is regarding organisation Name");
				}
				else {
					System.out.println("Testcase-2 is Fail which is regarding organisation Name");
				}
				Actions a=new Actions(driver);
				WebElement admImg=driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
				a.moveToElement(admImg).perform();
				Thread.sleep(5000);
				driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
}
				
				
				
				
				
				
				
				
				
				
				

				
				
			
				
				
				
				
				