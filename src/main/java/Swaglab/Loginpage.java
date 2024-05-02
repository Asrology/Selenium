package Swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declaration
		@FindBy(xpath = "//input[@name='user-name']")private WebElement untxt;
		@FindBy(xpath = "//input[@name='password']")private WebElement pwdtxt;
		@FindBy(xpath = "//input[@id='login-button']")private WebElement loginbtnt;
		//initialization
		public Loginpage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//utilization
		public WebElement getUntxt() {
			return untxt;
		}
		public WebElement getPwdtxt() {
			return pwdtxt;
		}
		public WebElement getLoginbtnt() {
			return loginbtnt;
		}
		
			
}
