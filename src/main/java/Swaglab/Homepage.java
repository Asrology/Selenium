package Swaglab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//delceration
	@FindBy(xpath = "//div[@class=\"inventory_item_name\"]")private WebElement soucelabbackpack;
	@FindBy(xpath = "//div[@class='inventory_item_name']")private WebElement bolt_shirt;
	@FindBy(xpath = "//div[@class='inventory_item_name']")private WebElement Onesiekbtn;
	@FindBy(xpath = "//div[@class='inventory_item_name']")private WebElement bikelightbtn;
	@FindBy(xpath = "//div[@class='inventory_item_name']")private WebElement jacketbtn;
	@FindBy(xpath = "//div[@class='inventory_item_name']")private WebElement tshirtredbtn;
	@FindBy(xpath = "//a[@id='logout_sidebar_link']")private WebElement loginbtn;
	//initialization
			public Homepage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			//utilization
			public WebElement getSoucelabbackpack() {
				return soucelabbackpack;
			}
			public WebElement getBolt_shirt() {
				return bolt_shirt;
			}
			public WebElement getOnesiekbtn() {
				return Onesiekbtn;
			}
			public WebElement getBikelightbtn() {
				return bikelightbtn;
			}
			public WebElement getJacketbtn() {
				return jacketbtn;
			}
			public WebElement getTshirtredbtn() {
				return tshirtredbtn;
				
			}
			public WebElement getLoginbtn() {
				return loginbtn;
			}
			public void setLoginbtn(WebElement loginbtn) {
				this.loginbtn = loginbtn;
			}
			
	

}
