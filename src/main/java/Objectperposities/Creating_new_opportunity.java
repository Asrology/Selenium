package Objectperposities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Creating_new_opportunity {
	
	//declaration

	@FindBy(xpath = "//span[@class='lvtHeaderText']")private WebElement Createname;
	@FindBy(xpath = "//input[@name='potentialname']")private WebElement firstname;
	@FindBy(xpath = "//input[@id='related_to_display']")private WebElement relatedto;
	@FindBy(xpath = "//input[@name='search_text']")private WebElement searchbtn;
	@FindBy(xpath = "//a[@ href='index.php?module=Users&action=Logout']")private WebElement signbtn;
	
	
	
	//initialization
	
		public Creating_new_opportunity(WebDriver driver) {
			PageFactory.initElements( driver,this);
		}

		//utilization
		
		public WebElement getCreatename() {
			return Createname;
		}


		public WebElement getFirstname() {
			return firstname;
		}


		public WebElement getRelatedto() {
			return relatedto;
		}

		public void setRelatedto(WebElement relatedto) {
			this.relatedto = relatedto;
		}

		public WebElement getSearchbtn() {
			return searchbtn;
		}


		public WebElement getSignbtn() {
			return signbtn;
		}
		
		
		//business library
		
		public void Creating_new_opportunityToApp() {
			
			Createname.click();
			firstname.sendKeys("CVKN");
			 relatedto.sendKeys("najitha");
			searchbtn.click();
			signbtn.click();
			
		}
}
		


