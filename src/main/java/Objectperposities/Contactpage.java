package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactpage {
	//declaration
	
	@FindBy(xpath = "//a [@href='index.php?module=Contacts&action=index']")private WebElement contactname ;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement Lookupimg;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement Contactsave;
	@FindBy(xpath = "//a [@href='index.php?module=Users&action=Logout']")private WebElement longout;
	//initialization
	
			public Contactpage(WebDriver driver) {
				PageFactory.initElements( driver,this);
			}
			//utilization
						
					
		public WebElement getContactname() {
				return contactname;
			}




			public WebElement getLookupimg() {
				return Lookupimg;
			}




			public WebElement getContactsave() {
				return Contactsave;
			}




			public WebElement getLongout() {
				return longout;
			}
			
			
//buseniess labrary
			
			public void ContactToApp(){
				contactname.click();
				Lookupimg.sendKeys();
				Contactsave.click();
				longout.click();
				
			
			
				

}
}
