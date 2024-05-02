package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateorglookupImgpage {
	//declartion
	
	@FindBy(xpath = "//input[@name='accountname']")private WebElement Orgtxt;
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")private WebElement Savebtn;
	
	//initialization
	
		public CreateorglookupImgpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
			//utilization
			
		public WebElement getOrgtxt() {
			return Orgtxt;
		}
		public WebElement getSavebtn() {
			return Savebtn;
		}
		//business labrary
		public void CreateorglookupImgpageIoApp() {
			Orgtxt.sendKeys();
			 Savebtn.click();
			
		}
}
			
		
		
	
		
