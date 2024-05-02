package Genaricusalitity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class Excelfeching {
	public String readDataFromExcel(String SheetName,int rownum,int cellnum) throws Throwable  {
			FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\AdvancedSelenum\\src\\test\\resources\\Excelfaeching.xlxs");
	Workbook wb=WorkbookFactory.create(fis);
	String UN=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	return UN;

}
}
