package Genaricusalitity;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {

	public String readDataFrompropertyFile(String key) throws IOException {
		FileInputStream fisp=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\AdvancedSelenum\\src\\test\\resources\\text.properties.txt");
		Properties p=new Properties();
		p.load(fisp);
		String value=p.getProperty(key);
		return value;
}
}