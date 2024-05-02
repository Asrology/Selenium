package Vtigerrunningclass;

import org.apache.logging.log4j.util.PropertyFilePropertySource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Genaricusalitity.PropertiesFileUtility;

public class CreateorgTest {//ULC

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		//fact data from notepad
		PropertiesFileUtility  pUtil=new PropertiesFileUtility();
		String url=pUtil.readDataFrompropertyFile(URL);
		
		
		
		

	}

}
