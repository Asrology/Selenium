package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Genericutilitycontact {
	//declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement contactxt;
	
	//initialization
	
	public Genericutilitycontact(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	
	//utilization

	public WebElement getContactxt() {
		return contactxt;
	}

	public void setContactxt(WebElement contactxt) {
		this.contactxt = contactxt;
	}
	
	//buseniess labrary
	
	public void  GenericutilitycontactToApp() {
		contactxt.click();
		
	}
	
	
	

}
