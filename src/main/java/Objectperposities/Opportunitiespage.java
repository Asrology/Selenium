package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Opportunitiespage {
	//delecaration
	
	@FindBy(xpath = "//a[@href='index.php?module=Potentials&action=index']")private WebElement Opportunities;
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement Lookupimg;
	@FindBy(xpath = "//input[@name='potentialname']")private WebElement oppname;
	@FindBy(xpath = "//input[@title=\"Save [Alt+S]\"]")private WebElement oopsave;
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")private WebElement longout;
	//initialization
	
	public Opportunitiespage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		

}
	//utilization
	
	public WebElement getOpportunities() {
		return Opportunities;
	}
	public WebElement getLookupimg() {
		return Lookupimg;
	}
	public WebElement getOppname() {
		return oppname;
	}
	public WebElement getOopsave() {
		return oopsave;
	}
	public WebElement getLongout() {
		return longout;
	}
	//business library
	
	public void OpportunitiesToApp()  {
		Opportunities.click();
		Lookupimg.click();
		oppname.sendKeys();
	oppname.click();
	longout.click();
	
		
		
	}
}