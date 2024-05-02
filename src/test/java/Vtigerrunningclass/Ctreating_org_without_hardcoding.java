package Vtigerrunningclass;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Genaricusalitity.PropertiesFileUtility;
import Objectperposities.Contactinformationpage;
import Objectperposities.Contactpage;
import Objectperposities.Createinformationpage;
import Objectperposities.CreateorglookupImgpage;
import Objectperposities.Creating_new_opportunity;
import Objectperposities.Genericutilitycontact;
import Objectperposities.Homepage;
import Objectperposities.Loginpage;
import Objectperposities.Lookup_opportunities;
import Objectperposities.Opportunitiespage;
import Objectperposities.Organizationpage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ctreating_org_without_hardcoding {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		 PropertiesFileUtility pu=new PropertiesFileUtility();
		 String URL=pu.readDataFrompropertyFile("url");
		 String UN=pu.readDataFrompropertyFile("username");
		 String PWD=pu.readDataFrompropertyFile("password");
		 System.out.println(UN);
		 //Lanuch the broswer
		 WebDriverManager.edgedriver().setup();
		 WebDriver driver=new EdgeDriver();
		 driver.get(URL);
		 
		 //Login to app
		 Loginpage ip=new Loginpage(driver);
		 ip.loginTOApp(UN, PWD);
		 Thread.sleep(3000);
		 
		 //home page 
		Homepage hp=new Homepage(driver);
		hp.getOragLink().click();
		Thread.sleep(3000);
		
		//orgnization 
		Organizationpage op=new Organizationpage(driver);
		op.getLookupimg().click();
		Thread.sleep(3000);
		 
		//Createorglookupimgpage
		CreateorglookupImgpage clp=new CreateorglookupImgpage(driver);
		clp.getOrgtxt().sendKeys("najitha39");
		Thread.sleep(3000);
		clp. getSavebtn().click();
		Thread.sleep(3000);
		
		//Createinformationpage
		Createinformationpage cifp=new Createinformationpage(driver);
		cifp.getOrgnametxt().click();
		Thread.sleep(3000);
		 
		hp.getAdministrator().click();
		Thread.sleep(3000);
		
		hp.getSignoutbtn().click();
		Thread.sleep(3000);
		
		//contact
		
		//Login to app
		 Loginpage cip=new Loginpage(driver);
		 ip.loginTOApp(UN, PWD);
		 Thread.sleep(3000);
		 
		 //home page 
		Homepage chp=new Homepage(driver);
		hp.getOragLink().click();
		Thread.sleep(3000);
		
		
		
		//contactpage
		Contactpage cp=new Contactpage(driver);
		cp.getContactname().click();
		Thread.sleep(3000);
		cp.getLookupimg().click();
		Thread.sleep(3000);
		
		//Genericutilitycontactpage
		
		Genericutilitycontact gc=new Genericutilitycontact(driver);
		gc. getContactxt().click();
		Thread.sleep(3000);
		
		//contactinformationpage
		
		 Contactinformationpage Cip=new  Contactinformationpage(driver);
		 Cip.getCip().click();
		 Thread.sleep(3000);
		 
		 Cip.getContactname().sendKeys("gnani20");
		 Thread.sleep(3000);
		 
		 Cip.getContactnamelast().sendKeys("sravani20");
		 Thread.sleep(3000);
		 
		 Cip.getContactsave().click();
		 Thread.sleep(3000);
		 
		  hp.getAdministrator().click();
		  Thread.sleep(3000);
		  
		  hp.getSignoutbtn().click();
		  Thread.sleep(3000);
		  
		  
		  //Opportunities
		  
		  
		//Login to app
			 Loginpage cip1=new Loginpage(driver);
			 ip.loginTOApp(UN, PWD);
			 Thread.sleep(3000);
			 
			 //home page 
			Homepage chp1=new Homepage(driver);
			hp.getOragLink().click();
			Thread.sleep(3000);
			
			//Opportunitiespage
		  
		  Opportunitiespage Op=new  Opportunitiespage(driver);
		  Op.getOpportunities().click();
		  Thread.sleep(3000);
		  
		  
		  //Lookup_opportunities
		  
		  Lookup_opportunities opli= new Lookup_opportunities(driver);
		  opli.getoppLookupimg().click();
		  Thread.sleep(3000);
		  
		  //Creating_new_opportunity
		  
		  Creating_new_opportunity CNO=new Creating_new_opportunity(driver);
		  CNO. getCreatename().click();
		  Thread.sleep(3000);
		  
		  CNO.getFirstname().sendKeys("HELLO29");
		  Thread.sleep(3000);
		  
		  CNO.getRelatedto().sendKeys("hi4");
		  Thread.sleep(3000);
		  
		  CNO.getSearchbtn().click();
		  Thread.sleep(3000);
		  
		  hp.getAdministrator().click();
		  Thread.sleep(3000);
		  
		  hp.getSignoutbtn().click();
		  Thread.sleep(3000);
	}
}
		  		  
		  
		  
		  
		  
		  
		  
		 
		 
		
				
		
		
		
		
		
	
				
				
				
				
			
				
				
				
				
				
				
				
				
		
		
		 

	
	


