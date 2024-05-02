package practice;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Concantalt {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//a[@href='index.php?module=Contacts&action=index'] ")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/select.gif']")).click();
		Thread.sleep(2000);
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows.size());
		Thread.sleep(2000);
		for(String chlid: allwindows) {
			driver.switchTo().window(chlid);
		}
		driver.findElement(By.xpath("//input[@name='search_text']")).sendKeys("HCL");
		WebElement adm=driver.findElement(By.xpath("//select[@name='search_field']"));
		Select select1=new Select(adm);
		select1.selectByIndex(0);
		Set<String> allwindows1=driver.getWindowHandles();
		System.out.println(allwindows1.size());
		Thread.sleep(2000);
		for(String parent:allwindows1) {
			Thread.sleep(2000);
			driver.switchTo().window(parent);
			Thread.sleep(2000);
			Actions a=new Actions(driver);
			WebElement admimg=driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']"));
			a.moveToElement(admimg).perform();
			driver.findElement(By.xpath("//a[@ href='index.php?module=Users&action=Logout']"));
		}
	}
}
		
		
		
		
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		

		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
	


