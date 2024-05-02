package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class Productpage {

	public static void main(String[] args) throws Throwable {
		// TODO Auto generated method stub
		WebDriver driver=new EdgeDriver();
		//get url
		driver.get("http://localhost:8888/index.php?module=Products&action=index");
		//enter username
		driver.findElement(By.xpath("/input[@name='user_name']")).sendKeys("admin");
		//enter pwd
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
		//click submit button
		driver.findElement(By.xpath("/input[@id='submitButton']")).click();
		//click product
		driver.findElement(By.xpath("//a[@ href='index.php?module=Products&action=index']")).click();
		//click on create button
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		//enter prodcut name
		driver.findElement(By.xpath("//input[@class='detailedViewTextBox']")).sendKeys("Honor");
		//click checkbox
		driver.findElement(By.xpath("/input[@type='checkbox']")).click();
		Thread.sleep(5000);
		//select for dropdwon
				
				Select objSelect =new Select(driver.findElement(By.id("//input[@class='search-box']")));
		objSelect.selectByVisibleText("Automation");
		
		
		
		
		
	
		

	}

}
