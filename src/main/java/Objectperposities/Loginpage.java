package Objectperposities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declartion
	
	@FindBy(xpath ="//input[@name='user_name']" )private WebElement untxt;
	@FindBy(xpath ="//input[@name='user_password']" )private WebElement pwdtxt;
	@FindBy(xpath ="//input[@id='submitButton']" )private WebElement loginbtntxt;
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
	public WebElement getLoginbtntxt() {
		return loginbtntxt;
	}
	
	//business labrary
	
	public void loginTOApp(String UN,String PWD) {
		untxt.sendKeys(UN);
		pwdtxt.sendKeys(PWD);
		loginbtntxt.click();
		
		
		
		
		
	}
}
	
	
	
	
	
		
	
	

	
		

	


