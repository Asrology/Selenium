package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//decleration
	
	@FindBy(xpath = "//a[@ href='index.php?module=Accounts&action=index']")private WebElement OragLink;
	@FindBy(xpath = "//a [@href='index.php?module=Contacts&action=index']")private WebElement ConLink;
	@FindBy(xpath = "//a [@href='index.php?module=Potentials&action=index']")private WebElement OppLink;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement Administrator;		
	@FindBy(xpath = "//a[@ href='index.php?module=Users&action=Logout']")private WebElement signoutbtn;
	
	//initialization
	
		public Homepage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//utilization
			
		public WebElement getOragLink() {
		return OragLink;
	}
	public WebElement getConLink() {
		return ConLink;
	}
	public WebElement getOppLink() {
		return OppLink;
	}
		
		public WebElement getAdministrator() {
		return Administrator;
	}

	public void setAdministrator(WebElement administrator) {
		Administrator = administrator;
	}

		public WebElement getSignoutbtn() {
		return signoutbtn;
	}
	
	
		//busness labrary
		public void HomepageToApp() {
			OragLink.click();
			ConLink.click();
			OppLink.click();
			Administrator.click();
			signoutbtn.click();
			
			
			
		}
		
	

}
