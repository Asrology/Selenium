package actualtestcase;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Objectperposities.Createinformationpage;
import Objectperposities.Homepage;
import Objectperposities.Organizationpage;

public class Create_org_java {
	@Test
	public void corg() throws Throwable {
		//click on org link/mod
		Homepage hp=new Homepage(driver);
		hp.getOragLink();
		//click on lookup imGE
		Organizationpage op=new Organizationpage(driver);
		op.getLookupimg();
		//Create new org
		Createinformationpage cip=new Createinformationpage(driver);
		String ORGNAME = eu.readdatafromExcelFileUtility("Sheet1", 0, 0);
		cip.CreateinformationpageToApp((" ORGNAME"+On.getRandamnum());
		//save it
		clp.savebtn();
		//verify org created or not
	  Organizationpage op Organizationpage=new Organizationpage(driver);
	  String header = op.getHeader();
	  //verification using assert class
	  Assert.assertTrue(header.contains("ORGNAME"));
	  System.out.println("TC is Pass Org Is created");
	}
	}
		
		


