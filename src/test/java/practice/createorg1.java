package practice;

import java.awt.Desktop.Action;
import java.util.Random;

import javax.tools.JavaFileManager.Location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createorg1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://localhost:8888/");
		//UN
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		//PWD
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//click on org lookup btn
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//click on organization module
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		//click on org lookup imp
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		Random ran=new Random();
		int r =ran.nextInt(100);
		//give the org name
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TCS"+r);
		//click oon save btn
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@ title='Save [Alt+S]']")).click();
		//verify
		String expOrgName="TCS";
		Thread.sleep(5000);
		String actOrgName = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if(actOrgName.contains(expOrgName)) {
			Thread.sleep(5000);
			System.out.println("TC is pass");
		}
		else {
			System.out.println("TC is fail");
		}
		Thread.sleep(5000);
		Actions a= new Actions(driver);
		Thread.sleep(5000);
		WebElement admimg = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Thread.sleep(5000);
		a.moveToElement(admimg).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[.='Sign Out']")).click();
	}
}

		


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	


