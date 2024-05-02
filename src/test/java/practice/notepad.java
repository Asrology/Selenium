package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class notepad {

	public static void main(String[] args) throws Throwable  {
	// create object of FIS  class
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Downloads\\text.properties");
		//crate object of properties
		Properties p=new Properties();
		p.load(fis);
		String UN=p.getProperty("UN");
		System.out.println("UN");
		//create password
		Thread.sleep(2000);
		String PW=p.getProperty("PW");
		System.out.println("PW");
		
	
				
				

	}

}
