package practice;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		//switch to frame
		driver.switchTo().frame("iframeresults");
		//xpath for john
		driver.findElement(By.xpath("//input[@id='fname']")).clear();
		//give Najitha
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Najitha");

	}

}
