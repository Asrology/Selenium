package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lookup_opportunities {
	//declartion
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement opplookupimg;
	
	//initialization
	
	public  Lookup_opportunities(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getoppLookupimg() {
		return opplookupimg;
	}
	
	//business labrary
	
	public void Lookup_opportunitiesToApp() {
		
		opplookupimg.click();
	}
	
	

}
