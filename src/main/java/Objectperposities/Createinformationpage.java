package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createinformationpage {
//declaration
	@FindBy(xpath ="//span[@class='dvHeaderText']" )private WebElement Orgnametxt;
	@FindBy(xpath = "//a[@ href='index.php?module=Users&action=Logout']")private WebElement Signoutbtn;

//initialization
	public Createinformationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//utilization
	public WebElement getOrgnametxt() {
		return Orgnametxt;
	}

	public WebElement getSignoutbtn() {
		return Signoutbtn;
	}

//business labrary
public void CreateinformationpageToApp() {
	Orgnametxt.click();
	Signoutbtn.click();
}
}

	
