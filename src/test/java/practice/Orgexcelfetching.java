package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Orgexcelfetching {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Documents\\data1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String UN=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(UN);
		String PWD=wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("PWD");
		//String Brwsr=wb.getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		//System.out.println(" Brwsr)");
		//String url=wb.getSheet("Sheet1").getRow(0).getCell(3).getStringCellValue();
		//System.out.println("url");	

	}

}
