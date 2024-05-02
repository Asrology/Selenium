package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	//declartion
	
		@FindBy(xpath ="//img[@src='themes/softed/images/btnL3Add.gif']" )private WebElement Lookupimg;
		@FindBy(xpath ="//input[@type='text']" )private WebElement orgname;
		@FindBy(xpath ="//input[@title='Save [Alt+S]']" )private WebElement save;
		@FindBy(xpath ="//a[@ href='index.php?module=Users&action=Logout']" )private WebElement signout;                                                                                  
		
		//initialization
		
		public Organizationpage(WebDriver driver) {
			PageFactory.initElements( driver,this);
			
		}

		//utilization
		
		public WebElement getLookupimg() {
			return Lookupimg;
		}
		public WebElement getOrgname() {
			return orgname;
		}
		public WebElement getSave() {
			return save;
		}
		public WebElement getSignout() {
			return signout;
		}

		//bussiess labrary
		
		public void OrganizationToApp(String organization) {
			
			Lookupimg.click();
			orgname.sendKeys();
			save.click();
			signout.click();
			
		
		}
}


		
		

