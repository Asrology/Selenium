package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Datahadhing {

	

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		FileInputStream fise=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\AdvancedSelenum\\src\\test\\resources\\Datahding.propaties");
		Properties p= new= Properties();
		p.load(fise);
		String UN=P.getproperty("un");
		String PWD=p.getProperty("pwd");
		String URL=p.getProperty("url");
		WebDriver driver=new EdgeDriver();
		//get url
		driver.get("http://localhost:8888/");
		//enter username
		driver.findElement(By.xapth ("//input[@name='user_name']")).sendkeys("UN");
		//enter password
		driver.findElement(By.xpath("//input[@name='user_password']")).sendkeys("PWD");
		//click on login btn
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		//click on org moudle
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		driver.findElement(By.xpath(""))
		
		
		
		
		
		
				
		
		
				
		
		
	}

}
