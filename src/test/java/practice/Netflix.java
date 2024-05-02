package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Netflix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.netflix.com/in/login");
		//UN
		driver.findElement(By.xpath("//input[@name='userLoginId']")).sendKeys("gsrinadh734@gmail.com");
		//PWD
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Devara");
		//who the watching
		driver.findElement(By.xpath("//div[@class='profile-icon']")).click();
		//click on the neflix
		driver.findElement(By.xpath("//a[@href='/browse']"));
		driver.findElement(By.xpath("//a[@class='current active']"));
		
			
		
	}

}
