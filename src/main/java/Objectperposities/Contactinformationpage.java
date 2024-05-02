package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contactinformationpage {
	
	
	//declartion
	@FindBy(xpath = "//td[@class='dvtSelectedCell']")private WebElement cip;
	@FindBy(xpath = "//input[@class='detailedViewTextBox']")private WebElement contactname;
	@FindBy(xpath = "//input[@name='lastname']")private WebElement contactnamelast;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement contactsave;
	@FindBy(xpath = "//a[@ href='index.php?module=Users&action=Logout']")private WebElement  signbtn;
	
	//initialization
	
	public Contactinformationpage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}

	
	//utilization
	public WebElement getCip() {
		return cip;
	}

	public WebElement getContactname() {
		return contactname;
	}
	
	

	public WebElement getContactnamelast() {
		return contactnamelast;
	}


	public void setContactnamelast(WebElement contactnamelast) {
		this.contactnamelast = contactnamelast;
	}


	public WebElement getContactsave() {
		return contactsave;
	}
	

	public WebElement getSignbtn() {
		return signbtn;
	}

	//buseniess labrary
	public void  ContactinformationpagToApp() {
		cip.click();
		contactname.sendKeys("iphone");
		contactnamelast.click();
		contactsave.click();
		signbtn.click();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

