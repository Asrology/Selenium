package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
 //import org.openqa.selenium.interactions.Actions;

import com.github.dockerjava.api.model.Driver;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/html/html5_draganddrop.asp");
	//WebElement srcElement= driver.findElement(By.xpath("//img[@id='drag1']"));
		//dest element
		//WebElement destElement=driver.findElement(By.xpath("//div[@id='div2']"));
		//action class
		//Actions a=new Actions(driver);
		//a.dragAndDrop(srcElement, destElement).perform();
		//Thread.sleep(3000);
		//vice-versa
		//a.dragAndDrop(destElement, srcElement).perform();
	
	
	}
}